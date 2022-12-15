package com.ohj4.triviagame;

import javax.swing.*;

public class TriviaGame 
{
    public static void main( String[] args )
    {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        // TODO database initialization and game data persistance

        CardLayoutManager cardManager = CardLayoutManager.getInstance();

    }
}
