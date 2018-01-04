import java.awt.*;

/**
 * Created by Administrator on 2018/1/4.
 */
public class Player extends Entity {
	private int xd;
	private int yd;

	public Player(int x, int y) {
		super(x, y);
		this.setW(16);
		this.setH(16);
	}

	@Override
	public void draw(Graphics graphics) {
		super.draw(graphics);
		move();
		graphics.setColor(Color.ORANGE);
		graphics.fillOval(x, y, w, h);
	}

	private void move() {
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
