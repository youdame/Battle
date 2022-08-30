package view;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

public class Lose extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1828134641347568401L;
	/*
	 */

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lose frame = new Lose();
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
	public Lose() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 4643910637262695628L;
	

			        public Image back_img = new ImageIcon(Lose.class.getResource("/images/lose.png")).getImage();

			        public void paintComponent(Graphics g) {

			         super.paintComponent(g);
			     g.drawImage(back_img, 0, 0, null);    

			}

			};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrLose = new JTextArea();
		txtrLose.setForeground(Color.WHITE);
		txtrLose.setText("Lose....\n");
		txtrLose.setLineWrap(true);
		txtrLose.setFont(new Font("BM Hanna 11yrs Old", Font.PLAIN, 56));
		txtrLose.setBackground(new Color(255, 0, 0, 0));
		txtrLose.setBounds(450, 90, 169, 65);
		contentPane.add(txtrLose);
		setVisible(true);
	}
}
