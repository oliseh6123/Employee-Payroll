/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Emmanuel Obiajuru
 */
public class UpdateSalary extends javax.swing.JFrame {
     Connection conn = null;
     ResultSet rs = null;
     PreparedStatement pst = null;
    /**
     * Creates new form UpdateSalary
     */
    public UpdateSalary() {
        initComponents();
        conn =db.java_db();
        
         Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_empid = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_dept = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        r_percentage = new javax.swing.JRadioButton();
        r_amount = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txt_d1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_d2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee ID:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 40, 80, 15);

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel1.add(txt_search);
        txt_search.setBounds(110, 30, 600, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empolyee ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 80, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 160, 80, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Surname:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 210, 58, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date of Birth:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(380, 110, 84, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Basic Salary:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(380, 150, 75, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Department:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(380, 210, 78, 15);

        txt_empid.setEditable(false);
        jPanel1.add(txt_empid);
        txt_empid.setBounds(120, 100, 230, 30);

        txt_firstname.setEditable(false);
        jPanel1.add(txt_firstname);
        txt_firstname.setBounds(120, 150, 230, 30);

        txt_surname.setEditable(false);
        jPanel1.add(txt_surname);
        txt_surname.setBounds(120, 200, 230, 30);

        txt_dob.setEditable(false);
        jPanel1.add(txt_dob);
        txt_dob.setBounds(480, 100, 250, 30);

        txt_salary.setEditable(false);
        jPanel1.add(txt_salary);
        txt_salary.setBounds(480, 150, 250, 30);

        txt_dept.setEditable(false);
        jPanel1.add(txt_dept);
        txt_dept.setBounds(480, 200, 250, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Update Salary by:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 280, 108, 15);

        r_percentage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r_percentage.setText("Percentage(%)");
        r_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentageActionPerformed(evt);
            }
        });
        jPanel1.add(r_percentage);
        r_percentage.setBounds(330, 280, 113, 30);

        r_amount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r_amount.setText("Amount($)");
        r_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amountActionPerformed(evt);
            }
        });
        jPanel1.add(r_amount);
        r_amount.setBounds(160, 280, 120, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Percentage:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 330, 73, 20);

        txt_d1.setEditable(false);
        jPanel1.add(txt_d1);
        txt_d1.setBounds(110, 330, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Amount:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(260, 330, 54, 20);

        txt_d2.setEditable(false);
        jPanel1.add(txt_d2);
        txt_d2.setBounds(330, 330, 150, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/update icon.png"))); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(550, 330, 120, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/bk.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 10, 850, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        
        try{
           String sql = "select * from Staff_information where id=?";
           
           pst = conn.prepareStatement(sql);
           pst.setString(1,txt_search.getText());
           rs =pst.executeQuery();
           
           String add1 = rs.getString("id");
           txt_empid.setText(add1);
           
           String add2 = rs.getString("first_name");
           txt_firstname.setText(add2);
           
           String add3 = rs.getString("surname");
           txt_surname.setText(add3);
           
           String add4 = rs.getString("Dob");
           txt_dob.setText(add4);
           
           String add5 = rs.getString("Salary");
           txt_salary.setText(add5);
           
           String add6 = rs.getString("Department");
           txt_dept.setText(add6);
           
            
            
            
            
            
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
        
        finally{
            try{
                rs.close();
                pst.close();
                
            }catch(Exception e){
                
            }
                
                
        }
        
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int salary = Integer.parseInt(txt_salary.getText());
        
            if(r_percentage.isSelected()==true){
            
            int getPercentage = Integer.parseInt(txt_d1.getText());
            int calcPercentage = salary/100 * getPercentage + salary;
            String xP= String.valueOf(calcPercentage);
            txt_salary.setText(xP);
             
            }else if(r_amount.isSelected()==true){
            int getAmt = Integer.parseInt(txt_d2.getText());
            int calcAmount = salary +getAmt;
             String xA= String.valueOf(calcAmount);
             txt_salary.setText(xA);
             
            }
            
            
            
            
        
        try{
            String value1 = txt_empid.getText();
            String value2 = txt_salary.getText();
            
            String sql= "update Staff_information set id = '"+value1+"', salary = '"+value2+"' where id = '"+value1+"'  ";
                   
            pst = conn.prepareStatement(sql);
                   pst.execute();
                 JOptionPane.showMessageDialog(null, "Record Update Successfully");

            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void r_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amountActionPerformed
        // TODO add your handling code here:
        r_amount.setSelected(true);
        r_percentage.setSelected(false);
        txt_d1.setEnabled(false);
        txt_d2.setEditable(true);
        txt_d2.setEnabled(true);
        txt_d1.setText("");
        
    }//GEN-LAST:event_r_amountActionPerformed

    private void r_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentageActionPerformed
        // TODO add your handling code here:
         r_percentage.setSelected(true);
        r_amount.setSelected(false);
        txt_d2.setEnabled(false);
        txt_d1.setEditable(true);
        txt_d1.setEnabled(true);
        txt_d2.setText("");
    }//GEN-LAST:event_r_percentageActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UpdateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton r_amount;
    private javax.swing.JRadioButton r_percentage;
    private javax.swing.JTextField txt_d1;
    private javax.swing.JTextField txt_d2;
    private javax.swing.JTextField txt_dept;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_empid;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}
