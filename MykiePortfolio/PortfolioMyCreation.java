import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

public class PortfolioMyCreations extends PortfolioBase {
	private final JScrollPane scrollPane = new JScrollPane();
	
	public PortfolioMyCreations() {
        Container c = frame.getContentPane();
        c.setLayout(null);
        
        //background
        JLabel background = new JLabel("");
        background.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\16944506258_3981d4348d_o (1).jpg"));
        background.setBounds(0, 0, 850, 415);
        
        //exit button
        JButton toExit = new JButton("");
        toExit.setForeground(new Color(0, 0, 0));
        toExit.setBackground(new Color(0, 0, 0));
        toExit.setBounds(822, 10, 18, 21);

        toExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        //home button
        JButton toHome = new JButton("");
        toHome.setBounds(794, 10, 18, 21);
        toHome.setForeground(Color.BLACK);
        toHome.setBackground(new Color(128, 128, 128));
        frame.getContentPane().add(toHome);
        
        toHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PortfolioHome frame = new PortfolioHome();
                frame.setVisible(true);
            }
        });
        
        JButton show = new JButton("CREATIONS");
        show.setFont(new Font("Agency FB", Font.BOLD, 14));
        show.setBorderPainted(false);
        show.setBackground(Color.DARK_GRAY);
        show.setForeground(Color.WHITE);
        show.setOpaque(false);
        show.setBounds(337, 344, 163, 28);
        show.setBounds(337, 344, 121, 28);
        
        scrollPane.setOpaque(false);
        scrollPane.setBounds(58, 50, 726, 284);
        frame.getContentPane().add(scrollPane);
        
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        scrollPane.setViewportView(panel);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\2 (1).png"));
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\3 (1).png"));
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\4 (1).png"));
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\4 (1).png"));
        panel.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\5 (1).png"));
        panel.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\6 (1).png"));
        panel.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\7 (1).png"));
        panel.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("");
        lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\Screenshot_2023-05-08-22-49-05-764_com.spotify.music (1).jpg"));
        panel.add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("");
        lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\Screenshot_2023-05-08-22-49-12-137_com.spotify.music (1).jpg"));
        panel.add(lblNewLabel_8);
        
        JLabel lblNewLabel_9 = new JLabel("");
        lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\Screenshot_2023-05-08-22-49-21-215_com.spotify.music (1).jpg"));
        panel.add(lblNewLabel_9);
        
        JLabel lblNewLabel_10 = new JLabel("");
        lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\Screenshot_2023-05-08-22-49-34-737_com.spotify.music (1).jpg"));
        panel.add(lblNewLabel_10);
        
        JLabel lblNewLabel_11 = new JLabel("");
        lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\Untitled27 (1).jpg"));
        panel.add(lblNewLabel_11);
        
        JLabel lblNewLabel_12 = new JLabel("");
        lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\Untitled28 (1).jpg"));
        panel.add(lblNewLabel_12);
        
        JLabel lblNewLabel_13 = new JLabel("");
        lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\Untitled29 (1).jpg"));
        panel.add(lblNewLabel_13);
        
        JLabel lblNewLabel_14 = new JLabel("");
        lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\8 (1).png"));
        panel.add(lblNewLabel_14);
        
        JLabel lblNewLabel_15 = new JLabel("");
        lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\9.png"));
        panel.add(lblNewLabel_15);
        
        JLabel lblNewLabel_16 = new JLabel("");
        lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\10.png"));
        panel.add(lblNewLabel_16);
        
        JLabel lblNewLabel_17 = new JLabel("");
        lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\11.png"));
        panel.add(lblNewLabel_17);
        
        JLabel lblNewLabel_18 = new JLabel("");
        lblNewLabel_18.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\12.png"));
        panel.add(lblNewLabel_18);
        
        JLabel lblNewLabel_19 = new JLabel("");
        lblNewLabel_19.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\13.png"));
        panel.add(lblNewLabel_19);
        
        JLabel lblNewLabel_20 = new JLabel("");
        lblNewLabel_20.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\14.png"));
        panel.add(lblNewLabel_20);
        
        JLabel lblNewLabel_21 = new JLabel("");
        lblNewLabel_21.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\15.png"));
        panel.add(lblNewLabel_21);
        
        //visibility
        scrollPane.setVisible(false);
        
        //action listener
        show.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scrollPane.setVisible(true);
            }
        });
        
        c.add(toExit);
        c.add(toHome);
        c.add(show);
        c.add(background);
        
        frame.setVisible(true);
    }
}
