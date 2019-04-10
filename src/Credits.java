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

public class Credits {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credits window = new Credits();
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
	public Credits() {
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
		txtpnHowToPlay.setFont(new Font("Sitka Display", Font.BOLD, 27));
		txtpnHowToPlay.setText("Credits");
		txtpnHowToPlay.setBounds(230, 41, 128, 48);
		panel.add(txtpnHowToPlay);
		
		JLabel label_1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/credits.JPG")).getImage();
		label_1.setIcon(new ImageIcon(img1));
		label_1.setBounds(141, 64, 368, 355);
		panel.add(label_1);
		
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
		btnNewButton_4.setBounds(0, 0, 23, 22);
		panel.add(btnNewButton_4);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
		
	}

}
