//VitorGabrielMenckDiniz - RA:2487870
//GuilhermeRenatoTerraMacedo - RA:2313030


package View;
import Model.LigaException;
import Model.PontosCorridos;
import Controller.Banco;
import javax.swing.JOptionPane;

public class CadastrarPontosCorridos extends javax.swing.JFrame {

    private static CadastrarPontosCorridos cadastrarPontosCorridosUnic;
    private PontosCorridos pc = new PontosCorridos();
    
    
        
    public CadastrarPontosCorridos() {
        initComponents();
    }
    
    public static CadastrarPontosCorridos getCadastrarPontosCorridos(){
        if(cadastrarPontosCorridosUnic == null){
            cadastrarPontosCorridosUnic = new CadastrarPontosCorridos();
        } 
        
        return cadastrarPontosCorridosUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotGols = new javax.swing.JLabel();
        rotPremiacao = new javax.swing.JLabel();
        cxNomeLiga = new javax.swing.JTextField();
        cxPais = new javax.swing.JTextField();
        cxQtdTimes = new javax.swing.JTextField();
        cxJogos = new javax.swing.JTextField();
        cxPremiacao = new javax.swing.JTextField();
        rotCadPc = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        rotNomeLiga = new javax.swing.JLabel();
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
        rotNumClass = new javax.swing.JLabel();
        rotNumClass2 = new javax.swing.JLabel();
        rotRebaxados = new javax.swing.JLabel();
        cxNumClass = new javax.swing.JTextField();
        cxNumClass2 = new javax.swing.JTextField();
        cxRebaixados = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotGols.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotGols.setText("Numero de Jogos:");

        rotPremiacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotPremiacao.setText("Premiacao:");

        cxNomeLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeLigaActionPerformed(evt);
            }
        });

        cxPremiacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPremiacaoActionPerformed(evt);
            }
        });

        rotCadPc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotCadPc.setText("Cadastro de Liga de Pontos Corridos");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        rotNomeLiga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNomeLiga.setText("Nome da Liga:");

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

        rotNumClass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNumClass.setText("Numero de Classificados:");

        rotNumClass2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNumClass2.setText("Numero de Classificados Secudarios:");

        rotRebaxados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotRebaxados.setText("Numero de Rebaixados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadAtleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(96, 96, 96)
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
                        .addGap(141, 141, 141)
                        .addComponent(rotNomeLiga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNomeLiga))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(136, 136, 136)
                                    .addComponent(rotMelhorDefesa))
                                .addComponent(rotMelhorAtaque, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rotNumClass)
                                .addComponent(rotNumClass2)
                                .addComponent(rotRebaxados)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxMelhorAtaque)
                            .addComponent(cxMelhorDefesa)
                            .addComponent(cxNumClass)
                            .addComponent(cxNumClass2)
                            .addComponent(cxRebaixados))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rotCadPc)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotCadPc)
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
                    .addComponent(rotNumClass)
                    .addComponent(cxNumClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNumClass2)
                    .addComponent(cxNumClass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotRebaxados)
                    .addComponent(cxRebaixados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btCadAtleta)
                    .addComponent(btLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxPremiacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPremiacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPremiacaoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadAtletaActionPerformed
        cadastraPontosCorridos();
        limpar();
    }//GEN-LAST:event_btCadAtletaActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void cxNomeLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeLigaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeLigaActionPerformed

    public void cadastraPontosCorridos(){
        PontosCorridos pc = new PontosCorridos();
        boolean verif1 = false;
        boolean verif2 = false;
        boolean verif3 = false;
        boolean verif4 = false;
        boolean verif5 = false;
        boolean verif6 = false;
        boolean verif7 = false;

        try{
            pc.setNomeLiga(cxNomeLiga.getText());
            verif1 = true;
        }catch(LigaException le){
            JOptionPane.showMessageDialog(null,"Liga nao cadastrada corretamente","ERRO",0);
        }
        
        pc.setPais(cxPais.getText());

        try {
            pc.setQtdTimes(Integer.parseInt(cxQtdTimes.getText()));
            verif2 = true;
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
        }
 
        try {
            pc.setQtdJogos(Integer.parseInt(cxJogos.getText()));
            verif3 = true;
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
        }

        try {
            pc.setPremiacao(Integer.parseInt(cxPremiacao.getText()));
            verif4 = true;
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
        }
            
        
        pc.setArtilheiro(cxArtilheiro.getText());
        pc.setGarcom(cxGarcom.getText());
        pc.setMelhorAtaque(cxMelhorAtaque.getText());
        pc.setMelhorDefesa(cxMelhorDefesa.getText());

        try {
            pc.setClasInter(Integer.parseInt(cxNumClass.getText()));
            verif5 = true;
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
        }

        try {
            pc.setClasInter2(Integer.parseInt(cxNumClass2.getText()));
            verif6 = true;
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
        }

        try {
            pc.setRebaixados(Integer.parseInt(cxRebaixados.getText()));
            verif7 = true;
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
        }

        if(verif1 && verif2 && verif3 && verif4 && verif5 && verif6 && verif7){
            pc = Banco.getBanco().cadastraPontosCorridos(pc);
            
            if(pc!=null){
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
        cxNumClass.setText("");
        cxNumClass2.setText("");
        cxRebaixados.setText("");
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
                new CadastrarPontosCorridos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadAtleta;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxArtilheiro;
    private javax.swing.JTextField cxGarcom;
    private javax.swing.JTextField cxJogos;
    private javax.swing.JTextField cxMelhorAtaque;
    private javax.swing.JTextField cxMelhorDefesa;
    private javax.swing.JTextField cxNomeLiga;
    private javax.swing.JTextField cxNumClass;
    private javax.swing.JTextField cxNumClass2;
    private javax.swing.JTextField cxPais;
    private javax.swing.JTextField cxPremiacao;
    private javax.swing.JTextField cxQtdTimes;
    private javax.swing.JTextField cxRebaixados;
    private javax.swing.JLabel rotArtilheiro;
    private javax.swing.JLabel rotCadPc;
    private javax.swing.JLabel rotGarcom;
    private javax.swing.JLabel rotGols;
    private javax.swing.JLabel rotMelhorAtaque;
    private javax.swing.JLabel rotMelhorDefesa;
    private javax.swing.JLabel rotNomeLiga;
    private javax.swing.JLabel rotNumClass;
    private javax.swing.JLabel rotNumClass2;
    private javax.swing.JLabel rotPais;
    private javax.swing.JLabel rotPremiacao;
    private javax.swing.JLabel rotRebaxados;
    private javax.swing.JLabel rotTimes;
    // End of variables declaration//GEN-END:variables
}
