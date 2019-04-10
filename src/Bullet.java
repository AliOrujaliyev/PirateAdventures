import java.awt.Graphics;

public class Bullet extends GameObject {
	
	float angle; 
	
	public Bullet(float x, float y) {
		setX(x);
		setY(y);
		
	}
	
	@Override
	void draw(Graphics g) {

		g.drawOval((int) getX(),(int) getY(), 3, 3);

	}

	public void tick() {
		
		setY( getY() - 2 );
		
	}

}
