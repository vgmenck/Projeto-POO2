//VitorGabrielMenckDiniz - RA:2487870

package com.mycompany.entregafinal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaClube extends javax.swing.JFrame {

    private static ListaClube listarClubeUnic;
    
    public ListaClube() {
        initComponents();
    }

    public static ListaClube getListarClube(){
        if(listarClubeUnic == null){
            listarClubeUnic = new ListaClube();
        } 
        return listarClubeUnic;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabLstClube = new javax.swing.JTable();
        rotLstClube = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabLstClube.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome do Clube", "Ano de Fundacao", "Titulos", "Estado", "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabLstClube.getTableHeader().setReorderingAllowed(false);
        tabLstClube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLstClubeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabLstClube);
        if (tabLstClube.getColumnModel().getColumnCount() > 0) {
            tabLstClube.getColumnModel().getColumn(0).setResizable(false);
            tabLstClube.getColumnModel().getColumn(1).setResizable(false);
            tabLstClube.getColumnModel().getColumn(2).setResizable(false);
            tabLstClube.getColumnModel().getColumn(3).setResizable(false);
            tabLstClube.getColumnModel().getColumn(4).setResizable(false);
        }

        rotLstClube.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotLstClube.setText("Lista de Clube");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(rotLstClube)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotLstClube)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabLstClubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLstClubeMouseClicked
        selecionarTabela();
    }//GEN-LAST:event_tabLstClubeMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarClube();
    }//GEN-LAST:event_formWindowActivated

    public void listarClube(){
        DefaultTableModel tabModel = (DefaultTableModel) tabLstClube.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Clube c : Banco.getBanco().getBdClube()){
            tabModel.insertRow(posLin, new Object[]{c.getNomeTime(),c.getFundacao(),c.getQtdTitulos(),c.getEstado(),c.getCidade()});
            posLin++;
        }
     }
     
    public void selecionarTabela(){
        String valLin = "";
        
        int posLin = tabLstClube.getSelectedRow();
        
        for(int col = 0; col < tabLstClube.getColumnCount(); col++){
            valLin += tabLstClube.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < tabLstClube.getColumnCount()){
                valLin+= " - ";
            }
            
        }
        JOptionPane.showMessageDialog(null,"Informação selecionada: "+valLin,"Dados do Clubes",1);
    }
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaClube().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotLstClube;
    private javax.swing.JTable tabLstClube;
    // End of variables declaration//GEN-END:variables
}
