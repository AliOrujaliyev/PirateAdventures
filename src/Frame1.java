import java.awt.EventQueue;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.SystemColor;

public class Frame1 {

	private JFrame frmMainMenu;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmMainMenu.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainMenu = new JFrame();
		frmMainMenu.setTitle("main menu");
		frmMainMenu.setBounds(100, 100, 640, 480);
		frmMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainMenu.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(0, 0, 624, 441);
		frmMainMenu.getContentPane().add(panel);
		
		panel.setLayout(null);
		frmMainMenu.setResizable(true);
		Image image1 = new ImageIcon(this.getClass().getResource("/sh2.png")).getImage();
	
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainSprite set = new MainSprite();
				frmMainMenu.setVisible(false);
				set.setVisible(true);
			}
		});
		
		Image img = new ImageIcon(this.getClass().getResource("/qs1.png")).getImage();
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setForeground(new Color(204, 255, 255));
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Howto frameHowtoPlay = new Howto();
				frmMainMenu.setVisible(false);
				frameHowtoPlay.setVisible(true);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(img));
		
				btnNewButton_4.setBackground(new Color(204, 255, 255));
				btnNewButton_4.setBounds(590, 11, 24, 23);
				panel.add(btnNewButton_4);
		btnNewButton.setBounds(238, 155, 112, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Settings");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Settings set = new Settings();
				frmMainMenu.setVisible(false);
				set.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(238, 195, 112, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("High Scores");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Highsc hs = new Highsc();
				frmMainMenu.setVisible(false);
				hs.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(238, 241, 112, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Credits");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Credits credits = new Credits();
				frmMainMenu.setVisible(false);
				credits.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(238, 279, 112, 23);
		panel.add(btnNewButton_3);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				frmMainMenu.setVisible(false);
			}
		});
		btnExit.setBounds(238, 326, 112, 23);
		panel.add(btnExit);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(204, 255, 255));
		Image images = new ImageIcon(this.getClass().getResource("/prt.png")).getImage();
		label.setIcon(new ImageIcon(images));
		label.setBounds(238, 36, 97, 108);
		panel.add(label);
		
		JLabel lblChickenInvadersBut = new JLabel("Chicken Invaders, but Pirates");
		lblChickenInvadersBut.setFont(new Font("Sitka Display", Font.BOLD, 28));
		lblChickenInvadersBut.setBackground(new Color(204, 255, 255));
		lblChickenInvadersBut.setBounds(116, 11, 376, 30);
		panel.add(lblChickenInvadersBut);

		
		
		//JLabel lblNewLabel = new JLabel("New label");
		//lblNewLabel.setIcon(new ImageIcon(image1));
		//lblNewLabel.setBounds(0, 0, 624, 441);
		//panel.add(lblNewLabel);
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frmMainMenu.setVisible(b);
	}
}