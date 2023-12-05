
package br.edu.unicesumar.lazerInfantil.view;

/**
 * Tela inicial do sistema, exibindo a opção de cadastro de usuário.
 * 
 * @author Artur Cadorin
 * @version 1.0
 */
public class TelaInicial extends javax.swing.JFrame {

   
    public TelaInicial() {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 110), new java.awt.Dimension(0, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(130, 0), new java.awt.Dimension(0, 0));
        btnCadastrar = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 110), new java.awt.Dimension(0, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(130, 0), new java.awt.Dimension(32767, 0));
        panelRodape = new javax.swing.JPanel();
        labelHorario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lazer Infantil - Shopping");
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        panelTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelTitulo.setLayout(new java.awt.BorderLayout());

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setLabelFor(panelTitulo);
        labelTitulo.setText("Lazer Infantil - Shopping");
        labelTitulo.setPreferredSize(new java.awt.Dimension(210, 45));
        panelTitulo.add(labelTitulo, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelTitulo, java.awt.BorderLayout.NORTH);

        panelPrincipal.setLayout(new java.awt.BorderLayout());
        panelPrincipal.add(filler1, java.awt.BorderLayout.PAGE_START);
        panelPrincipal.add(filler3, java.awt.BorderLayout.LINE_START);

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar Usuário");
        btnCadastrar.setFocusable(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCadastrar, java.awt.BorderLayout.CENTER);
        panelPrincipal.add(filler2, java.awt.BorderLayout.PAGE_END);
        panelPrincipal.add(filler4, java.awt.BorderLayout.LINE_END);

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        labelHorario.setText("horario");

        javax.swing.GroupLayout panelRodapeLayout = new javax.swing.GroupLayout(panelRodape);
        panelRodape.setLayout(panelRodapeLayout);
        panelRodapeLayout.setHorizontalGroup(
            panelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRodapeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHorario)
                .addContainerGap(456, Short.MAX_VALUE))
        );
        panelRodapeLayout.setVerticalGroup(
            panelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRodapeLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(labelHorario)
                .addContainerGap())
        );

        getContentPane().add(panelRodape, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Método de clique do botão 'Cadastrar Usuário', instanciando a proxima tela.
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        new TelaCadastroResponsavel();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JLabel labelHorario;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelRodape;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
