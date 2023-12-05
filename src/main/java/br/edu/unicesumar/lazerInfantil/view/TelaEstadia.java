
package br.edu.unicesumar.lazerInfantil.view;

import br.edu.unicesumar.lazerInfantil.core.controllers.EstadiaController;
import br.edu.unicesumar.lazerInfantil.core.entity.Crianca;
import br.edu.unicesumar.lazerInfantil.core.entity.Estadia;
import br.edu.unicesumar.lazerInfantil.core.entity.Responsavel;
import javax.swing.JOptionPane;

/**
 * Tela referente a estadia na área infantil, sendo exibido os cadastros que foram recentemente efetuados
 * e o tempo utilizado.
 *
 * @author Artur Cadorin
 * @version 1.0
 */

public class TelaEstadia extends javax.swing.JFrame {
    
    private Responsavel referenciaResponsavel;
    private Crianca referenciaCrianca;
    private Estadia referenciaEstadia;

    public TelaEstadia() {
        initComponents();
        this.setVisible(true);
    }
    
    /**
     * Construtor de 2 argumentos, aonde é feito a passagem dos objetos que fazem referência ao 
     * cadastro tanto do responsável quanto da criança, atribuindo-os com os dados informados na tela anterior.
     * 
     * @param referenciaResponsavel Referência ao objeto responsável para passagem dos dados.
     * @param referenciaCrianca Referência ao objeto criança para passagem dos dados.
     */
    
    public TelaEstadia(Responsavel referenciaResponsavel, Crianca referenciaCrianca){
        initComponents();
        setVisible(true);
        
        this.referenciaResponsavel = referenciaResponsavel;
        this.referenciaCrianca = referenciaCrianca;
        
        textResponsavel.setText(referenciaResponsavel.getNome());
        textCrianca.setText(referenciaCrianca.getNome());
        textResponsavel.setEditable(false);
        textCrianca.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        labelResponsavel = new javax.swing.JLabel();
        textResponsavel = new javax.swing.JTextField();
        labelCrianca = new javax.swing.JLabel();
        textCrianca = new javax.swing.JTextField();
        labelTempo = new javax.swing.JLabel();
        textTempo = new javax.swing.JTextField();
        btnResumo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Estadia");
        setMinimumSize(new java.awt.Dimension(500, 350));
        setPreferredSize(new java.awt.Dimension(500, 350));
        setResizable(false);

        panelTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelTitulo.setMinimumSize(new java.awt.Dimension(100, 50));
        panelTitulo.setPreferredSize(new java.awt.Dimension(500, 50));
        panelTitulo.setLayout(new java.awt.BorderLayout());

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Etapa 3 de 3 - Cadastro da Estadia");
        panelTitulo.add(labelTitulo, java.awt.BorderLayout.CENTER);

        labelResponsavel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelResponsavel.setText("Responsável:");

        textResponsavel.setMinimumSize(new java.awt.Dimension(64, 26));
        textResponsavel.setPreferredSize(new java.awt.Dimension(64, 26));

        labelCrianca.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelCrianca.setText("Criança:");

        textCrianca.setPreferredSize(new java.awt.Dimension(64, 26));

        labelTempo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelTempo.setText("Tempo Utilizado (min):");

        textTempo.setPreferredSize(new java.awt.Dimension(64, 26));

        btnResumo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResumo.setText("Gerar Resumo");
        btnResumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnResumo)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addComponent(labelTempo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelResponsavel)
                                .addComponent(labelCrianca))
                            .addGap(18, 18, 18)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelResponsavel)
                    .addComponent(textResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCrianca)
                    .addComponent(textCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTempo)
                    .addComponent(textTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Evento de clique no botão avançar, primeiramente instanciando o objeto estadia, em sequência é realizado
     * a validação dos campos e atribuição dos dados para o objeto através do seu respectivo controller, se obtido sucesso
     * é instanciado uma nova tela de resumo, fazendo referência ao objeto estadia.
     * 
     * @param evt Paramêtro padrão gerado pelo netbeans.
     */
    
    private void btnResumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumoActionPerformed
        referenciaEstadia = new Estadia(this.referenciaResponsavel, this.referenciaCrianca);
        if (isCampoValido()) {
            referenciaEstadia.setTempoUtilizado(Integer.parseInt(textTempo.getText()));
            if(EstadiaController.salvarEstadia(referenciaEstadia)){
                new TelaResumo(referenciaEstadia);
            }
        }
    }//GEN-LAST:event_btnResumoActionPerformed
    
    /**
     * Verificar se o campos tempo utilizado foi preenchido, retornando false e uma mensagem de erro
     * caso ainda esteja vazio, além disso é feito um try catch ao realizar o parse do respectivo campo,
     * podendo também retornar uma mensagem de erro caso não seja possível realizar o parse.
     * 
     * @return Boolean conforme o preenchimento dos campos.
     */
    private boolean isCampoValido(){
        if(textTempo.getText().length() <= 0){
            JOptionPane.showMessageDialog(this, "Por favor preencha o campo tempo utilizado.");
            return false;
        }else{
            try{
                Integer.parseInt(textTempo.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Tempo não permitido.");
                return false;
            }
        }
        return true;
    }
        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstadia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResumo;
    private javax.swing.JLabel labelCrianca;
    private javax.swing.JLabel labelResponsavel;
    private javax.swing.JLabel labelTempo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField textCrianca;
    private javax.swing.JTextField textResponsavel;
    private javax.swing.JTextField textTempo;
    // End of variables declaration//GEN-END:variables
}
