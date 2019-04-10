import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.Timer;
import javax.swing.JPanel;

public class ScreenManager extends JPanel implements ActionListener{
	
	public MainShipModel mainship;
	//private WaveManager wave;
	private ArrayList<LevelManager> levels;
	//private LevelManager level;
	private SpriteManager sprite;
	private Timer timer;
    private int DELAY = 30;
    private final int X = 600;
    private final int Y = 600;
    private Image imageCannon;
    private Image enemyCannon;
    private PowerUpManager pm;
    private boolean bossLevel = false;
    public boolean running = true;
    public ScoreManager score;
    private  CollisionManager collisionManager;
    
    private PowerUpManager pw;
    private int cannonNumber;
    Image anim1;
	Image anim2;
	Image anim3;
    
	
	
    //int size;
    private ArrayList<Integer> count = new ArrayList<Integer>();
    int counter = 4;
    int waveCounter = 3;
    
    
	
	public ScreenManager() {
		
		initScreen();
		 
		collisionManager = new CollisionManager() {
		
            @Override
            public void instantiateCollideable() {
                
                cannonballs = mainship.getCannons();
                enemyShips = levels.get(0).wave.get(0).getCreeps();
                enemyCannonballs = levels.get(0).wave.get(0).getCannons();
                mainShip = mainship;
            }
    
        };
        
        collisionManager.instantiateCollideable();
	    }
	
	private void startTimer(int delaySeconds, Runnable function) {
        Executors.newSingleThreadScheduledExecutor().schedule(
          function,
          delaySeconds,
          TimeUnit.MILLISECONDS);
	}
	
	private void initScreen() {
		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.CYAN);
		setDoubleBuffered(true);
		
		
		pm = new PowerUpManager();
		sprite = new SpriteManager();
				//sprite.getManager();
		mainship = new MainShipModel(X,Y);
		levels = new ArrayList<LevelManager>();
		pw = new PowerUpManager();
		score = new ScoreManager();
		
		
		
		
		
		//level = new LevelManager();
		//wave = new WaveManager();
		imageCannon = sprite.loadImage("cannonLoose1.png");
		enemyCannon = sprite.loadImage("cannonBall1.png");
		
		anim1 = sprite.loadImage("cannonExplosion1.png");
		anim2 = sprite.loadImage("cannonExplosion2.png");
		anim3 = sprite.loadImage("cannonExplosion3.png");
		sprite.getImageDimensions();
		
		cannonNumber = mainship.numberOfCannons;
		
		for ( int i = 10; i < 20; i++ )
		{
			addLevel(i);
			counter = counter / 2;
		}
		
		
		//level.addWave(8);
		//level.addWave(3);
		
		
        timer = new Timer(DELAY, this);
        timer.start(); 
        
	}
//	




