/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thomasbotsford.oop.cw1;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author tom
 */
public class leagueTable extends javax.swing.JFrame {
    // Initialising variables and constructing objects
    static team team1 = new team("Warriors");
    static team team2 = new team("Kestrels");
    static team team3 = new team("Lions");
    static team team4 = new team("Challengers");
    static team team5 = new team("Centurions");
    static team team6 = new team("Explorers");
    static team team7 = new team("Panthers");
    static team team8 = new team("Swans");
    static referee ref1 = new referee("Daniel Seagate");
    static referee ref2 = new referee("Lucas Brindley");
    static referee ref3 = new referee("Adam Lane");
    static referee ref4;
    static referee ref5;
    static referee ref6;
    public static ArrayList<referee> refList = new ArrayList<>(6); //ArrayList of referees
    static manager manager1 = new manager("Adam Fearn");
    static manager manager2 = new manager("William Stamper");
    static manager manager3 = new manager("Zach Hadel");
    static manager manager4 = new manager("Michael Lauer");
    static manager manager5 = new manager("Thomas Botsford");
    static manager manager6 = new manager("Edward Fly");
    static manager manager7 = new manager("Nicholas Angel");
    static manager manager8 = new manager("Daniel Butterman");
    static coach coach1 = new coach("Richard Evans");
    static coach coach2 = new coach("Michael Stocklasa");
    static coach coach3 = new coach("Jacob Bauman");
    static coach coach4 = new coach("Jack Packard");
    static coach coach5 = new coach("Colin Cunningham");
    static coach coach6 = new coach("Harry Plinkett");
    static coach coach7 = new coach("Alex Jones");
    static coach coach8 = new coach("Gordon Hurd");
    static public team[] teams = new team[]{team1, team2, team3, team4, team5, team6, team7, team8}; //array of teams
    static public int i = 0;
    static public int p = 0;
    static public boolean firstInstance = true;
    static boolean coachSelected = false;
    static boolean managerSelected = false;
    static boolean newRefereeSelected = false;
    static boolean changeRefereeSelected = false;
    static boolean teamSelected = false;
    static boolean playerSelected = false;
    
    /**
     * Creates new form leagueTable
     */
    public leagueTable() {
        initComponents();
    }
    
