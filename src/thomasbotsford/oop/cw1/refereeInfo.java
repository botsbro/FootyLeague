/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thomasbotsford.oop.cw1;


import javax.swing.JOptionPane;

/**
 *
 * @author tom
 */
public class refereeInfo extends javax.swing.JFrame {
    
    /**
     * Creates new form refereeInfo
     */
    public refereeInfo() {
        initComponents();
    }
    

    //refresh method to update content in frame
    public static void refresh(){
        if(leagueTable.refList.size() >= 4){
            jButtonChange4.setVisible(true);
            jLabelRef4.setText(leagueTable.refList.get(3).getName());
            jLabelGames4.setText(Integer.toString(leagueTable.refList.get(3).games));
        }
        if(leagueTable.refList.size() >= 5){
            jButtonChange5.setVisible(true);
            jLabelRef5.setText(leagueTable.refList.get(4).getName());
            jLabelGames5.setText(Integer.toString(leagueTable.refList.get(4).games));
        }
        if(leagueTable.refList.size() == 6){
            jButtonChange6.setVisible(true);
            jLabelRef6.setText(leagueTable.refList.get(5).getName());
            jLabelGames6.setText(Integer.toString(leagueTable.refList.get(5).games));
        }       
        jLabelRef1.setText(leagueTable.refList.get(0).getName());
        jLabelRef2.setText(leagueTable.refList.get(1).getName());
        jLabelRef3.setText(leagueTable.refList.get(2).getName());
        jLabelGames1.setText(Integer.toString(leagueTable.refList.get(0).games));
        jLabelGames2.setText(Integer.toString(leagueTable.refList.get(1).games));
        jLabelGames3.setText(Integer.toString(leagueTable.refList.get(2).games)); 
    }   
    
