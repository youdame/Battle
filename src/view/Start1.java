package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import player.Player;

public class Start1 extends JFrame {

	

	private static final long serialVersionUID = -2119393818137589649L;
	/**
	 * 
	 */

	private JPanel contentPane;
	private JButton btnNewButton_1;
	public Player p1;
	public List <Player> targets;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start1 frame = new Start1();
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
	public Start1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel() {

			private static final long serialVersionUID = -6213376750006838556L;

			//아래 코드를 카피하여 이미지를 대체하세요

			        public Image back_img = new ImageIcon(View1.class.getResource("/images/start (1).jpeg")).getImage();

			        public void paintComponent(Graphics g) {

			         super.paintComponent(g);
			     g.drawImage(back_img, 0, 0, null);    

			}
			};
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton_1 = new JButton("Game Start!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new View1(p1, targets);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(455, 590, 170, 56);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setForeground(Color.PINK);
		btnNewButton_1.setFont(new Font("Ayuthaya", Font.PLAIN, 21));

		setVisible(true);
	}
	
	public Start1(Player p1, List <Player> targets) {
		
		this();
		this.p1 = p1;
		this.targets = targets;
		
	}
}
