package farmacie;

import Classes.Farmacie;
import Classes.Medicament;
import Classes.Stoc;
import Conectare.Conectare;
import Interfete.ComandaImp;
import Interfete.FarmacieImp;
import Interfete.MedicamentImp;
import Interfete.StocImp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author delim
 */
public class AfisareMedicament extends javax.swing.JFrame {
 Connection con;
    MedicamentImp mimp;
    StocImp simp;
    FarmacieImp fimp;
    public AfisareMedicament() throws Exception {
        initComponents();
        mimp=new MedicamentImp();
         fimp=new FarmacieImp();
        mimp=new MedicamentImp();
        simp=new StocImp();
        con=Conectare.getConnection();
      setDefaultCloseOperation(AfisareMedicament.DISPOSE_ON_CLOSE);
    DefaultComboBoxModel  model=new DefaultComboBoxModel();
DefaultComboBoxModel  model1=new DefaultComboBoxModel();
       
        
        //afiseaza medicamentele in listele din interfata
        
        ArrayList<Medicament> list=mimp.getList();
         //incarca numele medicamentelor in modele pentru a le lega de autocomplete 
         Consumer<Medicament> getNume = (Medicament med) -> {       
                   model.addElement(med.getNume());
              model1.addElement(med.getNume());
        };
        
        list.forEach(getNume);
        
        SelecteMedicament.setModel(model);
        MedicamentPerOras.setModel(model1);
          AutoCompleteDecorator.decorate(SelecteMedicament);
          AutoCompleteDecorator.decorate(MedicamentPerOras);
         
        } 
      
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        SelecteMedicament = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicamentInStoc = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MedInOras = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        RBBucuresti = new javax.swing.JRadioButton();
        RBCluj = new javax.swing.JRadioButton();
        RBTimisoara = new javax.swing.JRadioButton();
        RBIasi = new javax.swing.JRadioButton();
        MedicamentPerOras = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SelecteMedicament.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SelecteMedicament.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                SelecteMedicamentPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel1.setText("Selecteaza medicamentul");

        MedicamentInStoc.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        MedicamentInStoc.setToolTipText("");
        jScrollPane1.setViewportView(MedicamentInStoc);

        jLabel2.setText("Lista farmaciilor ce au medicamentul selectat");

        MedInOras.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(MedInOras);

        jLabel3.setText("Selecteaza medicamentul");

        buttonGroup1.add(RBBucuresti);
        RBBucuresti.setSelected(true);
        RBBucuresti.setText("Bucuresti");
        RBBucuresti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBBucurestiActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBCluj);
        RBCluj.setText("Cluj");
        RBCluj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBClujActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBTimisoara);
        RBTimisoara.setText("Timisoara");
        RBTimisoara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBTimisoaraActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBIasi);
        RBIasi.setText("Iasi");
        RBIasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBIasiActionPerformed(evt);
            }
        });

        MedicamentPerOras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        MedicamentPerOras.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                MedicamentPerOrasPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Informatii medicamente");

        jLabel5.setText("Farmacii si canitatea disponibila");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel5)))
                                .addGap(60, 60, 60))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(27, 27, 27)
                                        .addComponent(SelecteMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RBBucuresti)
                                        .addGap(18, 18, 18)
                                        .addComponent(RBCluj)
                                        .addGap(18, 18, 18)
                                        .addComponent(RBTimisoara)
                                        .addGap(18, 18, 18)
                                        .addComponent(RBIasi))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(MedicamentPerOras, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelecteMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(MedicamentPerOras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBBucuresti)
                    .addComponent(RBCluj)
                    .addComponent(RBTimisoara)
                    .addComponent(RBIasi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelecteMedicamentPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_SelecteMedicamentPopupMenuWillBecomeInvisible
         //afiseaza farmaciile care au in stoc medicamentul selectat
      
            String cod_med=String.valueOf(SelecteMedicament.getSelectedIndex()+1); //preia codul medicamentului cautat
            ArrayList locatieFarmacii=new ArrayList();
             ArrayList<Stoc> farmacii=simp.listaStocuriMedicament(cod_med); //unde se stocheaza rezultatul

                  //cauta in stoc medicamentul cu codul curent    
             Consumer<Stoc> getFarmacii= (Stoc s)->{
            Farmacie f=fimp.getFarmacie(s.getCod_f());
              if(!locatieFarmacii.contains(f.getNume()+" "+f.getOras()))
                locatieFarmacii.add(f.getNume()+" "+f.getOras());
        };
             farmacii.forEach(getFarmacii);
         afiseaza(locatieFarmacii,MedicamentInStoc);

    }//GEN-LAST:event_SelecteMedicamentPopupMenuWillBecomeInvisible
 
        //afiseaza cantitatile de medicament din orasul Bucuresti
    private void RBBucurestiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBBucurestiActionPerformed
       CautaInOras("Bucuresti");
    }//GEN-LAST:event_RBBucurestiActionPerformed

    private void RBTimisoaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBTimisoaraActionPerformed
     CautaInOras("Timisoara");
    }//GEN-LAST:event_RBTimisoaraActionPerformed

    private void RBClujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBClujActionPerformed
         CautaInOras("Cluj");
    }//GEN-LAST:event_RBClujActionPerformed

    private void RBIasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBIasiActionPerformed
         CautaInOras("Iasi");
    }//GEN-LAST:event_RBIasiActionPerformed

    private void MedicamentPerOrasPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_MedicamentPerOrasPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        if(RBBucuresti.isSelected())
              CautaInOras("Bucuresti");
        if(RBTimisoara.isSelected())
              CautaInOras("Timisoara");
        if(RBCluj.isSelected())
            CautaInOras("Cluj");
        if(RBIasi.isSelected())
              CautaInOras("Iasi");
    }//GEN-LAST:event_MedicamentPerOrasPopupMenuWillBecomeInvisible

    //functia cauta in orasul trimis ca si parametru medicamentul si cantitatile acestuia
    void CautaInOras(String oras)
    {
           String cod_med=String.valueOf(MedicamentPerOras.getSelectedIndex()+1); //preia codul medicamentului cautat
             ArrayList farmacii=new ArrayList(); //unde se stocheaza rezultatul
             
            ArrayList<Stoc> stocuri=simp.listaStocuriMedicament(cod_med);
            
            Consumer<Stoc> preiaCodF=(Stoc s)->{
                Farmacie f2=fimp.getFarmacie(s.getCod_f());
                Farmacie f=fimp.getFarmacieNume(f2.getNume(),oras);
                if(f.getNume()!=null)
                farmacii.add(f.getNume()+" "+s.getCantitate()+" bucati");
            };
             stocuri.forEach(preiaCodF);
        afiseaza(farmacii,MedInOras);

     
    }
    
    void afiseaza(ArrayList<String> linii, JList Lista)
	{
            Lista.removeAll();
	DefaultListModel model=new DefaultListModel();
	
       //pentru fiecare elemennt din lista se adauga un element in 
            linii.forEach(x->model.addElement(linii.get(linii.indexOf(x))));
            Lista.setModel(model);
	
        }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AfisareMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfisareMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfisareMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfisareMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try { 
                    new AfisareMedicament().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(AfisareMedicament.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> MedInOras;
    private javax.swing.JList<String> MedicamentInStoc;
    private javax.swing.JComboBox<String> MedicamentPerOras;
    private javax.swing.JRadioButton RBBucuresti;
    private javax.swing.JRadioButton RBCluj;
    private javax.swing.JRadioButton RBIasi;
    private javax.swing.JRadioButton RBTimisoara;
    private javax.swing.JComboBox<String> SelecteMedicament;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
