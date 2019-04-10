import java.awt.Image;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javafx.util.Pair;

public abstract class CollisionManager {
	
	protected ArrayList<Cannonball> cannonballs;
	protected ArrayList<Cannonball> enemyCannonballs;
	protected ArrayList<Creep> enemyShips;
	protected MainShipModel mainShip; 
	private SpriteManager sm;
	
	private Image bonus0;
	private Image bonus1;
	private Image bonus2;
	private Image bonus3;
	private Image bonus4;
	private Image bonus5;
	private Image bonus6;
	
	private Image image;
	private Image image2;
	private Image image3;
	
	private Image imageEnemy1;
	private Image image2Enemy1;
	private Image image3Enemy1;
	
	private Image imageEnemy2;
	private Image image2Enemy2;
	private Image image3Enemy2;
	
	private Image imageBoss1;
	private Image image2Boss2;
	private Image image3Boss3;
	
	private Image imageMain;
	private Image imageMain2;
	private Image imageMain3;
	
	private Image anim1;
	
	
	public CollisionManager() {
		
		cannonballs = new ArrayList<Cannonball>();
		enemyCannonballs = new ArrayList<Cannonball>();
		enemyShips = new ArrayList<Creep>();
		mainShip = new MainShipModel(0,0);
		sm = new SpriteManager();
		
		bonus0 = sm.loadImage("pup6.png");
		bonus1 = sm.loadImage("pup0.png");
		bonus2 = sm.loadImage("health.png");
		bonus3 = sm.loadImage("pup3.png");
		bonus4 = sm.loadImage("pup4.png");
		bonus5 = sm.loadImage("pup5.png");
		bonus6 = sm.loadImage("boost.png");
		
		image = sm.loadImage("shipEnemy02.png");
		image2 = sm.loadImage("shipEnemy03.png");
		image3 = sm.loadImage("shipEnemy4.png");
		
		imageEnemy1 = sm.loadImage("shipEnemy12.png");
		image2Enemy1 = sm.loadImage("shipEnemy13.png");
		image3Enemy1 = sm.loadImage("shipEnemy14.png");
		
		imageEnemy2 = sm.loadImage("shipEnemy21.png");
		image2Enemy2 = sm.loadImage("shipEnemy22.png");
		image3Enemy2 = sm.loadImage("shipEnemy23.png");
		
		imageBoss1 = sm.loadImage("shipBoss11.png");
		image2Boss2 = sm.loadImage("shipBoss12.png");
		image3Boss3 = sm.loadImage("shipBoss13.png");
		
		imageMain = sm.loadImage("shipMain1.png");
		imageMain2 = sm.loadImage("shipMain2.png");
		imageMain3 = sm.loadImage("shipMain3.png");
		
		anim1 = sm.loadImage("anim1.png");
		
	}
	
	public abstract void instantiateCollideable( );
	
	public void checkCollision() {
		
		// 60 
		// 80
		// 115
		// 230
		
		
		// Cannonball - 10
		// 1 - 6
		// 2 - 8
		// 3 - 13
		
		for( int cannonballIndex = 0; cannonballIndex < cannonballs.size() ; cannonballIndex++) {
			
			Cannonball c = cannonballs.get(cannonballIndex);
			
			for( int i = 0 ; i < enemyShips.size(); i++) {
				
				Creep enemy = enemyShips.get(i);
				
				
				
				if( c.getX() > enemy.getX() && c.getX() < enemy.getX()+enemy.getWidth() &&  Math.abs((c.getY() - enemy.getY() )) < 20) {
					enemy.setHealthPoints(enemy.getHealthPoints() - 1);
					
					enemy.setImage2(anim1);
					startTimer( 80, new Runnable() {

	                    @Override
	                    public void run() {
	                        enemy.setImage2(null);
	                    } });
					
					
					switch ( enemy.getHealthPoints() ) {
					case 2: 
							switch ( enemy.getIndex() )
							{
									case 1:enemy.setImage(image);
											break;
									case 2:enemy.setImage(imageEnemy1);
											break;
									case 3:enemy.setImage(imageEnemy2);
											break;
									case 4:enemy.setImage(imageBoss1);
											break;
							}
							break;
							
					case 1: 	
						switch ( enemy.getIndex() )
						{
								case 1:enemy.setImage(image2);
										break;
								case 2:enemy.setImage(image2Enemy1);
										break;
								case 3:enemy.setImage(image2Enemy2);
										break;
								case 4:enemy.setImage(image2Boss2);
										break;	
						}
						break;
						
					case 0: 
						switch ( enemy.getIndex() )
						{
							case 1:enemy.setImage(image3);
									break;
							case 2:enemy.setImage(image3Enemy1);
									break;
							case 3:enemy.setImage(image3Enemy2);
									break;
							case 4:enemy.setImage(image3Boss3);
									break;
						}
						int x = i;
						startTimer( 50, new Runnable() {

		                    @Override
		                    public void run() { 
		    						enemyShips.remove(x);
		    						ScoreManager.addKilledEnemyScore();
		    						//SoundManager.playSound("explosion");
		    						if(Math.random() > 0.5) {
		    							PowerUp pw = new PowerUp(c.getX(),c.getY());
		    							int x = pw.getType();
		    							switch ( x )
		    							{
		    								
		    								case 0:	pw.setImage(bonus0);
										break;
										
				    						case 1:pw.setImage(bonus1);
												break;
										case 3:pw.setImage(bonus3);
												break;
										case 4:pw.setImage(bonus6);
												break;
										case 6:pw.setImage(bonus4);
												break;
										case 7:pw.setImage(bonus2);
												break;
		    							}
		    							PowerUpManager.addPowerUp(pw);
		    						}
		                    }});
						break;
					}
				    
					
					
				    
					
					i--;
					
					if(!mainShip.hasPiercing()) {
						cannonballs.remove(cannonballIndex);
						cannonballIndex--;
						break;
					}
				
				}
			}
		}
		
		
		//Collision between enemycannonballs and player
		for( int i = 0; i < enemyCannonballs.size(); i++) {
			
			Cannonball c = enemyCannonballs.get(i);
			
			
			
			if( c.getX() > mainShip.getX()-10 && c.getX() < mainShip.getX() + 113 && Math.abs(c.getY() - mainShip.getY())<20) {
			
				mainShip.setShipImage2(anim1);
				startTimer( 40, new Runnable() {

	                @Override
	                public void run() {
	                    mainShip.setShipImage2(null);
	                } });
				
				switch ( mainShip.getHp() ) {
				case 3: mainShip.setShipImage(imageMain);
						break;
				case 1: mainShip.setShipImage(imageMain2);
				break;
				case 0: mainShip.setShipImage(imageMain3);
				break;
		
				}
				
				
				enemyCannonballs.remove(i);
				i--;
				
				mainShip.getHurt(1);
				
				if(mainShip.getHp() <= 0 ) 
					System.out.println("You lost");
			}
			
		}
		
	for(int i = 0 ; i < PowerUpManager.powerups.size(); i++) {
			
			PowerUp p = PowerUpManager.powerups.get(i);
			
			if( p.getX() > mainShip.getX()-5 && p.getX() < mainShip.getX() + 113 && Math.abs(p.getY() - mainShip.getY())<26) {
				
				mainShip.getPowerUp( p.getType() );
				//SoundManager.playSound("pickup");
				
				PowerUpManager.removePowerUp(i);
				i--;
			}
		}
		
	}
	void startTimer(int delaySeconds, Runnable function) {
        Executors.newSingleThreadScheduledExecutor().schedule(
          function,
          delaySeconds,
          TimeUnit.MILLISECONDS);
	}
	
	
}
