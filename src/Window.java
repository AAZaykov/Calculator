import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener, WindowListener {
    private JTextField display = new JTextField();
    private String text = "";
    private JButton b0;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton bResult;
    private JButton bClear;
    private JButton bDot;
    private JButton bPlus;
    private JButton bMinus;
    private JButton bMulti;
    private JButton bDiv;
    private JButton bDelete;
    private JButton bPerc;
    private char znak;
    private double first;
    private double second;

    public Window(String name) {
        setTitle(name);
        setLayout(null);
        setSize(320, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        display.setBounds(20, 20, 270, 60);
        display.setEditable(false);
        display.setFont(new Font("Impact", Font.BOLD, 40));
        add(display);

        Font font = new Font("Impact", Font.BOLD, 30);

        class Button extends JButton{
            Button(String name, int x, int y) {
                setText(name);
                setBounds(x, y, 60, 60);
                setFont(new Font("Impact", Font.BOLD, 30));
                setVisible(true);
            }

            Button(String name, int x, int y, int width, int height) {
                setText(name);
                setBounds(x, y, width, height);
                setFont(new Font("Impact", Font.BOLD, 30));
                setVisible(true);
            }
        }

        b0 = new Button("0", 90, 380);
        b0.addActionListener(this);
        add(b0);

        b1 = new Button("1", 20, 310);
        b1.addActionListener(this);
        add(b1);

        b2 = new Button("2", 90, 310);
        b2.addActionListener(this);
        add(b2);

        b3 = new Button("3", 160, 310);
        b3.addActionListener(this);
        add(b3);

        b4 = new Button("4", 20, 240);
        b4.addActionListener(this);
        add(b4);

        b5 = new Button("5", 90, 240);
        b5.addActionListener(this);
        add(b5);

        b6 = new Button("6", 160, 240);
        b6.addActionListener(this);
        add(b6);

        b7 = new Button("7", 20, 170);
        b7.addActionListener(this);
        add(b7);

        b8 = new Button("8", 90, 170);
        b8.addActionListener(this);
        add(b8);

        b9 = new Button("9", 160, 170);
        b9.addActionListener(this);
        add(b9);

        bDot = new Button(",", 160, 380);
        bDot.addActionListener(this);
        add(bDot);

        bResult = new Button("=", 230, 310, 60, 130);
        bResult.addActionListener(this);
        bResult.setBackground(Color.GREEN);
        add(bResult);

        bClear = new Button("C", 20, 100);
        bClear.addActionListener(this);
        add(bClear);

        bDiv = new Button("÷", 90, 100);
        bDiv.addActionListener(this);
        bDiv.setFont(new Font("Impact", Font.BOLD, 40));
        add(bDiv);

        bMulti = new Button("×", 160, 100);
        bMulti.addActionListener(this);
        bMulti.setFont(new Font("Impact", Font.BOLD, 40));
        add(bMulti);

        bPlus = new Button("+", 230, 240);
        bPlus.addActionListener(this);
        bPlus.setFont(new Font("Impact", Font.BOLD, 40));
        add(bPlus);

        bMinus = new Button("-", 230, 170);
        bMinus.addActionListener(this);
        bMinus.setFont(new Font("Impact", Font.BOLD, 40));
        add(bMinus);

        bDelete = new Button("←", 230, 100);
        bDelete.addActionListener(this);
        bDelete.setFont(new Font("Impact", Font.BOLD, 25));
        add(bDelete);

        bPerc = new Button("%", 20, 380);
        bPerc.addActionListener(this);
        add(bPerc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            if (text.equals("0"))
            text = "";
            text = text + b0.getText();
            display.setText(text);
        }
        if (e.getSource() == b1) {
            if (text.equals("0"))
            text = "";
            text = text + b1.getText();
            display.setText(text);
        }
        if (e.getSource() == b2) {
            if (text.equals("0"))
            text = "";
            text = text + b2.getText();
            display.setText(text);
        }
        if (e.getSource() == b3) {
            if (text.equals("0"))
            text = "";
            text = text + b3.getText();
            display.setText(text);
        }
        if (e.getSource() == b4) {
            if (text.equals("0"))
            text = "";
            text = text + b4.getText();
            display.setText(text);
        }
        if (e.getSource() == b5) {
            if (text.equals("0"))
            text = "";
            text = text + b5.getText();
            display.setText(text);
        }
        if (e.getSource() == b6) {
            if (text.equals("0"))
            text = "";
            text = text + b6.getText();
            display.setText(text);
        }
        if (e.getSource() == b7) {
            if (text.equals("0"))
            text = "";
            text = text + b7.getText();
            display.setText(text);
        }
        if (e.getSource() == b8) {
            if (text.equals("0"))
            text = "";
            text = text + b8.getText();
            display.setText(text);
        }
        if (e.getSource() == b9) {
            if (text.equals("0"))
            text = "";
            text = text + b9.getText();
            display.setText(text);
        }
        if (e.getSource() == bClear) {
            text = "0";
            display.setText(text);
        }
        if (e.getSource() == bDelete) {
            StringBuilder sb = new StringBuilder(text);
            text = sb.deleteCharAt(sb.length() - 1).toString();
            display.setText(text);
        }
        if (e.getSource() == bDot) {
            text = text + ".";
            display.setText(text);
        }
        if (e.getSource() == bPlus){
            display.setText(text);
            first = Double.parseDouble(text);
            text = "";
            znak = '+';
        }
        if (e.getSource() == bMinus) {
            display.setText(text);
            first = Double.parseDouble(text);
            text = "";
            znak = '-';
        }
        if (e.getSource() == bMulti) {
            display.setText(text);
            first = Double.parseDouble(text);
            text = "";
            znak = '*';
        }
        if (e.getSource() == bDiv) {
            display.setText(text);
            first = Double.parseDouble(text);
            text = "";
            znak = '/';
        }
        if (e.getSource() == bResult){
            if(znak == '+'){
                second = Double.parseDouble(text);
                text = String.valueOf((first + second));
                if(text.endsWith(".0")) text = text.replaceAll("\\.0", "");
                display.setText(text);
            }
            if(znak == '-'){
                second = Double.parseDouble(text);
                text = String.valueOf((first - second));
                if(text.endsWith(".0")) text = text.replaceAll("\\.0", "");
                display.setText(text);
            }
            if(znak == '/'){
                second = Double.parseDouble(text);
                text = (first / second) + "";
                if(text.endsWith(".0")) text = text.replaceAll("\\.0", "");
                display.setText(text);
            }
            if(znak == '*'){
                second = Double.parseDouble(text);
                text = String.valueOf((first * second));
                if(text.endsWith(".0")) text = text.replaceAll("\\.0", "");
                display.setText(text);
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}