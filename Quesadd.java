
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dhivya
 */
public class Quesadd extends javax.swing.JFrame {

    /**
     * Creates new form Quesadd
     */
    public Quesadd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        button1 = new java.awt.Button();
        label3 = new java.awt.Label();
        ques = new java.awt.TextField();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        opt1 = new java.awt.TextField();
        opt2 = new java.awt.TextField();
        opt3 = new java.awt.TextField();
        opt4 = new java.awt.TextField();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        label8 = new java.awt.Label();
        ans = new java.awt.TextField();
        button5 = new java.awt.Button();
        label9 = new java.awt.Label();
        id = new java.awt.TextField();
        button6 = new java.awt.Button();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        label1.setText("Questions");
        panel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 10, -1, -1));

        label2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label2.setText("1) Grand Central Terminal, Park Avenue, New York is the world's");
        panel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 102, -1, -1));

        jRadioButton1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("largest railway station");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        panel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 147, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jRadioButton2.setText("highest railway station");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        panel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 147, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jRadioButton3.setText(" longest railway station");
        panel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 147, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jRadioButton4.setText("None of the above");
        panel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 147, -1, -1));

        button1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        button1.setLabel("Add Questions");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        panel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 603, -1, -1));

        label3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label3.setText("Question");
        panel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 263, 80, -1));
        panel1.add(ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 263, 575, 35));

        label4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label4.setText("Option 1");
        panel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 308, -1, -1));

        label5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label5.setText("Option 2");
        panel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 369, -1, -1));

        label6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label6.setText("Option 3");
        panel1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 424, -1, -1));

        label7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label7.setText("Option 4");
        panel1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 483, -1, -1));
        panel1.add(opt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 308, 371, 33));
        panel1.add(opt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 369, 371, 30));
        panel1.add(opt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 424, 371, 32));
        panel1.add(opt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 479, 371, 32));

        button2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        button2.setLabel("Delete Question");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        panel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 603, -1, -1));

        button3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        button3.setLabel("Update Question");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        panel1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 603, -1, -1));

        button4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        button4.setLabel("Close");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        panel1.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 603, -1, -1));

        label8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label8.setText("Answer");
        panel1.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 530, -1, -1));

        ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansActionPerformed(evt);
            }
        });
        panel1.add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 530, 371, 34));

        button5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        button5.setLabel("Search");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        panel1.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 211, -1, -1));

        label9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label9.setText("Id");
        panel1.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 203, 27, -1));
        panel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 211, 201, 32));

        button6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        button6.setLabel("View");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        panel1.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 603, -1, -1));

        jButton1.setText("jButton1");
        panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 408, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
    String Id=id.getText();
    String Question=ques.getText();
    String Option1=opt1.getText();
    String Option2=opt2.getText();
    String Option3=opt3.getText();
    String Option4=opt4.getText();
    String Answer=ans.getText();
    PreparedStatement p;
    String query="Insert into ques(`id`,`ques`,`opt1`,`opt2`,`opt3`,`opt4`,`ans`)values(?,?,?,?,?,?,?)";
    try{
        p=Connection.getConnection().prepareStatement(query);
        p.setString(1, Id);
        p.setString(2, Question);
        p.setString(3, Option1);
        p.setString(4, Option2);
        p.setString(5, Option3);
        p.setString(6, Option4);
        p.setString(7, Answer);
        
        
     if(p.executeUpdate()>0){
         JOptionPane.showMessageDialog(null,"Question added");
     }
    }
    
        catch(Exception ex){
                System.out.println(ex);
                }
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        String Id=id.getText();
    int s=JOptionPane.showConfirmDialog(null,"Do you want to delete","select",JOptionPane.YES_NO_OPTION);
     if(s==0){
    String query="Delete from ques where `id`=?";
  
    try{
      PreparedStatement p=Connection.getConnection().prepareStatement(query);
                p.setString(1, Id);
     if(p.executeUpdate()>0){
         id.setText("");
         ques.setText("");
         opt1.setText("");
         opt2.setText("");
         opt3.setText("");
         opt4.setText("");
         ans.setText("");
     
         JOptionPane.showMessageDialog(null,"Delete Question");
     }
     else{
         JOptionPane.showMessageDialog(null,"Question not exist");
     }
    }
        catch(Exception ex){
                System.out.println(ex);
                }
     }
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        String Id = id.getText();
        String Question = ques.getText();
        String Option1 =opt1.getText();
        String Option2=opt2.getText();
        String Option3 =opt3.getText();
        String Option4 =opt4.getText();
         String Answer =ans.getText();
      
        
        String query ="UPDATE ques set `ques`=?,`opt1`=?,`opt2`=?,`opt3`=?,`opt4`=?,`ans`=? WHERE `id`=?";
           
     PreparedStatement ps;
     try{
         ps=Connection.getConnection().prepareStatement(query);
         ps.setString(1, Id);
         ps.setString(2, Question);
         ps.setString(3, Option1);
         ps.setString(4, Option2);
         ps.setString(5, Option3);
         ps.setString(6, Option4);
         ps.setString(7, Answer);
          
         if(ps.executeUpdate()>0){
         JOptionPane.showMessageDialog(null, "UPDATED");
         }  
         else{
             JOptionPane.showMessageDialog(null,"ID NOT FOUND");
         }
         }catch(Exception e){
             System.out.println(e);
         }    
    }//GEN-LAST:event_button3ActionPerformed

    private void ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ansActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
          String Id=id.getText();
      ResultSet rs;
      try{
          String query="select*from`ques` where `id`=?";
          PreparedStatement ps=Connection.getConnection().prepareStatement(query);
          ps.setString(1, Id);
          rs=ps.executeQuery();
          if(rs.next()){
              id.setText(rs.getString(1));
               ques.setText(rs.getString(2));
               opt1.setText(rs.getString(3));
               opt2.setText(rs.getString(4));
               opt3.setText(rs.getString(5));
               opt4.setText(rs.getString(6));
               ans.setText(rs.getString(7));
              
          }
          else{
              JOptionPane.showMessageDialog(null,"number not exit");
          }
      }
      catch(Exception ex){
          System.out.println(ex);
      }
    }//GEN-LAST:event_button5ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
         Index d=new Index();
        d.setVisible(true);
        setVisible(false);       // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        
    }//GEN-LAST:event_button6ActionPerformed

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
            java.util.logging.Logger.getLogger(Quesadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quesadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quesadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quesadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quesadd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField ans;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.TextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.TextField opt1;
    private java.awt.TextField opt2;
    private java.awt.TextField opt3;
    private java.awt.TextField opt4;
    private java.awt.Panel panel1;
    private java.awt.TextField ques;
    // End of variables declaration//GEN-END:variables
}
