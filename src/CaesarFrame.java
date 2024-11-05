import javax.swing.*;
import java.awt.*;

public class CaesarFrame extends JFrame {

    private final JTextField inputField;
    private final JTextField outputField;
    private final JButton codeButton;
    private final JComboBox<Object> alphabetComboBox;
    private final JLabel outputLabel;

    // Constructor
    public CaesarFrame() {
        // Set up the frame
        setTitle("SwingLab");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BorderLayout());

        // Initialize components
        inputField = new JTextField(20);
        outputField = new JTextField(20);
        outputField.setEditable(false);  // Make outputField non-editable

        codeButton = new JButton("Code");

        // Create an array of uppercase English alphabet letters
        Object[] alphabet = new Object[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        alphabetComboBox = new JComboBox<>(alphabet);

        // Create the output label
        outputLabel = new JLabel("Output");

        // Set up top panel with components in a FlowLayout
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        topPanel.add(alphabetComboBox);    // Add JComboBox
        topPanel.add(inputField);           // Add input JTextField
        topPanel.add(codeButton);          // Add close JButton next to inputField

        // Set up bottom panel for output field and label
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(outputLabel, BorderLayout.WEST);
        bottomPanel.add(outputField, BorderLayout.CENTER);

        // Add panels to the main frame
        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.SOUTH);

        // Set the action listener for the Close button
        codeButton.addActionListener(new OkButtonActionListener(this));

        // Make the window resizable
        setResizable(true);
    }

    // Getter methods to expose input/output components to the listener

    public String getInputText() {
        return inputField.getText();
    }

    public Object getSelectedOffset() {
        return alphabetComboBox.getSelectedItem();
    }

    public void setOutputText(String text) {
        outputField.setText(text);
    }
}
