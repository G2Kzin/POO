
package p.restaurante;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import javax.swing.JOptionPane; 

public class Interface extends javax.swing.JFrame {
    
    private LinkedHashMap<String, Cardapio> cardapios;

    public Interface() {
        initComponents();
        cardapios = new LinkedHashMap<>();
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarItem();
            }
        });
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        EscolhaDia = new javax.swing.JComboBox<>();
        TxtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnComida = new javax.swing.JRadioButton();
        BtnBebida = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel3.setText("UFJ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Restaurante");

        jButton1.setText("Adicionar Item");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        EscolhaDia.setBackground(new java.awt.Color(204, 204, 255));
        EscolhaDia.setForeground(new java.awt.Color(0, 0, 0));
        EscolhaDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira" }));

        TxtNome.setBackground(new java.awt.Color(255, 255, 255));
        TxtNome.setForeground(new java.awt.Color(0, 0, 0));
        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do Item:");

        jLabel2.setText("Tipo do Item:");

        BtnComida.setText("Comida");

        BtnBebida.setText("Bebida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EscolhaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(59, 59, 59))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnComida, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EscolhaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnComida)
                            .addComponent(BtnBebida))
                        .addGap(29, 29, 29)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed
      
    }//GEN-LAST:event_TxtNomeActionPerformed

    private void selecionarTipoComida() {
        BtnComida.setSelected(true);
        BtnBebida.setSelected(false);
    }

    private void selecionarTipoBebida() {
        BtnComida.setSelected(false);
        BtnBebida.setSelected(true);
    }
    
    private void adicionarItem() {
    String dia = (String) EscolhaDia.getSelectedItem();
    String nome = TxtNome.getText().trim(); 
    
    if (nome.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, insira o nome do item.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String tipo = BtnComida.isSelected() ? "Comida" : (BtnBebida.isSelected() ? "Bebida" : "");
    
    if (tipo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, selecione o tipo do item (Comida ou Bebida).", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    Cardapio cardapio = cardapios.getOrDefault(dia, new Cardapio());
   
    if (tipo.equals("Comida")) {
        cardapio.addComida(nome);
    } else if (tipo.equals("Bebida")) {
        cardapio.addBebida(nome);
    }
    
    // Atualizar o mapa de cardápios com o cardápio atualizado para o dia
    cardapios.put(dia, cardapio);
    
    // Atualizar a visualização na interface
    atualizarVisualizacao();
    
    // Limpar os campos de entrada após adicionar o item
    limparCampos();
    
    JOptionPane.showMessageDialog(this, tipo + " adicionada com sucesso para " + dia + ".", "Item Adicionado", JOptionPane.INFORMATION_MESSAGE);
}





private void atualizarVisualizacao() {
    StringBuilder visualizacao = new StringBuilder();
    
    // Array com os dias da semana
    String[] diasDaSemana = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira"};
    
    // Itera sobre os dias da semana
    for (String dia : diasDaSemana) {
        Cardapio cardapio = cardapios.getOrDefault(dia, new Cardapio()); // Obtém o cardápio ou cria um novo vazio se não existir
        visualizacao.append(dia).append(":\n");
        visualizacao.append("Comidas: ").append(cardapio.getComidas()).append("\n");
        visualizacao.append("Bebidas: ").append(cardapio.getBebidas()).append("\n\n");
    }
    
    jTextArea1.setText(visualizacao.toString());
}




    private void limparCampos() {
        TxtNome.setText("");
        BtnComida.setSelected(false);
        BtnBebida.setSelected(false);
    }

    public static void main(String args[]) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BtnBebida;
    private javax.swing.JRadioButton BtnComida;
    private javax.swing.JComboBox<String> EscolhaDia;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}


