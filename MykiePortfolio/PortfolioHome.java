import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PortfolioHome extends PortfolioBase {
    public PortfolioHome() {
    	super();
    	
        Container c = frame.getContentPane();
        c.setLayout(null);
        
        //background
        JLabel background = new JLabel("");
        background.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\16944506258_3981d4348d_o (1).jpg"));
        background.setBounds(0, 0, 850, 415);
    
        JButton toExit = new JButton("");
        toExit.setForeground(new Color(0, 0, 0));
        toExit.setBackground(new Color(0, 0, 0));
        toExit.setBounds(822, 10, 18, 21);

        toExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        JLabel picture = new JLabel("");
        picture.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\m.png"));
        picture.setBounds(168, 70, 242, 263);

        
        JButton toAbout = new JButton("ABOUT ME");
        toAbout.setFocusable(false);
        toAbout.setBackground(new Color(255, 255, 255));
        toAbout.setForeground(new Color(0, 0, 0));
        toAbout.setFocusTraversalKeysEnabled(false);
        toAbout.setFocusPainted(false);
        toAbout.setDefaultCapable(false);
        toAbout.setFont(new Font("Agency FB", Font.BOLD, 24));
        toAbout.setBounds(443, 70, 210, 66);
        
        JButton toSkills = new JButton("SKILLS");
        toSkills.setBackground(new Color(128, 128, 128));
        toSkills.setFont(new Font("Agency FB", Font.BOLD, 24));
        toSkills.setBounds(443, 169, 210, 66);
        
        JButton toCreations = new JButton("CREATIONS");
        toCreations.setForeground(new Color(255, 255, 255));
        toCreations.setBackground(new Color(0, 0, 0));
        toCreations.setFont(new Font("Agency FB", Font.BOLD, 24));
        toCreations.setBounds(443, 267, 210, 66);
        
        JButton toMain = new JButton("");
        toMain.setForeground(Color.BLACK);
        toMain.setBackground(new Color(128, 128, 128));
        toMain.setBounds(794, 10, 18, 21);
        
        //action listeners
        toMain.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 PortfolioMain frame = new PortfolioMain();
                 frame.setVisible(true);
        	}
        });
        
        toAbout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 PortfolioAboutMe frame = new PortfolioAboutMe();
                 frame.setVisible(true);
        	}
        });
        
        toSkills.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 PortfolioMySkills frame = new PortfolioMySkills();
                 frame.setVisible(true);
        	}
        });
        
        toCreations.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 PortfolioMyCreations frame = new PortfolioMyCreations();
                 frame.setVisible(true);
        	}
        });
        
        c.add(picture);
        c.add(toExit);
        c.add(toAbout);
        c.add(toSkills);
        c.add(toCreations);
        c.add(toMain);
        c.add(background);
        
        frame.setVisible(true);
    }
}
