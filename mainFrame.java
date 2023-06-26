import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainFrame extends JFrame {

	private JPanel contentPane;
	private JLabel mainBG; 
	private JButton iarahBtn,mykieBtn,jaellenBtn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame frame = new mainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1129, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iarahBtn = new JButton("");
		iarahBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myPortfolio frame = new myPortfolio();
				frame.setVisible(true);    
				
				dispose();
			}
		});
		iarahBtn.setOpaque(false);
		iarahBtn.setFocusable(false);
		iarahBtn.setFocusPainted(false);
		iarahBtn.setContentAreaFilled(false);
		iarahBtn.setBorderPainted(false);
		iarahBtn.setBounds(359, 554, 408, 73);
		contentPane.add(iarahBtn);
		
		mykieBtn = new JButton("");
		mykieBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PortfolioMain frame = new PortfolioMain();
		        frame.setVisible(true);
		        
		        dispose();
			}
		});
		mykieBtn.setOpaque(false);
		mykieBtn.setFocusable(false);
		mykieBtn.setFocusPainted(false);
		mykieBtn.setContentAreaFilled(false);
		mykieBtn.setBorderPainted(false);
		mykieBtn.setBounds(359, 460, 408, 73);
		contentPane.add(mykieBtn);
		
		jaellenBtn = new JButton("");
		jaellenBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main frame = new Main();
				frame.setVisible(true);
				
				dispose();
			}
		});
		jaellenBtn.setOpaque(false);
		jaellenBtn.setFocusable(false);
		jaellenBtn.setFocusPainted(false);
		jaellenBtn.setContentAreaFilled(false);
		jaellenBtn.setBorderPainted(false);
		jaellenBtn.setBounds(359, 376, 408, 73);
		contentPane.add(jaellenBtn);
		
		mainBG = new JLabel("");
		mainBG.setIcon(new ImageIcon("C:\\Users\\Iarah Mae Tusiap\\Downloads\\mainbg.png"));
		mainBG.setBounds(0, -12, 1113, 741);
		contentPane.add(mainBG);
		
		
		
		
	}
}
