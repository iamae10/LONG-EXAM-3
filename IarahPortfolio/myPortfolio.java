

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class myPortfolio extends PortfolioFrame {
	
	public myPortfolio() {
		setTitle("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 450);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("View more about me");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				about frame1 = new about();
				frame1.setVisible(true);
			}
		});
		btn1.setBounds(386, 269, 153, 23);
		contentPane.add(btn1);
		
		//initialize the home button and its properties
		JButton btn2 = new JButton("Home");
		btn2.setFont(new Font("SansSerif", Font.BOLD, 15));
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(false);
		btn2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myPortfolio frame = new myPortfolio();
				frame.setVisible(true); //calling the myPortfolio class frame
			}
		});
		btn2.setBounds(375, 26, 97, 41);
		contentPane.add(btn2);
		
		//initialize the what I do button and its properties
		JButton btn3 = new JButton("What I Do");
		btn3.setFont(new Font("SansSerif", Font.BOLD, 15));
		btn3.setBorderPainted(false);
		btn3.setContentAreaFilled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WhatIDo frame2 = new WhatIDo();
				frame2.setVisible(true);//calling the what i do class frame
			}
		});
		btn3.setBounds(474, 26, 117, 41);
		contentPane.add(btn3);
		
		//initialize the about button and its properties
		JButton btn4 = new JButton("About");
		btn4.setFont(new Font("SansSerif", Font.BOLD, 15));
		btn4.setContentAreaFilled(false);
		btn4.setBorderPainted(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				about frame1 = new about();
				frame1.setVisible(true);//calling the about class frame
			}
		});
		btn4.setBounds(580, 26, 97, 41);
		contentPane.add(btn4);
		
		//initialize the contact button and its properties
		JButton btn5 = new JButton("Contact");
		btn5.setFont(new Font("SansSerif", Font.BOLD, 15));
		btn5.setContentAreaFilled(false);
		btn5.setBorderPainted(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contact frame3 = new contact();
				frame3.setVisible(true);//calling the contact class frame
			}
		});
		btn5.setBounds(671, 26, 97, 41);
		contentPane.add(btn5);
		
		
		//display the informations using JLabel and its properties
		JLabel  label1 = new JLabel("Hi! I'm");
		label1.setFont(new Font("Leelawadee UI", Font.PLAIN, 35));
		label1.setBounds(387, 97, 146, 54);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("IARAH MAE TUSIAP");
		label2.setFont(new Font("Leelawadee UI", Font.BOLD, 40));
		label2.setBounds(387, 134, 381, 41);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("1st year college student, studying Bachelor");
		label3.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label3.setBounds(387, 168, 360, 23);
		contentPane.add(label3);
		
		JLabel label4 = new JLabel("of Science in Information Technology with");
		label4.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label4.setBounds(387, 186, 332, 23);
		contentPane.add(label4);
		
		JLabel label5 = new JLabel("specialization in Mobile and Web");
		label5.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label5.setBounds(387, 202, 332, 23);
		contentPane.add(label5);
		
		JLabel label6 = new JLabel("Applications at National University-Manila");
		label6.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label6.setBounds(387, 220, 360, 23);
		contentPane.add(label6);
		
		JLabel label7 = new JLabel("What I Do ");
		label7.setFont(new Font("Brush Script MT", Font.BOLD | Font.ITALIC, 40));
		label7.setBounds(81, 464, 177, 68);
		contentPane.add(label7);
		
		JLabel label8 = new JLabel("");
		label8.setBounds(81, 543, 146, 154);
		contentPane.add(label8);
		
		JLabel label9 = new JLabel("");
		label9.setBounds(449, 440, 46, 14);
		contentPane.add(label9);
		
		JLabel label10 = new JLabel("bg");
		label10.setBounds(52, 47, 281, 324);
		contentPane.add(label10);
		
		JLabel label11 = new JLabel("");
		label11.setBounds(0, 0, 797, 422);
		contentPane.add(label11);
		
		//pictures used in the frame
		Image img1 = new ImageIcon(this.getClass().getResource("bg13.png")).getImage().getScaledInstance(281,324,Image.SCALE_DEFAULT);
		label10.setIcon(new ImageIcon(img1));
		
		Image img2 = new ImageIcon(this.getClass().getResource("bg4.png")).getImage().getScaledInstance(797,422,Image.SCALE_DEFAULT);
		label11.setIcon(new ImageIcon(img2));
	}
}
