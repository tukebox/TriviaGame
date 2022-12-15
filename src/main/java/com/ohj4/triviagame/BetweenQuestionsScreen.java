package com.ohj4.triviagame;

import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;

//import java.util.Timer;

public class BetweenQuestionsScreen {

    private JPanel panel;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(GroupLayout layout) {

        PlayerAnswer = new javax.swing.JLabel();
        AnswerLabel = new javax.swing.JLabel();
        LabelP = new javax.swing.JLabel();
        PlayerNameIn = new javax.swing.JLabel();
        TImer = new javax.swing.JLabel();
        Answer = new javax.swing.JLabel();
        PointsLabel = new javax.swing.JLabel();
        CorrectIcon = new javax.swing.JLabel();
        WrongIcon = new javax.swing.JLabel();
        

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        JLabel background;
        panel.setBackground(new java.awt.Color(17, 104, 165));
        ImageIcon image = new ImageIcon("/com/ohj4/triviagame/icons/Background1.png");
        background = new JLabel("",image,JLabel.CENTER);
        panel.add(background);
        

        PlayerAnswer.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        PlayerAnswer.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        //PlayerAnswer.setText("Player 2");

        AnswerLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        AnswerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        //AnswerLabel.setText("JavaScript");

        LabelP.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        LabelP.setText("Points");

        PlayerNameIn.setFont(new java.awt.Font("DejaVu Sans", 3, 24)); // NOI18N
        PlayerNameIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerNameIn.setText("Next player in:");

        TImer.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        TImer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TImer.setText("5");

        Answer.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        Answer.setText("Answer:");

        PointsLabel.setFont(new java.awt.Font("DejaVu Sans", 3, 48)); // NOI18N
        PointsLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        //PointsLabel.setText("76");

        CorrectIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ohj4/triviagame/icons/Correct.png"))); // NOI18N
        WrongIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ohj4/triviagame/icons/Wrong.png")));



        //javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        //getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(PlayerAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(AnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(PlayerNameIn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TImer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CorrectIcon)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PointsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelP, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(471, 471, 471))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PlayerAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CorrectIcon))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelP, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PointsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayerNameIn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TImer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
        );
        
        panel.addComponentListener( new ComponentAdapter() {
            @Override
            public void componentShown( ComponentEvent e ) {
                updateComponents();
            }
        });

        //pack();
    }// </editor-fold>                        

    
     // @param args the command line arguments
     


    // Variables declaration - do not modify                     
    private javax.swing.JLabel Answer;
    private javax.swing.JLabel AnswerLabel;
    private javax.swing.JLabel CorrectIcon;
    private javax.swing.JLabel LabelP;
    private javax.swing.JLabel PlayerAnswer;
    private javax.swing.JLabel PlayerNameIn;
    private javax.swing.JLabel PointsLabel;
    private javax.swing.JLabel TImer;
    private javax.swing.JLabel WrongIcon;
    // End of variables declaration  
    
    private void updateComponents() {

            Player player = GameState.getInstance().getCurrentPlayer();
            panel.setBackground(player.getGameColor());
            PlayerAnswer.setText(player.getName());
            AnswerLabel.setText(player.getLastAnswerString());
            PointsLabel.setText(String.valueOf(player.getLastAnswerScore()));
            TImer.setText("5");
            if (player.getLastAnswerScore() > 0) {
                CorrectIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ohj4/triviagame/icons/Correct.png"))); // NOI18N
            }
            else {
                CorrectIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ohj4/triviagame/icons/Wrong.png")));
            }

            ActionListener turnTimer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    Integer timeRemaining = Integer.parseInt(TImer.getText());
                    if (timeRemaining > 0) {
                        TImer.setText(String.valueOf(--timeRemaining));
                    }
                }
            };
            
            final Timer scoreScreenTimer = new Timer(1000, turnTimer);
            scoreScreenTimer.start();

            // This is really ugly, but couldn't figure out how to terminate the GUI updating timer without reworking the 
            // class structure heavily or using wait/sleep which isn't good either. 

            ActionListener turnEnder = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    
                    
                    scoreScreenTimer.stop();

                    if (GameState.getInstance().endTurn()) {
                        CardLayoutManager.getInstance().setScreen("GAMESCREEN");
                    }
                    else {
                        CardLayoutManager.getInstance().setScreen("SCORES");
                    }
                }
            };
            
            Timer turnEnderTimer = new Timer(5000, turnEnder);
            turnEnderTimer.setRepeats(false);
            turnEnderTimer.start();
    }

    private void createPanelAndLayout() {

        panel = new JPanel();

        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        initComponents(layout);
    }

    public JPanel getPanel() {
        return panel;
    }

    public BetweenQuestionsScreen() {
        createPanelAndLayout();
    }
}





