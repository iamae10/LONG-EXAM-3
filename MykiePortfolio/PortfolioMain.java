import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PortfolioMain extends PortfolioBase {
	
    public PortfolioMain() {
    	super(); 
    	
        Container c = frame.getContentPane();
        c.setLayout(null);
        
        JLabel background = new JLabel("");
        background.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\16944506258_3981d4348d_o (1).jpg"));
        background.setBounds(0, 0, 850, 415);
    	
        JLabel mykie = new JLabel("MYKIE");
        mykie.setFont(new Font("Agency FB", Font.BOLD, 60));
        mykie.setForeground(Color.WHITE);
        mykie.setBounds(203, 155, 135, 103);

        JLabel patosa = new JLabel("PATOSA");
        patosa.setFont(new Font("Agency FB", Font.BOLD, 60));
        patosa.setForeground(Color.WHITE);
        patosa.setBounds(495, 155, 171, 103);

        JButton toExit = new JButton("");
        toExit.setForeground(new Color(0, 0, 0));
        toExit.setBackground(new Color(0, 0, 0));
        toExit.setBounds(822, 10, 18, 21);

        toExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton logo = new JButton("");
        logo.setContentAreaFilled(false); 
        logo.setBorderPainted(false);
        logo.setIcon(new ImageIcon("C:\\Users\\Mykie\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication2\\src\\logo (1).png"));
        logo.setBounds(349, 135, 124, 129);
        
        logo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PortfolioHome portfolioHome = new PortfolioHome();
                portfolioHome.setVisible(true);

                frame.dispose();
            }
        });

        c.add(mykie);
        c.add(patosa);
        c.add(toExit);
        c.add(logo);
        c.add(background);

        frame.setVisible(true);
    }
 }
