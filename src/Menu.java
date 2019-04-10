import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Menu extends JFrame {
	
	private JFrame frame;
	private int MENU_HEIGHT = 1400;
	private int MENU_WIDTH = 750;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("main menu");
		setBounds(100, 100, MENU_HEIGHT, MENU_WIDTH);
		setLocationRelativeTo(null);
		//contentPane = new JPanel();
		setBackground(Color.BLUE);
		getContentPane().setLayout(null);
		
		Image img12 = new ImageIcon(this.getClass().getResource("seaa1.jpg")).getImage();
		
		JLabel lblChickenInvadersBut = new JLabel("Chicken Invaders but Pirates");
		lblChickenInvadersBut.setForeground(new Color(255, 255, 51));
		lblChickenInvadersBut.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 45));
		lblChickenInvadersBut.setBounds(342, 32, 615, 106);
		getContentPane().add(lblChickenInvadersBut);
		
		JButton btnStart = new JButton("Start");
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainSprite game = new MainSprite();
				game.setVisible(true);
				setVisible(false);
			}
		});
		btnStart.setFont(new Font("Sitka Display", Font.BOLD, 27));
		btnStart.setForeground(new Color(255, 255, 51));
		btnStart.setBackground(new Color(102, 204, 255));
		btnStart.setBounds(596, 197, 174, 61);
		getContentPane().add(btnStart);
		
		JButton button = new JButton("Settings");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Settings settings = new Settings();
				settings.setVisible(true);
				setVisible(false);
			}
		});
		button.setForeground(new Color(255, 255, 51));
		button.setFont(new Font("Sitka Display", Font.BOLD, 27));
		button.setBackground(new Color(102, 204, 255));
		button.setBounds(596, 295, 174, 61);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("High Scores");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HighScoresFrame highSc = new HighScoresFrame();
				highSc.setVisible(true);
				setVisible(false);
			}
		});
		button_1.setForeground(new Color(255, 255, 51));
		button_1.setFont(new Font("Sitka Display", Font.BOLD, 27));
		button_1.setBackground(new Color(102, 204, 255));
		button_1.setBounds(596, 394, 174, 61);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Credits");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CreditsFrame credits = new CreditsFrame();
				credits.setVisible(true);
				setVisible(false);
			}
		});
		button_2.setForeground(new Color(255, 255, 51));
		button_2.setFont(new Font("Sitka Display", Font.BOLD, 27));
		button_2.setBackground(new Color(102, 204, 255));
		button_2.setBounds(596, 497, 174, 61);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Exit");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		button_3.setForeground(new Color(255, 255, 51));
		button_3.setFont(new Font("Sitka Display", Font.BOLD, 27));
		button_3.setBackground(new Color(102, 204, 255));
		button_3.setBounds(596, 594, 174, 61);
		getContentPane().add(button_3);
		
		Image img123 = new ImageIcon(this.getClass().getResource("if.png")).getImage();
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HowToPlayFrame howto = new HowToPlayFrame();
				howto.setVisible(true);
				setVisible(false);
			}
		});
		label_1.setBounds(1197, 11, 63, 61);
		label_1.setIcon(new ImageIcon(img123));
		getContentPane().add(label_1);
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1370, 711);
		label.setIcon(new ImageIcon(img12));
		getContentPane().add(label);
	}
}