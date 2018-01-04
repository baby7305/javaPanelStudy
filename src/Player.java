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
		this.setW(16);
		this.setH(16);
		hitbox = new Rectangle(x, y, w, h);
	}

	@Override
	public void draw(Graphics graphics) {
		super.draw(graphics);
		move();
		if (!instance.getStage().isTouch(hitbox)) {
			yd = 1;
		} else {
			yd = 0;
		}
		graphics.setColor(Color.ORANGE);
		graphics.fillOval(x, y, w, h);
	}

	private void move() {
		hitbox.x += xd;
		hitbox.y += yd;
		x += xd;
		y += yd;
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
