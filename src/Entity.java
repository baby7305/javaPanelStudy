import java.awt.*;

/**
 * Created by Administrator on 2018/1/4.
 */
public abstract class Entity {
	protected int x;
	protected int y;
	protected int w;
	protected int h;
	protected boolean removed = false;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public boolean isRemoved() {
		return removed;
	}

	public void setRemoved(boolean removed) {
		this.removed = removed;
	}


	public Entity(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics graphics) {

	}
}
