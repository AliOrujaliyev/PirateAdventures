import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Settings {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings window = new Settings();
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
	public Settings() {
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
		
		JLabel txtpnChickenInvadersBut = new JLabel();
		txtpnChickenInvadersBut.setBackground(new Color(204, 255, 255));
		txtpnChickenInvadersBut.setFont(new Font("Sitka Display", Font.BOLD, 27));
		txtpnChickenInvadersBut.setText("Settings");
		txtpnChickenInvadersBut.setBounds(251, 32, 149, 39);
		panel.add(txtpnChickenInvadersBut);
		
		
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
		btnNewButton_4.setBounds(0, 0, 26, 22);
		panel.add(btnNewButton_4);
		
		JLabel txtpnMusic = new JLabel();
		txtpnMusic.setBackground(new Color(204, 255, 255));
		txtpnMusic.setText("Music");
		txtpnMusic.setFont(new Font("Sitka Display", Font.BOLD, 20));
		txtpnMusic.setBounds(261, 82, 67, 39);
		panel.add(txtpnMusic);
		
		JLabel txtrSound = new JLabel();
		txtrSound.setBackground(new Color(204, 255, 255));
		txtrSound.setFont(new Font("Sitka Display", Font.BOLD, 20));
		txtrSound.setText("Sound");
		txtrSound.setBounds(261, 169, 67, 22);
		panel.add(txtrSound);
		Image img2 = new ImageIcon(this.getClass().getResource("/off.png")).getImage();
		Image img1 = new ImageIcon(this.getClass().getResource("/on.png")).getImage();
		
		JSlider slider = new JSlider();
		slider.setForeground(new Color(153, 0, 255));
		slider.setBackground(new Color(204, 255, 255));
		slider.setBounds(211, 132, 200, 26);
		panel.add(slider);
		
		
		JSlider slider_1 = new JSlider();
		slider_1.setForeground(new Color(204, 0, 255));
		slider_1.setBackground(new Color(204, 255, 255));
		slider_1.setBounds(211, 202, 200, 26);
		panel.add(slider_1);
		
		JLabel txtpnBackground = new JLabel();
		txtpnBackground.setFont(new Font("Sitka Display", Font.BOLD, 25));
		txtpnBackground.setBackground(new Color(204, 255, 255));
		txtpnBackground.setText("Background");
		txtpnBackground.setBounds(251, 226, 134, 39);
		panel.add(txtpnBackground);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/sea1.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img3));
		lblNewLabel_2.setBounds(75, 291, 112, 106);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/sea2.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img4));
		lblNewLabel_3.setBounds(261, 291, 112, 106);
		panel.add(lblNewLabel_3);
		
		JLabel label = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/sea4.png")).getImage();
		label.setIcon(new ImageIcon(img5));
		label.setBounds(451, 291, 119, 106);
		panel.add(label);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBounds(75, 404, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(264, 404, 109, 23);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(451, 404, 109, 23);
		panel.add(radioButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("ON/OFF");
		chckbxNewCheckBox.setFont(new Font("Sitka Text", Font.BOLD, 11));
		chckbxNewCheckBox.setBounds(334, 92, 97, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxOnoff = new JCheckBox("ON/OFF");
		chckbxOnoff.setFont(new Font("Sitka Text", Font.BOLD, 11));
		chckbxOnoff.setBounds(334, 175, 97, 23);
		panel.add(chckbxOnoff);
	}

	public void setVisible(boolean b) {

			frame.setVisible(b);
		
	}
}