    // Refresh method to update content in frame
    public static void refresh(){
        jButtonTeam1.setText(team1.getName());
        jButtonTeam2.setText(team2.getName());
        jButtonTeam3.setText(team3.getName());
        jButtonTeam4.setText(team4.getName());
        jButtonTeam5.setText(team5.getName());
        jButtonTeam6.setText(team6.getName());
        jButtonTeam7.setText(team7.getName());
        jButtonTeam8.setText(team8.getName());
        jLabelWins1.setText(Integer.toString(team1.getWins()));
        jLabelWins2.setText(Integer.toString(team2.getWins()));
        jLabelWins3.setText(Integer.toString(team3.getWins()));
        jLabelWins4.setText(Integer.toString(team4.getWins()));
        jLabelWins5.setText(Integer.toString(team5.getWins()));
        jLabelWins6.setText(Integer.toString(team6.getWins()));
        jLabelWins7.setText(Integer.toString(team7.getWins()));
        jLabelWins8.setText(Integer.toString(team8.getWins()));
        jLabelDraws1.setText(Integer.toString(team1.getDraws()));
        jLabelDraws2.setText(Integer.toString(team2.getDraws()));
        jLabelDraws3.setText(Integer.toString(team3.getDraws()));
        jLabelDraws4.setText(Integer.toString(team4.getDraws()));
        jLabelDraws5.setText(Integer.toString(team5.getDraws()));
        jLabelDraws6.setText(Integer.toString(team6.getDraws()));
        jLabelDraws7.setText(Integer.toString(team7.getDraws()));
        jLabelDraws8.setText(Integer.toString(team8.getDraws()));
        jLabelLosses1.setText(Integer.toString(team1.getLosses()));
        jLabelLosses2.setText(Integer.toString(team2.getLosses()));
        jLabelLosses3.setText(Integer.toString(team3.getLosses()));
        jLabelLosses4.setText(Integer.toString(team4.getLosses()));
        jLabelLosses5.setText(Integer.toString(team5.getLosses()));
        jLabelLosses6.setText(Integer.toString(team6.getLosses()));
        jLabelLosses7.setText(Integer.toString(team7.getLosses()));
        jLabelLosses8.setText(Integer.toString(team8.getLosses()));
        jLabelPoints1.setText(Integer.toString(team1.getPoints()));
        jLabelPoints2.setText(Integer.toString(team2.getPoints()));
        jLabelPoints3.setText(Integer.toString(team3.getPoints()));
        jLabelPoints4.setText(Integer.toString(team4.getPoints()));
        jLabelPoints5.setText(Integer.toString(team5.getPoints()));
        jLabelPoints6.setText(Integer.toString(team6.getPoints()));
        jLabelPoints7.setText(Integer.toString(team7.getPoints()));
        jLabelPoints8.setText(Integer.toString(team8.getPoints()));
        jLabelGF1.setText(Integer.toString(team1.goals));
        jLabelGF2.setText(Integer.toString(team2.goals));
        jLabelGF3.setText(Integer.toString(team3.goals));
        jLabelGF4.setText(Integer.toString(team4.goals));
        jLabelGF5.setText(Integer.toString(team5.goals));
        jLabelGF6.setText(Integer.toString(team6.goals));
        jLabelGF7.setText(Integer.toString(team7.goals));
        jLabelGF8.setText(Integer.toString(team8.goals));
        jLabelGA1.setText(Integer.toString(team1.goalsAgainst));
        jLabelGA2.setText(Integer.toString(team2.goalsAgainst));
        jLabelGA3.setText(Integer.toString(team3.goalsAgainst));
        jLabelGA4.setText(Integer.toString(team4.goalsAgainst));
        jLabelGA5.setText(Integer.toString(team5.goalsAgainst));
        jLabelGA6.setText(Integer.toString(team6.goalsAgainst));
        jLabelGA7.setText(Integer.toString(team7.goalsAgainst));
        jLabelGA8.setText(Integer.toString(team8.goalsAgainst));
        
        //calculating and displaying goal difference 
        jLabelGD1.setText(Integer.toString(team1.goals - team1.goalsAgainst));
        jLabelGD2.setText(Integer.toString(team2.goals - team2.goalsAgainst));
        jLabelGD3.setText(Integer.toString(team3.goals - team3.goalsAgainst));
        jLabelGD4.setText(Integer.toString(team4.goals - team4.goalsAgainst));
        jLabelGD5.setText(Integer.toString(team5.goals - team5.goalsAgainst));
        jLabelGD6.setText(Integer.toString(team6.goals - team6.goalsAgainst));
        jLabelGD7.setText(Integer.toString(team7.goals - team7.goalsAgainst));
        jLabelGD8.setText(Integer.toString(team8.goals - team8.goalsAgainst));
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
        jLabelTeam = new javax.swing.JLabel();
        jLabelWins = new javax.swing.JLabel();
        jLabelDraws = new javax.swing.JLabel();
        jLabelLosses = new javax.swing.JLabel();
        jLabelPoints = new javax.swing.JLabel();
        jLabelWins1 = new javax.swing.JLabel();
        jLabelWins2 = new javax.swing.JLabel();
        jLabelWins3 = new javax.swing.JLabel();
        jLabelWins4 = new javax.swing.JLabel();
        jLabelWins5 = new javax.swing.JLabel();
        jLabelWins6 = new javax.swing.JLabel();
        jLabelWins7 = new javax.swing.JLabel();
        jLabelWins8 = new javax.swing.JLabel();
        jLabelDraws1 = new javax.swing.JLabel();
        jLabelDraws2 = new javax.swing.JLabel();
        jLabelDraws3 = new javax.swing.JLabel();
        jLabelDraws4 = new javax.swing.JLabel();
        jLabelDraws5 = new javax.swing.JLabel();
        jLabelDraws6 = new javax.swing.JLabel();
        jLabelDraws7 = new javax.swing.JLabel();
        jLabelDraws8 = new javax.swing.JLabel();
        jLabelLosses1 = new javax.swing.JLabel();
        jLabelLosses2 = new javax.swing.JLabel();
        jLabelLosses3 = new javax.swing.JLabel();
        jLabelLosses4 = new javax.swing.JLabel();
        jLabelLosses5 = new javax.swing.JLabel();
        jLabelLosses6 = new javax.swing.JLabel();
        jLabelLosses7 = new javax.swing.JLabel();
        jLabelLosses8 = new javax.swing.JLabel();
        jLabelPoints1 = new javax.swing.JLabel();
        jLabelPoints2 = new javax.swing.JLabel();
        jLabelPoints3 = new javax.swing.JLabel();
        jLabelPoints4 = new javax.swing.JLabel();
        jLabelPoints5 = new javax.swing.JLabel();
        jLabelPoints6 = new javax.swing.JLabel();
        jLabelPoints7 = new javax.swing.JLabel();
        jLabelPoints8 = new javax.swing.JLabel();
        jButtonNewGame = new javax.swing.JButton();
        jButtonTeam1 = new javax.swing.JButton();
        jButtonTeam2 = new javax.swing.JButton();
        jButtonTeam3 = new javax.swing.JButton();
        jButtonTeam4 = new javax.swing.JButton();
        jButtonTeam5 = new javax.swing.JButton();
        jButtonTeam6 = new javax.swing.JButton();
        jButtonTeam7 = new javax.swing.JButton();
        jButtonTeam8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelGF1 = new javax.swing.JLabel();
        jLabelGF2 = new javax.swing.JLabel();
        jLabelGF3 = new javax.swing.JLabel();
        jLabelGF4 = new javax.swing.JLabel();
        jLabelGF5 = new javax.swing.JLabel();
        jLabelGF6 = new javax.swing.JLabel();
        jLabelGF7 = new javax.swing.JLabel();
        jLabelGF8 = new javax.swing.JLabel();
        jLabelGA1 = new javax.swing.JLabel();
        jLabelGA2 = new javax.swing.JLabel();
        jLabelGA3 = new javax.swing.JLabel();
        jLabelGA4 = new javax.swing.JLabel();
        jLabelGA5 = new javax.swing.JLabel();
        jLabelGA6 = new javax.swing.JLabel();
        jLabelGA7 = new javax.swing.JLabel();
        jLabelGA8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabelGD1 = new javax.swing.JLabel();
        jLabelGD2 = new javax.swing.JLabel();
        jLabelGD3 = new javax.swing.JLabel();
        jLabelGD4 = new javax.swing.JLabel();
        jLabelGD5 = new javax.swing.JLabel();
        jLabelGD6 = new javax.swing.JLabel();
        jLabelGD7 = new javax.swing.JLabel();
        jLabelGD8 = new javax.swing.JLabel();
        jButtonRefInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("leagueFrame");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("leagueFrame"); // NOI18N

        jLabelTeam.setText("Team");

        jLabelWins.setText("Wins");

        jLabelDraws.setText("Draws");

        jLabelLosses.setText("Losses");

        jLabelPoints.setText("Points");

        jLabelWins1.setText("jLabel1");

        jLabelWins2.setText("jLabel2");

        jLabelWins3.setText("jLabel3");

        jLabelWins4.setText("jLabel4");

        jLabelWins5.setText("jLabel5");

        jLabelWins6.setText("jLabel6");

        jLabelWins7.setText("jLabel7");

        jLabelWins8.setText("jLabel8");

        jLabelDraws1.setText("jLabel9");

        jLabelDraws2.setText("jLabel10");

        jLabelDraws3.setText("jLabel11");

        jLabelDraws4.setText("jLabel12");

        jLabelDraws5.setText("jLabel13");

        jLabelDraws6.setText("jLabel14");

        jLabelDraws7.setText("jLabel15");

        jLabelDraws8.setText("jLabel16");

        jLabelLosses1.setText("jLabel17");

        jLabelLosses2.setText("jLabel18");

        jLabelLosses3.setText("jLabel19");

        jLabelLosses4.setText("jLabel20");

        jLabelLosses5.setText("jLabel21");

        jLabelLosses6.setText("jLabel22");

        jLabelLosses7.setText("jLabel23");

        jLabelLosses8.setText("jLabel24");

        jLabelPoints1.setText("jLabel25");

        jLabelPoints2.setText("jLabel26");

        jLabelPoints3.setText("jLabel27");

        jLabelPoints4.setText("jLabel28");

        jLabelPoints5.setText("jLabel29");

        jLabelPoints6.setText("jLabel30");

        jLabelPoints7.setText("jLabel31");

        jLabelPoints8.setText("jLabel32");

        jButtonNewGame.setText("New Game");
        jButtonNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewGameActionPerformed(evt);
            }
        });

        jButtonTeam1.setText("jButton2");
        jButtonTeam1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonTeam1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonTeam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeam1ActionPerformed(evt);
            }
        });

        jButtonTeam2.setText("jButton3");
        jButtonTeam2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonTeam2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonTeam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeam2ActionPerformed(evt);
            }
        });

        jButtonTeam3.setText("jButton4");
        jButtonTeam3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonTeam3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonTeam3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeam3ActionPerformed(evt);
            }
        });

        jButtonTeam4.setText("jButton5");
        jButtonTeam4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonTeam4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonTeam4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeam4ActionPerformed(evt);
            }
        });

        jButtonTeam5.setText("jButton6");
        jButtonTeam5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonTeam5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonTeam5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeam5ActionPerformed(evt);
            }
        });

        jButtonTeam6.setText("jButton7");
        jButtonTeam6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonTeam6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonTeam6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeam6ActionPerformed(evt);
            }
        });

        jButtonTeam7.setText("jButton8");
        jButtonTeam7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonTeam7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonTeam7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeam7ActionPerformed(evt);
            }
        });

        jButtonTeam8.setText("jButton9");
        jButtonTeam8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonTeam8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonTeam8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeam8ActionPerformed(evt);
            }
        });

        jLabel1.setText("GF");

        jLabel2.setText("GA");

        jLabelGF1.setText("jLabel3");

        jLabelGF2.setText("jLabel4");

        jLabelGF3.setText("jLabel5");

        jLabelGF4.setText("jLabel6");

        jLabelGF5.setText("jLabel7");

        jLabelGF6.setText("jLabel8");

        jLabelGF7.setText("jLabel9");

        jLabelGF8.setText("jLabel10");

        jLabelGA1.setText("jLabel11");

        jLabelGA2.setText("jLabel12");

        jLabelGA3.setText("jLabel13");

        jLabelGA4.setText("jLabel14");

        jLabelGA5.setText("jLabel15");

        jLabelGA6.setText("jLabel16");

        jLabelGA7.setText("jLabel17");

        jLabelGA8.setText("jLabel18");

        jLabel19.setText("GD");

        jLabelGD1.setText("jLabel20");

        jLabelGD2.setText("jLabel21");

        jLabelGD3.setText("jLabel22");

        jLabelGD4.setText("jLabel23");

        jLabelGD5.setText("jLabel24");

        jLabelGD6.setText("jLabel25");

        jLabelGD7.setText("jLabel26");

        jLabelGD8.setText("jLabel27");

        jButtonRefInfo.setText("Referees");
        jButtonRefInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonTeam8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelTeam))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonTeam7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jButtonTeam6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonTeam5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonTeam4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonTeam3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonTeam2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonTeam1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWins)
                    .addComponent(jLabelWins1)
                    .addComponent(jLabelWins2)
                    .addComponent(jLabelWins3)
                    .addComponent(jLabelWins4)
                    .addComponent(jLabelWins5)
                    .addComponent(jLabelWins6)
                    .addComponent(jLabelWins7)
                    .addComponent(jLabelWins8))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDraws)
                    .addComponent(jLabelDraws1)
                    .addComponent(jLabelDraws2)
                    .addComponent(jLabelDraws3)
                    .addComponent(jLabelDraws4)
                    .addComponent(jLabelDraws5)
                    .addComponent(jLabelDraws6)
                    .addComponent(jLabelDraws7)
                    .addComponent(jLabelDraws8))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLosses)
                    .addComponent(jLabelLosses2)
                    .addComponent(jLabelLosses3)
                    .addComponent(jLabelLosses4)
                    .addComponent(jLabelLosses5)
                    .addComponent(jLabelLosses6)
                    .addComponent(jLabelLosses7)
                    .addComponent(jLabelLosses8)
                    .addComponent(jLabelLosses1))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelGF1)
                    .addComponent(jLabelGF2)
                    .addComponent(jLabelGF3)
                    .addComponent(jLabelGF4)
                    .addComponent(jLabelGF5)
                    .addComponent(jLabelGF6)
                    .addComponent(jLabelGF7)
                    .addComponent(jLabelGF8))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabelGA1)
                    .addComponent(jLabelGA2)
                    .addComponent(jLabelGA3)
                    .addComponent(jLabelGA4)
                    .addComponent(jLabelGA5)
                    .addComponent(jLabelGA6)
                    .addComponent(jLabelGA7)
                    .addComponent(jLabelGA8))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGD1)
                    .addComponent(jLabel19)
                    .addComponent(jLabelGD2)
                    .addComponent(jLabelGD3)
                    .addComponent(jLabelGD4)
                    .addComponent(jLabelGD5)
                    .addComponent(jLabelGD6)
                    .addComponent(jLabelGD7)
                    .addComponent(jLabelGD8))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPoints8)
                    .addComponent(jLabelPoints7)
                    .addComponent(jLabelPoints6)
                    .addComponent(jLabelPoints5)
                    .addComponent(jLabelPoints4)
                    .addComponent(jLabelPoints3)
                    .addComponent(jLabelPoints2)
                    .addComponent(jLabelPoints1)
                    .addComponent(jLabelPoints))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 371, Short.MAX_VALUE)
                .addComponent(jButtonRefInfo)
                .addGap(69, 69, 69)
                .addComponent(jButtonNewGame)
                .addGap(244, 244, 244))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTeam)
                    .addComponent(jLabelWins)
                    .addComponent(jLabelDraws)
                    .addComponent(jLabelLosses)
                    .addComponent(jLabelPoints)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel19))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWins1)
                    .addComponent(jLabelDraws1)
                    .addComponent(jLabelLosses1)
                    .addComponent(jLabelPoints1)
                    .addComponent(jButtonTeam1)
                    .addComponent(jLabelGF1)
                    .addComponent(jLabelGA1)
                    .addComponent(jLabelGD1))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWins2)
                    .addComponent(jLabelDraws2)
                    .addComponent(jLabelLosses2)
                    .addComponent(jLabelPoints2)
                    .addComponent(jButtonTeam2)
                    .addComponent(jLabelGF2)
                    .addComponent(jLabelGA2)
                    .addComponent(jLabelGD2))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWins3)
                    .addComponent(jLabelDraws3)
                    .addComponent(jLabelLosses3)
                    .addComponent(jLabelPoints3)
                    .addComponent(jButtonTeam3)
                    .addComponent(jLabelGF3)
                    .addComponent(jLabelGA3)
                    .addComponent(jLabelGD3))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWins4)
                    .addComponent(jLabelDraws4)
                    .addComponent(jLabelLosses4)
                    .addComponent(jLabelPoints4)
                    .addComponent(jButtonTeam4)
                    .addComponent(jLabelGF4)
                    .addComponent(jLabelGA4)
                    .addComponent(jLabelGD4))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWins5)
                    .addComponent(jLabelDraws5)
                    .addComponent(jLabelLosses5)
                    .addComponent(jLabelPoints5)
                    .addComponent(jButtonTeam5)
                    .addComponent(jLabelGF5)
                    .addComponent(jLabelGA5)
                    .addComponent(jLabelGD5))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWins6)
                    .addComponent(jLabelDraws6)
                    .addComponent(jLabelLosses6)
                    .addComponent(jLabelPoints6)
                    .addComponent(jButtonTeam6)
                    .addComponent(jLabelGF6)
                    .addComponent(jLabelGA6)
                    .addComponent(jLabelGD6))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWins7)
                    .addComponent(jLabelDraws7)
                    .addComponent(jLabelLosses7)
                    .addComponent(jLabelPoints7)
                    .addComponent(jButtonTeam7)
                    .addComponent(jLabelGF7)
                    .addComponent(jLabelGA7)
                    .addComponent(jLabelGD7))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWins8)
                    .addComponent(jLabelDraws8)
                    .addComponent(jLabelLosses8)
                    .addComponent(jLabelPoints8)
                    .addComponent(jButtonTeam8)
                    .addComponent(jLabelGF8)
                    .addComponent(jLabelGA8)
                    .addComponent(jLabelGD8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewGame)
                    .addComponent(jButtonRefInfo)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Event handler for new game button
    private void jButtonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewGameActionPerformed
        if(refList.size() == 6){
            newGame.createFrame();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please ensure there are six referees before creating any games.");
        }
    }//GEN-LAST:event_jButtonNewGameActionPerformed

    //event handler for selecting 4th team in table
    private void jButtonTeam4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeam4ActionPerformed
        i = 3;
        teamInfo.createFrame();
    }//GEN-LAST:event_jButtonTeam4ActionPerformed
    
    //event handler for selecting 1st team in table
    private void jButtonTeam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeam1ActionPerformed
        i = 0;
        teamInfo.createFrame();
    }//GEN-LAST:event_jButtonTeam1ActionPerformed
    
    //event handler for selecting 2nd team in table
    private void jButtonTeam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeam2ActionPerformed
        i = 1;
        teamInfo.createFrame();
    }//GEN-LAST:event_jButtonTeam2ActionPerformed
    
    //event handler for selecting 3rd team in table
    private void jButtonTeam3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeam3ActionPerformed
        i = 2;
        teamInfo.createFrame();
    }//GEN-LAST:event_jButtonTeam3ActionPerformed
    
    //event handler for selecting 5th team in table
    private void jButtonTeam5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeam5ActionPerformed
        i = 4;
        teamInfo.createFrame();
    }//GEN-LAST:event_jButtonTeam5ActionPerformed
    
    //event handler for selecting 6th team in table
    private void jButtonTeam6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeam6ActionPerformed
        i = 5;
        teamInfo.createFrame();
    }//GEN-LAST:event_jButtonTeam6ActionPerformed
    
    //event handler for selecting 7th team in table
    private void jButtonTeam7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeam7ActionPerformed
        i = 6;
        teamInfo.createFrame();
    }//GEN-LAST:event_jButtonTeam7ActionPerformed
    
    //event handler for selecting 8th team in table
    private void jButtonTeam8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeam8ActionPerformed
        i = 7;
        teamInfo.createFrame();
    }//GEN-LAST:event_jButtonTeam8ActionPerformed

    //event handler for selecting referees button
    private void jButtonRefInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefInfoActionPerformed
        //uses a different method to create the refereeInfo form if it is not the first time
        if(firstInstance == true){
            refereeInfo.createFrame();
            firstInstance = false;
        }
        else{
            refereeInfo.createFrame2();
        }
    }//GEN-LAST:event_jButtonRefInfoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        
        /**initialising the teams and their players
         * create player array
         * initialise array with player constructors
         * set team's players to the array
         * set team's manager to one that is previously initialised
         * set team's coach to one that is previously initialised
         */
        player[] warriorsPlayers;
        warriorsPlayers = new player[] {new player("John White","GK",2), new player("Jack Lincoln","LB",10),
        new player("Peter Simpson","RB",8), new player("Alex Hulmes","CB",4), new player("Thomas Downing","CM",1), new player("Lucas Jones","LM",9),
        new player("Dominic Peters","RM",5), new player("Elliott Cooper","CAM",6), new player("Max Stafford-Watson","LW",11), new player("Connor Curran","ST",3),
        new player("Joe Clyne","RW",7), new player("Niall Murray","SUB",13), new player("Chris O'Neill","SUB",12)};
        team1.players = warriorsPlayers;
        team1.setManager(manager1);
        team1.setCoach(coach1); 
                
        player[] kestrelsPlayers;
        kestrelsPlayers = new player[] {new player("Caleb Brown","GK",9), new player("Kevin Moore","LB",4),
        new player("Max White","RB",2), new player("Archie Phillips","CB",10), new player("Fraser Hill","CM",8), new player("Lloyd Roberts","LM",1),
        new player("Ben Adams","RM",7), new player("Philip Payne","CAM",6), new player("Dillon Edwards","LW",11), new player("Curtis Mills","ST",3),
        new player("Tim Price","RW",5), new player("Nicholas Hawkins","SUB",12), new player("Andrew Rose","SUB",13)};
        team2.players = kestrelsPlayers;
        team2.setManager(manager2); 
        team2.setCoach(coach2); 
        
        player[] lionsPlayers;
        lionsPlayers = new player[] {new player("Keiran Cook","GK",11), new player("Callum Reynolds","LB",6),
        new player("Jordan Collins","RB",7), new player("Simon Rose","CB",4), new player("Omar Stephens","CM",1), new player("Morgan Knight","LM",3),
        new player("Tyler Stevens","RM",10), new player("Greg Hawkins","CAM",13), new player("Niall Myers","LW",5), new player("Alfred Simmons","ST",2),
        new player("Matthew Burns","RW",8), new player("Luke Daniels","SUB",12), new player("John Stephens","SUB",9)};
        team3.players = lionsPlayers;
        team3.setManager(manager3);
        team3.setCoach(coach3); 
        
        player[] challengersPlayers;
        challengersPlayers = new player[] {new player("Craig Hughes","GK",6), new player("Lawrence Woods","LB",10),
        new player("Myles Rogers","RB",7), new player("Brendan Gardner","CB",1), new player("Arron Wells","CM",12), new player("Robbie Webb","LM",3),
        new player("Dean Wood","RM",5), new player("Darren Mcdonald","CAM",2), new player("Steven Daniels","LW",9), new player("Noah Jenkins","ST",11),
        new player("Angus Nichols","RW",13), new player("Steve Mills","SUB",4), new player("Caleb Weaver","SUB",8)};
        team4.players = challengersPlayers;
        team4.setManager(manager4); 
        team4.setCoach(coach4); 
        
        player[] centurionsPlayers;
        centurionsPlayers = new player[] {new player("Miles Hicks","GK",3), new player("Ali Owens","LB",4),
        new player("Lucas Peters","RB",13), new player("Tristan Simpson","CB",12), new player("Martin Hansen","CM",5), new player("Reuben Butler","LM",1),
        new player("Tom Cox","RM",10), new player("Euan Robertson","CAM",8), new player("Karl Crawford","LW",7), new player("Stuart Weaver","ST",11),
        new player("Marc Bell","RW",6), new player("Jason Gardner","SUB",9), new player("Nathan Robertson","SUB",2)};
        team5.players = centurionsPlayers;
        team5.setManager(manager5); 
        team5.setCoach(coach5); 
        
        player[] explorersPlayers;
        explorersPlayers = new player[] {new player("Ashley Richardson","GK",10), new player("Ewan Cummings","LB",1),
        new player("Carl Browne","RB",6), new player("Theodore Sheppard","CB",3), new player("Connor Bond","CM",2), new player("Max Walters","LM",9),
        new player("Alistair Stannard","RM",8), new player("Gareth Weber","CAM",4), new player("Ellis Bird","LW",11), new player("Leo Hodgson","ST",13),
        new player("Felix Poole","RW",12), new player("Jon Payne","SUB",5), new player("Timothy Hicks","SUB",7)};
        team6.players = explorersPlayers;
        team6.setManager(manager6);
        team6.setCoach(coach6); 
        
        player[] panthersPlayers;
        panthersPlayers = new player[] {new player("Hugh Andrews","GK",10), new player("Larry Hopkins","LB",3),
        new player("Ian Wilkins","RB",8), new player("Rowan Bowman","CB",1), new player("Blake Welch","CM",12), new player("Brad Field","LM",11),
        new player("Spencer Harding","RM",5), new player("Alan Saunders","CAM",13), new player("Frank Carr","LW",4), new player("Louis Stainton","ST",7),
        new player("Keenan Sutherland","RW",9), new player("Jordan Nichols","SUB",2), new player("Philip Knight","SUB",6)};
        team7.players = panthersPlayers;
        team7.setManager(manager7);
        team7.setCoach(coach7); 
        
        player[] swansPlayers;
        swansPlayers = new player[] {new player("Travis Parks","GK",1), new player("Brett Davies","LB",13),
        new player("Ieuan Perkins","RB",12), new player("Justin Hobbs","CB",11), new player("Ricky Middleton","CM",2), new player("James Rowe","LM",3),
        new player("Grant Chapman","RM",4), new player("Hugh Chambers","CAM",7), new player("Tony May","LW",9), new player("Zack Wilkinson","ST",10),
        new player("Antony Hewitt","RW",6), new player("Paul Hansen","SUB",8), new player("Mark Peters","SUB",5)};
        team8.players = swansPlayers;
        team8.setManager(manager8); 
        team8.setCoach(coach8); 
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(leagueTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(leagueTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(leagueTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(leagueTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new leagueTable().setVisible(true);
                jButtonTeam1.setText(team1.getName());
                jButtonTeam2.setText(team2.getName());
                jButtonTeam3.setText(team3.getName());
                jButtonTeam4.setText(team4.getName());
                jButtonTeam5.setText(team5.getName());
                jButtonTeam6.setText(team6.getName());
                jButtonTeam7.setText(team7.getName());
                jButtonTeam8.setText(team8.getName());
                jLabelWins1.setText(Integer.toString(team1.getWins()));
                jLabelWins2.setText(Integer.toString(team2.getWins()));
                jLabelWins3.setText(Integer.toString(team3.getWins()));
                jLabelWins4.setText(Integer.toString(team4.getWins()));
                jLabelWins5.setText(Integer.toString(team5.getWins()));
                jLabelWins6.setText(Integer.toString(team6.getWins()));
                jLabelWins7.setText(Integer.toString(team7.getWins()));
                jLabelWins8.setText(Integer.toString(team8.getWins()));
                jLabelDraws1.setText(Integer.toString(team1.getDraws()));
                jLabelDraws2.setText(Integer.toString(team2.getDraws()));
                jLabelDraws3.setText(Integer.toString(team3.getDraws()));
                jLabelDraws4.setText(Integer.toString(team4.getDraws()));
                jLabelDraws5.setText(Integer.toString(team5.getDraws()));
                jLabelDraws6.setText(Integer.toString(team6.getDraws()));
                jLabelDraws7.setText(Integer.toString(team7.getDraws()));
                jLabelDraws8.setText(Integer.toString(team8.getDraws()));
                jLabelLosses1.setText(Integer.toString(team1.getLosses()));
                jLabelLosses2.setText(Integer.toString(team2.getLosses()));
                jLabelLosses3.setText(Integer.toString(team3.getLosses()));
                jLabelLosses4.setText(Integer.toString(team4.getLosses()));
                jLabelLosses5.setText(Integer.toString(team5.getLosses()));
                jLabelLosses6.setText(Integer.toString(team6.getLosses()));
                jLabelLosses7.setText(Integer.toString(team7.getLosses()));
                jLabelLosses8.setText(Integer.toString(team8.getLosses()));
                jLabelPoints1.setText(Integer.toString(team1.getPoints()));
                jLabelPoints2.setText(Integer.toString(team2.getPoints()));
                jLabelPoints3.setText(Integer.toString(team3.getPoints()));
                jLabelPoints4.setText(Integer.toString(team4.getPoints()));
                jLabelPoints5.setText(Integer.toString(team5.getPoints()));
                jLabelPoints6.setText(Integer.toString(team6.getPoints()));
                jLabelPoints7.setText(Integer.toString(team7.getPoints()));
                jLabelPoints8.setText(Integer.toString(team8.getPoints()));
                jLabelGF1.setText(Integer.toString(team1.goals));
                jLabelGF2.setText(Integer.toString(team2.goals));
                jLabelGF3.setText(Integer.toString(team3.goals));
                jLabelGF4.setText(Integer.toString(team4.goals));
                jLabelGF5.setText(Integer.toString(team5.goals));
                jLabelGF6.setText(Integer.toString(team6.goals));
                jLabelGF7.setText(Integer.toString(team7.goals));
                jLabelGF8.setText(Integer.toString(team8.goals));
                jLabelGA1.setText(Integer.toString(team1.goalsAgainst));
                jLabelGA2.setText(Integer.toString(team2.goalsAgainst));
                jLabelGA3.setText(Integer.toString(team3.goalsAgainst));
                jLabelGA4.setText(Integer.toString(team4.goalsAgainst));
                jLabelGA5.setText(Integer.toString(team5.goalsAgainst));
                jLabelGA6.setText(Integer.toString(team6.goalsAgainst));
                jLabelGA7.setText(Integer.toString(team7.goalsAgainst));
                jLabelGA8.setText(Integer.toString(team8.goalsAgainst));
                jLabelGD1.setText(Integer.toString(team1.goals - team1.goalsAgainst));
                jLabelGD2.setText(Integer.toString(team2.goals - team2.goalsAgainst));
                jLabelGD3.setText(Integer.toString(team3.goals - team3.goalsAgainst));
                jLabelGD4.setText(Integer.toString(team4.goals - team4.goalsAgainst));
                jLabelGD5.setText(Integer.toString(team5.goals - team5.goalsAgainst));
                jLabelGD6.setText(Integer.toString(team6.goals - team6.goalsAgainst));
                jLabelGD7.setText(Integer.toString(team7.goals - team7.goalsAgainst));
                jLabelGD8.setText(Integer.toString(team8.goals - team8.goalsAgainst));
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNewGame;
    private javax.swing.JButton jButtonRefInfo;
    private static javax.swing.JButton jButtonTeam1;
    private static javax.swing.JButton jButtonTeam2;
    private static javax.swing.JButton jButtonTeam3;
    private static javax.swing.JButton jButtonTeam4;
    private static javax.swing.JButton jButtonTeam5;
    private static javax.swing.JButton jButtonTeam6;
    private static javax.swing.JButton jButtonTeam7;
    private static javax.swing.JButton jButtonTeam8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDraws;
    private static javax.swing.JLabel jLabelDraws1;
    private static javax.swing.JLabel jLabelDraws2;
    private static javax.swing.JLabel jLabelDraws3;
    private static javax.swing.JLabel jLabelDraws4;
    private static javax.swing.JLabel jLabelDraws5;
    private static javax.swing.JLabel jLabelDraws6;
    private static javax.swing.JLabel jLabelDraws7;
    private static javax.swing.JLabel jLabelDraws8;
    private static javax.swing.JLabel jLabelGA1;
    private static javax.swing.JLabel jLabelGA2;
    private static javax.swing.JLabel jLabelGA3;
    private static javax.swing.JLabel jLabelGA4;
    private static javax.swing.JLabel jLabelGA5;
    private static javax.swing.JLabel jLabelGA6;
    private static javax.swing.JLabel jLabelGA7;
    private static javax.swing.JLabel jLabelGA8;
    private static javax.swing.JLabel jLabelGD1;
    private static javax.swing.JLabel jLabelGD2;
    private static javax.swing.JLabel jLabelGD3;
    private static javax.swing.JLabel jLabelGD4;
    private static javax.swing.JLabel jLabelGD5;
    private static javax.swing.JLabel jLabelGD6;
    private static javax.swing.JLabel jLabelGD7;
    private static javax.swing.JLabel jLabelGD8;
    private static javax.swing.JLabel jLabelGF1;
    private static javax.swing.JLabel jLabelGF2;
    private static javax.swing.JLabel jLabelGF3;
    private static javax.swing.JLabel jLabelGF4;
    private static javax.swing.JLabel jLabelGF5;
    private static javax.swing.JLabel jLabelGF6;
    private static javax.swing.JLabel jLabelGF7;
    private static javax.swing.JLabel jLabelGF8;
    private javax.swing.JLabel jLabelLosses;
    private static javax.swing.JLabel jLabelLosses1;
    private static javax.swing.JLabel jLabelLosses2;
    private static javax.swing.JLabel jLabelLosses3;
    private static javax.swing.JLabel jLabelLosses4;
    private static javax.swing.JLabel jLabelLosses5;
    private static javax.swing.JLabel jLabelLosses6;
    private static javax.swing.JLabel jLabelLosses7;
    private static javax.swing.JLabel jLabelLosses8;
    private javax.swing.JLabel jLabelPoints;
    private static javax.swing.JLabel jLabelPoints1;
    private static javax.swing.JLabel jLabelPoints2;
    private static javax.swing.JLabel jLabelPoints3;
    private static javax.swing.JLabel jLabelPoints4;
    private static javax.swing.JLabel jLabelPoints5;
    private static javax.swing.JLabel jLabelPoints6;
    private static javax.swing.JLabel jLabelPoints7;
    private static javax.swing.JLabel jLabelPoints8;
    private javax.swing.JLabel jLabelTeam;
    private javax.swing.JLabel jLabelWins;
    private static javax.swing.JLabel jLabelWins1;
    private static javax.swing.JLabel jLabelWins2;
    private static javax.swing.JLabel jLabelWins3;
    private static javax.swing.JLabel jLabelWins4;
    private static javax.swing.JLabel jLabelWins5;
    private static javax.swing.JLabel jLabelWins6;
    private static javax.swing.JLabel jLabelWins7;
    private static javax.swing.JLabel jLabelWins8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
