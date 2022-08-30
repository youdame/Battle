package view;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import player.Player;
import weapon.*;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Inventory extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4056466033227271425L;
	/**
	 * 
	 */
	
	/**
	 * 
	 */
	
	private JPanel contentPane;
	private JLabel label_3;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_4;
	private JTextArea text_1;
	private JTextArea text_2;
	private JTextArea text;
	private JTextArea text_3;
	private JTextArea text_22;
	private JTextArea text_11;
	private JTextArea text_33;
	private JTextArea text_44;
	private JLabel label_p_1;
	public Player p1;
	public List<Player> targets;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory(null);
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
	public Inventory(List<Weapon> weaponList) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel() {
	    /**
			 * 
			 */
			private static final long serialVersionUID = -753092000687106585L;
		/**
			 * 
			 */
		
		public Image back_img = new ImageIcon(Inventory.class.getResource("/images/\uC778\uBCA4\uD1A0\uB9AC.png")).getImage();

        public void paintComponent(Graphics g) {

         super.paintComponent(g);
         g.drawImage(back_img, 0, 0, null);    

        }

		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Inventory.class.getResource("/images/\u1100\u1169\u11BC\u1100\u1175\u1111\u1169 (1).png")));
		label_1.setBounds(45, 320, 220, 220);
		contentPane.add(label_1);
		
		label_2 = new JLabel("");
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setIcon(new ImageIcon(Inventory.class.getResource("/images/\u1108\u1161\u11AF\u1105\u1161\u110C\u1175\u1102\u1173\u11AB\u1110\u1162\u110B\u1167\u11B8 (3).png")));
		label_2.setBounds(300, 320, 220, 220);
		contentPane.add(label_2);
		
		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Inventory.class.getResource("/images/\u1110\u116E\u1106\u1167\u11BC\u1106\u1161\u11BC\u1110\u1169 .png")));
		label_3.setBounds(537, 320, 220, 220);
		contentPane.add(label_3);
		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Inventory.class.getResource("/images/\u1107\u1175\u11A8\u1105\u1161\u110B\u1175\u1110\u1173.png")));
		label_4.setBounds(758, 320, 220, 220);
		contentPane.add(label_4);
		
		text_1 = new JTextArea();
		text_1.setFont(new Font("BM Hanna Air", Font.BOLD, 17));
		text_1.setEditable(false);
		text_1.setForeground(new Color(255, 192, 203));
		text_1.setBackground(new Color(255, 0, 0, 0));
		text_1.setText("         \uC8FC\uBA39\uC5D0 \uB07C\uC6CC\uC11C \uBAA9\uD45C\uBB3C\uC744 \uACA8\uB208 \uB4A4\r\n             \uC785\uC73C\uB85C \uBE75 \uC18C\uB9AC\uB97C \uB0B4\uBA74,\r\n            \uACF5\uAE30\uB97C \uC555\uCD95\uD574\uC11C \uB300\uD3EC\uB85C\r\n      \uC5C4\uCCAD\uB09C \uC704\uB825\uC758 \uACF5\uAE30\uD0C4\uC744 \uBC1C\uC0AC\uD55C\uB2E4.\r\n");
		text_1.setBounds(29, 580, 267, 96);
		contentPane.add(text_1);
		
		text_2 = new JTextArea();
		text_2.setText("\uBAB8\uC5D0 \uBD99\uC774\uACE0 \uD0DC\uC5FD\uC744 \uAC10\uC73C\uBA74\n    \uBE5B\uCC98\uB7FC \uBE60\uB978 \uC18D\uB3C4\uB85C \n      \uACF5\uACA9\uD560 \uC218 \uC788\uB2E4.\n\n\r\n");
		text_2.setForeground(new Color(255, 255, 0));
		text_2.setFont(new Font("BM Hanna Air", Font.BOLD, 17));
		text_2.setEditable(false);
		text_2.setBackground(new Color(255, 0, 0, 0));
		text_2.setBounds(329, 585, 177, 64);
		contentPane.add(text_2);
		
		text = new JTextArea();
		text.setLineWrap(true);
		text.setText("      \uD22C\uBA85\uB9DD\uD1A0\uB97C \uCC29\uC6A9\uD558\uBA74, \n       \uBAA8\uC2B5\uC774 \uBCF4\uC774\uC9C0 \uC54A\uC544 \n\uC0C1\uB300\uB97C \uBA85\uC911\uD560 \uD655\uB960\uC774 \uB192\uC544\uC9C4\uB2E4.\n\n");
		text.setForeground(Color.ORANGE);
		text.setFont(new Font("BM Hanna Air", Font.BOLD, 17));
		text.setEditable(false);
		text.setBackground(new Color(255, 0, 0, 0));
		text.setBounds(560, 585, 207, 64);
		contentPane.add(text);
		
		text_3 = new JTextArea();
		text_3.setEditable(false);
		text_3.setText("    \uBE45\uB77C\uC774\uD2B8\uC5D0\uC11C \uB098\uC628 \uBE5B\uC744\n       \uC0AC\uB78C\uC5D0\uAC8C \uBE44\uCD94\uBA74\n\uBAB8\uC774 \uCEE4\uC838 \uACF5\uACA9\uB825\uC774 \uC99D\uAC00\uD55C\uB2E4.");
		text_3.setForeground(new Color(204, 255, 51));
		text_3.setFont(new Font("BM Hanna Air", Font.BOLD, 17));
		text_3.setBackground(new Color(255, 0, 0, 0));
		text_3.setBounds(779, 585, 198, 64);
		contentPane.add(text_3);
		
	
		
		text_11 = new JTextArea();
		text_11.update(text_11.getGraphics());
		text_11.setText("\uACF5\uAE30\uD3EC " + weaponList.get(1).useCount + "\n");
		text_11.setForeground(new Color(255, 192, 203));
		text_11.setFont(new Font("BM Hanna Air", Font.BOLD, 25));
		text_11.setEditable(false);
		text_11.setBackground(new Color(255, 0, 0, 0));
		text_11.setBounds(121, 545, 93, 29);
		contentPane.add(text_11);
		
		text_22 = new JTextArea();
		text_22.update(text_22.getGraphics());
		text_22.setText("\uBE68\uB77C\uC9C0\uB294 \uD0DC\uC5FD " + weaponList.get(2).useCount + "\n");
		text_22.setForeground(new Color(255, 255, 0));
		text_22.setFont(new Font("BM Hanna Air", Font.BOLD, 25));
		text_22.setEditable(false);
		text_22.setBackground(new Color(255, 0, 0, 0));
		text_22.setBounds(341, 545, 162, 29);
		contentPane.add(text_22);
		
		text_33 = new JTextArea();
		text_33.update(text_33.getGraphics());
		text_33.setText("\uD22C\uBA85\uB9DD\uD1A0 " + weaponList.get(3).useCount + "\n");
		text_33.setForeground(Color.ORANGE);
		text_33.setFont(new Font("BM Hanna Air", Font.BOLD, 25));
		text_33.setEditable(false);
		text_33.setBackground(new Color(255, 0, 0, 0));
		text_33.setBounds(605, 545, 109, 29);
		contentPane.add(text_33);
		
		text_44 = new JTextArea();
		text_44.update(text_44.getGraphics());
		text_44.setText("\uBE45\uB77C\uC774\uD2B8 "  + weaponList.get(4).useCount + "\n");
		text_44.setForeground(new Color(204, 255, 51));
		text_44.setFont(new Font("BM Hanna Air", Font.BOLD, 25));
		text_44.setEditable(false);
		text_44.setBackground(new Color(255, 0, 0, 0));
		text_44.setBounds(818, 545, 109, 29);
		contentPane.add(text_44);
		
		label_p_1 = new JLabel("New label");
		label_p_1.setIcon(new ImageIcon(Inventory.class.getResource("/images/\u1103\u1169\u1100\u116E\u110E\u1161\u11BD\u1102\u1173\u11AB\u1103\u1169\u1105\u1161\u110B\u1166\u1106\u1169\u11BC.png")));
		label_p_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_p_1.setForeground(new Color(255, 0, 0, 0));
		label_p_1.setBounds(45, 13, 223, 295);
		contentPane.add(label_p_1);
		
		JButton btn_2 = new JButton("\uB3CC\uC544\uAC00\uAE30");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}

			
		});
		btn_2.setFont(new Font("BM Jua", Font.BOLD, 17));
		btn_2.setBounds(778, 13, 200, 40);
		contentPane.add(btn_2);
		
		JPanel panel_a = new JPanel();
		panel_a.setLayout(null);
		panel_a.setBackground(new Color(255, 0, 0, 0));
		panel_a.setBounds(555, 13, 189, 289);
		contentPane.add(panel_a);
		

		
		setVisible(true);
	}
	
}
