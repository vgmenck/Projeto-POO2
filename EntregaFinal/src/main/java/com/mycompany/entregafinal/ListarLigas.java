//VitorGabrielMenckDiniz - RA:2487870

package com.mycompany.entregafinal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListarLigas extends javax.swing.JFrame {

    private static ListarLigas listarLigasUnic;
    
    public ListarLigas() {
        initComponents();
    }

    public static ListarLigas getListarLigas(){
        if(listarLigasUnic == null){
            listarLigasUnic = new ListarLigas();
        } 
        return listarLigasUnic;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabPc = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabMm = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabFg = new javax.swing.JTable();
        rotLstPc = new javax.swing.JLabel();
        rotLstMm = new javax.swing.JLabel();
        rotLstFg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabPc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Pais", "Numero de Times", "Jogos", "Premiacao", "Artilheiro", "Garcom", "Melhor Ataque", "Melhor Defesa", "Classificados", "Classificados Secundario ", "Rebaixados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabPc.getTableHeader().setReorderingAllowed(false);
        tabPc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPcMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPc);
        if (tabPc.getColumnModel().getColumnCount() > 0) {
            tabPc.getColumnModel().getColumn(0).setResizable(false);
            tabPc.getColumnModel().getColumn(1).setResizable(false);
            tabPc.getColumnModel().getColumn(2).setResizable(false);
            tabPc.getColumnModel().getColumn(3).setResizable(false);
            tabPc.getColumnModel().getColumn(4).setResizable(false);
            tabPc.getColumnModel().getColumn(5).setResizable(false);
            tabPc.getColumnModel().getColumn(6).setResizable(false);
            tabPc.getColumnModel().getColumn(7).setResizable(false);
            tabPc.getColumnModel().getColumn(8).setResizable(false);
            tabPc.getColumnModel().getColumn(9).setResizable(false);
            tabPc.getColumnModel().getColumn(10).setResizable(false);
            tabPc.getColumnModel().getColumn(11).setResizable(false);
        }

        tabMm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Pais", "Numero de Times", "Jogos", "Premiacao", "Artilheiro", "Garcom", "Melhor Ataque", "Melhor Defesa", "Fases", "Fase Atual ", "Times Restantes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabMm.getTableHeader().setReorderingAllowed(false);
        tabMm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMmMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabMm);
        if (tabMm.getColumnModel().getColumnCount() > 0) {
            tabMm.getColumnModel().getColumn(0).setResizable(false);
            tabMm.getColumnModel().getColumn(1).setResizable(false);
            tabMm.getColumnModel().getColumn(2).setResizable(false);
            tabMm.getColumnModel().getColumn(3).setResizable(false);
            tabMm.getColumnModel().getColumn(4).setResizable(false);
            tabMm.getColumnModel().getColumn(5).setResizable(false);
            tabMm.getColumnModel().getColumn(6).setResizable(false);
            tabMm.getColumnModel().getColumn(7).setResizable(false);
            tabMm.getColumnModel().getColumn(8).setResizable(false);
            tabMm.getColumnModel().getColumn(9).setResizable(false);
            tabMm.getColumnModel().getColumn(10).setResizable(false);
            tabMm.getColumnModel().getColumn(11).setResizable(false);
        }

        tabFg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Pais", "Numero de Times", "Jogos", "Premiacao", "Artilheiro", "Garcom", "Melhor Ataque ", "Melhor Defesa", "Grupos", "Times por Grupo", "Classificados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabFg.getTableHeader().setReorderingAllowed(false);
        tabFg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabFgMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabFg);
        if (tabFg.getColumnModel().getColumnCount() > 0) {
            tabFg.getColumnModel().getColumn(0).setResizable(false);
            tabFg.getColumnModel().getColumn(1).setResizable(false);
            tabFg.getColumnModel().getColumn(2).setResizable(false);
            tabFg.getColumnModel().getColumn(3).setResizable(false);
            tabFg.getColumnModel().getColumn(4).setResizable(false);
            tabFg.getColumnModel().getColumn(5).setResizable(false);
            tabFg.getColumnModel().getColumn(6).setResizable(false);
            tabFg.getColumnModel().getColumn(7).setResizable(false);
            tabFg.getColumnModel().getColumn(8).setResizable(false);
            tabFg.getColumnModel().getColumn(9).setResizable(false);
            tabFg.getColumnModel().getColumn(10).setResizable(false);
            tabFg.getColumnModel().getColumn(11).setResizable(false);
        }

        rotLstPc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotLstPc.setText("Lista de Ligas - Pontos Corridos");

        rotLstMm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotLstMm.setText("Lista de Ligas - Mata-Mata");

        rotLstFg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotLstFg.setText("Lista de Ligas - Fase de Grupos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rotLstPc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rotLstMm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1272, Short.MAX_VALUE)
            .addComponent(rotLstFg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotLstPc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rotLstMm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rotLstFg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabPcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPcMouseClicked
        selecionarTabelaPc();
    }//GEN-LAST:event_tabPcMouseClicked

    private void tabMmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMmMouseClicked
        selecionarTabelaMm();
    }//GEN-LAST:event_tabMmMouseClicked

    private void tabFgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabFgMouseClicked
        selecionarTabelaFg();
    }//GEN-LAST:event_tabFgMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarPc();
        listarMm();
        listarFg();
    }//GEN-LAST:event_formWindowActivated

    public void listarPc(){
        DefaultTableModel tabModel = (DefaultTableModel) tabPc.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(PontosCorridos pc : Banco.getBanco().getBdPontosCorridos()){
            tabModel.insertRow(posLin, new Object[]{pc.getNomeLiga(),
                pc.getPais(),
                pc.getQtdTimes(),
                pc.getQtdJogos(),
                pc.getPremiacao(),
                pc.getArtilheiro(),
                pc.getGarcom(),
                pc.getMelhorAtaque(),
                pc.getMelhorDefesa(),
                pc.getClasInter(),
                pc.getClasInter2(),
                pc.getRebaixados()});
            posLin++;
        }
     }
    
    public void selecionarTabelaPc(){
        String valLin = "";
        
        int posLin = tabPc.getSelectedRow();
        
        for(int col = 0; col < tabPc.getColumnCount(); col++){
            valLin += tabPc.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < tabPc.getColumnCount()){
                valLin+= " - ";
            }
            
        }
        JOptionPane.showMessageDialog(null,"Informação selecionada: "+valLin,"Dados do Clubes",1);
    }
    
    public void listarMm(){
        DefaultTableModel tabModel = (DefaultTableModel) tabMm.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(MataMata mm : Banco.getBanco().getBdMataMata()){
            tabModel.insertRow(posLin, new Object[]{mm.getNomeLiga(),
                mm.getPais(),
                mm.getQtdTimes(),
                mm.getQtdJogos(),
                mm.getPremiacao(),
                mm.getArtilheiro(),
                mm.getGarcom(),
                mm.getMelhorAtaque(),
                mm.getMelhorDefesa(),
                mm.getQtdFases(),
                mm.getFaseAtual(),
                mm.getQtdTimesRestantes()});
            posLin++;
        }
     }
    
    public void selecionarTabelaMm(){
        String valLin = "";
        
        int posLin = tabMm.getSelectedRow();
        
        for(int col = 0; col < tabMm.getColumnCount(); col++){
            valLin += tabMm.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < tabMm.getColumnCount()){
                valLin+= " - ";
            }
            
        }
        JOptionPane.showMessageDialog(null,"Informação selecionada: "+valLin,"Dados do Clubes",1);
    }
    
    public void listarFg(){
        DefaultTableModel tabModel = (DefaultTableModel) tabFg.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(FasedeGrupos fg : Banco.getBanco().getBdFasedeGrupos()){
            tabModel.insertRow(posLin, new Object[]{fg.getNomeLiga(),
                fg.getPais(),
                fg.getQtdTimes(),
                fg.getQtdJogos(),
                fg.getPremiacao(),
                fg.getArtilheiro(),
                fg.getGarcom(),
                fg.getMelhorAtaque(),
                fg.getMelhorDefesa(),
                fg.getQtdGrupos(),
                fg.getQtdTimesGrupo(),
                fg.getQtdClasGrupo()});
            posLin++;
        }
     }
    
    public void selecionarTabelaFg(){
        String valLin = "";
        
        int posLin = tabFg.getSelectedRow();
        
        for(int col = 0; col < tabFg.getColumnCount(); col++){
            valLin += tabFg.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < tabFg.getColumnCount()){
                valLin+= " - ";
            }
            
        }
        JOptionPane.showMessageDialog(null,"Informação selecionada: "+valLin,"Dados do Clubes",1);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarLigas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel rotLstFg;
    private javax.swing.JLabel rotLstMm;
    private javax.swing.JLabel rotLstPc;
    private javax.swing.JTable tabFg;
    private javax.swing.JTable tabMm;
    private javax.swing.JTable tabPc;
    // End of variables declaration//GEN-END:variables
}
