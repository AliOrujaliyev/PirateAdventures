
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

import javafx.scene.text.Text;



public class MainSprite extends JFrame {
	double interpolation = 0;
	final int TICKS_PER_SECOND = 25;
	final int SKIP_TICKS = 1000 / TICKS_PER_SECOND;
	final int MAX_FRAMESKIP = 5;
	private JPanel contentPane;
	private JPanel contentPane2;
	
    public MainSprite() {

    	contentPane = new ScreenManager();
        initUI();
       
 //      this.add(contentPane);
    }
    
    private void initUI() {
    	
        setSize(1400, 750);
        setResizable(true);
        setBackground(Color.BLUE);
      
        setBackground(new Color(51, 153, 204));
	    	getContentPane().setBackground(new Color(204, 255, 255));
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	setBounds(100, 100, 1400, 750);
	    	setLocationRelativeTo(null);
//            
    		
	//	frame.getContentPane().setLayout(null);
		//contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//contentPane.add(new ScreenManager());
//		add(new ScreenManager());
		Image img = new ImageIcon(this.getClass().getResource("back1.png")).getImage();
		Image img12 = new ImageIcon(this.getClass().getResource("sea12.png")).getImage();
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
		
		Image img5 = new ImageIcon(this.getClass().getResource("on1.png")).getImage();
		ImageIcon on1 = new ImageIcon(img5);
		Image img_5 = new ImageIcon(this.getClass().getResource("off1.png")).getImage();
		ImageIcon off1 = new ImageIcon(img_5);
		

		
		JLabel lblPoints = new JLabel("points:");
		lblPoints.setForeground(new Color(255, 255, 0));
		lblPoints.setFont(new Font("Sitka Heading", Font.BOLD, 17));
		
		lblPoints.setBounds(1131, 60, 100, 40);
		contentPane.add(lblPoints);
		
		JLabel lblHealthPoints = new JLabel("Health ");
		lblHealthPoints.setForeground(new Color(255, 255, 0));
		lblHealthPoints.setFont(new Font("Sitka Heading", Font.BOLD, 17));
		lblHealthPoints.setBounds(1131, 44, 100, 40);
		contentPane.add(lblHealthPoints);
		
		JLabel lblScore = new JLabel("Score:");
		lblScore.setForeground(new Color(255, 255, 0));
		lblScore.setFont(new Font("Sitka Heading", Font.BOLD, 18));
		lblScore.setBounds(1131, 12, 100, 40);
		contentPane.add(lblScore);
		btnNewButton_4.setIcon(new ImageIcon(img));
		
				btnNewButton_4.setBackground(new Color(51, 102, 204));
				btnNewButton_4.setBounds(0, 0, 36, 34);
				contentPane.add(btnNewButton_4);
		
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btnNewButton_1.getIcon() == on1)
				{
					btnNewButton_1.setIcon(off1);
				}
				else
					btnNewButton_1.setIcon(on1);
			}
		});
		
		btnNewButton_1.setBackground(new Color(51, 102, 204));
		btnNewButton_1.setBounds(46, 0, 36, 34);
		btnNewButton_1.setIcon(new ImageIcon(img5));
		contentPane.add(btnNewButton_1);
		
		
		
		Image img6 = new ImageIcon(this.getClass().getResource("on2.png")).getImage();
		ImageIcon on2 = new ImageIcon(img6);
		Image img_6 = new ImageIcon(this.getClass().getResource("off2.png")).getImage();
		ImageIcon off2 = new ImageIcon(img_6);
		JButton button = new JButton("");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (button.getIcon() == on2)
				{
					button.setIcon(off2);
				}
				else
					button.setIcon(on2);
			}
		});
		button.setBackground(new Color(51, 102, 204));
		button.setBounds(92, 0, 36, 34);
		button.setIcon(new ImageIcon(img6));
		contentPane.add(button);
		
		
		Image img3 = new ImageIcon(this.getClass().getResource("pause1.png")).getImage();
		ImageIcon p1 = new ImageIcon(img3);
		Image img4 = new ImageIcon(this.getClass().getResource("pause2.png")).getImage();
		ImageIcon p2 = new ImageIcon(img4);
		JButton button_1 = new JButton("");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (button_1.getIcon() == p1)
				{
					button_1.setIcon(p2);
				}
				else
					button_1.setIcon(p1);
			}
		});
		button_1.setBackground(new Color(51, 102, 204));
		button_1.setBounds(134, 0, 42, 34);
		button_1.setIcon(new ImageIcon(img3));
		contentPane.add(button_1);
		
	/*	JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(img12));
		lblNewLabel_2.setBounds(0, 0, 1370, 711);
		contentPane.add(lblNewLabel_2);*/
        
		

	
//        setTitle("Chicken Invaders but Pirates");
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String toString( int x )
    {
    		return "" + x;
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                MainSprite ex = new MainSprite();
                ex.setVisible(true);
            }
        });
    }
   
}