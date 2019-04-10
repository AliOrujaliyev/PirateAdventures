import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class won {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					won window = new won();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public won() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 480);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(0, 0, 624, 441);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel txtpnCongratulations = new JLabel();
		txtpnCongratulations.setBackground(new Color(204, 255, 255));
		txtpnCongratulations.setFont(new Font("Sitka Text", Font.BOLD, 25));
		txtpnCongratulations.setText("CONGRATULATIONS!!!");
		txtpnCongratulations.setBounds(133, 64, 283, 56);
		panel.add(txtpnCongratulations);
		
		JLabel lblYouLose = new JLabel("YOU WON");
		lblYouLose.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblYouLose.setBackground(new Color(204, 255, 255));
		lblYouLose.setBounds(189, 112, 157, 47);
		panel.add(lblYouLose);
		
		JLabel txtpnScore = new JLabel();
		txtpnScore.setBackground(new Color(204, 255, 204));
		txtpnScore.setFont(new Font("Sitka Text", Font.BOLD, 18));
		txtpnScore.setText("Score:");
		txtpnScore.setBounds(208, 189, 139, 29);
		panel.add(txtpnScore);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainSprite restart = new MainSprite();
				restart.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnRestart.setBounds(208, 278, 100, 23);
		panel.add(btnRestart);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Frame1 frmMainMenu = new Frame1();
				frmMainMenu.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnMainMenu.setBounds(208, 337, 100, 23);
		panel.add(btnMainMenu);
		
	}

}
