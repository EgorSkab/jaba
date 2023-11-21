package bsu.rfe.java.group5.lab_2.Skabitski.var12B;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class formula$ButtonEventListener implements ActionListener {
    Window this$0;
    public formula$ButtonEventListener(final Window this$0) {
        this.this$0 = this$0;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == this.this$0.getButtonCalculate()) {
                Double x = Double.parseDouble(this.this$0.getTextFieldX().getText());
                Double y = Double.parseDouble(this.this$0.getTextFieldY().getText());
                Double z = Double.parseDouble(this.this$0.getTextFieldZ().getText());
                if (this.this$0.getRadioF1().isSelected()) {
                    this.this$0.setResult(this.this$0.calculate1(x, y, z));
                } else if (this.this$0.getRadioF2().isSelected()) {
                    this.this$0.setResult(this.this$0.calculate2(x, y, z));
                }

                this.this$0.getLabelResult().setText("Result: " + this.this$0.getResult().toString());
            } else if (e.getSource() == this.this$0.getButtonClear()) {
                this.this$0.getTextFieldX().setText("0");
                this.this$0.getTextFieldY().setText("0");
                this.this$0.getTextFieldZ().setText("0");
                this.this$0.getLabelResult().setText("Result: 0");
            } else if (e.getSource() == this.this$0.getButtonMPlus()) {
                this.this$0.setResult(Double.parseDouble(this.this$0.getLabelResult().getText()));
                this.this$0.setSum(this.this$0.getSum() + this.this$0.getResult());
                this.this$0.getLabelResult().setText(this.this$0.getSum().toString());
            } else if (e.getSource() == this.this$0.getButtonMC()) {
                this.this$0.getLabelResult().setText("Result: 0");
                this.this$0.setResult(Double.parseDouble(this.this$0.getLabelResult().getText()));
                this.this$0.setSum(0.0);
                this.this$0.getLabelResult().setText(this.this$0.getSum().toString());
            }
        } catch (NumberFormatException var5) {
            JOptionPane.showMessageDialog(this.this$0, "Ошибка в формате записи числа с плавающей точкой", "Ошибочный формат числа", 2);
        }

    }
}
