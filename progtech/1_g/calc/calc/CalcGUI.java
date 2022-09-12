/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author bli
 */
public class CalcGUI {

    private JFrame frame;
    private JPanel numPanel;
    private JPanel buttonPanel;
    private JTextField operand1;
    private JTextField operand2;
    private JTextField result;

    public CalcGUI(int fieldWidth) {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        numPanel = new JPanel();
        numPanel.setLayout(new BoxLayout(numPanel, BoxLayout.Y_AXIS));
        operand1 = new JTextField(fieldWidth);
        numPanel.add(operand1);
        operand2 = new JTextField(fieldWidth);
        numPanel.add(operand2);
        result = new JTextField(fieldWidth);
        numPanel.add(result);
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 1));
        JButton addButton = new JButton("+");
        addButton.addActionListener(new CalcActionListener("add"));
        buttonPanel.add(addButton);
        JButton subButton = new JButton("-");
        subButton.addActionListener(new CalcActionListener("sub"));
        buttonPanel.add(subButton);
        JButton mulButton = new JButton("*");
        mulButton.addActionListener(new CalcActionListener("mul"));
        buttonPanel.add(mulButton);
        JButton divButton = new JButton("/");
        divButton.addActionListener(new CalcActionListener("div"));
        buttonPanel.add(divButton);
        JButton powButton = new JButton("^");
        powButton.addActionListener(new CalcActionListener("pow"));
        buttonPanel.add(powButton);
        
        frame.getContentPane().add(BorderLayout.WEST, numPanel);
        frame.getContentPane().add(BorderLayout.EAST, buttonPanel);
        
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        JMenu calcMenu = new JMenu("Calc");
        menuBar.add(calcMenu);
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        calcMenu.add(exitMenuItem);
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        frame.pack();
        frame.setVisible(true);
    }

    class CalcActionListener implements ActionListener {

        private final String operation;

        public CalcActionListener(String operation) {
            this.operation = operation;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                double op1 = Double.valueOf(operand1.getText());
                double op2 = Double.valueOf(operand2.getText());
                double res = 0;
                switch (operation) {
                    case "add":
                        res = op1 + op2;
                        break;
                    case "sub":
                        res = op1 - op2;
                        break;
                    case "mul":
                        res = op1 * op2;
                        break;
                    case "div":
                        res = op1 / op2;
                        break;
                    case "pow":
                        res = Math.pow(op1, op2);
                        break;
                }
                result.setText(String.valueOf(res));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Rossz formatumu szamok!", "Hiba", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}