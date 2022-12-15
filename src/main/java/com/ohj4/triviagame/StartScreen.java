package com.ohj4.triviagame;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Dimension;

public class StartScreen {

    private JPanel panel;

    public void addComponentsToLayout(GroupLayout layout) {

        JLabel mainLabel = new JLabel("TRIVIA");
        JLabel preMainLabel = new JLabel("SUPER");
        JLabel postMainLabel = new JLabel("GAME");
        mainLabel.setFont(new Font("DejaVu Sans", Font.PLAIN, 80));
        preMainLabel.setFont(new Font("DejaVu Sans", Font.PLAIN, 50));
        postMainLabel.setFont(new Font("DejaVu Sans", Font.PLAIN, 50));
        JButton newGameButton = new JButton("NEW GAME");
        newGameButton.setMinimumSize(new Dimension(225, 113));
        newGameButton.setFont(new Font("DejaVu Sans", Font.PLAIN, 30));
        newGameButton.setActionCommand("NEWGAMESCREEN");
        JButton scoresButton = new JButton("SCORES");
        scoresButton.setMinimumSize(new Dimension(150, 75));
        scoresButton.setFont(new Font("DejaVu Sans", Font.PLAIN, 30));
        JButton quitButton = new JButton("QUIT");
        quitButton.setMinimumSize(new Dimension(150, 75));
        quitButton.setFont(new Font("DejaVu Sans", Font.PLAIN, 30));

        quitButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                System.exit(0);
            }  
        });

        newGameButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                CardLayoutManager.getInstance().setScreen(e);;
            }  
        });

        scoresButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                CardLayoutManager.getInstance().setScreen(e);;
            }  
        });

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 130, 130)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(preMainLabel)
                    .addComponent(mainLabel)
                    .addComponent(postMainLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED,
                     40, 40)                 
                .addComponent(newGameButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED,
                    40, 40)    
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(scoresButton)
                .addComponent(quitButton)));

        layout.setHorizontalGroup(
            layout.createParallelGroup()
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(preMainLabel)
                .addGap(25, 25, 25)
                .addComponent(mainLabel)
                .addGap(25, 25, 25)
                .addComponent(postMainLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(newGameButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(scoresButton)
                .addGap(75, 75, 75)
                .addComponent(quitButton))
        );
    }

    
    public JPanel getPanel() {
        return panel;
    }

    private void createPanelAndLayout() {

        panel = new JPanel();

        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        addComponentsToLayout(layout);

    }
    
    public StartScreen() {

        createPanelAndLayout();

    }

}