import java.awt.Graphics;
import java.awt.Image;


public class Creep extends GameObject{
	
	int healthPoints;
	private Image image;
	private Image image2;
	private int index = 1;
	private int width;
	public boolean shooted = true;
	
	Creep(int hp) {
		healthPoints = hp;
	}
	
	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	
	public void tick() {
		
		setY(getY()+1);
	}
	
	public void setIndex(int index) {
		this.index = index;
		switch ( index )
		{
				case 1: width = 60;
						break;
				case 2: width = 80;
						break;
				case 3: width = 115;
						break;
				case 4: width = 230;
						break;
		}
	}
	
	public int getIndex() {
		return index;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setImage( Image image )
	{
		this.image = image;
	}
	
	public void setImage2( Image image )
	{
		this.image2 = image;
	}
	
	
	
	public Image getImage() {
		return image;
	}
	
	public Image getImage2() {
		return image2;
	}
	
	@Override
	void draw(Graphics g) {
	}

}
