import java.awt.Graphics;
import java.util.ArrayList;

public class PowerUpManager {
	
	public static ArrayList<PowerUp> powerups;
	
	public PowerUpManager() {
		
		powerups = new ArrayList<PowerUp>();
		
	}
	
	public static void addPowerUp( PowerUp p ) {
		powerups.add(p);
	}
	
	public static void removePowerUp( PowerUp p) {
		powerups.remove(p);
	}
	
	public static void removePowerUp( int i) {
		powerups.remove(i);
	}
	
	public static void drawAll(Graphics g) {
		/*for( PowerUp p : powerups ) {
			p.draw(g);
		}*/
	}
	
	public static void tickAll() {
		for( PowerUp p : powerups ) {
			p.setY(p.getY() + 3);
		}
	}
}
