package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;

public class Win extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3010244428632691310L;

	/**
	 * 
	
	 * 
	 */
	
	/**
	 * 
	 */
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Win frame = new Win();
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
	public Win() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel() {

	
			/**
			 * 
			 */
			private static final long serialVersionUID = -1677402177538881025L;
			/**
			 * 
			 */
			
			//아래 코드를 카피하여 이미지를 대체하세요

			        public Image back_img = new ImageIcon(Win.class.getResource("/images/win.png")).getImage();

			        public void paintComponent(Graphics g) {

			         super.paintComponent(g);
			     g.drawImage(back_img, 0, 0, null);    

			}

			};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("BM Hanna 11yrs Old", Font.PLAIN, 56));
		textArea.setText("\uB3C4\uB77C\uC5D0\uBABD~ \uACE0\uB9C8\uC6CC!\n");
		textArea.setLineWrap(true);
		textArea.setBackground(new Color(255, 0, 0, 0));
		textArea.setBounds(313, 70, 426, 65);
		contentPane.add(textArea);
		setVisible(true);
	}
	
}
