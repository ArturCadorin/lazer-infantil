
package br.edu.unicesumar.lazerInfantil.view;

import br.edu.unicesumar.lazerInfantil.core.controllers.CriancaController;
import br.edu.unicesumar.lazerInfantil.core.entity.Crianca;
import br.edu.unicesumar.lazerInfantil.core.entity.Responsavel;
import javax.swing.JOptionPane;

/**
 * Tela de cadastro da criança, exibindo as informações necessária para realizar
 * o cadastro no sistema.
 * 
 * @author Artur Cadorin
 * @version 1.0
 */
public class TelaCadastroCrianca extends javax.swing.JFrame {
    
    private Responsavel referenciaResponsavel;
    private Crianca referenciaCrianca;
    
    public TelaCadastroCrianca() {
        initComponents();
        this.setVisible(true);
    }
    
    /**
     * Construtor de 2 argumentos, aonde é feito a passagem dos objetos que fazem referência ao 
     * cadastro tanto do responsável quanto da criança, atribuindo-os com os dados informados na tela anterior.
     * 
     * @param referenciaCrianca Referência ao objeto criança para passagem dos dados.
     * @param referenciaResponsavel Referência ao objeto responsável para passagem dos dados.
     */
    
    public TelaCadastroCrianca(Crianca referenciaCrianca, Responsavel referenciaResponsavel){
        initComponents();
        setVisible(true);
        this.referenciaResponsavel = referenciaResponsavel;
        this.referenciaCrianca = referenciaCrianca;
        textResponsavel.setText(referenciaResponsavel.getNome());
        textResponsavel.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelPrincipal = new javax.swing.JPanel();
        labelResponsavel = new javax.swing.JLabel();
        textResponsavel = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelSexo = new javax.swing.JLabel();
        labelIdade = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textSexo = new javax.swing.JTextField();
        textIdade = new javax.swing.JTextField();
        btnAvancar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Criança");
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        panelTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelTitulo.setMinimumSize(new java.awt.Dimension(292, 60));
        panelTitulo.setPreferredSize(new java.awt.Dimension(500, 60));
        panelTitulo.setLayout(new java.awt.BorderLayout());

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Etapa 2 de 3 - Cadastro da Criança");
        panelTitulo.add(labelTitulo, java.awt.BorderLayout.CENTER);

        labelResponsavel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelResponsavel.setText("Responsável:");

        textResponsavel.setMinimumSize(new java.awt.Dimension(64, 26));
        textResponsavel.setPreferredSize(new java.awt.Dimension(64, 26));

        labelNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelNome.setText("Nome:");

        labelSexo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelSexo.setText("Sexo:");

        labelIdade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelIdade.setText("Idade:");

        textNome.setMinimumSize(new java.awt.Dimension(64, 26));
        textNome.setPreferredSize(new java.awt.Dimension(64, 26));

        textSexo.setMinimumSize(new java.awt.Dimension(64, 26));
        textSexo.setPreferredSize(new java.awt.Dimension(64, 26));

        textIdade.setMinimumSize(new java.awt.Dimension(64, 26));
        textIdade.setPreferredSize(new java.awt.Dimension(64, 26));

        btnAvancar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAvancar.setText("Avançar");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout labelPrincipalLayout = new javax.swing.GroupLayout(labelPrincipal);
        labelPrincipal.setLayout(labelPrincipalLayout);
        labelPrincipalLayout.setHorizontalGroup(
            labelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelPrincipalLayout.createSequentialGroup()
                .addGroup(labelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(labelPrincipalLayout.createSequentialGroup()
                        .addGroup(labelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(labelPrincipalLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(labelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNome)
                                    .addComponent(labelSexo)
                                    .addComponent(labelIdade))
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelResponsavel)
                                .addGap(18, 18, 18)))
                        .addGroup(labelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textNome, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(textSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textResponsavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        labelPrincipalLayout.setVerticalGroup(
            labelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(labelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelResponsavel))
                .addGap(18, 18, 18)
                .addGroup(labelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(labelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSexo))
                .addGap(18, 18, 18)
                .addGroup(labelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdade))
                .addGap(31, 31, 31)
                .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento de clique no botão avançar, primeiramente validando se os campos foram todos preenchidos, em sequência é realizado
     * a validação dos campos e atribuição dos dados para o objeto através do seu respectivo controller, se obtido sucesso
     * é instanciado uma nova tela fazendo referência aos objetos Criança e Responsável.
     * 
     * @param evt Paramêtro padrão gerado pelo netbeans.
     */
    
    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        if(isCampoValido()){
            referenciaCrianca.setResponsavel(referenciaResponsavel);
            transferirDados();
            if(CriancaController.salvarCrianca(this.referenciaCrianca)){
                new TelaEstadia(this.referenciaResponsavel, this.referenciaCrianca);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnAvancarActionPerformed

    /**
     * Verificar se os campos foram todos preenchidos, retornando false e uma mensagem de erro
     * caso ainda reste algum campo não preenchido na tela, além disso é feito um try catch ao realizar o parse do campo idade,
     * podendo também retornar uma mensagem de erro caso não seja possível realizar o respectivo parse.
     * 
     * @return Boolean conforme o preenchimento dos campos.
     */
    
    private boolean isCampoValido(){
        if(textNome.getText().length() <= 0 || textIdade.getText().length() <= 0
                || textSexo.getText().length() <= 0){
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
     * Transferir os dados dos campos para o objeto criança referênciado na classe.
     */
    
    private void transferirDados(){
        referenciaCrianca.setNome(textNome.getText());
        referenciaCrianca.setIdade(Integer.parseInt(textIdade.getText()));
        referenciaCrianca.setSexo(textSexo.getText());
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCrianca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelNome;
    private javax.swing.JPanel labelPrincipal;
    private javax.swing.JLabel labelResponsavel;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField textIdade;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textResponsavel;
    private javax.swing.JTextField textSexo;
    // End of variables declaration//GEN-END:variables
}
