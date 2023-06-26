import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;

public class PortfolioMySkills extends PortfolioBase {
    public PortfolioMySkills() {
        super();
    	
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
        
        //panels
        JPanel skills = new JPanel();
        skills.setBackground(Color.DARK_GRAY);
        skills.setBounds(55, 94, 226, 281);
        skills.setLayout(null);
        
        JPanel education = new JPanel();
        education.setLayout(null);
        education.setBackground(Color.DARK_GRAY);
        education.setBounds(316, 94, 226, 281);
        
        JPanel contact = new JPanel();
        contact.setLayout(null);
        contact.setBackground(Color.DARK_GRAY);
        contact.setBounds(573, 94, 226, 281);
        
        //header
        JPanel header = new JPanel();
        header.setOpaque(false);
        header.setFocusable(false);
        header.setFocusTraversalKeysEnabled(false);
        header.setEnabled(false);
        header.setBounds(55, 47, 744, 37);
        header.setLayout(null);
        
        JButton skillsBtn = new JButton("SKILLS");
        skillsBtn.setFont(new Font("Agency FB", Font.BOLD, 24));
        skillsBtn.setBounds(54, 0, 119, 37);
        skillsBtn.setContentAreaFilled(false);
        skillsBtn.setBorderPainted(false);
        header.add(skillsBtn);
        
        JButton btnEducation = new JButton("EDUCATION");
        btnEducation.setFont(new Font("Agency FB", Font.BOLD, 24));
        btnEducation.setContentAreaFilled(false);
        btnEducation.setBorderPainted(false);
        btnEducation.setBounds(276, 0, 198, 37);
        header.add(btnEducation);
        
        JButton btnContact = new JButton("CONTACT");
        btnContact.setFont(new Font("Agency FB", Font.BOLD, 24));
        btnContact.setContentAreaFilled(false);
        btnContact.setBorderPainted(false);
        btnContact.setBounds(535, 0, 187, 37);
        header.add(btnContact);
        
        
        JButton seeMore = new JButton("see more");
        seeMore.setFont(new Font("Agency FB", Font.BOLD, 14));
        seeMore.setBorderPainted(false);
        seeMore.setBackground(Color.DARK_GRAY);
        seeMore.setForeground(Color.WHITE);
        seeMore.setOpaque(false);
        seeMore.setBounds(66, 232, 95, 39);
        skills.add(seeMore);
        
        JTextArea forSkills = new JTextArea("\n GRAPHIC DESIGN\n\n DIGITAL DRAWING");
        forSkills.setFont(new Font("Agency FB", Font.BOLD, 32));
        forSkills.setForeground(Color.WHITE);
        forSkills.setBackground(Color.DARK_GRAY);
        forSkills.setBounds(10, 10, 206, 261);
        skills.add(forSkills);
        c.add(education);
        
        JTextArea forEdu = new JTextArea("\n               ELEMENTARY:\n MARY'S GREENFIELD ACADEMY    \n\n               HIGHSCHOOL:\n    MENDEZ-NUÑEZ MOTESSORI    \n\n          COLLEGE (PRESENT):\n NATIONAL UNIVERSITY(MANILA)");
        forEdu.setFont(new Font("Agency FB", Font.BOLD, 20));
        forEdu.setForeground(Color.WHITE);
        forEdu.setBackground(Color.DARK_GRAY);
        forEdu.setBounds(10, 10, 206, 261);
        education.add(forEdu);
        
        JTextArea forContact = new JTextArea("\n            PHONE NUMMER:\n              09235737061            \n\n           E-MAIL ADDRESS:\n      mykie2patosa@gmail.com               \n\n                 FACEBOOK:\n                mykiepatosa");
        forContact.setFont(new Font("Agency FB", Font.BOLD, 20));
        forContact.setForeground(Color.WHITE);
        forContact.setBackground(Color.DARK_GRAY);
        forContact.setBounds(10, 10, 206, 261);
        contact.add(forContact);

        //visibility
        forSkills.setVisible(false);
        forEdu.setVisible(false);
        forContact.setVisible(false);
        
        //action listeners
        skillsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                forSkills.setVisible(true);
            }
        });
        
        btnEducation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                forEdu.setVisible(true);
            }
        });
        
        btnContact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                forContact.setVisible(true);
            }
        });
        
        seeMore.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PortfolioMyCreations frame = new PortfolioMyCreations();
                frame.setVisible(true);
            }
        });
        
        
        c.add(toHome);
        c.add(toExit);
        c.add(header);
        c.add(skills);
        c.add(education);
        c.add(contact);
        c.add(background);

        frame.setVisible(true);    
    }
}
