import java.awt.Graphics;
import java.util.ArrayList;

public class BulletManager {

	private ArrayList<Bullet> cannonballs;
	
	public BulletManager() {
		
		cannonballs = new ArrayList<Bullet>();
		
	}
	
	
	public void addBullet(float x, float y, float direction) {
		
		cannonballs.add(new Bullet(x, y));
		
	}
	
	public void tick() {
			
		Bullet b;
		
		for( int i = 0 ; i < cannonballs.size(); i++) {
			
			b = cannonballs.get(i);
			b.tick();
			
			if(Helper.isOutside(b.getX(), b.getY())) {
				cannonballs.remove(i);
				i--;
			}
			
		}
	}
	
	public void render(Graphics g) {
		
		for( Bullet b : cannonballs) {
			
			
			g.clearRect((int) b.getX(), (int) b.getY() + 2, 4, 4);
			b.draw(g);
			
			
		}
	}

}
