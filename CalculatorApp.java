import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//to extend class swing:)


public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        CalculatorApp calculatorApp = new CalculatorApp();
        calculatorApp.setVisible(true);
    });
}
