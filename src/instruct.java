
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arsin
 */
public class instruct extends javax.swing.JFrame {
            public int x=0;
            public int btn_id = 0;
    /**
     * Creates new form instruct
     * @param abc
     * @param xyz
     */
    public instruct(String abc, String xyz) {
        initComponents();
        b1.setEnabled(false);
        l1.setText(abc);
        l2.setText(xyz);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        ck1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 230, 30));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setText("INSTRUCTIONS :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel6.setText("1. Read all the questions carefully.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 284, -1));

        jLabel7.setText("2.You have 15 minutes to complete the quiz.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel9.setText("4.Test will be autosubmitted when time is completed.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel11.setText("5.Unanswered Questions : White");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 20));

        jLabel12.setText("Answered Questions : Yellow");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 20));

        jLabel13.setText("Bookmarked Questions: Blue");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 20));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 289, -1, -1));

        b1.setText("Start test");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 85, 46));

        ck1.setText("I agree to all the terms and conditions given above.");
        ck1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ck1StateChanged(evt);
            }
        });
        ck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ck1ActionPerformed(evt);
            }
        });
        getContentPane().add(ck1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, 30));

        jLabel2.setText("6.You can attempt the test only once.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 20));

        l2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        l2.setText(" ");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 80, 30));

        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 110, 20));

        jLabel4.setText(" ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 20, 110));

        jLabel15.setText("3. Correct Answer : +5 marks");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 200, -1));

        jLabel16.setText("Unattemted Question : 0 marks");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 220, 30));

        jLabel17.setText("Wrong Answer : -2 marks");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 220, 30));

        filler1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102), null, null));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 520, 230));

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 32)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("JAVA EXAM 01");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel18.setText("WELCOME");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ck1ActionPerformed
        boolean check = ck1.isSelected();
        if(check = true){
            b1.setEnabled(true);
        }else if(check = false){
            b1.setEnabled(false);
        } 
    }//GEN-LAST:event_ck1ActionPerformed

    private void ck1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ck1StateChanged
      
    }//GEN-LAST:event_ck1StateChanged

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       String user = l2.getText();
        test t = new test(user);
       t.setVisible(true);
       this.setVisible(false);
       
       try
             {
                Class.forName("com.mysql.jdbc.Driver");
                com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection)DriverManager.getConnection("jdbc:mysql://localhost:3309/exam", "root", "ARMANS123");
                com.mysql.jdbc.Statement stmt = (com.mysql.jdbc.Statement)con.createStatement();
                com.mysql.jdbc.Statement stmt1 = (com.mysql.jdbc.Statement)con.createStatement();
                String query = "Select id from question order by rand() limit 15;";
                ResultSet rs = stmt.executeQuery(query);
                    while (rs.next())
/* 412:    */       {
                        int q_id =(Integer) rs.getInt("id"); 
                        ++btn_id;
                        
/* 418:    */   String query1 = "insert into test values(" + x + ", '" + user + "', " + q_id + ", " + btn_id + ", " + 0 + ", " + 0 + ", " + 0 + ");";
                stmt1.executeUpdate(query1);
                        ++x;
            }}
                
            catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException n)
              {
             JOptionPane.showMessageDialog(this, n.getMessage());
              }
    }//GEN-LAST:event_b1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try
/* 403:    */     {
/* 404:375 */       Class.forName("com.mysql.jdbc.Driver");
/* 405:376 */       Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3309/exam", "root", "ARMANS123");
/* 406:    */       
/* 407:378 */       Statement stmt = (Statement)con.createStatement();
/* 408:    */       
/* 409:380 */       String query = "SELECT id FROM test order by id DESC limit 1;";
/* 410:381 */       ResultSet rs = stmt.executeQuery(query);
/* 411:382 */      
                    while (rs.next())
/* 412:    */       {
                        
/* 413:384 */           x =(Integer) rs.getInt("id"); 
                        x=x+1;
/* 416:387 */         
                       
/* 418:    */       }
/* 419:    */     }
/* 420:    */     catch (ClassNotFoundException | SQLException n)
/* 421:    */     {
/* 422:397 */       JOptionPane.showMessageDialog(this, "Invalid!!!");
/* 423:    */     }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(instruct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instruct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instruct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instruct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JCheckBox ck1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    // End of variables declaration//GEN-END:variables
}