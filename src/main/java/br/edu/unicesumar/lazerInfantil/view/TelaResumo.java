
package br.edu.unicesumar.lazerInfantil.view;

import br.edu.unicesumar.lazerInfantil.core.controllers.EstadiaController;
import br.edu.unicesumar.lazerInfantil.core.entity.Crianca;
import br.edu.unicesumar.lazerInfantil.core.entity.Estadia;
import br.edu.unicesumar.lazerInfantil.core.entity.Responsavel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 * Tela de resumo da estadia, contendo as informação relativas a estadia na área infantil, além
 * do tempo utilizado e o valor a ser pago.
 * 
 * @author Artur Cadorin
 * @version 1.0
 */

public class TelaResumo extends javax.swing.JFrame {
    
    private Estadia referenciaEstadia;
    
    public TelaResumo() {
        initComponents();
        setVisible(true);
    }
    
    public TelaResumo(Estadia referenciaEstadia) {
        initComponents();
        setVisible(true);
        
        this.referenciaEstadia = referenciaEstadia;
        textPanelRelatorio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        textResumo = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 500));

        textResumo.setEditable(false);
        textResumo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane.setViewportView(textResumo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Exibir relatório no JTextPanel, realizando a centralização do texto bem como
     * alteração na sua respectiva font.
     */
    
    private void textPanelRelatorio(){
        StyledDocument documentStyle = textResumo.getStyledDocument();
        SimpleAttributeSet centerAttribute = new SimpleAttributeSet();
        StyleConstants.setAlignment(centerAttribute, StyleConstants.ALIGN_CENTER);
        documentStyle.setParagraphAttributes(0, documentStyle.getLength(), centerAttribute, false); 
        
        textResumo.setText(relatorio());
    }
    
    /**
     * Gerar relatório da estadia, este método recebe mais 2 métodos complementares dentro
     * de seu bloco de instrução, fazendo a complementação do relatório a ser exibido.
     * 
     * @return String do relátorio gerado.
     */
    
    private String relatorio(){
        return "Dados da Estadia" + relatorioResponsavel() + 
                relatorioCrianca() + "\n\nTempo Utilizado: " + referenciaEstadia.getTempoUtilizado() +
                " min" + EstadiaController.valorEstadia(referenciaEstadia);
    }
    
    /**
     * Gerar relatório do responsável, este método fará a complementação 
     * do relatório final.
     * 
     * @return String referente ao relatório do responsável.
     */
    
    private String relatorioResponsavel(){
        Responsavel responsavel = referenciaEstadia.getReferenciaResponsavel();
        
        return "\n\nDados do Responsável" +
                "\nNome: " + responsavel.getNome() + "\nCPF: " + responsavel.getCpf() +
                "\nTelefone: " + responsavel.getTelefone() + "\nEmail: " + responsavel.getTelefone() +
                "\nEndereço: " + responsavel.getEndereco() + "\nIdade: " + responsavel.getIdade();
    }
    
    /**
     * Gerar relatório da criança, este método fará a complementação do relatório final.
     * 
     * @return String referente ao relatório da criança.
     */
    
    private String relatorioCrianca(){
        Crianca crianca = referenciaEstadia.getReferenciaCrianca();
        
        return "\n\nDados da Criança" + 
                "\nNome: " + crianca.getNome() + "\nIdade: " + crianca.getIdade() +
                "\nSexo: " + crianca.getSexo();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaResumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextPane textResumo;
    // End of variables declaration//GEN-END:variables
}
