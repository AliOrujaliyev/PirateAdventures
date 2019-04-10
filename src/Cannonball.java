import java.awt.Image;

public class Cannonball {
	private final int MAX_HEIGHT = 0;
    private final int CANNON_SPEED = 10;
	protected int x;
    protected int y;
    protected int index;
    private SpriteManager spriteManager;
    private Image image;
    
    public Cannonball(int x, int y, int index) {
    		this.x = x;
    		this.y = y;
    		this.index = index;
    		spriteManager = new SpriteManager();
    				//spriteManager.getManager();
        initCannon();
    }
    
    private void initCannon() {
    		if ( index == 1 )
    		{
    			image = spriteManager.loadImage("cannonBall1.png");  
    		}
    		else if ( index == 2 )
    		{
    			image = spriteManager.loadImage("cannonBall2.png"); 
    		}
    		else if ( index == 3 )
    		{
    			image = spriteManager.loadImage("cannonBall.png"); 
    		}
    		else if ( index == 4 )
    		{
    			image = spriteManager.loadImage("cannonBallBoss.png"); 
    		}
    		else if ( index == 5 )
    		{
    			image = spriteManager.loadImage("cannonExplosion1.png");
    		}
    		else if ( index == 6 )
    		{
    			image = spriteManager.loadImage("cannonExplosion2.png");
    		}
    		else if ( index == 7 )
    		{
    			image = spriteManager.loadImage("cannonExplosion3.png");
    		}
        spriteManager.getImageDimensions();
    }
    
    public Image getImage() {
		return image;
	}
    
    public void setImage( Image image) {
		this.image = image;
	}

    public void setIndex( int index) {
		this.index = index;
	}
    
    public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
    
    public void move() {
        
    		y = y - CANNON_SPEED;
        
        if (y < MAX_HEIGHT) {
            spriteManager.setVisible(false);
            // destroy cannonball ?
        }
    }
    
    public void moveEnemy() {
        
		y = y + CANNON_SPEED;
    
    if (y > 640 ) {
        spriteManager.setVisible(false);
        // destroy cannonball ?
    }
}
    
    public boolean isVisible() {
    		return spriteManager.isVisible();
    }
}
