

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WhatIDo extends about {

	public WhatIDo() {
		//frame properties
		setTitle("What I Do");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 501);
		
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JLabel label1 = new JLabel("WHAT I  DO");
		label1.setFont(new Font("Javanese Text", Font.BOLD, 35));
		label1.setBounds(56, 114, 236, 64);
		contentPane.add(label1);
		
		//initialize the tabbedpane for photography and digital art panel
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(362, 56, 394, 356);
		contentPane.add(tabbedPane);
		
		//add the photography panel to tabbedpane
		JPanel Photography_panel = new JPanel();
		Photography_panel.setForeground(Color.PINK);
		tabbedPane.addTab("Photography", null, Photography_panel, null);
		Photography_panel.setLayout(null);
		
		JLabel label2 = new JLabel("Taking photos gives me a sense of joy ");
		label2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label2.setBounds(21, 18, 324, 31);
		Photography_panel.add(label2);
		
		JLabel label3 = new JLabel("and satisfactions. It's like capturing a piece  ");
		label3.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label3.setBounds(21, 43, 368, 31);
		Photography_panel.add(label3);
		
		JLabel label4 = new JLabel("of the world and preserving it for eternity.");
		label4.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label4.setBounds(21, 73, 358, 23);
		Photography_panel.add(label4);
		
		JLabel label5 = new JLabel("We’re all searching for that perfect shot,  ");
		label5.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label5.setBounds(21, 118, 358, 23);
		Photography_panel.add(label5);
		
		JLabel label6 = new JLabel("that unique perspective on the world that only");
		label6.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label6.setBounds(21, 141, 368, 23);
		Photography_panel.add(label6);
		
		JLabel label7 = new JLabel("we can capture. Searching for the perfect ");
		label7.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label7.setBounds(21, 164, 358, 23);
		Photography_panel.add(label7);
		
		JLabel label8 = new JLabel("shot is an exciting journey of exploration ");
		label8.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label8.setBounds(21, 186, 358, 23);
		Photography_panel.add(label8);
		
		JLabel label9 = new JLabel("and discovery.");
		label9.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label9.setBounds(21, 208, 358, 23);
		Photography_panel.add(label9);
		
		JButton btn1 = new JButton("View more");
		btn1.setForeground(new Color(0, 0, 255));
		btn1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				photos frame4 = new photos();
				frame4.setVisible(true);// calling the photos class frame to display
			}
		});
		btn1.setBounds(0, 263, 126, 23);
		Photography_panel.add(btn1);
		
		JLabel label10 = new JLabel("");
		label10.setBounds(0, 0, 389, 328);
		Photography_panel.add(label10);
		
		//add the digital panel to the tabbedpane
		JPanel DigitalArt_panel = new JPanel();
		tabbedPane.addTab("Digital Arts", null, DigitalArt_panel, null);
		DigitalArt_panel.setLayout(null);
		
		JButton btn2 = new JButton("View more");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arts frame5 = new arts();
				frame5.setVisible(true);// calling the art class 
			}
		});
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(false);
		btn2.setFocusPainted(false);
		btn2.setForeground(new Color(0, 0, 255));
		btn2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btn2.setBounds(10, 220, 130, 23);
		DigitalArt_panel.add(btn2);
		
		JLabel label11 = new JLabel("I love digital art because it gives me a way ");
		label11.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label11.setBounds(10, 22, 379, 31);
		DigitalArt_panel.add(label11);
		
		JLabel label12 = new JLabel("to show my creative side and express myself ");
		label12.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label12.setBounds(10, 43, 379, 31);
		DigitalArt_panel.add(label12);
		
		JLabel label13 = new JLabel("ways I never thought possible. It's an amazing");
		label13.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label13.setBounds(10, 64, 379, 31);
		DigitalArt_panel.add(label13);
		
		JLabel label14 = new JLabel("feeling to be able to create something that");
		label14.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label14.setBounds(10, 85, 369, 31);
		DigitalArt_panel.add(label14);
		
		JLabel label15 = new JLabel("no one else has ever seen before.");
		label15.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		label15.setBounds(10, 106, 324, 31);
		DigitalArt_panel.add(label15);
		
		JLabel label16 = new JLabel("2");
		label16.setBounds(0, 0, 389, 328);
		DigitalArt_panel.add(label16);
		
		JButton btn3 = new JButton("");
		btn3.setContentAreaFilled(false);
		btn3.setBorderPainted(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //to dispose the frame
			}
		});
		btn3.setBounds(10, 11, 69, 43);
		contentPane.add(btn3);
		
		JLabel label17 = new JLabel("");
		label17.setBounds(43, 155, 236, 197);
		contentPane.add(label17);
		
		//add image icon to the button
		Image img1 = new ImageIcon(this.getClass().getResource("backBtn.png")).getImage().getScaledInstance(69,43,Image.SCALE_DEFAULT);
		btn3.setIcon(new ImageIcon(img1));
		
		Image img2 = new ImageIcon(this.getClass().getResource("bg9.png")).getImage().getScaledInstance(389,328,Image.SCALE_DEFAULT);
		label16.setIcon(new ImageIcon(img2));
		
		Image img3 = new ImageIcon(this.getClass().getResource("bg9.png")).getImage().getScaledInstance(389,328,Image.SCALE_DEFAULT);
		label10.setIcon(new ImageIcon(img3));
		
		Image img4 = new ImageIcon(this.getClass().getResource("idoIcon.png")).getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
		label17.setIcon(new ImageIcon(img4));
		
		
	}
}
