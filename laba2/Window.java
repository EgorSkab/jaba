package bsu.rfe.java.group5.lab_2.Skabitski.var12B;

import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {
    private Double result = 0.0;
    private Double sum = 0.0;
    private final JButton buttonCalculate = new JButton("Calculate");
    private final JButton buttonClear = new JButton("Clear");
    private final JButton buttonMplus = new JButton("M+");
    private final JButton buttonMC = new JButton("MC");
    private final JRadioButton radioF1 = new JRadioButton("Function 1");
    private final JRadioButton radioF2 = new JRadioButton("Function 2");
    private final JTextField textFieldX = new JTextField("0", 5);
    private final JTextField textFieldY = new JTextField("0", 5);
    private final JTextField textFieldZ = new JTextField("0", 5);
    private final JLabel labelX = new JLabel("X:");
    private final JLabel labelY = new JLabel("Y:");
    private final JLabel labelZ = new JLabel("Z:");
    private final JLabel labelResult = new JLabel("Result: 0");

    public double calculate1(Double x, Double y, Double z) {
        return Math.pow(Math.cos(Math.exp(x)) + Math.log(Math.pow(1 + y, 2) + Math.sqrt(Math.exp(Math.cos(x)) + Math.pow(Math.sin(Math.PI * z), 2)) + Math.sqrt(1 / x) + Math.cos(Math.pow(y, 2))), Math.sin(z));
    }

    public double calculate2(Double x, Double y, Double z) {
        return (1 + Math.sqrt(z * x)) / (Math.pow(1 + Math.pow(x, 3), 1 / y));
    }

    public Double getResult() {
        return result;
    }
    public Double getSum() {
        return sum;
    }
    public JButton getButtonCalculate() {
        return buttonCalculate;
    }
    public JButton getButtonClear() {
        return buttonClear;
    }
    public JButton getButtonMPlus() {
        return buttonMplus;
    }
    public JButton getButtonMC() {
        return buttonMC;
    }
    public JRadioButton getRadioF1() {
        return radioF1;
    }
    public JRadioButton getRadioF2() {
        return radioF2;
    }
    public JTextField getTextFieldX() {
        return textFieldX;
    }
    public JTextField getTextFieldY() {
        return textFieldY;
    }
    public JTextField getTextFieldZ() {
        return textFieldZ;
    }
    public JLabel getLabelResult() {
        return labelResult;
    }

    public void setResult(Double result) {
        this.result = result;
    }
    public void setSum(Double sum) {
        this.sum = sum;
    }


    public Window() {
        super("Calculator");
        this.setBounds(600, 300, 300, 180);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new BoxLayout(container, 1));
        ButtonGroup group = new ButtonGroup();
        group.add(this.radioF1);
        group.add(this.radioF2);
        JPanel panel1 = new JPanel();
        panel1.add(this.radioF1);
        this.radioF1.setSelected(true);
        panel1.add(this.radioF2);
        this.radioF1.addActionListener(new formula$ButtonEventListener(this));
        this.radioF2.addActionListener(new formula$ButtonEventListener(this));
        container.add(panel1);
        JPanel panel2 = new JPanel();
        panel2.add(this.labelX);
        panel2.add(this.textFieldX);
        panel2.add(this.labelY);
        panel2.add(this.textFieldY);
        panel2.add(this.labelZ);
        panel2.add(this.textFieldZ);
        container.add(panel2);
        JPanel panel3 = new JPanel();
        panel3.add(this.labelResult);
        container.add(panel3);
        JPanel panel4 = new JPanel();
        panel4.add(this.buttonCalculate);
        panel4.add(this.buttonClear);
        panel4.add(this.buttonMplus);
        panel4.add(this.buttonMC);
        container.add(panel4);
        this.buttonCalculate.addActionListener(new formula$ButtonEventListener(this));
        this.buttonClear.addActionListener(new formula$ButtonEventListener(this));
        this.buttonMplus.addActionListener(new formula$ButtonEventListener(this));
        this.buttonMC.addActionListener(new formula$ButtonEventListener(this));
    }
}

