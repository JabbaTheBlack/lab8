import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OkButtonActionListener implements ActionListener {
    private final CaesarFrame frame;
    private final CaesarCipher cipher;

    public OkButtonActionListener(CaesarFrame frame) {
        this.frame = frame;
        this.cipher = new CaesarCipher();  // Create an instance of CaesarCipher
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the input text from CaesarFrame
        String inputText = frame.getInputText();

        // Get the selected character from JComboBox in CaesarFrame and cast to char
        char offset = (char) frame.getSelectedOffset();

        // Encode the text using CaesarCipher
        String encodedText = cipher.encode(inputText, offset);

        // Display the encoded text in the output field
        frame.setOutputText(encodedText);
    }
}
