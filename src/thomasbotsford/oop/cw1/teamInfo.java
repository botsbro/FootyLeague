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
public class teamInfo extends javax.swing.JFrame {
    /**
     * Creates new form teamInfo
     */
    public teamInfo() {
        initComponents();
    }
    
    /**refresh method to update information
     * correct team is fetched using i variable set by event handler when selecting team button
     */
    public static void refresh(){
        jLabelTeamName.setText(leagueTable.teams[leagueTable.i].getName());
        jLabelPlayer1.setText(leagueTable.teams[leagueTable.i].players[0].getName());
        jLabelPlayer2.setText(leagueTable.teams[leagueTable.i].players[1].getName());
        jLabelPlayer3.setText(leagueTable.teams[leagueTable.i].players[2].getName());
        jLabelPlayer4.setText(leagueTable.teams[leagueTable.i].players[3].getName());
        jLabelPlayer5.setText(leagueTable.teams[leagueTable.i].players[4].getName());
        jLabelPlayer6.setText(leagueTable.teams[leagueTable.i].players[5].getName());
        jLabelPlayer7.setText(leagueTable.teams[leagueTable.i].players[6].getName());
        jLabelPlayer8.setText(leagueTable.teams[leagueTable.i].players[7].getName());
        jLabelPlayer9.setText(leagueTable.teams[leagueTable.i].players[8].getName());
        jLabelPlayer10.setText(leagueTable.teams[leagueTable.i].players[9].getName());
        jLabelPlayer11.setText(leagueTable.teams[leagueTable.i].players[10].getName());
        jLabelPlayer12.setText(leagueTable.teams[leagueTable.i].players[11].getName());
        jLabelPlayer13.setText(leagueTable.teams[leagueTable.i].players[12].getName());
        jLabelPosition1.setText(leagueTable.teams[leagueTable.i].players[0].getPosition());
        jLabelPosition2.setText(leagueTable.teams[leagueTable.i].players[1].getPosition());
        jLabelPosition3.setText(leagueTable.teams[leagueTable.i].players[2].getPosition());
        jLabelPosition4.setText(leagueTable.teams[leagueTable.i].players[3].getPosition());
        jLabelPosition5.setText(leagueTable.teams[leagueTable.i].players[4].getPosition());
        jLabelPosition6.setText(leagueTable.teams[leagueTable.i].players[5].getPosition());
        jLabelPosition7.setText(leagueTable.teams[leagueTable.i].players[6].getPosition());
        jLabelPosition8.setText(leagueTable.teams[leagueTable.i].players[7].getPosition());
        jLabelPosition9.setText(leagueTable.teams[leagueTable.i].players[8].getPosition());
        jLabelPosition10.setText(leagueTable.teams[leagueTable.i].players[9].getPosition());
        jLabelPosition11.setText(leagueTable.teams[leagueTable.i].players[10].getPosition());
        jLabelPosition12.setText(leagueTable.teams[leagueTable.i].players[11].getPosition());
        jLabelPosition13.setText(leagueTable.teams[leagueTable.i].players[12].getPosition());
        jLabelNumber1.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[0].getNumber()));
        jLabelNumber2.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[1].getNumber()));
        jLabelNumber3.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[2].getNumber()));
        jLabelNumber4.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[3].getNumber()));
        jLabelNumber5.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[4].getNumber()));
        jLabelNumber6.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[5].getNumber()));
        jLabelNumber7.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[6].getNumber()));
        jLabelNumber8.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[7].getNumber()));
        jLabelNumber9.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[8].getNumber()));
        jLabelNumber10.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[9].getNumber()));
        jLabelNumber11.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[10].getNumber()));
        jLabelNumber12.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[11].getNumber()));
        jLabelNumber13.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[12].getNumber()));
        jLabelManagerName.setText(leagueTable.teams[leagueTable.i].getManager().getName());
        jLabelCoachName.setText(leagueTable.teams[leagueTable.i].getCoach().getName());
    }
    
    //createFrame method to display the form
    public static void createFrame(){
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new teamInfo().setVisible(true);
                    //jLabelPlayer1.setText("test");
                    jLabelTeamName.setText(leagueTable.teams[leagueTable.i].getName());
                    jLabelPlayer1.setText(leagueTable.teams[leagueTable.i].players[0].getName());
                    jLabelPlayer2.setText(leagueTable.teams[leagueTable.i].players[1].getName());
                    jLabelPlayer3.setText(leagueTable.teams[leagueTable.i].players[2].getName());
                    jLabelPlayer4.setText(leagueTable.teams[leagueTable.i].players[3].getName());
                    jLabelPlayer5.setText(leagueTable.teams[leagueTable.i].players[4].getName());
                    jLabelPlayer6.setText(leagueTable.teams[leagueTable.i].players[5].getName());
                    jLabelPlayer7.setText(leagueTable.teams[leagueTable.i].players[6].getName());
                    jLabelPlayer8.setText(leagueTable.teams[leagueTable.i].players[7].getName());
                    jLabelPlayer9.setText(leagueTable.teams[leagueTable.i].players[8].getName());
                    jLabelPlayer10.setText(leagueTable.teams[leagueTable.i].players[9].getName());
                    jLabelPlayer11.setText(leagueTable.teams[leagueTable.i].players[10].getName());
                    jLabelPlayer12.setText(leagueTable.teams[leagueTable.i].players[11].getName());
                    jLabelPlayer13.setText(leagueTable.teams[leagueTable.i].players[12].getName());
                    jLabelPosition1.setText(leagueTable.teams[leagueTable.i].players[0].getPosition());
                    jLabelPosition2.setText(leagueTable.teams[leagueTable.i].players[1].getPosition());
                    jLabelPosition3.setText(leagueTable.teams[leagueTable.i].players[2].getPosition());
                    jLabelPosition4.setText(leagueTable.teams[leagueTable.i].players[3].getPosition());
                    jLabelPosition5.setText(leagueTable.teams[leagueTable.i].players[4].getPosition());
                    jLabelPosition6.setText(leagueTable.teams[leagueTable.i].players[5].getPosition());
                    jLabelPosition7.setText(leagueTable.teams[leagueTable.i].players[6].getPosition());
                    jLabelPosition8.setText(leagueTable.teams[leagueTable.i].players[7].getPosition());
                    jLabelPosition9.setText(leagueTable.teams[leagueTable.i].players[8].getPosition());
                    jLabelPosition10.setText(leagueTable.teams[leagueTable.i].players[9].getPosition());
                    jLabelPosition11.setText(leagueTable.teams[leagueTable.i].players[10].getPosition());
                    jLabelPosition12.setText(leagueTable.teams[leagueTable.i].players[11].getPosition());
                    jLabelPosition13.setText(leagueTable.teams[leagueTable.i].players[12].getPosition());
                    jLabelNumber1.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[0].getNumber()));
                    jLabelNumber2.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[1].getNumber()));
                    jLabelNumber3.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[2].getNumber()));
                    jLabelNumber4.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[3].getNumber()));
                    jLabelNumber5.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[4].getNumber()));
                    jLabelNumber6.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[5].getNumber()));
                    jLabelNumber7.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[6].getNumber()));
                    jLabelNumber8.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[7].getNumber()));
                    jLabelNumber9.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[8].getNumber()));
                    jLabelNumber10.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[9].getNumber()));
                    jLabelNumber11.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[10].getNumber()));
                    jLabelNumber12.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[11].getNumber()));
                    jLabelNumber13.setText(Integer.toString(leagueTable.teams[leagueTable.i].players[12].getNumber()));
                    jLabelManagerName.setText(leagueTable.teams[leagueTable.i].getManager().getName());
                    jLabelCoachName.setText(leagueTable.teams[leagueTable.i].getCoach().getName());
                    
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
        jLabelPlayer = new javax.swing.JLabel();
        jLabelPlayer1 = new javax.swing.JLabel();
        jLabelPlayer2 = new javax.swing.JLabel();
        jLabelPlayer3 = new javax.swing.JLabel();
        jLabelPlayer4 = new javax.swing.JLabel();
        jLabelPlayer5 = new javax.swing.JLabel();
        jLabelPlayer6 = new javax.swing.JLabel();
        jLabelPlayer7 = new javax.swing.JLabel();
        jLabelPlayer8 = new javax.swing.JLabel();
        jLabelPlayer9 = new javax.swing.JLabel();
        jLabelPlayer10 = new javax.swing.JLabel();
        jLabelPlayer11 = new javax.swing.JLabel();
        jLabelPlayer12 = new javax.swing.JLabel();
        jLabelPlayer13 = new javax.swing.JLabel();
        jLabelPosition13 = new javax.swing.JLabel();
        jLabelNumber13 = new javax.swing.JLabel();
        jLabelNumber12 = new javax.swing.JLabel();
        jLabelPosition12 = new javax.swing.JLabel();
        jLabelPosition11 = new javax.swing.JLabel();
        jLabelNumber11 = new javax.swing.JLabel();
        jLabelNumber10 = new javax.swing.JLabel();
        jLabelPosition10 = new javax.swing.JLabel();
        jLabelPosition9 = new javax.swing.JLabel();
        jLabelNumber9 = new javax.swing.JLabel();
        jLabelNumber8 = new javax.swing.JLabel();
        jLabelPosition8 = new javax.swing.JLabel();
        jLabelPosition7 = new javax.swing.JLabel();
        jLabelNumber7 = new javax.swing.JLabel();
        jLabelNumber6 = new javax.swing.JLabel();
        jLabelPosition6 = new javax.swing.JLabel();
        jLabelPosition5 = new javax.swing.JLabel();
        jLabelNumber5 = new javax.swing.JLabel();
        jLabelNumber4 = new javax.swing.JLabel();
        jLabelPosition4 = new javax.swing.JLabel();
        jLabelPosition3 = new javax.swing.JLabel();
        jLabelNumber3 = new javax.swing.JLabel();
        jLabelNumber2 = new javax.swing.JLabel();
        jLabelPosition2 = new javax.swing.JLabel();
        jLabelPosition1 = new javax.swing.JLabel();
        jLabelNumber1 = new javax.swing.JLabel();
        jLabelNumber = new javax.swing.JLabel();
        jLabelPosition = new javax.swing.JLabel();
        jLabelManager = new javax.swing.JLabel();
        jLabelManagerName = new javax.swing.JLabel();
        jLabelCoach = new javax.swing.JLabel();
        jLabelCoachName = new javax.swing.JLabel();
        jLabelTeamName = new javax.swing.JLabel();
        jButtonChangeManager = new javax.swing.JButton();
        jButtonChangeCoach = new javax.swing.JButton();
        jButtonChangeTeam = new javax.swing.JButton();
        jButtonChangePlayer1 = new javax.swing.JButton();
        jButtonChangePlayer2 = new javax.swing.JButton();
        jButtonChangePlayer3 = new javax.swing.JButton();
        jButtonChangePlayer4 = new javax.swing.JButton();
        jButtonChangePlayer5 = new javax.swing.JButton();
        jButtonChangePlayer6 = new javax.swing.JButton();
        jButtonChangePlayer7 = new javax.swing.JButton();
        jButtonChangePlayer8 = new javax.swing.JButton();
        jButtonChangePlayer9 = new javax.swing.JButton();
        jButtonChangePlayer10 = new javax.swing.JButton();
        jButtonChangePlayer11 = new javax.swing.JButton();
        jButtonChangePlayer12 = new javax.swing.JButton();
        jButtonChangePlayer13 = new javax.swing.JButton();
        jToggleButtonClear = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelPlayer.setText("Player");

        jLabelPlayer1.setText("jLabel2");

        jLabelPlayer2.setText("jLabel3");

        jLabelPlayer3.setText("jLabel4");

        jLabelPlayer4.setText("jLabel5");

        jLabelPlayer5.setText("jLabel6");

        jLabelPlayer6.setText("jLabel7");

        jLabelPlayer7.setText("jLabel8");

        jLabelPlayer8.setText("jLabel9");

        jLabelPlayer9.setText("jLabel10");

        jLabelPlayer10.setText("jLabel11");

        jLabelPlayer11.setText("jLabel12");

        jLabelPlayer12.setText("jLabel13");

        jLabelPlayer13.setText("jLabel2");

        jLabelPosition13.setText("jLabel31");

        jLabelNumber13.setText("jLabel43");

        jLabelNumber12.setText("jLabel43");

        jLabelPosition12.setText("jLabel31");

        jLabelPosition11.setText("jLabel30");

        jLabelNumber11.setText("jLabel42");

        jLabelNumber10.setText("jLabel41");

        jLabelPosition10.setText("jLabel29");

        jLabelPosition9.setText("jLabel28");

        jLabelNumber9.setText("jLabel40");

        jLabelNumber8.setText("jLabel39");

        jLabelPosition8.setText("jLabel27");

        jLabelPosition7.setText("jLabel26");

        jLabelNumber7.setText("jLabel38");

        jLabelNumber6.setText("jLabel37");

        jLabelPosition6.setText("jLabel25");

        jLabelPosition5.setText("jLabel24");

        jLabelNumber5.setText("jLabel36");

        jLabelNumber4.setText("jLabel35");

        jLabelPosition4.setText("jLabel23");

        jLabelPosition3.setText("jLabel22");

        jLabelNumber3.setText("jLabel34");

        jLabelNumber2.setText("jLabel33");

        jLabelPosition2.setText("jLabel21");

        jLabelPosition1.setText("jLabel20");

        jLabelNumber1.setText("jLabel32");

        jLabelNumber.setText("Number");

        jLabelPosition.setText("Position");

        jLabelManager.setText("Manager");

        jLabelManagerName.setText("jLabel18");

        jLabelCoach.setText("Coach");

        jLabelCoachName.setText("jLabel19");

        jLabelTeamName.setBackground(new java.awt.Color(255, 51, 51));
        jLabelTeamName.setText("jLabel2");

        jButtonChangeManager.setText("Change");
        jButtonChangeManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeManagerActionPerformed(evt);
            }
        });

        jButtonChangeCoach.setText("Change");
        jButtonChangeCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeCoachActionPerformed(evt);
            }
        });

        jButtonChangeTeam.setText("Rename Team");
        jButtonChangeTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeTeamActionPerformed(evt);
            }
        });

        jButtonChangePlayer1.setText("Replace");
        jButtonChangePlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePlayer1ActionPerformed(evt);
            }
        });

        jButtonChangePlayer2.setText("Replace");
        jButtonChangePlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePlayer2ActionPerformed(evt);
            }
        });

        jButtonChangePlayer3.setText("Replace");
        jButtonChangePlayer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePlayer3ActionPerformed(evt);
            }
        });

        jButtonChangePlayer4.setText("Replace");
        jButtonChangePlayer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePlayer4ActionPerformed(evt);
            }
        });

        jButtonChangePlayer5.setText("Replace");
        jButtonChangePlayer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePlayer5ActionPerformed(evt);
            }
        });

        jButtonChangePlayer6.setText("Replace");
        jButtonChangePlayer6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePlayer6ActionPerformed(evt);
            }
        });

        jButtonChangePlayer7.setText("Replace");
        jButtonChangePlayer7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePlayer7ActionPerformed(evt);
            }
        });

        jButtonChangePlayer8.setText("Replace");
        jButtonChangePlayer8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePlayer8ActionPerformed(evt);
            }
        });

        jButtonChangePlayer9.setText("Replace");
        jButtonChangePlayer9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePlayer9ActionPerformed(evt);
            }
        });

        jButtonChangePlayer10.setText("Replace");
        jButtonChangePlayer10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePlayer10ActionPerformed(evt);
            }
        });

        jButtonChangePlayer11.setText("Replace");
        jButtonChangePlayer11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePlayer11ActionPerformed(evt);
            }
        });

        jButtonChangePlayer12.setText("Replace");
        jButtonChangePlayer12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePlayer12ActionPerformed(evt);
            }
        });

        jButtonChangePlayer13.setText("Replace");
        jButtonChangePlayer13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePlayer13ActionPerformed(evt);
            }
        });

        jToggleButtonClear.setText("Clear team record");
        jToggleButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonChangePlayer1)
                                    .addComponent(jButtonChangePlayer2)
                                    .addComponent(jButtonChangePlayer3)
                                    .addComponent(jButtonChangePlayer5)
                                    .addComponent(jButtonChangePlayer6)
                                    .addComponent(jButtonChangePlayer7))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabelPlayer)
                                                .addComponent(jLabelPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                                .addComponent(jLabelPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelPlayer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabelPlayer5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabelPlayer6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelPlayer7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonChangePlayer4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonChangePlayer8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPlayer8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonChangePlayer13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPlayer13, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonChangePlayer9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPlayer9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonChangePlayer10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPlayer10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonChangePlayer11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPlayer11, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonChangePlayer12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPlayer12, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPosition13)
                            .addComponent(jLabelPosition9)
                            .addComponent(jLabelPosition4)
                            .addComponent(jLabelPosition5)
                            .addComponent(jLabelPosition8)
                            .addComponent(jLabelPosition10)
                            .addComponent(jLabelPosition11)
                            .addComponent(jLabelPosition12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPosition2)
                                    .addComponent(jLabelPosition3)
                                    .addComponent(jLabelPosition6)
                                    .addComponent(jLabelPosition7)
                                    .addComponent(jLabelPosition1)
                                    .addComponent(jLabelPosition))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNumber)
                                            .addComponent(jLabelNumber1))
                                        .addGap(12, 12, 12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNumber7)
                                            .addComponent(jLabelNumber6)
                                            .addComponent(jLabelNumber3)
                                            .addComponent(jLabelNumber2)
                                            .addComponent(jLabelNumber4)
                                            .addComponent(jLabelNumber5)
                                            .addComponent(jLabelNumber8)
                                            .addComponent(jLabelNumber9)
                                            .addComponent(jLabelNumber10)
                                            .addComponent(jLabelNumber11)
                                            .addComponent(jLabelNumber12)
                                            .addComponent(jLabelNumber13))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelManager)
                                                    .addComponent(jLabelCoach)
                                                    .addComponent(jLabelManagerName)
                                                    .addComponent(jLabelCoachName))
                                                .addGap(0, 15, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButtonChangeCoach, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButtonChangeManager, javax.swing.GroupLayout.Alignment.TRAILING)))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabelTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonChangeTeam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButtonClear)
                        .addGap(48, 48, 48)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTeamName)
                    .addComponent(jButtonChangeTeam)
                    .addComponent(jToggleButtonClear))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlayer)
                    .addComponent(jLabelPosition)
                    .addComponent(jLabelNumber))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlayer1)
                    .addComponent(jLabelPosition1)
                    .addComponent(jLabelNumber1)
                    .addComponent(jButtonChangePlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPlayer2)
                        .addComponent(jLabelPosition2)
                        .addComponent(jLabelNumber2)
                        .addComponent(jButtonChangePlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelManagerName)
                        .addComponent(jLabelPosition3)
                        .addComponent(jLabelNumber3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPlayer3)
                        .addComponent(jButtonChangePlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonChangeManager, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPosition4)
                        .addComponent(jLabelNumber4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPlayer4)
                        .addComponent(jButtonChangePlayer4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlayer5)
                    .addComponent(jLabelPosition5)
                    .addComponent(jLabelNumber5)
                    .addComponent(jButtonChangePlayer5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlayer6)
                    .addComponent(jLabelCoach)
                    .addComponent(jLabelPosition6)
                    .addComponent(jLabelNumber6)
                    .addComponent(jButtonChangePlayer6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlayer7)
                    .addComponent(jLabelCoachName)
                    .addComponent(jLabelPosition7)
                    .addComponent(jLabelNumber7)
                    .addComponent(jButtonChangePlayer7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonChangeCoach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPlayer8)
                        .addComponent(jLabelPosition8)
                        .addComponent(jLabelNumber8)
                        .addComponent(jButtonChangePlayer8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlayer9)
                    .addComponent(jLabelPosition9)
                    .addComponent(jLabelNumber9)
                    .addComponent(jButtonChangePlayer9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlayer10)
                    .addComponent(jLabelPosition10)
                    .addComponent(jLabelNumber10)
                    .addComponent(jButtonChangePlayer10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlayer11)
                    .addComponent(jLabelPosition11)
                    .addComponent(jLabelNumber11)
                    .addComponent(jButtonChangePlayer11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlayer12)
                    .addComponent(jLabelPosition12)
                    .addComponent(jLabelNumber12)
                    .addComponent(jButtonChangePlayer12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlayer13)
                    .addComponent(jLabelPosition13)
                    .addComponent(jLabelNumber13)
                    .addComponent(jButtonChangePlayer13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
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

    //event handler for change manager button
    private void jButtonChangeManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeManagerActionPerformed
        leagueTable.managerSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        leagueTable.playerSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangeManagerActionPerformed

    //event handler for change coach button
    private void jButtonChangeCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeCoachActionPerformed
        leagueTable.coachSelected = true; 
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        leagueTable.playerSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangeCoachActionPerformed

    //event handler for change team button
    private void jButtonChangeTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeTeamActionPerformed
        leagueTable.teamSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.playerSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangeTeamActionPerformed

    //event handler for change 1st player button
    private void jButtonChangePlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePlayer1ActionPerformed
        /** p variable is used by changeName button event handlers to determine which 
         * player from the player array used for each team should be updated
         */ 
        leagueTable.p = 0;
        leagueTable.playerSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangePlayer1ActionPerformed
    
    //event handler for change 2nd player button
    private void jButtonChangePlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePlayer2ActionPerformed
        leagueTable.p = 1;
        leagueTable.playerSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangePlayer2ActionPerformed
    
    //event handler for change 3rd player button
    private void jButtonChangePlayer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePlayer3ActionPerformed
        leagueTable.p = 2;
        leagueTable.playerSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangePlayer3ActionPerformed

    //event handler for change 4th player button
    private void jButtonChangePlayer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePlayer4ActionPerformed
        leagueTable.p = 3;
        leagueTable.playerSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangePlayer4ActionPerformed

    //event handler for change 5th player button
    private void jButtonChangePlayer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePlayer5ActionPerformed
        leagueTable.p = 4;
        leagueTable.playerSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangePlayer5ActionPerformed

    //event handler for change 6th player button
    private void jButtonChangePlayer6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePlayer6ActionPerformed
        leagueTable.p = 5;
        leagueTable.playerSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangePlayer6ActionPerformed

    //event handler for change 7th player button
    private void jButtonChangePlayer7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePlayer7ActionPerformed
        leagueTable.p = 6;
        leagueTable.playerSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangePlayer7ActionPerformed

    //event handler for change 8th player button
    private void jButtonChangePlayer8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePlayer8ActionPerformed
        leagueTable.p = 7;
        leagueTable.playerSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangePlayer8ActionPerformed

    //event handler for change 9th player button
    private void jButtonChangePlayer9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePlayer9ActionPerformed
        leagueTable.p = 8;
        leagueTable.playerSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangePlayer9ActionPerformed

    //event handler for change 10th player button
    private void jButtonChangePlayer10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePlayer10ActionPerformed
        leagueTable.p = 9;
        leagueTable.playerSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangePlayer10ActionPerformed

    //event handler for change 11th player button
    private void jButtonChangePlayer11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePlayer11ActionPerformed
        leagueTable.p = 10;
        leagueTable.playerSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangePlayer11ActionPerformed
    
    //event handler for change 12th player button
    private void jButtonChangePlayer12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePlayer12ActionPerformed
        leagueTable.p = 11;
        leagueTable.playerSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangePlayer12ActionPerformed

    //event handler for change 13th player button
    private void jButtonChangePlayer13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePlayer13ActionPerformed
        leagueTable.p = 12;
        leagueTable.playerSelected = true;
        leagueTable.coachSelected = false;
        leagueTable.managerSelected = false;
        leagueTable.newRefereeSelected = false;
        leagueTable.changeRefereeSelected = false;
        leagueTable.teamSelected = false;
        changeName.createFrame();
    }//GEN-LAST:event_jButtonChangePlayer13ActionPerformed

    /**event handler for clear button
     * sets all league statistic values to '0'
     * refresh league table
     * display reset notice
     */ 
    private void jToggleButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonClearActionPerformed
        
        leagueTable.teams[leagueTable.i].wins = 0;
        leagueTable.teams[leagueTable.i].losses = 0;
        leagueTable.teams[leagueTable.i].draws = 0;
        leagueTable.teams[leagueTable.i].goals = 0;
        leagueTable.teams[leagueTable.i].goalsAgainst = 0;
        leagueTable.teams[leagueTable.i].points = 0;
        leagueTable.refresh();
        JOptionPane.showMessageDialog(this, "Team stats have been reset");
    }//GEN-LAST:event_jToggleButtonClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangeCoach;
    private javax.swing.JButton jButtonChangeManager;
    private javax.swing.JButton jButtonChangePlayer1;
    private javax.swing.JButton jButtonChangePlayer10;
    private javax.swing.JButton jButtonChangePlayer11;
    private javax.swing.JButton jButtonChangePlayer12;
    private javax.swing.JButton jButtonChangePlayer13;
    private javax.swing.JButton jButtonChangePlayer2;
    private javax.swing.JButton jButtonChangePlayer3;
    private javax.swing.JButton jButtonChangePlayer4;
    private javax.swing.JButton jButtonChangePlayer5;
    private javax.swing.JButton jButtonChangePlayer6;
    private javax.swing.JButton jButtonChangePlayer7;
    private javax.swing.JButton jButtonChangePlayer8;
    private javax.swing.JButton jButtonChangePlayer9;
    private javax.swing.JButton jButtonChangeTeam;
    private javax.swing.JLabel jLabelCoach;
    private static javax.swing.JLabel jLabelCoachName;
    private javax.swing.JLabel jLabelManager;
    private static javax.swing.JLabel jLabelManagerName;
    private javax.swing.JLabel jLabelNumber;
    private static javax.swing.JLabel jLabelNumber1;
    private static javax.swing.JLabel jLabelNumber10;
    private static javax.swing.JLabel jLabelNumber11;
    private static javax.swing.JLabel jLabelNumber12;
    private static javax.swing.JLabel jLabelNumber13;
    private static javax.swing.JLabel jLabelNumber2;
    private static javax.swing.JLabel jLabelNumber3;
    private static javax.swing.JLabel jLabelNumber4;
    private static javax.swing.JLabel jLabelNumber5;
    private static javax.swing.JLabel jLabelNumber6;
    private static javax.swing.JLabel jLabelNumber7;
    private static javax.swing.JLabel jLabelNumber8;
    private static javax.swing.JLabel jLabelNumber9;
    private javax.swing.JLabel jLabelPlayer;
    private static javax.swing.JLabel jLabelPlayer1;
    private static javax.swing.JLabel jLabelPlayer10;
    private static javax.swing.JLabel jLabelPlayer11;
    private static javax.swing.JLabel jLabelPlayer12;
    private static javax.swing.JLabel jLabelPlayer13;
    private static javax.swing.JLabel jLabelPlayer2;
    private static javax.swing.JLabel jLabelPlayer3;
    private static javax.swing.JLabel jLabelPlayer4;
    private static javax.swing.JLabel jLabelPlayer5;
    private static javax.swing.JLabel jLabelPlayer6;
    private static javax.swing.JLabel jLabelPlayer7;
    private static javax.swing.JLabel jLabelPlayer8;
    private static javax.swing.JLabel jLabelPlayer9;
    private javax.swing.JLabel jLabelPosition;
    private static javax.swing.JLabel jLabelPosition1;
    private static javax.swing.JLabel jLabelPosition10;
    private static javax.swing.JLabel jLabelPosition11;
    private static javax.swing.JLabel jLabelPosition12;
    private static javax.swing.JLabel jLabelPosition13;
    private static javax.swing.JLabel jLabelPosition2;
    private static javax.swing.JLabel jLabelPosition3;
    private static javax.swing.JLabel jLabelPosition4;
    private static javax.swing.JLabel jLabelPosition5;
    private static javax.swing.JLabel jLabelPosition6;
    private static javax.swing.JLabel jLabelPosition7;
    private static javax.swing.JLabel jLabelPosition8;
    private static javax.swing.JLabel jLabelPosition9;
    private static javax.swing.JLabel jLabelTeamName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButtonClear;
    // End of variables declaration//GEN-END:variables
}
