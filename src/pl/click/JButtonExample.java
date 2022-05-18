package pl.click;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonExample implements ActionListener
{
    private static JButton btn;

    public static void logo()
    {
        //create a frame
        JFrame frame = new JFrame("JButton Example");
        //create button
        btn = new JButton("Click here");
        //set button position
        btn.setBounds(70,80,100,30);
        JButtonExample instance = new JButtonExample();
        btn.addActionListener(instance);
        //add button to frame
        frame.add(btn);
        frame.setSize(250,250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        //change button background color
//        btn.setBackground(Color.RED);
//        //change button text color
//        btn.setForeground(Color.WHITE);

        for(int i=1;i<=9;i++) {
            btn.setBackground(Color.RED);
            //change button text color
            btn.setForeground(Color.WHITE);
            }}
        }

