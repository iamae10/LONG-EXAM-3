

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;


public class about extends myPortfolio {

	
	public about() {
		//frame properties
		setTitle("About");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 504);
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//initialize the tabbedpane to add multiple panels
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(217, -30, 550, 506);
		contentPane.add(tabbedPane);
		
		JPanel personalinfo_panel = new JPanel();
		tabbedPane.addTab("New tab", null, personalinfo_panel, null);
		personalinfo_panel.setLayout(null);
		personalinfo_panel.setVisible(true);

	    JPanel education_panel = new JPanel();
		tabbedPane.addTab("New tab", null, education_panel, null);
		education_panel.setLayout(null);
		education_panel.setVisible(true);
		
		//initialize the hobbies panel 
		JPanel hobbies_panel = new JPanel();
		tabbedPane.addTab("New tab", null, hobbies_panel, null);
		hobbies_panel.setLayout(null);
		
		//initialize the skills panel 
		JPanel skillsandprof_panel = new JPanel();
		tabbedPane.addTab("New tab", null, skillsandprof_panel, null);
		skillsandprof_panel.setLayout(null);
				
		
				
		JButton btn1 = new JButton("Personal Information");
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0); //calling the first panel integrated from tabbedpane to display
			}
		});
		btn1.setFont(new Font("Modern No. 20", Font.BOLD, 15));
		btn1.setHorizontalAlignment(SwingConstants.RIGHT);
		btn1.setBounds(0, 125, 207, 43);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Education");
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1); //calling the second panel integrated from tabbedpane to display
				
			}
		});
		btn2.setFont(new Font("Modern No. 20", Font.BOLD, 15));
		btn2.setHorizontalAlignment(SwingConstants.RIGHT);
		btn2.setBounds(0, 168, 207, 43);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("Hobbies");
		btn3.setContentAreaFilled(false);
		btn3.setBorderPainted(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2); //calling the third panel integrated from tabbedpane to display
			}
		});
		btn3.setFont(new Font("Modern No. 20", Font.BOLD, 15));
		btn3.setHorizontalAlignment(SwingConstants.RIGHT);
		btn3.setBounds(0, 211, 207, 43);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("Skills and Profficiency");
		btn4.setContentAreaFilled(false);
		btn4.setBorderPainted(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3); //calling the fourth panel integrated from tabbedpane to display
			}
		});
		btn4.setFont(new Font("Modern No. 20", Font.BOLD, 15));
		btn4.setHorizontalAlignment(SwingConstants.RIGHT);
		btn4.setBounds(0, 254, 207, 43);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setContentAreaFilled(false);
		btn5.setBorderPainted(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //dispose the frame
			}
		});
		btn5.setBounds(10, 11, 55, 43);
		contentPane.add(btn5);
		
	
		
		JLabel label1 = new JLabel("PERSONAL INFORMATION");
		label1.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		label1.setBounds(34, 75, 489, 39);
		personalinfo_panel.add(label1);
		
		JLabel label2 = new JLabel("DATE OF BIRTH:  January 10, 2004");
		label2.setFont(new Font("Gill Sans MT", Font.PLAIN, 17));
		label2.setBounds(34, 157, 297, 21);
		personalinfo_panel.add(label2);
		
		JLabel label3 = new JLabel("GENDER: Female");
		label3.setFont(new Font("Gill Sans MT", Font.PLAIN, 17));
		label3.setBounds(34, 202, 258, 14);
		personalinfo_panel.add(label3);
		
		JLabel label4 = new JLabel("AGE: 19");
		label4.setFont(new Font("Gill Sans MT", Font.PLAIN, 17));
		label4.setBounds(34, 243, 209, 14);
		personalinfo_panel.add(label4);
		
		JLabel label5 = new JLabel("RELIGION: Roman Catholic");
		label5.setFont(new Font("Gill Sans MT", Font.PLAIN, 17));
		label5.setBounds(34, 279, 269, 14);
		personalinfo_panel.add(label5);
		
		JLabel label6 = new JLabel("CIVIL STATUS:  Single");
		label6.setFont(new Font("Gill Sans MT", Font.PLAIN, 17));
		label6.setBounds(34, 323, 245, 14);
		personalinfo_panel.add(label6);
		
		JLabel label7 = new JLabel("");
		label7.setBounds(0, 0, 535, 467);
		personalinfo_panel.add(label7);
		
		JLabel label8 = new JLabel("EDUCATION");
		label8.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		label8.setBounds(150, 98, 227, 28);
		education_panel.add(label8);
		
		JLabel label9 = new JLabel(" Junior High School");
		label9.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
		label9.setBounds(156, 161, 191, 28);
		education_panel.add(label9);
		
		JLabel label10 = new JLabel("Binaliuan National High School");
		label10.setFont(new Font("Gill Sans MT", Font.PLAIN, 18));
		label10.setBounds(137, 200, 240, 22);
		education_panel.add(label10);
		
		JLabel label11 = new JLabel("BATCH 2019-2020");
		label11.setFont(new Font("Gill Sans MT", Font.PLAIN, 18));
		label11.setBounds(177, 189, 152, 14);
		education_panel.add(label11);
		
		JLabel label12 = new JLabel("Senior High School");
		label12.setHorizontalAlignment(SwingConstants.CENTER);
		label12.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
		label12.setBounds(156, 269, 191, 28);
		education_panel.add(label12);
		
		JLabel label13 = new JLabel("BATCH 2021-2022");
		label13.setFont(new Font("Gill Sans MT", Font.PLAIN, 18));
		label13.setBounds(177, 295, 147, 22);
		education_panel.add(label13);
		
		JLabel label14 = new JLabel("Binaliuan National High School");
		label14.setFont(new Font("Gill Sans MT", Font.PLAIN, 18));
		label14.setBounds(137, 308, 240, 28);
		education_panel.add(label14);
		
		JLabel label15 = new JLabel("");
		label15.setBounds(0, 0, 535, 467);
		education_panel.add(label15);
		
		JLabel label16 = new JLabel("HOBBIES");
		label16.setHorizontalAlignment(SwingConstants.CENTER);
		label16.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		label16.setBounds(159, 103, 209, 28);
		hobbies_panel.add(label16);
		
		JLabel label18 = new JLabel("Random capturing sceneries");
		label18.setHorizontalAlignment(SwingConstants.CENTER);
		label18.setFont(new Font("Gill Sans MT", Font.PLAIN, 19));
		label18.setBounds(94, 156, 322, 28);
		hobbies_panel.add(label18);
		
		JLabel label19 = new JLabel("Coding");
		label19.setHorizontalAlignment(SwingConstants.CENTER);
		label19.setFont(new Font("Gill Sans MT", Font.PLAIN, 18));
		label19.setBounds(94, 195, 322, 22);
		hobbies_panel.add(label19);
		
		JLabel label20 = new JLabel("Readng online comics (e.g manga, webtoon)");
		label20.setHorizontalAlignment(SwingConstants.CENTER);
		label20.setFont(new Font("Gill Sans MT", Font.PLAIN, 18));
		label20.setBounds(104, 223, 350, 28);
		hobbies_panel.add(label20);
		
		JLabel label21 = new JLabel("");
		label21.setBounds(114, 270, 340, 22);
		hobbies_panel.add(label21);
		
		JLabel label22 = new JLabel("Watching anime movies");
		label22.setHorizontalAlignment(SwingConstants.CENTER);
		label22.setFont(new Font("Gill Sans MT", Font.PLAIN, 18));
		label22.setBounds(94, 262, 350, 22);
		hobbies_panel.add(label22);
		
		JLabel label23 = new JLabel("");
		label23.setBounds(0, 0, 535, 467);
		hobbies_panel.add(label23);
		
		JLabel label24 = new JLabel("SKILLS AND PROFICIENCY");
		label24.setFont(new Font("Goudy Stout", Font.PLAIN, 20));
		label24.setBounds(27, 87, 480, 28);
		skillsandprof_panel.add(label24);
		
		JLabel label25 = new JLabel("SOFT SKILLS");
		label25.setFont(new Font("Gill Sans MT", Font.BOLD, 19));
		label25.setBounds(66, 142, 127, 14);
		skillsandprof_panel.add(label25);
		
		JLabel label26 = new JLabel("TECHNICAL SKILLS");
		label26.setFont(new Font("Gill Sans MT", Font.BOLD, 19));
		label26.setBounds(295, 142, 198, 14);
		skillsandprof_panel.add(label26);
		
		JLabel label27 = new JLabel("Leadership");
		label27.setHorizontalAlignment(SwingConstants.CENTER);
		label27.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		label27.setBounds(66, 177, 127, 19);
		skillsandprof_panel.add(label27);
		
		JLabel label28 = new JLabel("Problem-solving");
		label28.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		label28.setHorizontalAlignment(SwingConstants.CENTER);
		label28.setBounds(66, 200, 127, 19);
		skillsandprof_panel.add(label28);
		
		JLabel label29 = new JLabel("Adaptability");
		label29.setHorizontalAlignment(SwingConstants.CENTER);
		label29.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		label29.setBounds(66, 230, 127, 19);
		skillsandprof_panel.add(label29);
		
		JLabel label30 = new JLabel("Resiliency");
		label30.setHorizontalAlignment(SwingConstants.CENTER);
		label30.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		label30.setBounds(66, 256, 127, 19);
		skillsandprof_panel.add(label30);
		
		JLabel label31 = new JLabel("");
		label31.setHorizontalAlignment(SwingConstants.CENTER);
		label31.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		label31.setBounds(66, 281, 127, 14);
		skillsandprof_panel.add(label31);
		
		JLabel label32 = new JLabel("Computer Management");
		label32.setHorizontalAlignment(SwingConstants.CENTER);
		label32.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		label32.setBounds(326, 181, 167, 19);
		skillsandprof_panel.add(label32);
		
		JLabel label33 = new JLabel("Java Programming");
		label33.setHorizontalAlignment(SwingConstants.CENTER);
		label33.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		label33.setBounds(326, 206, 167, 17);
		skillsandprof_panel.add(label33);
		
		JLabel label34 = new JLabel("Presentation Editing");
		label34.setHorizontalAlignment(SwingConstants.CENTER);
		label34.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		label34.setBounds(326, 234, 167, 19);
		skillsandprof_panel.add(label34);
		
		JLabel label35 = new JLabel("");
		label35.setHorizontalAlignment(SwingConstants.CENTER);
		label35.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		label35.setBounds(0, 0, 535, 467);
		skillsandprof_panel.add(label35);
		
		JLabel label36 = new JLabel("");
		label36.setBounds(232, 293, 46, 14);
		contentPane.add(label36);
		
		JLabel label37 = new JLabel("");
		label37.setBounds(0, 0, 207, 476);
		contentPane.add(label37);
		
		//all images used in this frame
		Image img1 = new ImageIcon(this.getClass().getResource("backBtn.png")).getImage().getScaledInstance( 55, 43,Image.SCALE_DEFAULT);
		btn5.setIcon(new ImageIcon(img1));
		
		Image img2 = new ImageIcon(this.getClass().getResource("bg16.jpg")).getImage().getScaledInstance(207,476,Image.SCALE_DEFAULT);
		label37.setIcon(new ImageIcon(img2));
		
		Image img3 = new ImageIcon(this.getClass().getResource("bg15.jpg")).getImage().getScaledInstance(535,467,Image.SCALE_DEFAULT);
		label7.setIcon(new ImageIcon(img3));
		
		Image img4 = new ImageIcon(this.getClass().getResource("bg15.jpg")).getImage().getScaledInstance(535,467,Image.SCALE_DEFAULT);
		label15.setIcon(new ImageIcon(img4));
		
		Image img5 = new ImageIcon(this.getClass().getResource("bg15.jpg")).getImage().getScaledInstance(535,467,Image.SCALE_DEFAULT);
		label23.setIcon(new ImageIcon(img5));
		
		Image img6 = new ImageIcon(this.getClass().getResource("bg15.jpg")).getImage().getScaledInstance(535,467,Image.SCALE_DEFAULT);
		label35.setIcon(new ImageIcon(img6));
	}
}
