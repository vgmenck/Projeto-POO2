//Apache NetBeans IDE 18
//VitorGabrielMenckDiniz - RA:2487870

package com.mycompany.entregafinal;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        rotPrincipal = new javax.swing.JLabel();
        rotProcuLiga = new javax.swing.JLabel();
        btDeletLiga = new javax.swing.JButton();
        btAlteraLiga = new javax.swing.JButton();
        btConsultaLiga = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btListaLigas = new javax.swing.JButton();
        rotNomeLiga = new javax.swing.JLabel();
        rotPaisLiga = new javax.swing.JLabel();
        cxNomeLiga = new javax.swing.JTextField();
        cxPaisLiga = new javax.swing.JTextField();
        bmMenu = new javax.swing.JMenuBar();
        mnLiga = new javax.swing.JMenu();
        cadPc = new javax.swing.JMenuItem();
        cadMm = new javax.swing.JMenuItem();
        cadFg = new javax.swing.JMenuItem();
        mnClube = new javax.swing.JMenu();
        cadClube = new javax.swing.JMenuItem();
        lstClube = new javax.swing.JMenuItem();
        mnAtleta = new javax.swing.JMenu();
        cadAtleta = new javax.swing.JMenuItem();
        lstAtleta = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        rotPrincipal.setText("Ligas ");
        rotPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rotPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        rotProcuLiga.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rotProcuLiga.setText("PROCURAR LIGA:");

        btDeletLiga.setText("Excluir Liga");
        btDeletLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletLigaActionPerformed(evt);
            }
        });

        btAlteraLiga.setText("Alterar Liga");
        btAlteraLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlteraLigaActionPerformed(evt);
            }
        });

        btConsultaLiga.setText("Consultar Ligas");
        btConsultaLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaLigaActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btListaLigas.setText("Listar Ligas");
        btListaLigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListaLigasActionPerformed(evt);
            }
        });

        rotNomeLiga.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rotNomeLiga.setText("Nome da Liga:");

        rotPaisLiga.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rotPaisLiga.setText("Pais da Liga:");

        mnLiga.setText("Liga");

        cadPc.setText("Cadastrar Liga de Pontos Corridos");
        cadPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadPcActionPerformed(evt);
            }
        });
        mnLiga.add(cadPc);

        cadMm.setText("Cadastrar Liga de Mata Mata");
        cadMm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadMmActionPerformed(evt);
            }
        });
        mnLiga.add(cadMm);

        cadFg.setText("Cadastar Liga de Fase de Grupo");
        cadFg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFgActionPerformed(evt);
            }
        });
        mnLiga.add(cadFg);

        bmMenu.add(mnLiga);

        mnClube.setText("Clubes");

        cadClube.setText("Cadastrar Clube");
        cadClube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadClubeActionPerformed(evt);
            }
        });
        mnClube.add(cadClube);

        lstClube.setText("Lista de Clubes");
        lstClube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstClubeActionPerformed(evt);
            }
        });
        mnClube.add(lstClube);

        bmMenu.add(mnClube);

        mnAtleta.setText("Atletas");

        cadAtleta.setText("Cadastrar Atleta");
        cadAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadAtletaActionPerformed(evt);
            }
        });
        mnAtleta.add(cadAtleta);

        lstAtleta.setText("Lista de Atletas");
        lstAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstAtletaActionPerformed(evt);
            }
        });
        mnAtleta.add(lstAtleta);

        bmMenu.add(mnAtleta);

        setJMenuBar(bmMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotPrincipal)
                    .addComponent(rotProcuLiga))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rotNomeLiga)
                            .addComponent(rotPaisLiga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxPaisLiga, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(cxNomeLiga)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btConsultaLiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAlteraLiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btListaLigas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btDeletLiga, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rotPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rotProcuLiga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNomeLiga)
                    .addComponent(cxNomeLiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotPaisLiga)
                    .addComponent(cxPaisLiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDeletLiga)
                    .addComponent(btConsultaLiga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlteraLiga)
                    .addComponent(btListaLigas))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDeletLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletLigaActionPerformed
        deletLigas();
        limpar();
    }//GEN-LAST:event_btDeletLigaActionPerformed

    private void btAlteraLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlteraLigaActionPerformed
        alterarLigas();
        limpar();
    }//GEN-LAST:event_btAlteraLigaActionPerformed

    private void btConsultaLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaLigaActionPerformed
        consultarLigas();
        limpar();
    }//GEN-LAST:event_btConsultaLigaActionPerformed

    private void btListaLigasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListaLigasActionPerformed
        ListarLigas.getListarLigas().setVisible(true);
    }//GEN-LAST:event_btListaLigasActionPerformed

    private void cadClubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadClubeActionPerformed
       CadastrarClube.getCadastrarClube().setVisible(true);
    }//GEN-LAST:event_cadClubeActionPerformed

    private void cadAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadAtletaActionPerformed
        CadastrarAtleta.getCadastrarAtleta().setVisible(true);
    }//GEN-LAST:event_cadAtletaActionPerformed

    private void lstClubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstClubeActionPerformed
        ListaClube.getListarClube().setVisible(true);
    }//GEN-LAST:event_lstClubeActionPerformed

    private void lstAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstAtletaActionPerformed
        ListaAtleta.getListarAtleta().setVisible(true);
    }//GEN-LAST:event_lstAtletaActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void cadPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadPcActionPerformed
        CadastrarPontosCorridos.getCadastrarPontosCorridos().setVisible(true);
    }//GEN-LAST:event_cadPcActionPerformed

    private void cadMmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadMmActionPerformed
        CadastrarMataMata.getCadastrarMataMata().setVisible(true);
    }//GEN-LAST:event_cadMmActionPerformed

    private void cadFgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFgActionPerformed
        CadastrarFasedeGrupos.getCadastrarFasedeGrupos().setVisible(true);
    }//GEN-LAST:event_cadFgActionPerformed

     public void consultarLigas(){
        PontosCorridos pc = new PontosCorridos();
        MataMata mm = new MataMata();
        FasedeGrupos fg = new FasedeGrupos();
        try{
            pc.setNomeLiga(cxNomeLiga.getText());
        }catch(LigaException le){
            JOptionPane.showMessageDialog(null,"Liga nao cadastrada corretamente","ERRO",4);
        }
        pc.setPais(cxPaisLiga.getText());
        
        try{
            mm.setNomeLiga(cxNomeLiga.getText());
        }catch(LigaException le){
            JOptionPane.showMessageDialog(null,"Liga nao cadastrada corretamente","ERRO",4);
        }
        mm.setPais(cxPaisLiga.getText());
        
        try{
            fg.setNomeLiga(cxNomeLiga.getText());
        }catch(LigaException le){
            JOptionPane.showMessageDialog(null,"Liga nao cadastrada corretamente","ERRO",4);
        }
        fg.setPais(cxPaisLiga.getText()); 
        
        pc = Banco.consultarPontosCorridos(pc);
        mm = Banco.consultarMataMata(mm);
        fg = Banco.consultarFasedeGrupos(fg);
        
        if(pc != null || mm != null || fg != null ){
           if (pc != null){
               JOptionPane.showMessageDialog(null, 
                    "Nome da Liga: " +pc.getNomeLiga()
                   +"\nPais: " +pc.getPais()
                   +"\nQuantidade de Times: " +pc.getQtdTimes()
                   +"\nQuantidade de Jogos: " +pc.getQtdJogos()
                   +"\nPremiacao: " +pc.getPremiacao()
                   +"\nArtilheiro: " +pc.getArtilheiro()
                   +"\nMaior Assistente: " +pc.getGarcom()
                   +"\nMelhor Ataque: " +pc.getMelhorAtaque() 
                   +"\nMelhor Defesa: " +pc.getMelhorDefesa()
                   +"\nClassificados para competiçoes internacionais primarias: " +pc.getClasInter()
                   +"\nClassificados para competiçoes internacionais secundarias: " +pc.getClasInter2() 
                   +"\nRebaixados: " +pc.getRebaixados() , "Consulta Ligas", 1);
           }else if(mm!=null){
               JOptionPane.showMessageDialog(null, 
                    "Nome da Liga: " +mm.getNomeLiga()
                   +"\nPais: " +mm.getPais()
                   +"\nQuantidade de Times: " +mm.getQtdTimes()
                   +"\nQuantidade de Jogos: " +mm.getQtdJogos()
                   +"\nPremiacao: " +mm.getPremiacao()
                   +"\nArtilheiro: " +mm.getArtilheiro()
                   +"\nMaior Assistente: " +mm.getGarcom()
                   +"\nMelhor Ataque: " +mm.getMelhorAtaque() 
                   +"\nMelhor Defesa: " +mm.getMelhorDefesa()
                   +"\nNumero de Fases: " +mm.getQtdFases()
                   +"\nFase Atual: " +mm.getFaseAtual()
                   +"\nQuantidade de Times Restantes: " +mm.getQtdTimesRestantes() , "Consulta Ligas", 1);
           }else if(fg != null){
                JOptionPane.showMessageDialog(null, 
                    "Nome da Liga: " +fg.getNomeLiga()
                   +"\nPais: " +fg.getPais()
                   +"\nQuantidade de Times: " +fg.getQtdTimes()
                   +"\nQuantidade de Jogos: " +fg.getQtdJogos()
                   +"\nPremiacao: " +fg.getPremiacao()
                   +"\nArtilheiro: " +fg.getArtilheiro()
                   +"\nMaior Assistente: " +fg.getGarcom()
                   +"\nMelhor Ataque: " +fg.getMelhorAtaque() 
                   +"\nMelhor Defesa: " +fg.getMelhorDefesa()
                   +"\nQuantidade de Grupos: " +fg.getQtdGrupos()
                   +"\nQuantidade de Times: " +fg.getQtdTimesGrupo()
                   +"\nQuantidade de Times Classificados por Grupo: " +fg.getQtdClasGrupo() , "Consulta Ligas", 1);
           }
        } else {
            JOptionPane.showMessageDialog(null,"Liga nao cadastrada","Consulta Ligas",1);
        }
    }
     
     public void deletLigas(){
        PontosCorridos pc = new PontosCorridos();
        MataMata mm = new MataMata();
        FasedeGrupos fg = new FasedeGrupos();
        try{
            pc.setNomeLiga(cxNomeLiga.getText());
        }catch(LigaException le){
            JOptionPane.showMessageDialog(null,"Liga nao cadastrada corretamente","ERRO",4);
        }
        pc.setPais(cxPaisLiga.getText());
        
        try{
            mm.setNomeLiga(cxNomeLiga.getText());
        }catch(LigaException le){
            JOptionPane.showMessageDialog(null,"Liga nao cadastrada corretamente","ERRO",4);
        }
        mm.setPais(cxPaisLiga.getText());
        
        try{
            fg.setNomeLiga(cxNomeLiga.getText());
        }catch(LigaException le){
            JOptionPane.showMessageDialog(null,"Liga nao cadastrada corretamente","ERRO",4);
        }
        fg.setPais(cxPaisLiga.getText()); 
        
        pc = Banco.delPontosCorridos(pc);
        mm = Banco.delMataMata(mm);
        fg = Banco.delFasedeGrupos(fg);
        
        if(pc == null || mm == null || fg == null ){
           if (pc == null){
               JOptionPane.showMessageDialog(null,"Liga excluida","Exclusao de Liga",1);
           }else if(mm == null){
               JOptionPane.showMessageDialog(null,"Liga excluida","Exclusao de Liga",1);
           }else if(fg == null){
                JOptionPane.showMessageDialog(null,"Liga excluida","Exclusao de Liga",1);
           }
        } else {
            JOptionPane.showMessageDialog(null,"Liga nao cadastrada","Exclusao de Liga",1);
        }
       
    }
     
    public void alterarLigas(){
        PontosCorridos pc = new PontosCorridos();
        MataMata mm = new MataMata();
        FasedeGrupos fg = new FasedeGrupos();
        
        try{
            pc.setNomeLiga(cxNomeLiga.getText());
        }catch(LigaException le){
            JOptionPane.showMessageDialog(null,"Liga nao cadastrada corretamente","ERRO",0);
        }
        pc.setPais(cxPaisLiga.getText());
        
        try{
            mm.setNomeLiga(cxNomeLiga.getText());
        }catch(LigaException le){
            JOptionPane.showMessageDialog(null,"Liga nao cadastrada corretamente","ERRO",0);
        }
        mm.setPais(cxPaisLiga.getText());
        
        try{
            fg.setNomeLiga(cxNomeLiga.getText());
        }catch(LigaException le){
            JOptionPane.showMessageDialog(null,"Liga nao cadastrada corretamente","ERRO",0);
        }
        fg.setPais(cxPaisLiga.getText()); 
        
        pc = Banco.alterarPontosCorridos(pc);
        mm = Banco.alterarMataMata(mm);
        fg = Banco.alterarFasedeGrupos(fg);
        
        if(pc != null || mm != null || fg != null){
            if(pc != null){
                cxNomeLiga.setText(pc.getNomeLiga());
                cxPaisLiga.setText(pc.getPais());
                
                JOptionPane.showMessageDialog(null,"Nome e Pais da Liga alterado", "Alteracao de Liga", 1);
            } else if (mm != null){
                cxNomeLiga.setText(pc.getNomeLiga());
                cxPaisLiga.setText(pc.getPais());
                
                JOptionPane.showMessageDialog(null,"Nome e Pais da Liga alterado", "Alteracao de Liga", 1);
            }else if(fg != null){
                cxNomeLiga.setText(pc.getNomeLiga());
                cxPaisLiga.setText(pc.getPais()); 
                
                JOptionPane.showMessageDialog(null,"Nome e Pais da Liga alterado", "Alteracao de Liga", 1);
            }
        }else {
            JOptionPane.showMessageDialog(null,"Liga nao cadastrada","Alteracao de Liga",1);
        }
    }
     
    public void limpar(){
        cxNomeLiga.setText("");
        cxPaisLiga.setText("");
    }
    
    public void sair(){
		int resp = JOptionPane.showConfirmDialog(null,"Deseja sair?","Saida",JOptionPane.YES_NO_OPTION);
			if(resp == 0){
                            System.exit(0);	
			}
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bmMenu;
    private javax.swing.JButton btAlteraLiga;
    private javax.swing.JButton btConsultaLiga;
    private javax.swing.JButton btDeletLiga;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListaLigas;
    private javax.swing.JButton btSair;
    private javax.swing.JMenuItem cadAtleta;
    private javax.swing.JMenuItem cadClube;
    private javax.swing.JMenuItem cadFg;
    private javax.swing.JMenuItem cadMm;
    private javax.swing.JMenuItem cadPc;
    private javax.swing.JTextField cxNomeLiga;
    private javax.swing.JTextField cxPaisLiga;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem lstAtleta;
    private javax.swing.JMenuItem lstClube;
    private javax.swing.JMenu mnAtleta;
    private javax.swing.JMenu mnClube;
    private javax.swing.JMenu mnLiga;
    private javax.swing.JLabel rotNomeLiga;
    private javax.swing.JLabel rotPaisLiga;
    private javax.swing.JLabel rotPrincipal;
    private javax.swing.JLabel rotProcuLiga;
    // End of variables declaration//GEN-END:variables
}
