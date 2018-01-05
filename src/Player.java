import java.awt.*;

/**
 * Created by Administrator on 2018/1/4.
 */
public class Player extends Entity {
	private int xd;
	private int yd;
	private Main instance;
	private Rectangle hitbox;

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
	}

	private void move() {
		if (!instance.getStage().isTouch(hitbox)) {
			yd = 1;
		} else {
			yd = 0;
		}
		hitbox.x += xd;
		hitbox.y += yd;
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
