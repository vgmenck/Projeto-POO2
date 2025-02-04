//VitorGabrielMenckDiniz - RA:2487870

package com.mycompany.entregafinal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaAtleta extends javax.swing.JFrame {

    private static ListaAtleta consulAtletaUnic;
    
    public ListaAtleta() {
        initComponents();
    }

    public static ListaAtleta getListarAtleta(){
        if(consulAtletaUnic == null){
            consulAtletaUnic = new ListaAtleta();
        } 
        return consulAtletaUnic;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabAtleta = new javax.swing.JTable();
        rotLstAtleta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabAtleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome do Atleta", "Posicao", "Idade", "Gols", "Assistencias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabAtleta.getTableHeader().setReorderingAllowed(false);
        tabAtleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAtletaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabAtleta);
        if (tabAtleta.getColumnModel().getColumnCount() > 0) {
            tabAtleta.getColumnModel().getColumn(0).setResizable(false);
            tabAtleta.getColumnModel().getColumn(1).setResizable(false);
            tabAtleta.getColumnModel().getColumn(2).setResizable(false);
            tabAtleta.getColumnModel().getColumn(3).setResizable(false);
            tabAtleta.getColumnModel().getColumn(4).setResizable(false);
        }

        rotLstAtleta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotLstAtleta.setText("Lista de Atletas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(rotLstAtleta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotLstAtleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabAtletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAtletaMouseClicked
        selecionarTabela();  
    }//GEN-LAST:event_tabAtletaMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       listarAtleta();
    }//GEN-LAST:event_formWindowActivated

    
    public void listarAtleta(){
        DefaultTableModel tabModel = (DefaultTableModel) tabAtleta.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Atleta a : Banco.getBanco().getBdAtleta()){
            tabModel.insertRow(posLin, new Object[]{a.getNomeAtleta(),a.getPosicao(),a.getIdadeAtleta(),a.getGols(),a.getAssistencias()});
            posLin++;
        }
     }
     
     public void selecionarTabela(){
        String valLin = "";
        
        int posLin = tabAtleta.getSelectedRow();
        
        for(int col = 0; col < tabAtleta.getColumnCount(); col++){
            valLin += tabAtleta.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < tabAtleta.getColumnCount()){
                valLin+= " - ";
            }
            
        }
        JOptionPane.showMessageDialog(null,"Informação selecionada: "+valLin,"Dados do Clubes",1);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaAtleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotLstAtleta;
    private javax.swing.JTable tabAtleta;
    // End of variables declaration//GEN-END:variables
}
