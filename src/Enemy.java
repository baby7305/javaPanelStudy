import java.awt.*;

/**
 * Created by Administrator on 2018/1/5.
 */
public class Enemy extends Entity {
	private Rectangle hitbox;
	private boolean dead;
	private int ix;
	private int iy;
	private Main instance;


	public Enemy(Main instance, int x, int y) {
		super(x, y);
		this.instance = instance;
		hitbox = new Rectangle(x, y, 64, 64);
	}

	public void draw(Graphics graphics) {
		move();
		graphics.setColor(Color.CYAN);
		graphics.fillRect(hitbox.x, hitbox.y, hitbox.width, hitbox.height);
	}

	private void move() {

	}
}
