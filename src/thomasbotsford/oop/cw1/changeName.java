/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thomasbotsford.oop.cw1;

import javax.swing.JOptionPane;

/**
 *
 * @author 23657952
 */
public class changeName extends javax.swing.JFrame {

    /**
     * Creates new form changeName
     */
    public changeName() {
        initComponents();
    }
    
    //method to display the form
    public static void createFrame(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                //swing controls relating to player information are only displayed if playerSelected is true
                new changeName().setVisible(true);
                jLabelPosition.setVisible(false);
                jTextFieldPosition.setVisible(false);
                jButtonChangePosition.setVisible(false);
                jLabelNumber.setVisible(false);
                jTextFieldNumber.setVisible(false);
                jButtonChangeNumber.setVisible(false);
                if(leagueTable.playerSelected == true){
                jLabelPosition.setVisible(true);
                jTextFieldPosition.setVisible(true);
                jButtonChangePosition.setVisible(true);
                jLabelNumber.setVisible(true);
                jTextFieldNumber.setVisible(true);
                jButtonChangeNumber.setVisible(true);  
                }
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
        jTextFieldPosition = new javax.swing.JTextField();
        jLabel = new javax.swing.JLabel();
        jButtonChangeName = new javax.swing.JButton();
        jLabelPosition = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelNumber = new javax.swing.JLabel();
        jTextFieldNumber = new javax.swing.JTextField();
        jButtonChangePosition = new javax.swing.JButton();
        jButtonChangeNumber = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("Please enter new name of object");

        jButtonChangeName.setText("Enter");
        jButtonChangeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeNameActionPerformed(evt);
            }
        });

        jLabelPosition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPosition.setText("Please enter new player position");

        jLabelNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumber.setText("Please enter new player number");

        jButtonChangePosition.setText("Enter");
        jButtonChangePosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePositionActionPerformed(evt);
            }
        });

        jButtonChangeNumber.setText("Enter");
        jButtonChangeNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jButtonChangeName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldName)
                            .addComponent(jLabelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonChangeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonChangePosition, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel)
                .addGap(54, 54, 54)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonChangeName)
                .addGap(41, 41, 41)
                .addComponent(jLabelPosition)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonChangePosition)
                .addGap(28, 28, 28)
                .addComponent(jLabelNumber)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonChangeNumber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    //event handler for change name "Enter" button
    private void jButtonChangeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeNameActionPerformed
        /**updates object information based on which object is selected
        * 
        *   xSelected and i variables are set by events handlers 
        *   of the buttons that open the changeName window 
        */
        if(leagueTable.coachSelected == true){
            /**update information using text field entry
             * call refresh method to display new information
             * close window
            */
            leagueTable.teams[leagueTable.i].getCoach().setName(jTextFieldName.getText());
            teamInfo.refresh();
            this.dispose();
        }
        else if(leagueTable.managerSelected == true){
            leagueTable.teams[leagueTable.i].getManager().setName(jTextFieldName.getText());
            teamInfo.refresh();
            this.dispose();
        }
        else if(leagueTable.newRefereeSelected == true){
            leagueTable.refList.add(leagueTable.refList.size(), new referee(jTextFieldName.getText()));         
            refereeInfo.refresh();
            this.dispose();
        }
        else if (leagueTable.changeRefereeSelected == true){
            leagueTable.refList.set(leagueTable.i, new referee (jTextFieldName.getText()));
            refereeInfo.refresh();
            this.dispose();
        }
        else if (leagueTable.teamSelected == true){
            leagueTable.teams[leagueTable.i].setName(jTextFieldName.getText());
            teamInfo.refresh();
            leagueTable.refresh();
            this.dispose();
        }
        
        // p variable set by event handler when clicking player "change" button
        else if (leagueTable.playerSelected == true){
            leagueTable.teams[leagueTable.i].players[leagueTable.p].setName(jTextFieldName.getText());         
            teamInfo.refresh();
        }
        /** all xSelected variables set to false to prevent the incorrect 
         *  if/else-if statement from being used in future instances of the form
         */
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        leagueTable.playerSelected = false;
    }//GEN-LAST:event_jButtonChangeNameActionPerformed

    // event handler for player position "enter" button
    /**update information using text field entry
     * call refresh method to display new information
     */
    private void jButtonChangePositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePositionActionPerformed
        leagueTable.teams[leagueTable.i].players[leagueTable.p].setPosition(jTextFieldPosition.getText());
        teamInfo.refresh();
    }//GEN-LAST:event_jButtonChangePositionActionPerformed

    // event handler for player number "enter" button
    /**update information using numeric field entry
     * catches exception if entry is not numeric and produces error message
     * call refresh method to display new information
     */
    private void jButtonChangeNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeNumberActionPerformed
        try{
            leagueTable.teams[leagueTable.i].players[leagueTable.p].setNumber(Integer.parseInt(jTextFieldNumber.getText()));
        }
        catch(NumberFormatException x){
            JOptionPane.showMessageDialog(this, "Please enter a numeric value for player number");
        }
        teamInfo.refresh();
    }//GEN-LAST:event_jButtonChangeNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangeName;
    private static javax.swing.JButton jButtonChangeNumber;
    private static javax.swing.JButton jButtonChangePosition;
    private javax.swing.JLabel jLabel;
    private static javax.swing.JLabel jLabelNumber;
    private static javax.swing.JLabel jLabelPosition;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldName;
    private static javax.swing.JTextField jTextFieldNumber;
    private static javax.swing.JTextField jTextFieldPosition;
    // End of variables declaration//GEN-END:variables
}
