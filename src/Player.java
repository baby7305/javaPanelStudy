import java.awt.*;

/**
 * Created by Administrator on 2018/1/4.
 */
public class Player extends Entity {
	private int xd;
	private int yd;
	private Main instance;
	private Rectangle hitbox;
	private int life = 3;

	public Player(Main instance, int x, int y) {
		super(x, y);
		this.instance = instance;
		hitbox = new Rectangle(x, y, 16, 16);
		xd = 0;
		yd = 1;
	}

	@Override
	public void draw(Graphics graphics) {
		super.draw(graphics);
		move();
		graphics.setColor(Color.ORANGE);
		graphics.fillOval(hitbox.x, hitbox.y, hitbox.width, hitbox.height);
		graphics.setColor(Color.WHITE);
		graphics.drawString("Life/lives:" + life, 20, 20);
	}

	private void move() {
		if (!instance.getStage().isTouch(hitbox)) {
			yd = 1;
		} else {
			yd = 0;
		}
		hitbox.x += xd;
		hitbox.y += yd;
		if (instance.getEnemyManager().isColliding(hitbox)) {
			if (life > 0) {
				life--;
				hitbox.x = 800 / 2 - w / 2;
				y = 400;
			} else {
				instance.setGameOver(true);
			}
		}
	}

	public int getXd() {
		return xd;
	}

	public void setXd(int xd) {
		this.xd = xd;
	}

	public int getYd() {
		return yd;
	}

	public void setYd(int yd) {
		this.yd = yd;
	}
}
