package sample;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

//import static jdk.nashorn.internal.objects.NativeString.substring;

class Fenetresaisie {
    Fenetresaisie(){
    }

    public static class Fenetre2prime {
        public final static int HT = 1024;
        public final static int LG = 758;

        public static void main(String[] args) {
            JPanel panel = new JPanel();
            JFrame F = new JFrame("CORONAZE");
            F.setExtendedState(JFrame.MAXIMIZED_BOTH);
            F.setSize(HT, LG);
            F.setVisible(true);

            F.addWindowListener(new GestionFenetre());

           /*
            GridLayout layout = new GridLayout(1,3);
            layout.setHgap(25);
            panel.setLayout(layout);
*/

            ImageIcon icone = new ImageIcon("images.jpg");

            JLabel image = new JLabel(icone);

            JTextArea textArea = new JTextArea();
            textArea.setLineWrap(true);
            textArea.setColumns(20);
            textArea.setFont(new Font("Terminal", Font.BOLD, 30));
            textArea.setForeground(Color.RED);
            textArea.setBackground(Color.black);
            textArea.setText(">_");


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

                    textArea.setText(textArea.getText().replace("_", ""));
                    textArea.setText(textArea.getText() + "_");
                    if(! textArea.getText().startsWith(">")){
                        textArea.setText(">");
                    }
                    textArea.getText();
                    e.getKeyChar();
                    if (e.getKeyCode() == 10){
                        System.out.println(textArea.getText());
                        textArea.setText(">_");
                    }


                }

            });



            JLabel label = new JLabel(">texte de l'histoire ici<");
            label.setFont(new Font("Terminal", Font.BOLD, 30));
            label.setOpaque(true);
            label.setForeground(Color.green);
            label.setBackground(Color.BLACK);


            JSplitPane topJSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, label, image);
            //  topJSplitPane.setDividerLocation(400);



            //  JSplitPane bottomJSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, image, textArea);

            F.add(textArea, BorderLayout.EAST);
            F.add(image, BorderLayout.SOUTH);
            F.add(label, BorderLayout.WEST);
            // F.add(topJSplitPane);
            // F.add(bottomJSplitPane, BorderLayout.SOUTH);
            panel.setVisible(true);
            F.setVisible(true);

            try{
                Thread.sleep(3000);

            }catch(InterruptedException e){

            }


        }

    }

    static class GestionFenetre extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}