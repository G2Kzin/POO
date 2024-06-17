package p.restaurante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class RestauranteUni {

    private JFrame frame;
    private List<CardapioDiario> cardapios;
    private JComboBox<String> diaSemanaComboBox;
    private JTextField nomeTextField;
    private JComboBox<String> tipoComboBox;
    private JTextArea cardapioTextArea;

    public RestauranteUni() {
        cardapios = new ArrayList<>();
        for (String dia : new String[]{"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"}) {
            cardapios.add(new CardapioDiario(dia));
        }
        initialize();
    }

    private void initialize() {
        // Definindo o look and feel para Nimbus e modificando para tema escuro
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            UIManager.put("control", new Color(50, 50, 50));
            UIManager.put("info", new Color(50, 50, 50));
            UIManager.put("nimbusBase", new Color(18, 30, 49));
            UIManager.put("nimbusAlertYellow", new Color(248, 187, 0));
            UIManager.put("nimbusDisabledText", new Color(128, 128, 128));
            UIManager.put("nimbusFocus", new Color(115, 164, 209));
            UIManager.put("nimbusGreen", new Color(176, 179, 50));
            UIManager.put("nimbusInfoBlue", new Color(66, 139, 221));
            UIManager.put("nimbusLightBackground", new Color(18, 30, 49));
            UIManager.put("nimbusOrange", new Color(191, 98, 4));
            UIManager.put("nimbusRed", new Color(169, 46, 34));
            UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
            UIManager.put("nimbusSelectionBackground", new Color(104, 93, 156));
            UIManager.put("text", new Color(230, 230, 230));
        } catch (Exception e) {
            e.printStackTrace();
        }

        frame = new JFrame("Restaurante Universitário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 20, 10));
        panel.setBackground(new Color(50, 50, 50));
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        diaSemanaComboBox = new JComboBox<>(new String[]{"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"});
        diaSemanaComboBox.setBackground(new Color(70, 70, 70));
        diaSemanaComboBox.setForeground(Color.WHITE);
        panel.add(diaSemanaComboBox);

        nomeTextField = new JTextField();
        nomeTextField.setBackground(new Color(70, 70, 70));
        nomeTextField.setForeground(Color.WHITE);
        panel.add(new JLabel("Nome do Item:"));
        panel.add(nomeTextField);

        tipoComboBox = new JComboBox<>(new String[]{"Comida", "Bebida"});
        tipoComboBox.setBackground(new Color(70, 70, 70));
        tipoComboBox.setForeground(Color.WHITE);
        panel.add(new JLabel("Tipo do Item:"));
        panel.add(tipoComboBox);

        JButton btnAdicionarItem = new JButton("Adicionar Item");
        btnAdicionarItem.setBackground(new Color(70, 70, 70));
        btnAdicionarItem.setForeground(Color.WHITE);
        btnAdicionarItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarItem();
            }
        });
        panel.add(btnAdicionarItem);

        JButton btnVisualizarCardapio = new JButton("Visualizar Cardápio");
        btnVisualizarCardapio.setBackground(new Color(70, 70, 70));
        btnVisualizarCardapio.setForeground(Color.WHITE);
        btnVisualizarCardapio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visualizarCardapio();
            }
        });
        panel.add(btnVisualizarCardapio);

        cardapioTextArea = new JTextArea(10,10);
        cardapioTextArea.setBackground(new Color(70, 70, 70));
        cardapioTextArea.setForeground(Color.WHITE);
        cardapioTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(cardapioTextArea);
        scrollPane.getViewport().setBackground(new Color(70, 70, 70));
        frame.getContentPane().add(scrollPane, BorderLayout.SOUTH);

        GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        
        
        frame.setResizable(true);
        frame.setSize(1057, 800);

        frame.setVisible(true);
    }

    private void adicionarItem() {
        String diaSemana = (String) diaSemanaComboBox.getSelectedItem();
        String nome = nomeTextField.getText();
        String tipo = (String) tipoComboBox.getSelectedItem();

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "O nome do item não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ItemCardapio item = new ItemCardapio(nome, tipo);
        for (CardapioDiario cardapio : cardapios) {
            if (cardapio.getDiaSemana().equals(diaSemana)) {
                cardapio.adicionarItem(item);
                JOptionPane.showMessageDialog(frame, "Item adicionado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                nomeTextField.setText("");
                return;
            }
        }
    }

    private void visualizarCardapio() {
        StringBuilder sb = new StringBuilder();
        for (CardapioDiario cardapio : cardapios) {
            sb.append(cardapio.getDiaSemana()).append(":\n");
            for (ItemCardapio item : cardapio.getItens()) {
                sb.append("     ").append(item).append("\n");
            }
        }
        cardapioTextArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        new RestauranteUni();
    }
}

