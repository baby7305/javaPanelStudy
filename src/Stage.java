import java.awt.*;

/**
 * Created by Administrator on 2018/1/4.
 */
public class Stage {
	private Rectangle platform;

	public Stage() {
		platform = new Rectangle(0, 540, 800, 60);
	}

	public void draw(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(platform.x, platform.y, platform.width, platform.height);
	}

	public boolean isTouch(Rectangle entity){
		return platform.intersects(entity);
	}
}
