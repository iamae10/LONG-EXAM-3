

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//a class that inherited from JFrame
public class contact extends WhatIDo {
	public contact() {
		//frame properties
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 484);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton backBtn = new JButton("");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		backBtn.setContentAreaFilled(false);
		backBtn.setBorderPainted(false);
		backBtn.setBounds(10, 11, 57, 48);
		contentPane.add(backBtn);
		
		JLabel label1 = new JLabel("If you interested, please don't hesitate to contact me");
		label1.setFont(new Font("Calibri", Font.BOLD, 13));
		label1.setBounds(217, 104, 299, 14);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Reach Me Out");
		label2.setFont(new Font("Kristen ITC", Font.BOLD, 35));
		label2.setBounds(229, 45, 287, 48);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("");
		label3.setBounds(216, 118, 87, 91);
		contentPane.add(label3);
		
		JLabel label4 = new JLabel("");
		label4.setBounds(216, 219, 87, 72);
		contentPane.add(label4);
		
		JLabel label5 = new JLabel("");
		label5.setBounds(216, 313, 81, 72);
		contentPane.add(label5);
		
		JLabel label6 = new JLabel("iamaetusiap61@gmail.com");
		label6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label6.setBounds(307, 347, 209, 21);
		contentPane.add(label6);
		
		JLabel label7 = new JLabel("_irhmaeeee");
		label7.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label7.setBounds(313, 252, 209, 21);
		contentPane.add(label7);
		
		JLabel label8 = new JLabel("iamae10");
		label8.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label8.setBounds(313, 153, 209, 21);
		contentPane.add(label8);
		
		JLabel label9 = new JLabel("");
		label9.setBounds(0, 0, 718, 445);
		contentPane.add(label9);

		Image img1 = new ImageIcon(this.getClass().getResource("github.png")).getImage().getScaledInstance(87,91,Image.SCALE_DEFAULT);
		label3.setIcon(new ImageIcon(img1));
		
		Image img2 = new ImageIcon(this.getClass().getResource("ig.png")).getImage().getScaledInstance(87,72,Image.SCALE_DEFAULT);
		label4.setIcon(new ImageIcon(img2));
		
		Image img3 = new ImageIcon(this.getClass().getResource("email.png")).getImage().getScaledInstance(87,72,Image.SCALE_DEFAULT);
		label5.setIcon(new ImageIcon(img3));
		
		Image img4 = new ImageIcon(this.getClass().getResource("bg9.png")).getImage().getScaledInstance(718,445,Image.SCALE_DEFAULT);
		label9.setIcon(new ImageIcon(img4));
		
		Image img5 = new ImageIcon(this.getClass().getResource("backBtn.png")).getImage().getScaledInstance(57,28,Image.SCALE_DEFAULT);;
		backBtn.setIcon(new ImageIcon(img5));
	}
}
