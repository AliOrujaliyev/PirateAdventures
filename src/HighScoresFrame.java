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
import javax.swing.JTextPane;

public class HighScoresFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HighScoresFrame frame = new HighScoresFrame();
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
	public HighScoresFrame() {
		setBackground(new Color(51, 153, 204));
		getContentPane().setBackground(new Color(204, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 750);
		setLocationRelativeTo(null);
	//	frame.getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnWejrfwlkejtlf = new JTextPane();
		//txtpnWejrfwlkejtlf.setText(getHighScores());
		txtpnWejrfwlkejtlf.setEditable(false);
		txtpnWejrfwlkejtlf.setFont(new Font("Sitka Text", Font.BOLD, 24));
		txtpnWejrfwlkejtlf.setForeground(new Color(255, 255, 0));
		txtpnWejrfwlkejtlf.setBackground(new Color(176, 196, 222));
		txtpnWejrfwlkejtlf.setBounds(570, 188, 287, 330);
		contentPane.add(txtpnWejrfwlkejtlf);
		

		
		JLabel highScores = new JLabel();
		highScores.setForeground(new Color(255, 255, 51));
		highScores.setHorizontalAlignment(SwingConstants.CENTER);
		highScores.setBackground(new Color(204, 255, 255));
		highScores.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 40));
		highScores.setText("High Scores");
		highScores.setBounds(554, 37, 303, 63);
		contentPane.add(highScores);
		
		Image img = new ImageIcon(this.getClass().getResource("/back1.png")).getImage();
		Image img12 = new ImageIcon(this.getClass().getResource("/seaa1.jpg")).getImage();
		JButton btnNewButton_4 = new JButton("");
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
		
				btnNewButton_4.setBackground(new Color(100, 149, 237));
				btnNewButton_4.setBounds(0, 0, 38, 39);
				contentPane.add(btnNewButton_4);
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(img12));
		lblNewLabel_2.setBounds(0, 0, 1370, 711);
		contentPane.add(lblNewLabel_2);
	}

}