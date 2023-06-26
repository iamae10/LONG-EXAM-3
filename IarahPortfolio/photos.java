

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class photos extends contact {

	public photos() {
		//frame properties
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 666);
		
		
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
		backBtn.setBounds(10, 11, 44, 35);
		contentPane.add(backBtn);
		

		JLabel label1 = new JLabel("");
		label1.setBounds(36, 47, 198, 252);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("");
		label2.setBounds(36, 319, 198, 271);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("");
		label3.setBounds(244, 47, 198, 252);
		contentPane.add(label3);
		
		JLabel label4 = new JLabel("");
		label4.setBounds(452, 47, 198, 252);
		contentPane.add(label4);
		
		JLabel label5 = new JLabel("");
		label5.setBounds(244, 310, 198, 288);
		contentPane.add(label5);
		
		JLabel label6 = new JLabel("");
		label6.setBounds(452, 310, 198, 288);
		contentPane.add(label6);
	
		JLabel label7 = new JLabel("");
		label7.setBounds(0, 0, 698, 627);
		contentPane.add(label7);
		
		Image img8 = new ImageIcon(this.getClass().getResource("bg16.jpg")).getImage().getScaledInstance(698,627,Image.SCALE_DEFAULT);
		label7.setIcon(new ImageIcon(img8));
		
		Image img1 = new ImageIcon(this.getClass().getResource("1.png")).getImage().getScaledInstance(198,252,Image.SCALE_DEFAULT);
		label1.setIcon(new ImageIcon(img1));
		
		Image img2 = new ImageIcon(this.getClass().getResource("2.png")).getImage().getScaledInstance(198,252,Image.SCALE_DEFAULT);
		label2.setIcon(new ImageIcon(img2));
		
		Image img3 = new ImageIcon(this.getClass().getResource("4.png")).getImage().getScaledInstance(198,252,Image.SCALE_DEFAULT);
		label3.setIcon(new ImageIcon(img3));
		
		Image img4 = new ImageIcon(this.getClass().getResource("5.png")).getImage().getScaledInstance(198,252,Image.SCALE_DEFAULT);
		label4.setIcon(new ImageIcon(img4));
		
		Image img5 = new ImageIcon(this.getClass().getResource("6.png")).getImage().getScaledInstance(198,252,Image.SCALE_DEFAULT);
		label5.setIcon(new ImageIcon(img5));
		
		Image img6 = new ImageIcon(this.getClass().getResource("7.png")).getImage().getScaledInstance(198,252,Image.SCALE_DEFAULT);
		label6.setIcon(new ImageIcon(img6));
		
		Image img7 = new ImageIcon(this.getClass().getResource("backBtn.png")).getImage().getScaledInstance(44,35,Image.SCALE_DEFAULT);
		backBtn.setIcon(new ImageIcon(img7));
	}
}
