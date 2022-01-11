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
    private JButton bDel;
    private JButton bDot;
    private JButton bPlus;
    private JButton bMinus;
    private JButton bMulti;
    private JButton bDiv;
    private JButton bBack;
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
        b0 = new JButton("0");
        b0.setBounds(90, 380, 60, 60);
        b0.setFont(font);
        b0.addActionListener(this);
        add(b0);

        b1 = new JButton("1");
        b1.setBounds(20, 310, 60, 60);
        b1.setFont(font);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("2");
        b2.setBounds(90, 310, 60, 60);
        b2.setFont(font);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("3");
        b3.setBounds(160, 310, 60, 60);
        b3.setFont(font);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("4");
        b4.setBounds(20, 240, 60, 60);
        b4.setFont(font);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("5");
        b5.setBounds(90, 240, 60, 60);
        b5.setFont(font);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("6");
        b6.setBounds(160, 240, 60, 60);
        b6.setFont(font);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("7");
        b7.setBounds(20, 170, 60, 60);
        b7.setFont(font);
        b7.addActionListener(this);
        add(b7);

        b8 = new JButton("8");
        b8.setBounds(90, 170, 60, 60);
        b8.setFont(font);
        b8.addActionListener(this);
        add(b8);

        b9 = new JButton("9");
        b9.setBounds(160, 170, 60, 60);
        b9.setFont(font);
        b9.addActionListener(this);
        add(b9);

        bDot = new JButton(",");
        bDot.setBounds(160, 380, 60, 60);
        bDot.setFont(font);
        bDot.addActionListener(this);
        add(bDot);

        bResult = new JButton("=");
        bResult.setBounds(230, 310, 60, 130);
        bResult.setBackground(Color.GREEN);
        bResult.setFont(font);
        bResult.addActionListener(this);
        add(bResult);

        bDel = new JButton("C");
        bDel.setBounds(20, 100, 60, 60);
        bDel.setFont(font);
        bDel.addActionListener(this);
        add(bDel);

        bDiv = new JButton("÷");
        bDiv.setBounds(90, 100, 60, 60);
        bDiv.setFont(new Font("Impact", Font.BOLD, 40));
        bDiv.addActionListener(this);
        add(bDiv);

        bMulti = new JButton("×");
        bMulti.setBounds(160, 100, 60, 60);
        bMulti.setFont(new Font("Impact", Font.BOLD, 40));
        bMulti.addActionListener(this);
        add(bMulti);

        bPlus = new JButton("+");
        bPlus.setBounds(230, 240, 60, 60);
        bPlus.setFont(new Font("Impact", Font.BOLD, 40));
        bPlus.addActionListener(this);
        add(bPlus);

        bMinus = new JButton("-");
        bMinus.setBounds(230, 170, 60, 60);
        bMinus.setFont(new Font("Impact", Font.BOLD, 40));
        bMinus.addActionListener(this);
        add(bMinus);

        bBack = new JButton("←");
        bBack.setBounds(230, 100, 60, 60);
        bBack.setFont(new Font("Impact", Font.BOLD, 25));
        bBack.addActionListener(this);
        add(bBack);

        bPerc = new JButton("%");
        bPerc.setBounds(20, 380, 60, 60);
        bPerc.setFont(font);
        bPerc.addActionListener(this);
        add(bPerc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            text = text + b0.getText();
            display.setText(text);
        }
        if (e.getSource() == b1) {
            text = text + b1.getText();
            display.setText(text);
        }
        if (e.getSource() == b2) {
            text = text + b2.getText();
            display.setText(text);
        }
        if (e.getSource() == b3) {
            text = text + b3.getText();
            display.setText(text);
        }
        if (e.getSource() == b4) {
            text = text + b4.getText();
            display.setText(text);
        }
        if (e.getSource() == b5) {
            text = text + b5.getText();
            display.setText(text);
        }
        if (e.getSource() == b6) {
            text = text + b6.getText();
            display.setText(text);
        }
        if (e.getSource() == b7) {
            text = text + b7.getText();
            display.setText(text);
        }
        if (e.getSource() == b8) {
            text = text + b8.getText();
            display.setText(text);
        }
        if (e.getSource() == b9) {
            text = text + b9.getText();
            display.setText(text);
        }
        if (e.getSource() == bDel) {
            text = "";
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
                text = (first + second) + "";
                if(text.endsWith(".0")) text = text.replaceAll("\\.0", "");
                display.setText(text);
            }
            if(znak == '-'){
                second = Double.parseDouble(text);
                text = (first - second) + "";
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
                text = (first * second) + "";
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

    private static class JGradientButton extends JButton {
        private JGradientButton() {
            super("Gradient Button");
            setContentAreaFilled(false);
            setFocusPainted(false); // used for demonstration
        }

        @Override
        protected void paintComponent(Graphics g) {
            final Graphics2D g2 = (Graphics2D) g.create();
            g2.setPaint(new GradientPaint(
                    new Point(0, 0),
                    Color.WHITE,
                    new Point(0, getHeight()),
                    Color.PINK));
            g2.fillRect(0, 0, getWidth(), getHeight());
            g2.dispose();

            super.paintComponent(g);
        }
    }
}