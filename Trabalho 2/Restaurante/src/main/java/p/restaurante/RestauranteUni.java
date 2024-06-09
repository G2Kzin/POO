/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        frame = new JFrame("Restaurante Universitário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 10, 10));
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        diaSemanaComboBox = new JComboBox<>(new String[]{"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"});
        panel.add(diaSemanaComboBox);

        nomeTextField = new JTextField();
        panel.add(new JLabel("Nome do Item:"));
        panel.add(nomeTextField);

        tipoComboBox = new JComboBox<>(new String[]{"Comida", "Bebida"});
        panel.add(new JLabel("Tipo do Item:"));
        panel.add(tipoComboBox);

        JButton btnAdicionarItem = new JButton("Adicionar Item");
        btnAdicionarItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarItem();
            }
        });
        panel.add(btnAdicionarItem);

        JButton btnVisualizarCardapio = new JButton("Visualizar Cardápio");
        btnVisualizarCardapio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visualizarCardapio();
            }
        });
        panel.add(btnVisualizarCardapio);

        cardapioTextArea = new JTextArea();
        cardapioTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(cardapioTextArea);
        frame.getContentPane().add(scrollPane, BorderLayout.SOUTH);

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
                sb.append("  ").append(item).append("\n");
            }
        }
        cardapioTextArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        new RestauranteUni();
    }
}
