import java.awt.*;

/**
 * Created by Administrator on 2018/1/5.
 */
public class Enemy extends Entity {
	private Rectangle hitbox;
	private boolean dead;


	public Enemy(int x, int y) {
		super(x, y);
		hitbox = new Rectangle(x, y, 64, 64);
	}

	public void draw(Graphics graphics) {
		move();
		graphics.setColor(Color.CYAN);
		graphics.fillRect(hitbox.x, hitbox.y, hitbox.width, hitbox.height);
	}

	private void move(){

	}
}
