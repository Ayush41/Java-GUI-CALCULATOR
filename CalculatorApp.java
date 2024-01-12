import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//to extend class swing:)
public class CalculatorApp extends JFrame implements ActionListener {
    private JTextField number1Field, number2Field, resultField;

    public CalculatorApp() {
        // Set up the JFrame
        setTitle("Simple Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Create components
        number1Field = new JTextField();
        number2Field = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Subtract");
        JButton mulButton = new JButton("Multiply");
        JButton divButton = new JButton("Divide");

        // Add components to the JFrame
        add(new JLabel("Number 1:"));
        add(number1Field);
        add(new JLabel("Number 2:"));
        add(number2Field);
        add(new JLabel("Result:"));
        add(resultField);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);

        // Add action listeners to buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
    }
}


public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        CalculatorApp calculatorApp = new CalculatorApp();
        calculatorApp.setVisible(true);
    });
}
