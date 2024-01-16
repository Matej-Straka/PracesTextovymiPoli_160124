import javax.swing.*;
import java.util.Random;


public class Window extends JFrame {
    private JPanel mainPanel;
    private JTextField randomNumber;
    private JTextArea copiedNumber;
    private JButton genBtn;
    private JButton copyBtn;

    public Window() {
        setContentPane(mainPanel);
        pack();
        setTitle("Test práce s tlačítky");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        copiedNumber.setEditable(false);
        genBtn.addActionListener(e -> randomNumber.setText(String.valueOf(vygenerujCislo())));
        copyBtn.addActionListener(e -> copiedNumber.append(randomNumber.getText() + "\n"));
    }
    public int vygenerujCislo(){
        Random rand = new Random();
        return rand.nextInt(100)+1;
    }
}
