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
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Howto {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Howto window = new Howto();
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
	public Howto() {
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
		
		JLabel txtpnHowToPlay = new JLabel();
		txtpnHowToPlay.setBackground(new Color(204, 255, 255));
		txtpnHowToPlay.setFont(new Font("Sitka Display", Font.BOLD, 24));
		txtpnHowToPlay.setText("How To Play");
		txtpnHowToPlay.setBounds(206, 11, 209, 48);
		panel.add(txtpnHowToPlay);
		
		
		Image img = new ImageIcon(this.getClass().getResource("/bck1.png")).getImage();
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Frame1 frmMainMenu = new Frame1();
				frmMainMenu.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(img));

		btnNewButton_4.setBackground(new Color(204, 255, 255));
		btnNewButton_4.setBounds(0, 0, 27, 23);
		panel.add(btnNewButton_4);
		
		JLabel label_1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/Capture.JPG")).getImage();
		label_1.setIcon(new ImageIcon(img1));
		label_1.setBounds(113, 65, 368, 355);
		panel.add(label_1);
		

		

	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}

}
