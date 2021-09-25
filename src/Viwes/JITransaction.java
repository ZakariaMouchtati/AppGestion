/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viwes;

import Class.Connect;
import Class.Client;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author ASUS
 */
public class JITransaction extends javax.swing.JInternalFrame {
    int h,w;
    /**
     * Creates new form NewJInternalFrame
     * @param h
     * @param w
     */
    public JITransaction(int h,int w) {
        initComponents();
        setSize(w,h);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnAjouter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rdneffet = new javax.swing.JRadioButton();
        rdncheque = new javax.swing.JRadioButton();
        rdvirement = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        txtMontant = new javax.swing.JTextField();
        cbxclient = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        rdnespece = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        btnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button-Add-icon.png"))); // NOI18N
        btnAjouter.setText("Ajouter ");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        jLabel3.setText("Libelle :");

        buttonGroup1.add(rdneffet);
        rdneffet.setText("effet ");

        buttonGroup1.add(rdncheque);
        rdncheque.setText("Chèque");

        buttonGroup1.add(rdvirement);
        rdvirement.setText("Virmement ");

        jLabel4.setText("Montant :");

        jLabel5.setText("Client :");

        jLabel2.setText("Date :");

        buttonGroup1.add(rdnespece);
        rdnespece.setText("espece");

        jLabel1.setText("DH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdncheque)
                                .addGap(30, 30, 30)
                                .addComponent(rdvirement)
                                .addGap(37, 37, 37)
                                .addComponent(rdneffet)
                                .addGap(18, 18, 18)
                                .addComponent(rdnespece))
                            .addComponent(txtdate)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMontant)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(cbxclient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 376, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdneffet)
                    .addComponent(rdvirement)
                    .addComponent(rdncheque)
                    .addComponent(rdnespece)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMontant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        try {
            // TODO add your handling code here:
            Date datcmd;
            datcmd=new SimpleDateFormat("dd/mm/yyyy").parse(txtdate.getText());
            Client c=(Client) cbxclient.getSelectedItem();
            Connection con=Connect.seconnenter();
            PreparedStatement ps=con.prepareStatement("insert into transaction values(seq_notrans.nextval,?,?,?,?)",new int[]{1});
            ps.setDate(1,java.sql.Date.valueOf(new SimpleDateFormat("yyyy-mm-dd").format(datcmd)));
            if(rdncheque.isSelected()){
                ps.setString(2,"Cheque");
            }else if(rdvirement.isSelected()){
                ps.setString(2,"Virement");
            }else if(rdneffet.isSelected()){
                ps.setString(2,"Effet");
            }else{
                ps.setString(2,"espece");
            }
            ps.setFloat(3,Float.parseFloat(txtMontant.getText()));
            ps.setInt(4,c.getId_clt());
            ps.executeUpdate();
            int notans=0;
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                notans=rs.getInt(1);
            }
            CallableStatement cs=con.prepareCall("{Call mise(?,?)}");
            cs.setFloat(1, Float.parseFloat(txtMontant.getText()));
            cs.setInt(2,c.getId_clt());
            cs.execute();
            JOptionPane.showMessageDialog(this,"Transaction ajouter avec Sucess");
            //Impression de relver de transcatsion
            int choix=JOptionPane.showConfirmDialog(this,"vouler vous imprimer","Confirmation",JOptionPane.YES_NO_OPTION);
            if(choix==JOptionPane.YES_OPTION){
             JasperDesign jasperdesign=JRXmlLoader.load("src//Report//Banque.jrxml");
            JasperReport jasperReport=JasperCompileManager.compileReport(jasperdesign);
            Map parametres =new HashMap();
            parametres.put("notrans", notans);
            JasperPrint jasperprint=JasperFillManager.fillReport(jasperReport, parametres,Connect.seconnenter());
            JRViewer jv=new JRViewer(jasperprint);
            ImpressionFrame v=new ImpressionFrame();
            v.setVisible(true);
            v.getContentPane().add(jv);
            }
        } catch (Exception ex) {
            Logger.getLogger(JITransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            // TODO add your handling code here:
            Connection con =Connect.seconnenter();
            Statement s=con.createStatement();
            ResultSet rs=s.executeQuery("select distinct idclt,nom,mail,tel,ice from Client join commande using(idclt)");
            while(rs.next()){
                cbxclient.addItem(new Client(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5)));
            }
        } catch (Exception ex) {
            Logger.getLogger(JITransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Client> cbxclient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdncheque;
    private javax.swing.JRadioButton rdneffet;
    private javax.swing.JRadioButton rdnespece;
    private javax.swing.JRadioButton rdvirement;
    private javax.swing.JTextField txtMontant;
    private javax.swing.JTextField txtdate;
    // End of variables declaration//GEN-END:variables
}
