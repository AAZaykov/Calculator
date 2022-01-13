import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener{
    private final JTextField display = new JTextField("0");
    private String text = "";
    private final JButton b0;
    private final JButton b1;
    private final JButton b2;
    private final JButton b3;
    private final JButton b4;
    private final JButton b5;
    private final JButton b6;
    private final JButton b7;
    private final JButton b8;
    private final JButton b9;
    private final JButton bResult;
    private final JButton bClear;
    private final JButton bDot;
    private final JButton bPlus;
    private final JButton bMinus;
    private final JButton bMulti;
    private final JButton bDiv;
    private final JButton bDelete;
    private final JButton bPercent;
    private final JButton b1DivX;
    private final JButton bSecondPowerX;
    private final JButton bThirdPowerX;
    private final JButton bSqrtX;
    private char operation;
    private double first;

    public Window(String name) {
        setLayout(null);
        setTitle(name);
        setSize(354, 580);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        display.setBounds(4, 20, 332, 60);
        display.setEditable(false);
        display.setFont(new Font("Impact", Font.BOLD, 40));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        add(display);

        class Button extends JButton{
            Button(String name, int x, int y) {
                setText(name);
                setBounds(x, y, 80, 60);
                setFont(new Font("Impact", Font.BOLD, 30));
                setBackground(Color.LIGHT_GRAY);
                setVisible(true);
            }
        }

        b0 = new Button("0", 88, 480);
        b0.addActionListener(this);
        add(b0);

        b1 = new Button("1", 4, 416);
        b1.addActionListener(this);
        add(b1);

        b2 = new Button("2", 88, 416);
        b2.addActionListener(this);
        add(b2);

        b3 = new Button("3", 172, 416);
        b3.addActionListener(this);
        add(b3);

        b4 = new Button("4", 4, 352);
        b4.addActionListener(this);
        add(b4);

        b5 = new Button("5", 88, 352);
        b5.addActionListener(this);
        add(b5);

        b6 = new Button("6", 172, 352);
        b6.addActionListener(this);
        add(b6);

        b7 = new Button("7", 4, 288);
        b7.addActionListener(this);
        add(b7);

        b8 = new Button("8", 88, 288);
        b8.addActionListener(this);
        add(b8);

        b9 = new Button("9", 172, 288);
        b9.addActionListener(this);
        add(b9);

        bDot = new Button(",", 172, 480);
        bDot.addActionListener(this);
        add(bDot);

        bResult = new Button("=", 256, 480);
        bResult.addActionListener(this);
        bResult.setBackground(Color.GREEN);
        add(bResult);

        bClear = new Button("C", 172, 160);
        bClear.addActionListener(this);
        add(bClear);

        bDiv = new Button("÷", 256, 224);
        bDiv.addActionListener(this);
        bDiv.setFont(new Font("Impact", Font.BOLD, 40));
        add(bDiv);

        bMulti = new Button("×", 256, 288);
        bMulti.addActionListener(this);
        bMulti.setFont(new Font("Impact", Font.BOLD, 40));
        add(bMulti);

        bPlus = new Button("+", 256, 416);
        bPlus.addActionListener(this);
        bPlus.setFont(new Font("Impact", Font.BOLD, 40));
        add(bPlus);

        bMinus = new Button("-", 256, 352);
        bMinus.addActionListener(this);
        bMinus.setFont(new Font("Impact", Font.BOLD, 40));
        add(bMinus);

        bDelete = new Button("←", 256, 160);
        bDelete.addActionListener(this);
        bDelete.setFont(new Font("Impact", Font.BOLD, 25));
        add(bDelete);

        bPercent = new Button("%", 4, 160);
        bPercent.addActionListener(this);
        add(bPercent);

        JButton bPlusMinus = new Button("+/-", 4, 480);
        bPlusMinus.addActionListener(this);
        add(bPlusMinus);

        b1DivX = new Button("1/x", 4, 224);
        b1DivX.addActionListener(this);
        add(b1DivX);

        bSecondPowerX = new Button("x²", 88, 224);
        bSecondPowerX.addActionListener(this);
        add(bSecondPowerX);

        bThirdPowerX = new Button("x³", 172, 224);
        bThirdPowerX.addActionListener(this);
        add(bThirdPowerX);

        bSqrtX = new Button("", 88, 160);
        bSqrtX.addActionListener(this);
        bSqrtX.setIcon(new ImageIcon("Sqrt.jpg"));
        add(bSqrtX);
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
        if (e.getSource() == bSqrtX) {
            if (text.equals("0"))
                text = "";
            text = String.valueOf(Math.sqrt(Double.parseDouble(text)));
            if(text.endsWith(".0")) text = text.replaceAll("\\.0", "");
            if (text.length() > 15){
                text = text.substring(0, 15);
            }
            display.setText(text);
        }
        if (e.getSource() == bSecondPowerX) {
            if (text.equals("0"))
                text = "";
            text = String.valueOf(Math.pow(Double.parseDouble(text), 2));
            if(text.endsWith(".0")) text = text.replaceAll("\\.0", "");
            if (text.length() > 15){
                text = text.substring(0, 15);
            }
            display.setText(text);
        }
        if (e.getSource() == bThirdPowerX) {
            if (text.equals("0"))
                text = "";
            text = String.valueOf(Math.pow(Double.parseDouble(text), 3));
            if(text.endsWith(".0")) text = text.replaceAll("\\.0", "");
            if (text.length() > 15){
                text = text.substring(0, 15);
            }
            display.setText(text);
        }
        if (e.getSource() == b1DivX) {
            if (text.equals("0"))
                text = "";
            text = String.valueOf(1 / Double.parseDouble(text));
            if(text.endsWith(".0")) text = text.replaceAll("\\.0", "");
            if (text.length() > 15){
                text = text.substring(0, 15);
            }
            display.setText(text);
        }
        double second;
        if (e.getSource() == bPercent) {
            if (text.equals("0"))
                text = "";
            second = Double.parseDouble(text);
            second = first * second / 100;
            text = String.valueOf(second);
            if(text.endsWith(".0")) text = text.replaceAll("\\.0", "");
            display.setText(text);
        }
        if (e.getSource() == bPlus){
            display.setText(text);
            first = Double.parseDouble(text);
            text = "";
            operation = '+';
        }
        if (e.getSource() == bMinus) {
            display.setText(text);
            first = Double.parseDouble(text);
            text = "";
            operation = '-';
        }
        if (e.getSource() == bMulti) {
            display.setText(text);
            first = Double.parseDouble(text);
            text = "";
            operation = '*';
        }
        if (e.getSource() == bDiv) {
            display.setText(text);
            first = Double.parseDouble(text);
            text = "";
            operation = '/';
        }
        if (e.getSource() == bResult){
            if(operation == '+'){
                second = Double.parseDouble(text);
                text = String.valueOf((first + second));
                if(text.endsWith(".0")) text = text.replaceAll("\\.0", "");
                if (text.length() > 15){
                    text = text.substring(0, 15);
                }
                display.setText(text);
            }
            if(operation == '-'){
                second = Double.parseDouble(text);
                text = String.valueOf((first - second));
                if(text.endsWith(".0")) text = text.replaceAll("\\.0", "");
                if (text.length() > 15){
                    text = text.substring(0, 15);
                }
                display.setText(text);
            }
            if(operation == '/'){
                second = Double.parseDouble(text);
                text = String.valueOf((first / second));
                if(text.endsWith(".0")) text = text.replaceAll("\\.0", "");
                if (text.length() > 15){
                    text = text.substring(0, 15);
                }
                display.setText(text);
            }
            if(operation == '*'){
                second = Double.parseDouble(text);
                text = String.valueOf((first * second));
                if(text.endsWith(".0")) text = text.replaceAll("\\.0", "");
                if (text.length() > 15){
                    text = text.substring(0, 15);
                }
                display.setText(text);
            }
        }
    }
}