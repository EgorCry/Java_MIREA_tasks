package Task_10;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.text.DecimalFormat;

public class Calculator extends JFrame{
        public Calculator(){

            DecimalFormat precision = new DecimalFormat("#.####");

            setTitle("Calculator");
            setSize(480, 830);
            setResizable(false);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Close the app

            Color color = new Color(190, 50, 76);

            ImageIcon icon = new ImageIcon("src\\Task_10\\Pictures\\naruto.png");
            setIconImage(icon.getImage());//Set new icon

            JLabel background;
            ImageIcon image = new ImageIcon("src\\Task_10\\Pictures\\BorutoCalc.jpg");
            background = new JLabel("", image, JLabel.CENTER);
            background.setBounds(0,0,480,800);
            add(background);//For adding background

            JLabel result = new JLabel("Dattebayo!", JLabel.CENTER);
            result.setFont(new Font("Ninja Naruto", Font.BOLD, 35));
            result.setForeground(Color.BLACK);
            result.setBounds(77, 648, 312, 96);
            result.setBackground(color);

            JButton plus = new JButton();
            plus.setBounds(180, 112, 50, 55);
            plus.setIcon(new ImageIcon("src\\Task_10\\Pictures\\plus.png"));
            background.add(plus);

            JButton minus = new JButton();
            minus.setBounds(235, 112, 50, 55);
            minus.setIcon(new ImageIcon("src\\Task_10\\Pictures\\minus.png"));
            background.add(minus);

            JButton multi = new JButton();
            multi.setBounds(180, 172, 50, 55);
            multi.setIcon(new ImageIcon("src\\Task_10\\Pictures\\multi.png"));
            background.add(multi);

            JButton division = new JButton();
            division.setBounds(235, 172, 50, 55);
            division.setIcon(new ImageIcon("src\\Task_10\\Pictures\\division.png"));
            background.add(division);

            JButton erase1 = new JButton();
            erase1.setBounds(180, 232, 50, 55);
            erase1.setIcon(new ImageIcon("src\\Task_10\\Pictures\\erase.png"));
            background.add(erase1);

            JButton erase2 = new JButton();
            erase2.setBounds(235, 232, 50, 55);
            erase2.setIcon(new ImageIcon("src\\Task_10\\Pictures\\erase.png"));
            background.add(erase2);

            JLabel left = new JLabel();
            left.setBounds(19, 159, 145, 90);
            left.setIcon(new ImageIcon("src\\Task_10\\Pictures\\back.png"));
            JTextField leftWright = new JTextField(JTextField.CENTER);
            leftWright.setBounds(19, 159, 146, 90);
            leftWright.setBackground(color);
            leftWright.setFont(new Font("Ninja Naruto", Font.BOLD, 20));
            leftWright.setForeground(Color.BLACK);

            JLabel right = new JLabel();
            right.setBounds(300, 159, 145, 90);
            right.setIcon(new ImageIcon("src\\Task_10\\Pictures\\back.png"));
            JTextField rightWright = new JTextField(JTextField.CENTER);
            rightWright.setBounds(300, 159, 146, 90);
            rightWright.setBackground(color);
            rightWright.setFont(new Font("Ninja Naruto", Font.BOLD, 20));
            rightWright.setForeground(Color.BLACK);

            leftWright.addCaretListener(action -> {
                try{
                    int value1 = Integer.parseInt(leftWright.getText());
                    leftWright.setText(String.valueOf(value1));
                }
                catch (NumberFormatException ex){
                    System.out.println(ex);
                }
            });

            rightWright.addCaretListener(action -> {
                try{
                    int value2 = Integer.parseInt(rightWright.getText());
                    rightWright.setText(String.valueOf(value2));
                }
                catch (NumberFormatException ex){
                    System.out.println(ex);
                }
            });

            plus.addActionListener(action -> {
                try {
                    double first = Double.parseDouble(leftWright.getText());
                    double second = Double.parseDouble(rightWright.getText());
                    double c = first + second;
                    result.setFont(new Font("Ninja Naruto", Font.BOLD, 35));
                    result.setText(String.valueOf(precision.format(c)));
                }
                catch (NumberFormatException ex){
                    result.setFont(new Font("Ninja Naruto", Font.BOLD, 18));
                    result.setText("Error  in  left  or  right!");
                }
            });

            minus.addActionListener(action -> {
                try {
                    double first = Double.parseDouble(leftWright.getText());
                    double second = Double.parseDouble(rightWright.getText());
                    double c = first - second;
                    result.setFont(new Font("Ninja Naruto", Font.BOLD, 35));
                    result.setText(String.valueOf(precision.format(c)));
                }
                catch (NumberFormatException ex){
                    result.setFont(new Font("Ninja Naruto", Font.BOLD, 18));
                    result.setText("Error  in  left  or  right!");
                }
            });

            multi.addActionListener(action -> {
                try {
                    double first = Double.parseDouble(leftWright.getText());
                    double second = Double.parseDouble(rightWright.getText());
                    double c = first * second;
                    result.setFont(new Font("Ninja Naruto", Font.BOLD, 35));
                    result.setText(String.valueOf(precision.format(c)));
                }
                catch (NumberFormatException ex){
                    result.setFont(new Font("Ninja Naruto", Font.BOLD, 18));
                    result.setText("Error  in  left  or  right!");
                }
            });

            division.addActionListener(action -> {
                try {
                    double first = Double.parseDouble(leftWright.getText());
                    double second = Double.parseDouble(rightWright.getText());
                    if(second == 0){
                        result.setFont(new Font("Ninja Naruto", Font.BOLD, 18));
                        result.setText("You've written zero in the right!");
                    }
                    else {
                        result.setFont(new Font("Ninja Naruto", Font.BOLD, 35));
                        double c = first / second;
                        result.setText(String.valueOf(precision.format(c)));
                    }
                }
                catch (NumberFormatException ex){
                    result.setFont(new Font("Ninja Naruto", Font.BOLD, 18));
                    result.setText("Error  in  left  or  right!");
                }
            });

            erase1.addActionListener(action -> {
                result.setFont(new Font("Ninja Naruto", Font.BOLD, 35));
                leftWright.setText("0.0");
            });

            erase2.addActionListener(action -> {
                result.setFont(new Font("Ninja Naruto", Font.BOLD, 35));
                rightWright.setText("0.0");
            });

            background.add(left);
            background.add(leftWright);
            background.add(result);
            background.add(right);
            background.add(rightWright);
        }
}