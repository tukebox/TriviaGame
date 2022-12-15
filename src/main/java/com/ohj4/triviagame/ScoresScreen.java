package com.ohj4.triviagame;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Dimension;

import java.util.List;

public class ScoresScreen {
    
    private JPanel panel;

    //public void addComponentsToLayout(GroupLayout layout) {
        
       /* JLabel mainLabel = new JLabel("SCORES");
        mainLabel.setFont(new Font("Serif", Font.PLAIN, 80));
        JButton newGameButton = new JButton("BACK");
        newGameButton.setMinimumSize(new Dimension(225, 113));
        newGameButton.setFont(new Font("Serif", Font.PLAIN, 30));

        newGameButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                CardLayoutManager.getInstance().setScreen(e);;
            }  
        });


        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(mainLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED,
                     40, Short.MAX_VALUE)                 
                .addComponent(newGameButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED,
                    40, Short.MAX_VALUE));

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(mainLabel)
                .addComponent(newGameButton));
    } */

    private void initComponents(GroupLayout layout) {

        buttonGroupQuestions = new javax.swing.ButtonGroup();
        buttonGroupDifficulty = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LeaderboardsTable = new javax.swing.JTable();
        LastGameLabel = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        PlayerFirst = new javax.swing.JLabel();
        PlayerThird = new javax.swing.JLabel();
        PlayerFourth = new javax.swing.JLabel();
        PlayerSecond = new javax.swing.JLabel();
        PointsFirst = new javax.swing.JLabel();
        PointsThird = new javax.swing.JLabel();
        PointsSecond = new javax.swing.JLabel();
        PointsFourth = new javax.swing.JLabel();
        CathegoryLabel = new javax.swing.JLabel();
        DifficultyLabel = new javax.swing.JLabel();
        QuestionsLabel = new javax.swing.JLabel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        CategoryComboBox = new javax.swing.JComboBox<>();
        jRadioButtonMed = new javax.swing.JRadioButton();
        jRadioButtonEasy = new javax.swing.JRadioButton();
        jRadioButtonHard = new javax.swing.JRadioButton();
        OKjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Scores");

        LeaderboardsTable.setBackground(new java.awt.Color(0, 102, 102));
        LeaderboardsTable.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 102)));
        LeaderboardsTable.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        LeaderboardsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Tuukka", 2500},
                {"Juho", 2300},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Players", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LeaderboardsTable.setGridColor(new java.awt.Color(153, 255, 255));
        LeaderboardsTable.setSelectionBackground(new java.awt.Color(204, 0, 204));
        LeaderboardsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(LeaderboardsTable);
        if (LeaderboardsTable.getColumnModel().getColumnCount() > 0) {
            LeaderboardsTable.getColumnModel().getColumn(0).setResizable(false);
            LeaderboardsTable.getColumnModel().getColumn(1).setResizable(false);
        }

        LastGameLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        LastGameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LastGameLabel.setText("Last Game");

        Label1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setText("1.");

        Label2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label2.setText("2.");

        Label3.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        Label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label3.setText("3.");

        Label4.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        Label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label4.setText("4.");

        PlayerFirst.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        PlayerFirst.setForeground(new java.awt.Color(0, 0, 204));
        PlayerFirst.setText("Player 1");

        PlayerThird.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        PlayerThird.setForeground(new java.awt.Color(255, 255, 0));
        PlayerThird.setText("Player 3");

        PlayerFourth.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        PlayerFourth.setForeground(new java.awt.Color(0, 204, 0));
        PlayerFourth.setText("Player 4");

        PlayerSecond.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        PlayerSecond.setForeground(new java.awt.Color(255, 0, 0));
        PlayerSecond.setText("Player 2");

        PointsFirst.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        PointsFirst.setForeground(new java.awt.Color(0, 0, 255));
        PointsFirst.setText("1866");

        PointsThird.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        PointsThird.setForeground(new java.awt.Color(255, 255, 0));
        PointsThird.setText("1712");

        PointsSecond.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        PointsSecond.setForeground(new java.awt.Color(255, 0, 0));
        PointsSecond.setText("1816");

        PointsFourth.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        PointsFourth.setForeground(new java.awt.Color(0, 255, 0));
        PointsFourth.setText("1569");

        CathegoryLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        CathegoryLabel.setText("Category");

        DifficultyLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        DifficultyLabel.setText("Difficulty");

        QuestionsLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        QuestionsLabel.setText("Questions");

        jRadioButton20.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jRadioButton20.setText("20");
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });

        jRadioButton30.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jRadioButton30.setText("30");
        jRadioButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton30ActionPerformed(evt);
            }
        });

        jRadioButton10.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jRadioButton10.setText("10");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        buttonGroupQuestions.add(jRadioButton10);
        buttonGroupQuestions.add(jRadioButton20);
        buttonGroupQuestions.add(jRadioButton30);


        CategoryComboBox.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        CategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jRadioButtonMed.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jRadioButtonMed.setText("Med");
        jRadioButtonMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMedActionPerformed(evt);
            }
        });

        jRadioButtonEasy.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jRadioButtonEasy.setText("Easy");

        jRadioButtonHard.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jRadioButtonHard.setText("Hard");


        buttonGroupDifficulty.add(jRadioButtonEasy);
        buttonGroupDifficulty.add(jRadioButtonMed);
        buttonGroupDifficulty.add(jRadioButtonHard);

        OKjButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        OKjButton1.setText("OK");
        OKjButton1.setActionCommand("STARTSCREEN");
        OKjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKjButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Leaderboards");

        //javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        //getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(PlayerFourth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(PlayerThird, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(PlayerSecond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(PlayerFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QuestionsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CathegoryLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DifficultyLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PointsSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PointsFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PointsThird, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PointsFourth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(LastGameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonEasy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonMed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonHard)
                                .addGap(2, 2, 2)))
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
            .addGroup(layout.createSequentialGroup()
                .addGap(487, 487, 487)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGap(532, 532, 532)
                .addComponent(OKjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(LastGameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayerFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PointsFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayerSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PointsSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayerThird, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PointsThird, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayerFourth, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PointsFourth, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuestionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CathegoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DifficultyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonMed, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonHard, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(OKjButton1)
                .addGap(52, 52, 52))
        );

        panel.addComponentListener( new ComponentAdapter() {
            @Override
            public void componentShown( ComponentEvent e ) {
                updateComponents();
            }
        });

        //pack();
    }// </editor-fold>                        

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jRadioButton30ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jRadioButtonMedActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void OKjButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        CardLayoutManager.getInstance().setScreen(evt);

    }                                          

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScoresScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoresScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoresScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoresScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
       // java.awt.EventQueue.invokeLater(new Runnable() {
           // public void run() {
           //     new ScoresScreen().setVisible(true);
           // }
       // });
    //}

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> CategoryComboBox;
    private javax.swing.JLabel CathegoryLabel;
    private javax.swing.JLabel DifficultyLabel;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel LastGameLabel;
    private javax.swing.JTable LeaderboardsTable;
    private javax.swing.JButton OKjButton1;
    private javax.swing.JLabel PlayerFirst;
    private javax.swing.JLabel PlayerFourth;
    private javax.swing.JLabel PlayerSecond;
    private javax.swing.JLabel PlayerThird;
    private javax.swing.JLabel PointsFirst;
    private javax.swing.JLabel PointsFourth;
    private javax.swing.JLabel PointsSecond;
    private javax.swing.JLabel PointsThird;
    private javax.swing.JLabel QuestionsLabel;
    private javax.swing.ButtonGroup buttonGroupDifficulty;
    private javax.swing.ButtonGroup buttonGroupQuestions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButtonEasy;
    private javax.swing.JRadioButton jRadioButtonHard;
    private javax.swing.JRadioButton jRadioButtonMed;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   


    private void updateComponents() {
        if (GameState.getInstance().getGameConcluded()) {

            //QuestionsLabel.setText(String.valueOf(game.getGameLength()));
    
            List<Player> players = GameState.getInstance().getPlayerNamesAndScores();

            PlayerFirst.setText(players.get(0).getName());
            PlayerFirst.setForeground(players.get(0).getGameColor());
            PointsFirst.setText(String.valueOf(players.get(0).getScore()));
            PointsFirst.setForeground(players.get(0).getGameColor());

            PlayerSecond.setText(players.get(1).getName());
            PlayerSecond.setForeground(players.get(1).getGameColor());
            PointsSecond.setText(String.valueOf(players.get(1).getScore()));
            PointsSecond.setForeground(players.get(1).getGameColor());

            PlayerThird.setText(players.get(2).getName());
            PlayerThird.setForeground(players.get(2).getGameColor());
            PointsThird.setText(String.valueOf(players.get(2).getScore()));
            PointsThird.setForeground(players.get(2).getGameColor());
            
            PlayerFourth.setText(players.get(3).getName());
            PlayerFourth.setForeground(players.get(3).getGameColor());
            PointsFourth.setText(String.valueOf(players.get(3).getScore()));
            PointsFourth.setForeground(players.get(3).getGameColor());

        }
    }

    
    public JPanel getPanel() {
        return panel;
    }

    private void createPanelAndLayout() {

        panel = new JPanel();

        GroupLayout layout = new GroupLayout(panel);
        //layout.setAutoCreateGaps(true);
        //layout.setAutoCreateContainerGaps(true);
        panel.setLayout(layout);

        initComponents(layout);
    }

    public ScoresScreen() {
        createPanelAndLayout();
    }
}
