import java.awt.Graphics;
import java.awt.Image;

public class PowerUp extends GameObject {
	
	int type;
	private Image image;
	
	public PowerUp(int x, int y) {
		
		setX(x);
		setY(y);
		type = (int) (Math.random() * 8) ; 
		
	}
	
	public Image getImage() {
		return image;
	}
	
	public void setImage ( Image image ) {
		this.image = image;
	}
	
	public int getType() {
		return type;
	}
	@Override
	void draw(Graphics g) {
		
		g.drawRect((int) getX(), (int)getY(), 5, 5);
		g.drawString("" +type, (int)getX(), (int)getY());
		// TODO Auto-generated method stub

	}

}