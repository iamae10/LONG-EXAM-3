

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class arts extends photos {

	public arts() {
		//frame properties
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 472);
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
		backBtn.setBounds(10, 11, 51, 43);
		contentPane.add(backBtn);
		
		JLabel label1 = new JLabel("New label");
		label1.setBounds(124, 22, 335, 389);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("APP USED");
		label2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label2.setBounds(516, 84, 103, 14);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("Ibispaint");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label3.setBounds(516, 104, 59, 19);
		contentPane.add(label3);
		
		JLabel label4 = new JLabel("DURATION");
		label4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label4.setBounds(516, 154, 103, 14);
		contentPane.add(label4);
		
		JLabel label5 = new JLabel("3 Hours and 39 mins.");
		label5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label5.setBounds(516, 179, 154, 19);
		contentPane.add(label5);
		
		JLabel label6 = new JLabel("");
		label6.setBounds(0, 0, 746, 433);
		contentPane.add(label6);
		
		
		Image img1 = new ImageIcon(this.getClass().getResource("8.png")).getImage().getScaledInstance(335,389,Image.SCALE_DEFAULT);
		label1.setIcon(new ImageIcon(img1));
		
		Image img2 = new ImageIcon(this.getClass().getResource("backBtn.png")).getImage().getScaledInstance(51,43,Image.SCALE_DEFAULT);
		backBtn.setIcon(new ImageIcon(img2));
		
		Image img3 = new ImageIcon(this.getClass().getResource("bg16.jpg")).getImage().getScaledInstance(746,433,Image.SCALE_DEFAULT);
		label6.setIcon(new ImageIcon(img3));
	}
}