    //method to display the form for first time
    public static void createFrame(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new refereeInfo().setVisible(true);
                if(leagueTable.refList.size() >= 4){
                    jButtonChange4.setVisible(true);
                    jLabelRef4.setText(leagueTable.refList.get(3).getName());
                    jLabelGames4.setText(Integer.toString(leagueTable.refList.get(3).games));
                }
                if(leagueTable.refList.size() >= 5){
                    jButtonChange5.setVisible(true);
                    jLabelRef5.setText(leagueTable.refList.get(4).getName());
                    jLabelGames5.setText(Integer.toString(leagueTable.refList.get(4).games));
                }
                if(leagueTable.refList.size() == 6){
                    jButtonChange6.setVisible(true);
                    jLabelRef6.setText(leagueTable.refList.get(5).getName());
                    jLabelGames6.setText(Integer.toString(leagueTable.refList.get(5).games));
                }
                else{
                jButtonChange4.setVisible(false);
                jButtonChange5.setVisible(false);
                jButtonChange6.setVisible(false);
                }
                //add the first 3 referee objects into the refList ArrayList
                leagueTable.refList.add(0, leagueTable.ref1);
                leagueTable.refList.add(1, leagueTable.ref2);
                leagueTable.refList.add(2, leagueTable.ref3);
                jLabelRef1.setText(leagueTable.refList.get(0).getName());
                jLabelRef2.setText(leagueTable.refList.get(1).getName());
                jLabelRef3.setText(leagueTable.refList.get(2).getName());
                jLabelGames1.setText(Integer.toString(leagueTable.refList.get(0).games));
                jLabelGames2.setText(Integer.toString(leagueTable.refList.get(1).games));
                jLabelGames3.setText(Integer.toString(leagueTable.refList.get(2).games));
                leagueTable.firstInstance = false;
            }
        });
    }
    
    //method to display the form if not the first time
    public static void createFrame2(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new refereeInfo().setVisible(true);
                //displays additional referees if they have been added
                if(leagueTable.refList.size() >= 4){
                    jButtonChange4.setVisible(true);
                    jLabelRef4.setText(leagueTable.refList.get(3).getName());
                    jLabelGames4.setText(Integer.toString(leagueTable.refList.get(3).games));
                }
                if(leagueTable.refList.size() >= 5){
                    jButtonChange5.setVisible(true);
                    jLabelRef5.setText(leagueTable.refList.get(4).getName());
                    jLabelGames5.setText(Integer.toString(leagueTable.refList.get(4).games));
                }
                if(leagueTable.refList.size() == 6){
                    jButtonChange6.setVisible(true);
                    jLabelRef6.setText(leagueTable.refList.get(5).getName());
                    jLabelGames6.setText(Integer.toString(leagueTable.refList.get(5).games));
                }
                else{
                jButtonChange4.setVisible(false);
                jButtonChange5.setVisible(false);
                jButtonChange6.setVisible(false);
                }
                jLabelRef1.setText(leagueTable.refList.get(0).getName());
                jLabelRef2.setText(leagueTable.refList.get(1).getName());
                jLabelRef3.setText(leagueTable.refList.get(2).getName());
                jLabelGames1.setText(Integer.toString(leagueTable.refList.get(0).games));
                jLabelGames2.setText(Integer.toString(leagueTable.refList.get(1).games));
                jLabelGames3.setText(Integer.toString(leagueTable.refList.get(2).games));
            }
        });
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelRef1 = new javax.swing.JLabel();
        jLabelRef2 = new javax.swing.JLabel();
        jLabelRef3 = new javax.swing.JLabel();
        jLabelRef4 = new javax.swing.JLabel();
        jLabelRef5 = new javax.swing.JLabel();
        jLabelRef6 = new javax.swing.JLabel();
        jLabelGames1 = new javax.swing.JLabel();
        jLabelGames2 = new javax.swing.JLabel();
        jLabelGames3 = new javax.swing.JLabel();
        jLabelGames4 = new javax.swing.JLabel();
        jLabelGames5 = new javax.swing.JLabel();
        jLabelGames6 = new javax.swing.JLabel();
        jButtonAddRef = new javax.swing.JButton();
        jButtonChange1 = new javax.swing.JButton();
        jButtonChange2 = new javax.swing.JButton();
        jButtonChange3 = new javax.swing.JButton();
        jButtonChange4 = new javax.swing.JButton();
        jButtonChange5 = new javax.swing.JButton();
        jButtonChange6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Referee");

        jLabel2.setText("Games");

        jLabel3.setText("Referees");

        jLabelRef1.setText("jLabel4");

        jLabelRef2.setText("jLabel5");

        jLabelRef3.setText("jLabel6");

        jLabelRef4.setText("Empty");

        jLabelRef5.setText("Empty");

        jLabelRef6.setText("Empty");

        jLabelGames1.setText("jLabelGames1");

        jLabelGames2.setText("jLabelGames2");

        jLabelGames3.setText("jLabelGames3");

        jLabelGames4.setText("N/A");

        jLabelGames5.setText("N/A");

        jLabelGames6.setText("N/A");

        jButtonAddRef.setText("Add Referee");
        jButtonAddRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddRefActionPerformed(evt);
            }
        });

        jButtonChange1.setText("Replace");
        jButtonChange1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChange1ActionPerformed(evt);
            }
        });

        jButtonChange2.setText("Replace");
        jButtonChange2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChange2ActionPerformed(evt);
            }
        });

        jButtonChange3.setText("Replace");
        jButtonChange3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChange3ActionPerformed(evt);
            }
        });

        jButtonChange4.setText("Replace");
        jButtonChange4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChange4ActionPerformed(evt);
            }
        });

        jButtonChange5.setText("Replace");
        jButtonChange5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChange5ActionPerformed(evt);
            }
        });

        jButtonChange6.setText("Replace");
        jButtonChange6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChange6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonChange4)
                            .addComponent(jButtonChange1)
                            .addComponent(jButtonChange2)
                            .addComponent(jButtonChange3)
                            .addComponent(jButtonChange5)
                            .addComponent(jButtonChange6))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabelRef1)
                            .addComponent(jLabelRef2)
                            .addComponent(jLabelRef3)
                            .addComponent(jLabelRef4)
                            .addComponent(jLabelRef5)
                            .addComponent(jLabelRef6))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGames6)
                            .addComponent(jLabelGames5)
                            .addComponent(jLabelGames4)
                            .addComponent(jLabelGames1)
                            .addComponent(jLabel2)
                            .addComponent(jLabelGames2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelGames3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(jButtonAddRef)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRef1)
                    .addComponent(jLabelGames1)
                    .addComponent(jButtonChange1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonChange2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelRef2)
                        .addComponent(jLabelGames2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRef3)
                            .addComponent(jLabelGames3)
                            .addComponent(jButtonChange3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButtonAddRef)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRef4)
                    .addComponent(jLabelGames4)
                    .addComponent(jButtonChange4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRef5)
                    .addComponent(jLabelGames5)
                    .addComponent(jButtonChange5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRef6)
                    .addComponent(jLabelGames6)
                    .addComponent(jButtonChange6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**event handler for adding a new referee
     * if the maximum number of referees (6) has been reached, an error message is displayed
     * else changeName createFrame method is called with newRefereeSelected set to true
     */
    private void jButtonAddRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRefActionPerformed
        if(leagueTable.refList.size() >= 6){
            JOptionPane.showMessageDialog(this, "Maximum number of referees has been reached.");
        }
        else if(leagueTable.refList.size() <= 6){
        leagueTable.newRefereeSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        leagueTable.playerSelected = false;
        changeName.createFrame();
        }
    }//GEN-LAST:event_jButtonAddRefActionPerformed

    //event handler to change name of 4th referee
    private void jButtonChange4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChange4ActionPerformed
        leagueTable.changeRefereeSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.teamSelected = false;
        leagueTable.playerSelected = false;
        //i variable set to 3 to update the correct referee in the refList ArrayList 
        leagueTable.i = 3;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChange4ActionPerformed
    
    //event handler to change name of 1st referee
    private void jButtonChange1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChange1ActionPerformed
        leagueTable.changeRefereeSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.teamSelected = false;
        leagueTable.playerSelected = false;
        leagueTable.i = 0;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChange1ActionPerformed
    
    //event handler to change name of 2nd referee
    private void jButtonChange2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChange2ActionPerformed
        leagueTable.changeRefereeSelected = true;
        leagueTable.i = 1;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChange2ActionPerformed
    
    //event handler to change name of 3rd referee
    private void jButtonChange3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChange3ActionPerformed
        leagueTable.changeRefereeSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.teamSelected = false;
        leagueTable.playerSelected = false;
        leagueTable.i = 2;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChange3ActionPerformed
    
    //event handler to change name of 5th referee
    private void jButtonChange5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChange5ActionPerformed
        leagueTable.changeRefereeSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.teamSelected = false;
        leagueTable.playerSelected = false;
        leagueTable.i = 4;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChange5ActionPerformed
    
    //event handler to change name of 6th referee
    private void jButtonChange6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChange6ActionPerformed
        leagueTable.changeRefereeSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.teamSelected = false;
        leagueTable.playerSelected = false;
        leagueTable.i = 5;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChange6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddRef;
    private static javax.swing.JButton jButtonChange1;
    private static javax.swing.JButton jButtonChange2;
    private static javax.swing.JButton jButtonChange3;
    private static javax.swing.JButton jButtonChange4;
    private static javax.swing.JButton jButtonChange5;
    private static javax.swing.JButton jButtonChange6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabelGames1;
    private static javax.swing.JLabel jLabelGames2;
    private static javax.swing.JLabel jLabelGames3;
    private static javax.swing.JLabel jLabelGames4;
    private static javax.swing.JLabel jLabelGames5;
    private static javax.swing.JLabel jLabelGames6;
    private static javax.swing.JLabel jLabelRef1;
    private static javax.swing.JLabel jLabelRef2;
    private static javax.swing.JLabel jLabelRef3;
    public static javax.swing.JLabel jLabelRef4;
    public static javax.swing.JLabel jLabelRef5;
    public static javax.swing.JLabel jLabelRef6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
