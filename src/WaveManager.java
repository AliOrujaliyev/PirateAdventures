import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class WaveManager {
	
    ArrayList<Creep> creeps;
    private ArrayList<Cannonball> cannons;
    private SpriteManager sm;
    
	Image image1;
	Image image2;
	Image image3;
	Image image4;
	
	Image anim1;
	Image anim2;
	Image anim3;
	
	int count = 5;
	int size = 0;
	int dir = 1;
	
	public WaveManager() {
		
		creeps = new ArrayList<Creep>();
		cannons = new ArrayList<Cannonball>();
		sm = new SpriteManager();
		image1 = sm.loadImage("shipEnemy.png");
		image2 = sm.loadImage("shipEnemy2.png");
		image3 = sm.loadImage("shipEnemy3.png");
		image4 = sm.loadImage("shipBoss.png");
		anim1 = sm.loadImage("cannonExplosion1.png");
		anim2 = sm.loadImage("cannonExplosion2.png");
		anim3 = sm.loadImage("cannonExplosion3.png");
		
	}
	
	public void addCreep(int hp, float x, float y, int index) {
		
		Creep newCreep = new Creep(hp);
		newCreep.setX(x);
		newCreep.setY(y);
		if ( index == 1 )
		{
			newCreep.setImage(image1);
			newCreep.setIndex(index);
		}
		else if ( index == 2 )
		{
			newCreep.setImage(image2);
			newCreep.setIndex(index);
		}
		else if ( index == 3 ) {
			newCreep.setImage(image3);
			newCreep.setIndex(index);
		}
		else if ( index == 4 ) {
			newCreep.setImage(image4);
			newCreep.setIndex(index);
		}
		creeps.add(newCreep);
		size++;
	}
	
	public int getCreepSize() {
		return creeps.size();
	}
	
	public Creep getCreep( int i ) {
		return creeps.get(i);
	}
	
	/*public Image getImage() {
		return image;
	}*/
	
	public ArrayList<Creep> getCreeps() {
		return creeps;
	}
	
	public ArrayList<Cannonball> getCannons() {
		return cannons;
	}
	
	public void fire(int x, int y, int index) {
		cannons.add(new Cannonball(x + sm.width, y + sm.height / 2, index ) );
	}
	
	public void updateCannonballs() {

       ArrayList<Cannonball> balls = getCannons();

        for (int i = 0; i < balls.size(); i++) {

            Cannonball ball = (Cannonball) balls.get(i);

            if (ball.isVisible()) {
                ball.moveEnemy();
            }
            else {
                balls.remove(i);
            }
        }
    }
	

	
	public void tick() {
		
		updateCannonballs();
		
		for(int i = 0 ; i < creeps.size(); i++) {
			
			Creep c = creeps.get(i);
			
			if ( dir == 1 ) {
			    c.setX(c.getX() + 6);
			    //c.setY(c.getY() - 4);
			    if ( c.getX() > 1080 )
			    {
			    		dir = 0;
			    }
			}
			if ( dir == 0 ) {
			    c.setX(c.getX() - 6);
			    //c.setY(c.getY() - 4);
			    if ( c.getX() < 30 )
			    {
			    		dir = 1;
			    }
			}
			
			if(Helper.isOutside(c.getX(), c.getY())) {
				creeps.remove(i);
				i--;
			}
		}
	}


}
