//VitorGabrielMenckDiniz - RA:2487870
//GuilhermeRenatoTerraMacedo - RA:2313030

package View;

import Controller.Banco;
import Model.Atleta;
import javax.swing.JOptionPane;


public class CadastrarAtleta extends javax.swing.JFrame {

    private static CadastrarAtleta cadastrarAtletaUnic;
    private Atleta a = new Atleta();
    
    public CadastrarAtleta() {
        initComponents();
    }
    
    public static CadastrarAtleta getCadastrarAtleta(){
        if(cadastrarAtletaUnic == null){
            cadastrarAtletaUnic = new CadastrarAtleta();
        } 
        return cadastrarAtletaUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotCadAtleta = new javax.swing.JLabel();
        rotNomeAtleta = new javax.swing.JLabel();
        rotPosicao = new javax.swing.JLabel();
        rotIdade = new javax.swing.JLabel();
        rotGols = new javax.swing.JLabel();
        rotAssistencia = new javax.swing.JLabel();
        cxNomeAtleta = new javax.swing.JTextField();
        cxPosicao = new javax.swing.JTextField();
        cxIdade = new javax.swing.JTextField();
        cxGols = new javax.swing.JTextField();
        cxAssistencias = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btCadAtleta = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotCadAtleta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotCadAtleta.setText("Cadastro de Atleta");

        rotNomeAtleta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rotNomeAtleta.setText("Nome do Alteta:");

        rotPosicao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rotPosicao.setText("Posicao:");

        rotIdade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rotIdade.setText("Idade:");

        rotGols.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rotGols.setText("Gols:");

        rotAssistencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rotAssistencia.setText("Assistencia:");

        cxAssistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAssistenciasActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadAtleta.setText("Cadastrar");
        btCadAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadAtletaActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(rotCadAtleta))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotNomeAtleta)
                            .addComponent(rotPosicao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rotIdade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rotGols, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rotAssistencia, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxNomeAtleta)
                            .addComponent(cxPosicao)
                            .addComponent(cxIdade)
                            .addComponent(cxGols)
                            .addComponent(cxAssistencias))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadAtleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotCadAtleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNomeAtleta)
                    .addComponent(cxNomeAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotIdade)
                    .addComponent(cxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxGols, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotGols))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotAssistencia)
                    .addComponent(cxAssistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btCadAtleta)
                    .addComponent(btLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxAssistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAssistenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAssistenciasActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadAtletaActionPerformed
        cadastraAtleta();
        limpar();
    }//GEN-LAST:event_btCadAtletaActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    public void cadastraAtleta(){
        Atleta a = new Atleta();
        
        boolean verif1 = false;
        boolean verif2 = false;
        boolean verif3 = false;

            a.setNomeAtleta(cxNomeAtleta.getText());
            a.setPosicao(cxPosicao.getText());

            try {
                a.setIdadeAtleta(Integer.parseInt(cxIdade.getText()));
                verif1 = true;
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
            }
 
            

            try {
                a.setGols(Integer.parseInt(cxGols.getText()));
                verif2 = true;
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
            }
            
            

            try {
                a.setAssistencias(Integer.parseInt(cxAssistencias.getText()));
                verif3 = true;
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
            }

       
            if(verif1 && verif2 && verif3 ){
                a = Banco.getBanco().cadastraAtleta(a);
                if(a!=null){
                    JOptionPane.showMessageDialog(null,"CADASTRO CONCLUIDO","CADASTRO DE ATLETA",1);
                }else {
                    JOptionPane.showMessageDialog(null,"ESSE ATLETA JA EXISTE","CADASTRO DE ATLETA",3);
                }
            }
    }

    public void limpar(){
        cxNomeAtleta.setText("");
        cxNomeAtleta.requestFocus();
        cxPosicao.setText("");
        cxIdade.setText("");
        cxGols.setText("");
        cxAssistencias.setText("");
    }
    
    public void sair(){
	int resp = JOptionPane.showConfirmDialog(null,"Deseja sair?","Saida",JOptionPane.YES_NO_OPTION);
            if(resp == 0){
                dispose();	
            }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAtleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadAtleta;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxAssistencias;
    private javax.swing.JTextField cxGols;
    private javax.swing.JTextField cxIdade;
    private javax.swing.JTextField cxNomeAtleta;
    private javax.swing.JTextField cxPosicao;
    private javax.swing.JLabel rotAssistencia;
    private javax.swing.JLabel rotCadAtleta;
    private javax.swing.JLabel rotGols;
    private javax.swing.JLabel rotIdade;
    private javax.swing.JLabel rotNomeAtleta;
    private javax.swing.JLabel rotPosicao;
    // End of variables declaration//GEN-END:variables
}
