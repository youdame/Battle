package view;

import player.*;
import player.악당.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.util.List;

import java.awt.Graphics;

import java.awt.Image;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.UIManager;


public class View1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8564384894805482644L;
	/**
	 * 
	 */
	public Player p1;
	public List<Player> targets;



	private JPanel contentPane;
	private JPanel panel_a;
	private JPanel panel_b;
	private JLabel label_b;
	private JPanel panel_c;
	private JLabel label_c;
	private JLabel label_d;
	private JPanel panel_d;
	private JPanel panel_e;
	private JLabel label_e;
	private JButton btn_1;
	private JProgressBar bar_b;
	private JProgressBar bar_c;
	private JProgressBar bar_e;
	private JProgressBar bar_d;
	private JButton btn_2;
	private JButton btn_3;
	private static JTextArea textArea;
	private JLabel label_p;

	String pickupWeaponLog;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		View1 frame = new View1();
		frame.setVisible(true);
	}


	/**
	 * Create the frame.
	 */
	public View1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);


		contentPane = new JPanel() {

			private static final long serialVersionUID = -3479450165378492778L;
			/**
			 * 
			 */
			public Image back_img = new ImageIcon(View1.class.getResource("/images/background.png")).getImage();

			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(back_img, 0, 0, null);

			}

		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(255, 0, 0, 0));
		contentPane.setForeground(new Color(255, 0, 0, 0));
		contentPane.setLayout(null);

		panel_a = new JPanel();

		panel_a.setBounds(527, 0, 189, 289);
		contentPane.add(panel_a);
		panel_a.setBackground(new Color(255, 0, 0, 0));
		panel_a.setLayout(null);
		
		label_p = new JLabel("New label");
		label_p.setIcon(new ImageIcon(View1.class.getResource("/images/\u110B\u1175\u1109\u1173\u11AF\u110B\u1175.png")));
		label_p.setVerticalAlignment(SwingConstants.BOTTOM);
		label_p.setForeground(new Color(255, 0, 0, 0));
		label_p.setBounds(0, 0, 193, 295);
		panel_a.add(label_p);

		panel_b = new JPanel();
		panel_b.setLayout(null);
		panel_b.setBackground(new Color(255, 0, 0, 0));
		panel_b.setForeground(new Color(255, 0, 0, 0));
		panel_b.setBounds(16, 307, 199, 365);
		contentPane.add(panel_b);

		label_b = new JLabel("New label");
		label_b.setVerticalAlignment(SwingConstants.BOTTOM);
		label_b.setBounds(6, 70, 193, 295);
		label_b.setForeground(new Color(255, 0, 0, 0));
		panel_b.add(label_b);
		label_b.setIcon(new ImageIcon(View1.class.getResource("/images/\uBE44\uC2E4\uC774.png")));


		bar_b = new JProgressBar();
		bar_b.setOpaque(true);
		bar_b.setForeground(Color.RED);
		bar_b.setValue(100);
		
		bar_b.setBounds(6, 6, 187, 6);
		panel_b.add(bar_b);

		panel_c = new JPanel();
		panel_c.setLayout(null);
		panel_c.setBackground(new Color(255, 0, 0, 0));
		panel_c.setBounds(212, 307, 202, 365);
		contentPane.add(panel_c);

		label_c = new JLabel("New label");
		label_c.setVerticalAlignment(SwingConstants.BOTTOM);
		label_c.setIcon(new ImageIcon(View1.class.getResource("/images/\uD241\uD241\uC774.png")));
		label_c.setForeground(new Color(255, 0, 0, 0));
		label_c.setBounds(0, 47, 202, 318);
		panel_c.add(label_c);

		bar_c = new JProgressBar();
		bar_c.setOpaque(true);
		bar_c.setValue(100);
		bar_c.setForeground(Color.RED);
		bar_c.setBackground(UIManager.getColor("Button.background"));
		bar_c.setBounds(6, 6, 186, 6);
		panel_c.add(bar_c);

		panel_d = new JPanel();
		panel_d.setLayout(null);
		panel_d.setBackground(new Color(255, 0, 0, 0));
		panel_d.setBounds(768, 307, 202, 359);
		contentPane.add(panel_d);

		label_d = new JLabel("New label");
		label_d.setVerticalAlignment(SwingConstants.BOTTOM);
		label_d.setBounds(6, 76, 184, 283);
		panel_d.add(label_d);
		label_d.setIcon(new ImageIcon(View1.class.getResource("/images/Jin.png")));

		bar_d = new JProgressBar();
		bar_d.setValue(100);
		bar_d.setOpaque(true);
		bar_d.setForeground(Color.RED);
		bar_d.setBackground(new Color(255, 250, 240));
		bar_d.setBounds(6, 6, 186, 6);
		panel_d.add(bar_d);

		panel_e = new JPanel();
		panel_e.setLayout(null);
		panel_e.setBackground(new Color(255, 0, 0, 0));
		panel_e.setBounds(412, 307, 202, 365);
		contentPane.add(panel_e);

		label_e = new JLabel("New label");
		label_e.setVerticalAlignment(SwingConstants.BOTTOM);
		label_e.setIcon(new ImageIcon(View1.class.getResource("/images/young.png")));
		label_e.setBounds(6, 79, 194, 286);
		panel_e.add(label_e);

		bar_e = new JProgressBar();
		bar_e.setValue(100);
		bar_e.setOpaque(true);
		bar_e.setForeground(Color.RED);
		bar_e.setBackground(new Color(255, 250, 240));
		bar_e.setBounds(6, 6, 187, 6);
		panel_e.add(bar_e);
		
		
		btn_1 = new JButton("\uB3C4\uC640\uC918~\uB3C4\uB77C\uC5D0\uBABD!");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				노진구 p = (노진구) p1;
				String pickupWeaponLog = p.pickupRandomWeapon();
				textArea.append("흐앙 도라에몽ㅠㅠㅠㅠㅠㅠ 도와줘~~~~\n");
				textArea.update(textArea.getGraphics());
				textArea.append(pickupWeaponLog);
			}
		});
		btn_1.setFont(new Font("BM Jua", Font.BOLD, 17));
		btn_1.setBounds(768, 18, 200, 40);
		contentPane.add(btn_1);
		
		btn_2 = new JButton("공격하기");
		btn_2.setFont(new Font("BM Jua", Font.BOLD, 17));
		btn_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String attack_log = p1.attack(targets);
				textArea.append(attack_log);
				textArea.update(textArea.getGraphics());
			
				
				for(int i = 0; i < targets.size(); i++) {
					
					bar_d.setValue(p1.getHp());
					getBar(targets.get(i)).setValue(targets.get(i).getHp());
					if (targets.get(i).getHp() > 0) {
						targets.get(i).attack(p1);
						sleepAndUpdate(textArea, getBar(targets.get(i)));
	            		textArea.append(targets.get(i).attackMessage() + "\n");
	            		bar_d.update(bar_d.getGraphics());
	            		
					} else {
						textArea.append(targets.get(i).name + "를 물리쳤습니다.\n");
						getLabel(targets.get(i)).setEnabled(false);
					}
					
					
				} 
				
				
				textArea.append(showInfo(p1));
				for(int i = 0; i < targets.size(); i++) {
					textArea.append(showInfo(targets.get(i)));
				}
				
		
				if (p1.getHp() <= 0 ) {
	               textArea.append("악당 팀이 이겼습니다!\n");
	               JOptionPane.showMessageDialog(null, "악당 팀이 이겼습니다!\n");
	               dispose();	   
	               new Lose();
	            }

	            boolean win = true;

	            for(int i = 0; i < targets.size(); i++) {
	                if(targets.get(i).getHp() > 0) {
	                    win = false;
	                   
	                }
	            }
	            if (win){
	            	textArea.append("진구가 이겼습니다!\n");
	            	JOptionPane.showMessageDialog(null, "진구가 이겼습니다!\n");
	            	dispose();	             
	            	new Win();
	            }
	            
				
	            

			}
		});
		
				
		btn_2.setBounds(768, 70, 200, 40);
		contentPane.add(btn_2);

		btn_3 = new JButton("\uC774\uC2AC\uC774\uC758 \uC751\uC6D0\uBC1B\uAE30");
		btn_3.setFont(new Font("BM Jua", Font.BOLD, 17));
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("이슬이가 진구를 응원해줍니다. 진구야 ~ 힘내!! 할 수 있어 !!\n진구의 hp가 50만큼 회복됩니다\n");
				sleepAndUpdate(textArea, 1000);
				p1.setHp(p1.getHp() + 50);
				bar_d.setValue(p1.getHp());
				textArea.append(showInfo(p1));
			}
		});
		btn_3.setBounds(768, 122, 200, 40);
		contentPane.add(btn_3);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 18, 491, 269);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		
		textArea.setCaretPosition(textArea.getDocument().getLength());
		
		scrollPane.setViewportView(textArea); 
		
		
		JButton btn_4 = new JButton("\uC778\uBCA4\uD1A0\uB9AC");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Inventory(p1.getWeaponList());
			}
		});
		btn_4.setFont(new Font("BM Jua", Font.BOLD, 17));
		btn_4.setBounds(768, 174, 200, 40);
		contentPane.add(btn_4);

	}

	public View1(Player p1, List<Player> targets){
		this();
		this.p1 = (노진구) p1;
		this.targets = targets;
		
		
		textArea.append(showInfo(p1));
		
		bar_d.setMaximum(p1.getHp());
		bar_d.setValue(p1.getHp());
		label_d.setIcon(new ImageIcon(View1.class.getResource("/images/" + p1.imgFile)));
		
		
		for(int i = 0; i < targets.size(); i++) {
			textArea.append(showInfo(targets.get(i)));
			getBar(targets.get(i)).setMaximum(targets.get(i).getHp());
        	getBar(targets.get(i)).setValue(targets.get(i).getHp());
        	getLabel(targets.get(i)).setIcon(new ImageIcon(View1.class.getResource("/images/" + targets.get(i).imgFile)));
        	
        
		}
		
		this.setTitle("비실이, 퉁퉁이, 영민이 vs " + p1.name);
		this.setVisible(true);
		}
		
	
	public void sleepAndUpdate(JTextArea textArea, JProgressBar bar) {
		textArea.update(textArea.getGraphics());
		bar.update(bar.getGraphics());
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
		
	}
	

	
	public void sleepAndUpdate(JTextArea textArea, int time) {
		try {
            Thread.sleep(time);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
		textArea.update(textArea.getGraphics());
	}
	
	public JProgressBar getBar(Player p){
		
			if(p instanceof 비실이) {
				return bar_b;
			} else if (p instanceof 퉁퉁이){
		 		return bar_c;
			} else {			
				return bar_e; 
			}
	}
	
	public JLabel getLabel(Player p){
		
		if(p instanceof 비실이) {
			return label_b;
		} else if (p instanceof 퉁퉁이){
	 		return label_c;
		} else 		
			return label_e;
		}

	public String showInfo(Player p) {
		
		return "[정보] " + p.name + "의 Hp는 " + p.getHp() + " Power는 " + p.getPower() + "\n";
	}

}

	
	


