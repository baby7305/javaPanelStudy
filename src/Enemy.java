import java.awt.*;

/**
 * Created by Administrator on 2018/1/5.
 */
public class Enemy extends Entity {
	private Rectangle hitbox;
	private boolean dead;
	private int ix;
	private int iy;

	public boolean isDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	private Main instance;


	public Rectangle getHitbox() {
		return hitbox;
	}

	public void setHitbox(Rectangle hitbox) {
		this.hitbox = hitbox;
	}

	public Enemy(Main instance, int x, int y) {
		super(x, y);
		this.instance = instance;
		hitbox = new Rectangle(x, y, 32, 32);
		ix = 0;
		iy = 1;
		dead = false;
	}

	public void draw(Graphics graphics) {
		move();
		graphics.setColor(Color.CYAN);
		graphics.fillRect(hitbox.x, hitbox.y, hitbox.width, hitbox.height);
	}

	private void move() {
		if (instance.getStage().isTouch(hitbox)) {
			iy = 0;
			dead = true;
		}
		hitbox.x += ix;
		hitbox.y += iy;

	}
}
