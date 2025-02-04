//VitorGabrielMenckDiniz - RA:2487870
package com.mycompany.entregafinal;

import javax.swing.JOptionPane;

public class CadastrarClube extends javax.swing.JFrame {

    private static CadastrarClube cadastrarClubeUnic;
    private Clube c = new Clube();

    public CadastrarClube() {
        initComponents();
    }
    
    public static CadastrarClube getCadastrarClube(){
        if(cadastrarClubeUnic == null){
            cadastrarClubeUnic = new CadastrarClube();
        } 
        return cadastrarClubeUnic;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotCadClube = new javax.swing.JLabel();
        rotNomeTime = new javax.swing.JLabel();
        rotAnoFund = new javax.swing.JLabel();
        rotQtdTitulos = new javax.swing.JLabel();
        rotEstado = new javax.swing.JLabel();
        rotCidade = new javax.swing.JLabel();
        cxNomeTime = new javax.swing.JTextField();
        cxAnoFund = new javax.swing.JTextField();
        cxQtdTitulos = new javax.swing.JTextField();
        cxEstado = new javax.swing.JTextField();
        cxCidade = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btCadastar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotCadClube.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotCadClube.setText("Cadastro de Clube");

        rotNomeTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rotNomeTime.setText("Nome do Time:");

        rotAnoFund.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rotAnoFund.setText("Ano de Fundacao:");

        rotQtdTitulos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rotQtdTitulos.setText("Quantidade de Titulos:");

        rotEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rotEstado.setText("Estado:");

        rotCidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rotCidade.setText("Cidade:");

        cxAnoFund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAnoFundActionPerformed(evt);
            }
        });

        cxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEstadoActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadastar.setText("Cadastrar");
        btCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastarActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rotQtdTitulos)
                                .addComponent(rotEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rotCidade, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(rotAnoFund)
                            .addComponent(rotNomeTime))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cxCidade)
                            .addComponent(cxQtdTitulos)
                            .addComponent(cxAnoFund, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxNomeTime, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(rotCadClube))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCadastar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSair)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotCadClube)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNomeTime)
                    .addComponent(cxNomeTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxAnoFund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotAnoFund))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotQtdTitulos)
                    .addComponent(cxQtdTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotEstado)
                    .addComponent(cxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCidade)
                    .addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btCadastar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxAnoFundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAnoFundActionPerformed
        
    }//GEN-LAST:event_cxAnoFundActionPerformed

    private void cxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEstadoActionPerformed

    }//GEN-LAST:event_cxEstadoActionPerformed

    private void btCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastarActionPerformed
        cadastraCLube();
        limpar();
    }//GEN-LAST:event_btCadastarActionPerformed
    
    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpar();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void cadastraCLube() {
        c = new Clube();
        boolean verif1 = false;
        boolean verif2 = false;
        
        c.setNomeTime(cxNomeTime.getText());

        try {
            c.setFundacao(Integer.parseInt(cxAnoFund.getText()));
            verif2 = true;
        }catch(ClubeException ce) {
            JOptionPane.showMessageDialog(null,"O ANO DE FUNDACAO DEVE SER MAIOR QUE 1900 E MENOR QUE 2010","ERRO",0);
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
        }
        
        try {
            c.setQtdTitulos(Integer.parseInt(cxQtdTitulos.getText()));
            verif1 = true;
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor Digitado Incorretamente","ERRO",0);
        }

        c.setEstado(cxEstado.getText());
        c.setCidade(cxCidade.getText());
        
        if(verif1 && verif2){
            c = Banco.getBanco().cadastraClube(c);
            if(c!=null){
                JOptionPane.showMessageDialog(null,"CADASTRO CONCLUIDO","CADASTRO DE CLUBE",1);
            } else {
                JOptionPane.showMessageDialog(null,"ESSE CLUBE JA EXISTE","CADASTRO DE CLUBE",4);
        }
        }
     
    }    

    public void limpar(){
        cxNomeTime.setText("");
        cxAnoFund.setText("");
        cxQtdTitulos.setText("");
        cxEstado.setText("");
        cxCidade.setText("");
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
                new CadastrarClube().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxAnoFund;
    private javax.swing.JTextField cxCidade;
    private javax.swing.JTextField cxEstado;
    private javax.swing.JTextField cxNomeTime;
    private javax.swing.JTextField cxQtdTitulos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel rotAnoFund;
    private javax.swing.JLabel rotCadClube;
    private javax.swing.JLabel rotCidade;
    private javax.swing.JLabel rotEstado;
    private javax.swing.JLabel rotNomeTime;
    private javax.swing.JLabel rotQtdTitulos;
    // End of variables declaration//GEN-END:variables
}
