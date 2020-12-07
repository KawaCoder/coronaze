package sample;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Fenetre extends WindowAdapter implements Runnable {
    private JFrame  frame;
    private JLabel  label;
    private JSplitPane  splitPane;
    private JSplitPane  topPane;

    @Override // java.lang.Runnable
    public void run() {
        showGui();
    }

    @Override // java.awt.event.WindowAdapter
    public void windowOpened(WindowEvent event) {
        int height = event.getWindow().getHeight();
        splitPane.setDividerLocation(0.7);
        double high = height * 0.7;
        height = (int) Math.rint(high);
        high = height * 0.8;
        height = (int) Math.rint(high);
        label.setPreferredSize(new Dimension(event.getWindow().getWidth(), height));
    }

    private JTextArea createBottomPane() {
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setColumns(20);
        textArea.setFont(new Font("Terminal", Font.BOLD, 30));
        textArea.setForeground(Color.RED);
        textArea.setBackground(Color.black);
        textArea.setText(">");

/*
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException a) {
            a.printStackTrace();
        }


        Robot finalRobot = robot;

        textArea.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent e) {



                finalRobot.keyPress(KeyEvent.VK_LEFT);

                textArea.setText(textArea.getText().replace("&", ""));
               // textArea.setText(textArea.getText() + "_");
                if(! textArea.getText().startsWith(">")){
                    textArea.setText(">");
                }
                textArea.getText();
                e.getKeyChar();
                if (e.getKeyCode() == 10){
                    System.out.println(textArea.getText());
                    finalRobot.keyPress(KeyEvent.VK_BACK_SPACE);
                    textArea.setText(">");

                }


            }

        });
 */
        return textArea;
    }

    private JSplitPane createSplitPane() {
        splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, createTopPane(), createBottomPane());
        splitPane.setDividerLocation(0.4);
        return splitPane;
    }

    private JSplitPane createTopPane() {
        label = new JLabel(">texte de l'histoire ici<");
        label.setOpaque(true);
        label.setForeground(Color.green);
        label.setBackground(Color.BLACK);
        topPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                label,
                new JPanel());
        topPane.setDividerLocation(0.9);
        return topPane;
    }

    public void showGui() {
        frame = new JFrame("Window Capture");
        frame.addWindowListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.add(createSplitPane());
        frame.setVisible(true);
    }

    /**
     * Start here!
     */
    public static void main(String[] args, AbstractButton textArea) {
        EventQueue.invokeLater(new Fenetre());
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException a) {
            a.printStackTrace();
        }


        Robot finalRobot = robot;

        textArea.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent e) {



                finalRobot.keyPress(KeyEvent.VK_LEFT);

                textArea.setText(textArea.getText().replace("&", ""));
                // textArea.setText(textArea.getText() + "_");
                if(! textArea.getText().startsWith(">")){
                    textArea.setText(">");
                }
                textArea.getText();
                e.getKeyChar();
                if (e.getKeyCode() == 10){
                    System.out.println(textArea.getText());
                    finalRobot.keyPress(KeyEvent.VK_BACK_SPACE);
                    textArea.setText(">");

                }


            }

        });
    }
}