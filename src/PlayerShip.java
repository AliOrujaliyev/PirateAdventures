import java.awt.Color;
import java.awt.Graphics;

public class PlayerShip extends GameObject {

	public PlayerShip(float playerX, float playerY) {
		 
		setX(playerX);
		setY(playerY);
		
	}

	@Override
	void draw(Graphics g) {
		
		g.setColor(Color.black);
		g.drawRect((int) getX(), (int) getY(), 32, 32);
		
	}

}
