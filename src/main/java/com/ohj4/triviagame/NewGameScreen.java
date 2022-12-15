package com.ohj4.triviagame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class NewGameScreen implements ActionListener{

    private JPanel panel;

    public NewGameScreen(){
        setComponents();
    }

    private JLabel newGameLabel;
    private JLabel playersLabel;
    private JRadioButton players1;
    private JRadioButton players2;
    private JRadioButton players3;
    private JRadioButton players4;
    private ButtonGroup players;
    private JLabel questionsLabel;
    private JSlider questionSlider;
    private JLabel difficultyLabel;
    private JRadioButton easy;
    private JRadioButton medium;
    private JRadioButton hard;
    private ButtonGroup difficulty;
    private JLabel timeLabel;
    private JSlider timeSlider;
    private JLabel categoryLabel;
    private JComboBox categoryBox;
    private JButton startButton;
    private JButton backButton;
    private JTextField player1Text;
    private JTextField player2Text;
    private JTextField player3Text;
    private JTextField player4Text;

    private JRadioButton button;


    public JPanel getPanel() {
        return panel;
    }


    public void setComponents(){

        /*this.setSize(1200, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.CYAN);
        this.setLayout(null);
        this.setResizable(false);
        */
        
        panel = new JPanel();
        panel.setLayout(null);
        //panel.setBackground(Color.CYAN);

        newGameLabel = new JLabel("NEW GAME");
        newGameLabel.setBounds(520, 10, 200, 40);
        newGameLabel.setFont(new Font("DejaVu Sans", Font.BOLD, 25));
        panel.add(newGameLabel);

        
        //Players label and radiobuttons
        playersLabel = new JLabel("PLAYERS");
        playersLabel.setBounds(100, 80, 200, 40);
        playersLabel.setFont(new Font("DejaVu Sans", Font.PLAIN, 20));
        panel.add(playersLabel);

        players1 = new JRadioButton("1");
        players1.setBounds(800, 80, 40, 40);
        players1.setFont(new Font("DejaVu Sans", Font.PLAIN, 20));
        //players1.setBackground(Color.CYAN);
        panel.add(players1);
        
        players2 = new JRadioButton("2");
        players2.setBounds(840, 80, 40, 40);
        players2.setFont(new Font("DejaVu Sans", Font.PLAIN, 20));
        //players2.setBackground(Color.CYAN);
        panel.add(players2);
        players3 = new JRadioButton("3");
        players3.setBounds(880, 80, 40, 40);
        players3.setFont(new Font("DejaVu Sans", Font.PLAIN, 20));
        //players3.setBackground(Color.CYAN);
        panel.add(players3);
        players4 = new JRadioButton("4");
        players4.setBounds(920, 80, 40, 40);
        players4.setFont(new Font("DejaVu Sans", Font.PLAIN, 20));
        //players4.setBackground(Color.CYAN);
        panel.add(players4);

        players = new ButtonGroup();
        players.add(players1);
        players.add(players2);
        players.add(players3);
        players.add(players4);

        player1Text = new JTextField(20);
        player1Text.setBounds(820, 140, 180, 25);
        player1Text.setDocument(new JTextFieldLimit(10));
        player2Text = new JTextField(20);
        player2Text.setBounds(820, 170, 180, 25);
        player2Text.setDocument(new JTextFieldLimit(10));
        player3Text = new JTextField(20);
        player3Text.setBounds(820, 200, 180, 25);
        player3Text.setDocument(new JTextFieldLimit(10));
        player4Text = new JTextField(20);
        player4Text.setBounds(820, 230, 180, 25);
        player4Text.setDocument(new JTextFieldLimit(10));
        panel.add(player1Text);
        panel.add(player2Text);
        panel.add(player3Text);
        panel.add(player4Text);
        player1Text.setVisible(false);
        player2Text.setVisible(false);
        player3Text.setVisible(false);
        player4Text.setVisible(false);
                

        players1.addActionListener(this);
        players2.addActionListener(this);
        players3.addActionListener(this);
        players4.addActionListener(this);




        //Questions label and slider
        questionsLabel = new JLabel("QUESTIONS");
        questionsLabel.setBounds(100, 280, 200, 40);
        questionsLabel.setFont(new Font("DejaVu Sans", Font.PLAIN, 20));
        panel.add(questionsLabel);

        questionSlider = new JSlider(10,30,20);
        questionSlider.setBounds(800, 280, 200, 40);
        questionSlider.setPaintTicks(true);
        questionSlider.setMajorTickSpacing(10);
        questionSlider.setPaintLabels(true);
        questionSlider.setFont(new Font("DejaVu Sans", Font.PLAIN, 15));
        //questionSlider.setBackground(Color.CYAN);
        questionSlider.setSnapToTicks(true);
        panel.add(questionSlider);
        



        //Difficulty label and radiobuttons
        difficultyLabel = new JLabel("DIFFICULTY");
        difficultyLabel.setBounds(100, 360, 200, 40);
        difficultyLabel.setFont(new Font("DejaVu Sans", Font.PLAIN, 20));
        panel.add(difficultyLabel);

        easy = new JRadioButton("EASY");
        easy.setBounds(800, 360, 80, 40);
        easy.setFont(new Font("DejaVu Sans", Font.PLAIN, 20));
        easy.setActionCommand("easy");
        //easy.setBackground(Color.CYAN);
        panel.add(easy);
        medium = new JRadioButton("MED");
        medium.setBounds(880, 360, 80, 40);
        medium.setFont(new Font("DejaVu Sans", Font.PLAIN, 20));
        medium.setActionCommand("medium");
        //medium.setBackground(Color.CYAN);
        panel.add(medium);
        hard = new JRadioButton("HARD");
        hard.setBounds(960, 360, 100, 40);
        hard.setFont(new Font("DejaVu Sans", Font.PLAIN, 20));
        hard.setActionCommand("hard");
        //hard.setBackground(Color.CYAN);
        panel.add(hard);

        difficulty = new ButtonGroup();
        difficulty.add(easy);
        difficulty.add(medium);
        difficulty.add(hard);

        medium.setSelected(true);

        //Time label and slider
        timeLabel = new JLabel("TIME");
        timeLabel.setBounds(100, 440, 200, 40);
        timeLabel.setFont(new Font("DejaVu Sans", Font.PLAIN, 20));
        panel.add(timeLabel);

        timeSlider = new JSlider(10,60,30);
        timeSlider.setBounds(800, 440, 200, 40);
        timeSlider.setPaintTicks(true);
        timeSlider.setMajorTickSpacing(10);
        timeSlider.setPaintLabels(true);
        timeSlider.setFont(new Font("DejaVu Sans", Font.PLAIN, 15));
        //timeSlider.setBackground(Color.CYAN);
        timeSlider.setSnapToTicks(true);
        timeSlider.setPaintTrack(true);
        panel.add(timeSlider);


        //Category label and ComboBox
        categoryLabel = new JLabel("CATEGORY");
        categoryLabel.setBounds(100, 520, 200, 40);
        categoryLabel.setFont(new Font("DejaVu Sans", Font.PLAIN, 20));
        panel.add(categoryLabel);

        Set<String> categorySet = GameState.getInstance().getCategories();

        String[] category = new String[categorySet.size()];
        categorySet.toArray(category);

        categoryBox = new JComboBox(category);
        categoryBox.setBounds(800, 520, 200, 30);
        categoryBox.setFont(new Font("DejaVu Sans", Font.PLAIN, 15));
        //categoryBox.setBackground(Color.CYAN);
        panel.add(categoryBox);


        startButton = new JButton("START");
        startButton.setBounds(500, 600, 200, 40);
        startButton.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
        startButton.setFocusable(false);
        startButton.setActionCommand("GAMESCREEN");
        panel.add(startButton);



        startButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                if (((player1Text.isVisible() && player1Text.getText().isEmpty()) || ((player2Text.isVisible() && player2Text.getText().isEmpty())
                || ((player3Text.isVisible() && player3Text.getText().isEmpty()) || ((player4Text.isVisible() && player4Text.getText().isEmpty())))))){

                    JOptionPane.showMessageDialog(null, "Write name for every player");
                }
                else if (!player1Text.isVisible()){
                    JOptionPane.showMessageDialog(null, "Choose how many players");
                }
                else{
                    List<String> players = new ArrayList<String>();
                    players.add(player1Text.getText());
                    if (!player2Text.getText().isEmpty()) {
                        players.add(player2Text.getText());
                    }
                    if (!player3Text.getText().isEmpty()) {
                        players.add(player3Text.getText());
                    }
                    if (!player4Text.getText().isEmpty()) {
                        players.add(player4Text.getText());
                    }
                    GameState game = GameState.getInstance();
                    if (game.initializeGame(questionSlider.getValue(), players, categoryBox.getSelectedItem(), difficulty.getSelection().getActionCommand())) {
                        CardLayoutManager.getInstance().setScreen(e);
                    }
                    else {
                        JOptionPane.showMessageDialog(panel.getParent(), "Unable to load questions from OpenTrivia DB, check internet connection", "Question API error", JOptionPane.WARNING_MESSAGE);
                        // show error here in fetching questions
                    }
                }  
            }  
        });

        backButton = new JButton("BACK");
        backButton.setBounds(1000, 605, 100, 30);
        backButton.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
        backButton.setFocusable(false);
        backButton.setActionCommand("STARTSCREEN");
        
        panel.add(backButton);

        backButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                CardLayoutManager.getInstance().setScreen(e);;
            }  
        }); 


        panel.setVisible(true);

    }

    

    @Override
    public void actionPerformed(ActionEvent e) {

        button = (JRadioButton) e.getSource();

        if (button == players2){
            player1Text.setVisible(true);
            player2Text.setVisible(true);
            player3Text.setVisible(false);
            player4Text.setVisible(false);
            player3Text.setText(null);
            player4Text.setText(null);
        }
        else if (button == players1){
            player1Text.setVisible(true);
            player2Text.setVisible(false);
            player3Text.setVisible(false);
            player4Text.setVisible(false);
            player2Text.setText(null);
            player3Text.setText(null);
            player4Text.setText(null);
        }
        else if (button == players3){
            player1Text.setVisible(true);
            player2Text.setVisible(true);
            player3Text.setVisible(true);
            player4Text.setVisible(false);
            player4Text.setText(null);
        }
        else if (button == players4){
            player1Text.setVisible(true);
            player2Text.setVisible(true);
            player3Text.setVisible(true);
            player4Text.setVisible(true);
        }

        
    }

    public class JTextFieldLimit extends PlainDocument {
        private int limit;
      
        JTextFieldLimit(int limit) {
         super();
         this.limit = limit;
         }
      
        public void insertString( int offset, String  str, AttributeSet attr ) throws BadLocationException {
          if (str == null) return;
      
          if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
          }
        }
      }

    
}
