import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.DropMode;

public class HowToPlayFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HowToPlayFrame frame = new HowToPlayFrame();
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
	public HowToPlayFrame() {
		

		setBackground(new Color(51, 153, 204));
		getContentPane().setBackground(new Color(204, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-402, -187, 1400, 750);
		setLocationRelativeTo(null);
	//	frame.getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		Image ship = new ImageIcon(this.getClass().getResource("ship2.png")).getImage();
		Image boss = new ImageIcon(this.getClass().getResource("shipBoss2.png")).getImage();	
		Image enemy = new ImageIcon(this.getClass().getResource("shipEnemy.png")).getImage();
		Image enemy2 = new ImageIcon(this.getClass().getResource("shipEnemy2.png")).getImage();
		Image enemy3 = new ImageIcon(this.getClass().getResource("shipEnemy3.png")).getImage();
		Image medkit = new ImageIcon(this.getClass().getResource("health.png")).getImage();
		Image doubleP = new ImageIcon(this.getClass().getResource("pup3.png")).getImage();
		Image rand = new ImageIcon(this.getClass().getResource("pup4.png")).getImage();
		Image god = new ImageIcon(this.getClass().getResource("pup6.png")).getImage();
		Image fastC = new ImageIcon(this.getClass().getResource("pup0.png")).getImage();
		//Image superB = new ImageIcon(this.getClass().getResource("pup5.png")).getImage();
		Image boost = new ImageIcon(this.getClass().getResource("boost.png")).getImage();
		Image bomb = new ImageIcon(this.getClass().getResource("bomb.png")).getImage();
		//Image pierce = new ImageIcon(this.getClass().getResource("pierce.png")).getImage();
		
		contentPane.setLayout(null);
		
		JLabel label10 = new JLabel("");
		label10.setBounds(55, 586, 40, 45);
		label10.setBackground(new Color(176, 196, 222));
		label10.setIcon(new ImageIcon(medkit));
		contentPane.add(label10);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(1111, 184, 212, 88);
		label_3.setIcon(new ImageIcon(enemy3));
		contentPane.add(label_3);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(908, 184, 123, 73);
		label_2.setIcon(new ImageIcon(enemy2));
		contentPane.add(label_2);
		
		JLabel lblShip = new JLabel("");
		lblShip.setBounds(100, 149, 123, 73);
		lblShip.setIcon(new ImageIcon(ship));
		contentPane.add(lblShip);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(687, 184, 153, 73);
		label_1.setIcon(new ImageIcon(enemy));
		contentPane.add(label_1);
		
		JLabel label = new JLabel("");
		label.setBounds(90, 213, 153, 84);
		label.setBackground(new Color(176, 196, 222));
		label.setIcon(new ImageIcon(boss));
		contentPane.add(label);
		
		JLabel label1 = new JLabel("");
		label1.setBounds(80, 309, 158, 57);
		label1.setBackground(new Color(176, 196, 222));
		label1.setIcon(new ImageIcon(boost));
		contentPane.add(label1);
		
		
		JLabel label2 = new JLabel("");
		label2.setBounds(80, 357, 158, 76);
		label2.setBackground(new Color(176, 196, 222));
		label2.setIcon(new ImageIcon(god));
		contentPane.add(label2);
		
		JLabel label4 = new JLabel("");
		label4.setBounds(409, 368, 308, 93);
		label4.setBackground(new Color(176, 196, 222));
		label4.setIcon(new ImageIcon(rand));
		contentPane.add(label4);
		
	
		
		JLabel label6 = new JLabel("");
		label6.setBounds(650, 310, 182, 84);
		label6.setBackground(new Color(176, 196, 222));
		label6.setIcon(new ImageIcon(doubleP));
		contentPane.add(label6);
		
		JLabel label7 = new JLabel("");
		label7.setBounds(40, 429, 98, 100);
		label7.setBackground(new Color(176, 196, 222));
		label7.setIcon(new ImageIcon(fastC));
		contentPane.add(label7);
		
		JLabel label8 = new JLabel("");
		label8.setBounds(40, 528, 158, 48);
		label8.setBackground(new Color(176, 196, 222));
		label8.setIcon(new ImageIcon(bomb));
		contentPane.add(label8);
		
		JLabel txtpnHowToPlay = new JLabel();
		txtpnHowToPlay.setBounds(558, 0, 303, 39);
		txtpnHowToPlay.setForeground(new Color(255, 255, 51));
		txtpnHowToPlay.setHorizontalAlignment(SwingConstants.CENTER);
		txtpnHowToPlay.setBackground(new Color(204, 255, 255));
		txtpnHowToPlay.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 37));
		txtpnHowToPlay.setText("How To Play");
		contentPane.add(txtpnHowToPlay);
		
		Image img = new ImageIcon(this.getClass().getResource("back1.png")).getImage();
		Image img12 = new ImageIcon(this.getClass().getResource("seaa1.jpg")).getImage();
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(0, 0, 35, 34);
		btnNewButton_4.setForeground(new Color(51, 102, 204));
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu frmMainMenu = new Menu();
				frmMainMenu.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(img));
		
				btnNewButton_4.setBackground(new Color(51, 102, 204));
				contentPane.add(btnNewButton_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 37, 1315, 663);
		contentPane.add(scrollPane);
		
		JTextPane txtpnWelcomeToChicken = new JTextPane();
		txtpnWelcomeToChicken.setEditable(false);
		scrollPane.setViewportView(txtpnWelcomeToChicken);
		txtpnWelcomeToChicken.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		txtpnWelcomeToChicken.setBackground(new Color(176, 196, 222));
		txtpnWelcomeToChicken.setText("\t\t\t\t\t\t\tWelcome to Chicken Invaders, but Pirates!\r\nThe Chicken Invaders but Pirates is a clone for a well-known game Chicken Invaders. But in this game scenario instead of chickens invasion to the earth, the evil pirates attack to the shore of BilkentShire. The great ship of Bilkent come to the defence of BilkentShire lands from pirates. The successful defence will occur when ship of BilkentShire destroys all pirates in wave. However there will be other incoming waves which should be cleaned. \r\n\r\n\t\t\t\t\t\t\tMain Goal\r\nThe player controls the ship position on a fixed axis which shoots cannonballs at the enemies. Player can move a ship using \"left\"/ \"right\" keys on the keyboard and shoot using \"space\" key. By attacking enemies you take health points from them, and when they reach zero they are destroyed. By destroying enough waves of enemies you are given power-ups which affect the rate of fire and effects on the projectiles. The level ends when all the waves and bosses are defeated.\r\nMain Ship\t\t\t\t\t\t\t\tEnemy Pirate Ships: Small Pirate Ship\t\tMedium Pirate Ship\t\tBig Pirate Ship\r\n\r\n\t\t\t\t\t\t\t\r\nBosses: Bosses in this game will be encountered several times throughout the game.\r\nBoss Ship\r\n\r\n\r\n\r\nBonuses: \r\nPassive Power-Ups will be used automatically as soon as they were picked up, and it will has limited time until it vanishes. \r\nSpeed Boost: Increases the speed of player\u2019s ship up to two times.\t\t\t\tDouble Points: Doubles points that player gets from the destroying enemies.\t\r\n\r\n\r\n\r\nGod Mode: God Mode provides the player invulnerability.\t\tCannon Randomizer: This power-up will randomize the number of cannon that main ship has.\r\n\t\t\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\nFast Cannon: It increases the speed of shooting.\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\r\n\r\nActive Power-Ups: These type of power-ups can be stacked, and used later in the most appropriate time.\r\nBomb Ball: Player unleashes big bomb in the straight line, which explodes in collision with first enemy ship\t\t\t\t\t\t\t\t\t\r\n\r\n\r\n\t\t\t\t\t\t\t\r\nHealth Packs:");
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(0, 0, 1370, 711);
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		lblNewLabel_2.setIcon(new ImageIcon(img12));
		contentPane.add(lblNewLabel_2);
		

	}
}
