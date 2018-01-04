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
		graphics.fillOval(this.getX(),this.getY(),this.getW(),this.getH());
	}

	private void move(){

	}
}
