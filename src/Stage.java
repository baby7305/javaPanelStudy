import java.awt.*;

/**
 * Created by Administrator on 2018/1/4.
 */
public class Stage {
	private Rectangle platform = new Rectangle(0, 540, 800, 20);

	public Stage() {

	}

	public void draw(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 540, 800, 20);
//		graphics.fillRect(platform.x, platform.y, platform.width, platform.height);
	}
}
