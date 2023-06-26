import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class PortfolioBase extends JFrame {
    public JFrame frame;

    public PortfolioBase() {
        frame = new JFrame("");
        frame.setSize(850, 415);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        frame.setUndecorated(true);
    }

    public static void main(String[] args) {
        PortfolioMain frame = new PortfolioMain();
        frame.setVisible(true);
    }
}
