import java.awt.Image;

import javax.swing.ImageIcon;

public class SpriteManager {
	protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image image;
    //private static SpriteManager spriteManager = new SpriteManager();

    public SpriteManager() {
//    		if ( spriteManager == null ) {
//			spriteManager = new SpriteManager();
//		}
//    		else {
//    			getManager();
//    		}
    		//spriteManager = new SpriteManager();
        //this.x = x;
        // this.y = y;
        visible = true;
    }
    
    /*public static SpriteManager getManager() {
    		return spriteManager;
    }*/

    protected Image loadImage(String file) {

        ImageIcon icon = new ImageIcon(file);
        image = icon.getImage();
        return image;
    }
    
    protected void getImageDimensions() {

        width = image.getWidth(null);
        height = image.getHeight(null);
    }    

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void setX( int x ) {
    		this.x = x;
    }
    public void setY( int y ) {
    		this.y = y;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(Boolean isVisible) {
        visible = isVisible;
    }
}
