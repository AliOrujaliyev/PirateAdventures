import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;

//import SoundManager;



public class MainShipModel{
	
	private ArrayList<Cannonball> cannons;
	private int dx;
	private int dy;
	private SpriteManager sm;
	private Image image;
	private Image image2;
	private int hp = 10;
	
	protected boolean isActiveGodMode;
	protected boolean hasPiercingPowerUp;
	protected int fireRate = 150; // higher FR means slower shots
	protected int movementSpeed = 10;
	protected int numberOfCannons = 1;
	private enum fireState { IDLE, RELOADING, FINISHED };

	
	fireState state;
	
	
	
	public MainShipModel(int x, int y)
	{
		state = fireState.IDLE;
		hasPiercingPowerUp = false;
		isActiveGodMode = false;
		
		sm = new SpriteManager();
				//sm.getManager();
		sm.setX(x);
		sm.setY(y);
		initCraft();
	}
	
	private void initCraft() {
		cannons = new ArrayList<Cannonball>();
		//ImageIcon ii = new ImageIcon("src/ship.png");
		//image = ii.getImage();
		image = sm.loadImage("ship (1).png");
		sm.getImageDimensions();
		//x = 40;
		//y = 60;
	}
	
	public Image getShipImage() {
		return image;
	}
	
	public Image getShipImage2() {
		return image2;
	}
	
	public void setShipImage(Image image) {
		this.image = image;
	}
	
	public void setShipImage2(Image image) {
		this.image2 = image;
	}
	
	public int getX() {
		return sm.getX();
	}
	
	public int getY() {
		return sm.getY();
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void move() {
		if ( sm.getX() < 0 )
		{
			dx = 0;
			sm.setX(sm.getX() + 1);
		}
		if ( sm.getX() > 1180)
		{
			dx = 0;
			sm.setX(sm.getX() - 1);
		}
		if ( sm.getY() > 640 )
		{
			dy = 0;
			sm.setY(sm.getY() - 1);
		}
		
		sm.setX(sm.getX() + dx);
		sm.setY(sm.getY() + dy);
    }
	
	public ArrayList<Cannonball> getCannons() {
		return cannons;
	}

	public void fire() {
		
		
		if(state == fireState.IDLE) {
			
			for(int i = 0 ; i < numberOfCannons; i++) {
				cannons.add(new Cannonball(13*i + (int) (Math.random()*3) + sm.getX() + sm.width / 2,  + (int)(  4*Math.random() ) + sm.getY() + sm.height / 2, 3 ) );
				
			}
			//SoundManager.playSound("hit");
			
			state = fireState.RELOADING;
			
			startTimer( fireRate, new Runnable() {

				@Override
				public void run() {
					state = fireState.IDLE;
					
				} } );
		}
	}	
		
		public void getHurt( int dmg ) {
			
			if( isActiveGodMode ) {
			
				System.out.println("God mode saved you");
				return;
			}
			else
				hp -= dmg;
			
		
		
		}
	

		public void getPowerUp(int type) {
			
			// God mode PU
			if(type == 0) {
				
				isActiveGodMode = true;
				startTimer( 5000, new Runnable() {

					@Override
					public void run() {
						isActiveGodMode = false;
					} });
			}
			// FASTERSHOOTING PU
			else if(type == 1) {
				
				fireRate = 75;
				startTimer( 5000, new Runnable() {

					@Override 
					public void run() {
						fireRate = 150;						
					}});
			}
			// PIERCING SHOT PU
			/*else if(type == 2) { 
				
				hasPiercingPowerUp = true;
				
				startTimer( 5000, new Runnable() {

					@Override
					public void run() {
						
						hasPiercingPowerUp = false;
						
					}} );
			}*/
			// DOUBLESCORE PER KILL PU
			else if(type == 3) {
				
				ScoreManager.setBonusScore(20);
				
				startTimer( 10000, new Runnable() { 
					@Override
					public void run() {
						ScoreManager.setBonusScore(10);
					}} );
			}
			// INCREASED MS PU
			else if( type == 4 ) {
				
				movementSpeed = 10;
				
				startTimer( 5000, new Runnable() {

					@Override
					public void run() {
						
						movementSpeed = 15;
					} } );
			}
			// RANDOMIZEEER
			else if( type == 6 ) {
				
				this.numberOfCannons = (int) (Math.random() * 2) + 1;
				System.out.println(numberOfCannons);
			}
			// med kit
			else if ( type == 7 )
			{
				setHp(10);
				if ( hp > 5 )
				{
					image = sm.loadImage("ship (1).png");
				}
			}
			
		}

		void startTimer(int dealyMillisecs, Runnable function) {
			  Executors.newSingleThreadScheduledExecutor().schedule(
			    function,
			    dealyMillisecs,
			    TimeUnit.MILLISECONDS);
		}

		public boolean hasPiercing() {
			return hasPiercingPowerUp;
		}
		
		
	
	public void keyPressed(KeyEvent e) {

	        int key = e.getKeyCode(); 
	       
	        if ( key == KeyEvent.VK_SPACE) {
    			fire();
        }
	        
	        if (key == KeyEvent.VK_LEFT) {
	            dx = -8;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	            dx = 8;
	        }

	        if (key == KeyEvent.VK_UP) {
	            dy = -6;
	        }

	        if (key == KeyEvent.VK_DOWN) {
	            dy = 6;
	        }
	    }

	    public void keyReleased(KeyEvent e) {
	        
	        int key = e.getKeyCode();

	       
	        if (key == KeyEvent.VK_LEFT) {
	        		dx = -3;
	        		dx = -2;
	        		dx = -1;
	        		dx = -0;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
		        	dx = 3;
	        		dx = 2;
	        		dx = 1;
	        		dx = 0;
	        }

	        if (key == KeyEvent.VK_UP) {
		        	dy = -3;
	        		dy = -2;
	        		dy = -1;
	        		dy = 0;
	        }

	        if (key == KeyEvent.VK_DOWN) {
		        	dy = 3;
	        		dy = 2;
	        		dy = 1;
	        		dy = 0;
	        }
	    }

	

	
}
