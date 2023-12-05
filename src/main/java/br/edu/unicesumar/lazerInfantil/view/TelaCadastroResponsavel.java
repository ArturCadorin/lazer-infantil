
package br.edu.unicesumar.lazerInfantil.view;

import br.edu.unicesumar.lazerInfantil.core.controllers.ResponsavelController;
import br.edu.unicesumar.lazerInfantil.core.entity.Crianca;
import br.edu.unicesumar.lazerInfantil.core.entity.Responsavel;
import javax.swing.JOptionPane;

/**
 * Tela de cadastro do responsável, exibindo as informações necessárias para realizar
 * o cadastro no sistema.
 * 
 * @author Artur Cadorin
 * @version 1.0
 */
public class TelaCadastroResponsavel extends javax.swing.JFrame {
    
    private Responsavel referenciaResponsavel;

    public TelaCadastroResponsavel() {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        textCPF = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        textTelefone = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        textEndereco = new javax.swing.JTextField();
        labelIdade = new javax.swing.JLabel();
        textIdade = new javax.swing.JTextField();
        btnAvancar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Responsável");
        setMinimumSize(new java.awt.Dimension(500, 450));
        setPreferredSize(new java.awt.Dimension(500, 450));
        setResizable(false);

        panelTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        panelTitulo.setMinimumSize(new java.awt.Dimension(338, 60));
        panelTitulo.setPreferredSize(new java.awt.Dimension(500, 60));
        panelTitulo.setLayout(new java.awt.BorderLayout());

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Etapa 1 de 3 - Cadastro do Responsável");
        panelTitulo.add(labelTitulo, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelTitulo, java.awt.BorderLayout.NORTH);

        labelNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelNome.setText("Nome:");

        textNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        labelCPF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelCPF.setText("CPF:");

        textCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        labelTelefone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelTelefone.setText("Telefone:");

        textTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelEmail.setText("Email:");

        textEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        labelEndereco.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelEndereco.setText("Endereço:");

        textEndereco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        labelIdade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelIdade.setText("Idade:");

        textIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnAvancar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAvancar.setText("Avançar");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIdade)
                    .addComponent(labelCPF)
                    .addComponent(labelNome)
                    .addComponent(labelTelefone)
                    .addComponent(labelEmail)
                    .addComponent(labelEndereco))
                .addGap(28, 28, 28)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCPF))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdade))
                .addGap(18, 18, 18)
                .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Evento de clique no botão avançar, primeiramente instanciando o objeto responsavel, em sequência é realizado
     * a validação dos campos e atribuição dos dados para o objeto através do seu respectivo controller, se obtido sucesso
     * é instanciado uma nova tela fazendo referência a um novo objeto criança além do objeto responsável já atribuido.
     * 
     * @param evt Paramêtro padrão gerado pelo netbeans.
     */
    
    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        referenciaResponsavel = new Responsavel(); // Instanciando o Responsavel
        if(isCampoValido()){
            transferirDados();
            if(ResponsavelController.salvarResponsavel(referenciaResponsavel)){
                Crianca referenciaCrianca = new Crianca();
                new TelaCadastroCrianca(referenciaCrianca, referenciaResponsavel);
                this.dispose();
            }
        }  
    }//GEN-LAST:event_btnAvancarActionPerformed
    
    /**
     * Verificar se os campos foram todos preenchidos, retornando false e uma mensagem de erro
     * caso ainda reste algum campo vazio na tela, além disso é feito um try catch ao realizar o parse do campo idade,
     * podendo também retornar uma mensagem de erro caso não seja possível realizar o respectivo parse.
     * 
     * @return Boolean conforme o preenchimento dos campos.
     */
    
    private boolean isCampoValido(){
        if(textNome.getText().length() <= 0 || textCPF.getText().length() <= 0
                || textTelefone.getText().length() <= 0 || textEmail.getText().length() <= 0
                || textEndereco.getText().length() <= 0 || textIdade.getText().length() <= 0){
            JOptionPane.showMessageDialog(this, "Por favor preencha todos os campos.");
            return false;
        }else{
            try{
                Integer.parseInt(textIdade.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Idade não permitida.");
                return false;
            }
        }
        return true;
    }  
    
    /**
     * Transferir os dados dos campos para o objeto responsável referênciado na classe.
     * 
     */
    
    private void transferirDados(){
        referenciaResponsavel.setNome(textNome.getText());
        referenciaResponsavel.setCpf(textCPF.getText());
        referenciaResponsavel.setTelefone(textTelefone.getText());
        referenciaResponsavel.setEmail(textEmail.getText());
        referenciaResponsavel.setEndereco(textEndereco.getText());
        referenciaResponsavel.setIdade(Integer.parseInt(textIdade.getText()));
    }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroResponsavel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField textCPF;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textEndereco;
    private javax.swing.JTextField textIdade;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}