/// to use it

	public void setDelay(int delay) {
		this.DELAY = delay;
	}
	
	
	private void addLevel(int number) {
		LevelManager newLevel = new LevelManager();
		levels.add(newLevel);
		int number1 = number / 2 + counter;
		int number2 = number - number1 + counter / 2;
		int number3 = number2 * 4 / 10;
		
		for ( int i = 0; i < waveCounter; i++)
		{
			 newLevel.addWave(number1, number2, number3);
		}
		if ( number == 10 )
		{
			newLevel.addBossWave();
		}
		counter++;;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		doDrawing(g);
		
		PowerUpManager.drawAll(g); 
		g.drawString("" + ScoreManager.getScore(), 1210, 38);
		g.drawString("" + mainship.getHp(), 1210, 88);
		g.drawString("Current PowerUps:", 800, 20);
		int drawingCounter = 40;
		if(mainship.isActiveGodMode) {
			g.drawString("God Mode", 800, drawingCounter+=20);
		}
		if(mainship.hasPiercingPowerUp) {
			g.drawString("Piercing Balls", 800, drawingCounter+=20);
		}
		if(mainship.fireRate == 75){
			g.drawString("Shoot FASTER!", 800, drawingCounter+=20);
		}
		if(mainship.movementSpeed > 10) {
			g.drawString("Quicker Tides", 800, drawingCounter+=20);
		}
		if(ScoreManager.bonusScorePerKill == 20 ) {
			g.drawString("Double Points", 800, drawingCounter+=20);
		}
		if(mainship.numberOfCannons > 1) {
			g.drawString("Cannon Randomizer", 800, drawingCounter+=20);
		}
		
		
		Toolkit.getDefaultToolkit().sync();
	}
	
	
	
	private void doDrawing(Graphics g) {
		if ( levels.get(0).wave.size() != 0 )
		{
			ArrayList<PowerUp> pwlist = pw.powerups;
			
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawImage(mainship.getShipImage(), mainship.getX(), mainship.getY(), this);
			for ( int i = 0; i < cannonNumber; i++)
			{
				g2d.drawImage(imageCannon, mainship.getX() + 58 + i * 20, mainship.getY() - 5 + i * 7 , this);
			}
			
			for ( int i = 0; i < pwlist.size(); i++ )
			{
				int x = pwlist.get(i).getType();
				switch ( x )
				{
					
					case 0:	g2d.drawImage(pwlist.get(i).getImage(),(int)pwlist.get(i).getX() - 10, (int)pwlist.get(i).getY() - 5, this );
					break;
				
					case 1:g2d.drawImage(pwlist.get(i).getImage(),(int)pwlist.get(i).getX() - 20, (int)pwlist.get(i).getY() - 8, this );
						break;
					case 3:g2d.drawImage(pwlist.get(i).getImage(),(int)pwlist.get(i).getX() - 80, (int)pwlist.get(i).getY() - 60, this );
						break;
					case 4:g2d.drawImage(pwlist.get(i).getImage(),(int)pwlist.get(i).getX() - 10, (int)pwlist.get(i).getY(), this );
						break;
					case 6:g2d.drawImage(pwlist.get(i).getImage(),(int)pwlist.get(i).getX() - 140, (int)pwlist.get(i).getY() - 40, this );
						break;
					case 7:g2d.drawImage(pwlist.get(i).getImage(),(int)pwlist.get(i).getX() - 10, (int)pwlist.get(i).getY(), this );
						break;
				}
				
			}
			
			
			ArrayList<Cannonball> balls = mainship.getCannons();
			
			ArrayList<Cannonball> balls2 = levels.get(0).wave.get(0).getCannons();
			
			ArrayList<Creep> creeps = levels.get(0).wave.get(0).getCreeps();
			
			for ( Object b1 : balls) {
				Cannonball ball = (Cannonball) b1;
				g2d.drawImage(ball.getImage(), ball.getX(), ball.getY(), this);
			}
			
			for ( Object w1 : creeps) {
				Creep creep = (Creep) w1;
				g2d.drawImage(creep.getImage(), (int)creep.getX(), (int)creep.getY(), this);
				if ( creep.getImage2() != null )
				{
					g2d.drawImage(creep.getImage2(), (int)creep.getX()+30, (int)creep.getY()+30, this);
				}
				if ( mainship.getShipImage2() != null )
				{
					g2d.drawImage(mainship.getShipImage2(), (int)mainship.getX()+40, (int)mainship.getY()-30, this);
				}
				//System.out.println(creep.getX());
			}
			
			for ( Object b2 : balls2) {
				Cannonball ball = (Cannonball) b2;
				g2d.drawImage(ball.getImage(), ball.getX(), ball.getY(), this);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public void updateBehavior() {
		if ( levels.get(0).wave.size() != 0 )
		{
			
			ArrayList<Creep> creeps = levels.get(0).wave.get(0).getCreeps();
			
			
			for ( int i = 0; i < creeps.size(); i++ )
			{
				
				Creep c = creeps.get(i);
				if ( Math.abs(c.getX() - mainship.getX()) < 50 && creeps.get(i).shooted)
				{
					levels.get(0).wave.get(0).fire((int)c.getX() + 40, (int)c.getY(), c.getIndex());
					creeps.get(i).shooted = false;
					int x = i;
					startTimer( 2000, new Runnable() {
		                @Override
		                public void run() {
		                		creeps.get(x).shooted = true;
		                } });
				}
			}
		}
	}
	
	private void updateCannonballs() {

        ArrayList<Cannonball> balls = mainship.getCannons();

        for (int i = 0; i < balls.size(); i++) {

            Cannonball ball = (Cannonball) balls.get(i);

            if (ball.isVisible()) {
                ball.move();
            } 
            else {
                balls.remove(i);
            }
        }
    }
	
	
	public void gameUpdate() {
		
		if ( levels.get(0).wave.size() == 0)
		{
			levels.remove(0);
		}
		
		collisionManager.instantiateCollideable();
			
	}
	

	
	@Override
    public void actionPerformed(ActionEvent e) {
		gameUpdate();
		levels.get(0).levelUpdate();
		
        mainship.move();
        updateBehavior();
        updateCannonballs();
        pm.tickAll();
        if (levels.get(0).wave.size() != 0 )
        {
        		levels.get(0).wave.get(0).tick();
        }
        collisionManager.checkCollision();
        
        repaint();  
    }
    
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            mainship.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            mainship.keyPressed(e);
        }
    }
}
