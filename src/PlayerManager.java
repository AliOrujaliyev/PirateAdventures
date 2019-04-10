import java.awt.Graphics;

public class PlayerManager {
	
	private int playerX, playerY;
	private PlayerShip player;
	int lives;
	BulletManager bulletManager;
	
	public PlayerManager(BulletManager bulletManager) {
		playerX = 300;
		playerY = 400;
		player = new PlayerShip(playerX, playerY);
		this.bulletManager = bulletManager;
	}
	
	public void tick() {
		player.setX(playerX);
		player.setY(playerY);
	}
	
	public void render(Graphics g) {
		player.draw(g);
	}
	
	public void shoot() {
		bulletManager.addBullet(playerX, playerY, 0);
	}

}
