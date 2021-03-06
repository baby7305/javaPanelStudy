import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2018/1/5.
 */
public class EnemyManager {
	private int amount;
	private List<Enemy> enemies;
	private Main instance;

	public EnemyManager(Main instance, int amount) {
		this.amount = amount;
		enemies = new ArrayList<Enemy>();
		this.instance = instance;
		spawn();
	}

	public void draw(Graphics graphics) {
		update();
		for (Enemy enemy : enemies) {
			enemy.draw(graphics);
		}

	}

	private void spawn() {
		Random random = new Random();
		int ss = enemies.size();
		if (ss < 20) {
			for (int i = 0; i < amount - ss; i++) {
				enemies.add(new Enemy(instance, random.nextInt(778), random.nextInt(100)));
			}
		} else if (ss > 20) {
			for (int i = 0; i < amount - ss; i++) {
				enemies.remove(i);
			}
		}
	}

	private void update() {
		boolean remove = false;
		for (int i = 0; i < enemies.size(); i++) {
			if (enemies.get(i).isDead()) {
				enemies.remove(i);
				remove = true;
			}
		}

		if (remove) {
			spawn();
		}

	}

	public boolean isColliding(Rectangle hitbox) {
		boolean c = false;
		for (int i = 0; i < enemies.size(); i++) {
			if (hitbox.intersects(enemies.get(i).getHitbox())) {
				c = true;
			}
		}
		return c;

	}
}
