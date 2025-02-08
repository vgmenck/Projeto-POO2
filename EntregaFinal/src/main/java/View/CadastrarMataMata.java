//VitorGabrielMenckDiniz - RA:2487870
//GuilhermeRenatoTerraMacedo - RA:2313030

package View;

import Model.LigaException;
import Model.MataMata;
import Controller.Banco;
import javax.swing.JOptionPane;


public class CadastrarMataMata extends javax.swing.JFrame {

    private static CadastrarMataMata cadastrarMataMataUnic;
    private MataMata mm = new MataMata();
    

    public CadastrarMataMata() {
        initComponents();
    }

    public static CadastrarMataMata getCadastrarMataMata(){
        if(cadastrarMataMataUnic == null){
            cadastrarMataMataUnic = new CadastrarMataMata();
        } 
        return cadastrarMataMataUnic;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadAtleta = new javax.swing.JButton();
        rotPais = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        rotTimes = new javax.swing.JLabel();
        rotArtilheiro = new javax.swing.JLabel();
        rotGarcom = new javax.swing.JLabel();
        rotMelhorAtaque = new javax.swing.JLabel();
        rotMelhorDefesa = new javax.swing.JLabel();
        cxArtilheiro = new javax.swing.JTextField();
        cxGarcom = new javax.swing.JTextField();
        cxMelhorAtaque = new javax.swing.JTextField();
        cxMelhorDefesa = new javax.swing.JTextField();
        rotGols = new javax.swing.JLabel();
        rotPremiacao = new javax.swing.JLabel();
        rotNumFases = new javax.swing.JLabel();
        cxNomeLiga = new javax.swing.JTextField();
        rotFaseAtual = new javax.swing.JLabel();
        cxPais = new javax.swing.JTextField();
        rotTimesRestantes = new javax.swing.JLabel();
        cxQtdTimes = new javax.swing.JTextField();
        cxNumFases = new javax.swing.JTextField();
        cxJogos = new javax.swing.JTextField();
        cxFaseAtual = new javax.swing.JTextField();
        cxPremiacao = new javax.swing.JTextField();
        cxTimesRestantes = new javax.swing.JTextField();
        rotCadMm = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        rotNomeLiga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btCadAtleta.setText("Cadastrar");
        btCadAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadAtletaActionPerformed(evt);
            }
        });

        rotPais.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotPais.setText("Pais:");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        rotTimes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotTimes.setText("Quantidade de Times");

        rotArtilheiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotArtilheiro.setText("Artilheiro:");

        rotGarcom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotGarcom.setText("Melhor Assistente:");

        rotMelhorAtaque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotMelhorAtaque.setText("Melhor Ataque:");

        rotMelhorDefesa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotMelhorDefesa.setText("Melhor Defesa:");

        rotGols.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotGols.setText("Numero de Jogos:");

        rotPremiacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotPremiacao.setText("Premiacao:");

        rotNumFases.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNumFases.setText("Numero de Fases:");

        cxNomeLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeLigaActionPerformed(evt);
            }
        });

        rotFaseAtual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotFaseAtual.setText("Fase Atual:");

        rotTimesRestantes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotTimesRestantes.setText("Numero de Times Restantes:");

        cxPremiacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPremiacaoActionPerformed(evt);
            }
        });

        rotCadMm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotCadMm.setText("Cadastro de Liga de Mata-Mata");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        rotNomeLiga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNomeLiga.setText("Nome da Liga:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 81, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadAtleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rotArtilheiro)
                            .addComponent(rotGarcom)
                            .addComponent(rotPremiacao)
                            .addComponent(rotGols)
                            .addComponent(rotTimes)
                            .addComponent(rotPais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxGarcom)
                            .addComponent(cxArtilheiro)
                            .addComponent(cxPremiacao)
                            .addComponent(cxJogos)
                            .addComponent(cxQtdTimes)
                            .addComponent(cxPais)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(rotNomeLiga)
                        .addGap(6, 6, 6)
                        .addComponent(cxNomeLiga))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(142, 142, 142)
                                    .addComponent(rotMelhorDefesa))
                                .addComponent(rotMelhorAtaque, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(rotFaseAtual, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rotNumFases, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rotTimesRestantes, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxMelhorAtaque)
                            .addComponent(cxMelhorDefesa)
                            .addComponent(cxNumFases)
                            .addComponent(cxFaseAtual)
                            .addComponent(cxTimesRestantes))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(rotCadMm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotCadMm)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNomeLiga)
                    .addComponent(cxNomeLiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotPais, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotTimes)
                    .addComponent(cxQtdTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotGols)
                    .addComponent(cxJogos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotPremiacao)
                    .addComponent(cxPremiacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotArtilheiro)
                    .addComponent(cxArtilheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotGarcom)
                    .addComponent(cxGarcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotMelhorAtaque)
                    .addComponent(cxMelhorAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotMelhorDefesa)
                    .addComponent(cxMelhorDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNumFases)
                    .addComponent(cxNumFases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotFaseAtual)
                    .addComponent(cxFaseAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotTimesRestantes)
                    .addComponent(cxTimesRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btCadAtleta)
                    .addComponent(btLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadAtletaActionPerformed
        cadastraMataMata();
        limpar();
    }//GEN-LAST:event_btCadAtletaActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void cxNomeLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeLigaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeLigaActionPerformed

    private void cxPremiacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPremiacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPremiacaoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    public void cadastraMataMata(){
        MataMata mm = new MataMata();
        boolean verif1 = false;
        boolean verif2 = false;
        boolean verif3 = false;
        boolean verif4 = false;
        boolean verif5 = false;
        boolean verif6 = false;

        try{
            mm.setNomeLiga(cxNomeLiga.getText());
            verif1 = true;
        }catch(LigaException le){
            JOptionPane.showMessageDialog(null,"Liga nao cadastrada corretamente","ERRO",0);
        }
        mm.setPais(cxPais.getText());

        try {
            mm.setQtdTimes(Integer.parseInt(cxQtdTimes.getText()));
            verif2 = true;
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
        }

        try {
            mm.setQtdJogos(Integer.parseInt(cxJogos.getText()));
            verif3 = true;
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
        }

        try {
            mm.setPremiacao(Integer.parseInt(cxPremiacao.getText()));
            verif4 = true;
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
        }

        mm.setArtilheiro(cxArtilheiro.getText());
        mm.setGarcom(cxGarcom.getText());
        mm.setMelhorAtaque(cxMelhorAtaque.getText());
        mm.setMelhorDefesa(cxMelhorDefesa.getText());

        try {
            mm.setQtdFases(Integer.parseInt(cxNumFases.getText()));
            verif5 = true;
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
        }
 
        mm.setFaseAtual(cxFaseAtual.getText());


        try {
            mm.setQtdTimesRestantes(Integer.parseInt(cxTimesRestantes.getText()));
            verif6 = true;
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
        }     

        if(verif1 && verif2 && verif3 && verif4 && verif5 && verif6){
            mm = Banco.getBanco().cadastraMataMata(mm);
             if(mm!=null){
                JOptionPane.showMessageDialog(null,"CADASTRO CONCLUIDO","CADASTRO DE LIGA",1);
            }else {
                JOptionPane.showMessageDialog(null,"ESSA LIGA JA EXISTE","CADASTRO DE LIGA",3);
            }
        }
   
    }
    
    public void limpar(){
        cxNomeLiga.setText("");
        cxNomeLiga.requestFocus();
        cxPais.setText("");
        cxQtdTimes.setText("");
        cxJogos.setText("");
        cxPremiacao.setText("");
        cxArtilheiro.setText("");
        cxGarcom.setText("");
        cxMelhorAtaque.setText("");
        cxMelhorDefesa.setText("");
        cxNumFases.setText("");
        cxFaseAtual.setText("");
        cxTimesRestantes.setText("");
    }
    
    public void sair(){
		int resp = JOptionPane.showConfirmDialog(null,"DESEJA SAIR?","SAIDA",JOptionPane.YES_NO_OPTION);
			if(resp == 0){
                            dispose();	
			}
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarMataMata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadAtleta;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxArtilheiro;
    private javax.swing.JTextField cxFaseAtual;
    private javax.swing.JTextField cxGarcom;
    private javax.swing.JTextField cxJogos;
    private javax.swing.JTextField cxMelhorAtaque;
    private javax.swing.JTextField cxMelhorDefesa;
    private javax.swing.JTextField cxNomeLiga;
    private javax.swing.JTextField cxNumFases;
    private javax.swing.JTextField cxPais;
    private javax.swing.JTextField cxPremiacao;
    private javax.swing.JTextField cxQtdTimes;
    private javax.swing.JTextField cxTimesRestantes;
    private javax.swing.JLabel rotArtilheiro;
    private javax.swing.JLabel rotCadMm;
    private javax.swing.JLabel rotFaseAtual;
    private javax.swing.JLabel rotGarcom;
    private javax.swing.JLabel rotGols;
    private javax.swing.JLabel rotMelhorAtaque;
    private javax.swing.JLabel rotMelhorDefesa;
    private javax.swing.JLabel rotNomeLiga;
    private javax.swing.JLabel rotNumFases;
    private javax.swing.JLabel rotPais;
    private javax.swing.JLabel rotPremiacao;
    private javax.swing.JLabel rotTimes;
    private javax.swing.JLabel rotTimesRestantes;
    // End of variables declaration//GEN-END:variables
}
