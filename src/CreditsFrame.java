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
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class CreditsFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreditsFrame frame = new CreditsFrame();
					frame.getContentPane().setLayout(null);
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
	public CreditsFrame() {
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
		

		
		JLabel credits = new JLabel();
		credits.setForeground(new Color(255, 255, 51));
		credits.setHorizontalAlignment(SwingConstants.CENTER);
		credits.setBackground(new Color(204, 255, 255));
		credits.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 40));
		credits.setText("Credits");
		credits.setBounds(547, 45, 161, 54);
		contentPane.add(credits);
		

		
		JLabel lblNewLabel = new JLabel("Muhamed Keta");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setBounds(570, 296, 206, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ali Orujaliev");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(570, 349, 206, 69);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAlinaZhumasheva = new JLabel("Alina Zhumasheva");
		lblAlinaZhumasheva.setForeground(new Color(255, 255, 51));
		lblAlinaZhumasheva.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAlinaZhumasheva.setBounds(564, 405, 244, 69);
		contentPane.add(lblAlinaZhumasheva);
		
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
		
				btnNewButton_4.setBackground(new Color(51, 102, 204));
				btnNewButton_4.setBounds(0, 0, 35, 34);
				contentPane.add(btnNewButton_4);
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(img12));
		lblNewLabel_2.setBounds(0, 0, 1370, 711);
		contentPane.add(lblNewLabel_2);
	}
}
