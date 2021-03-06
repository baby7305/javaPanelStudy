import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JPanel implements KeyListener {
	private Stage stage;
	private Player player;
	private EnemyManager enemyManager;
	private boolean isGameOver;

	public Main() {
		setSize(new Dimension(800, 600));
		setPreferredSize(new Dimension(800, 600));
		setBackground(Color.BLACK);
		setFocusable(true);
		addKeyListener(this);

		stage = new Stage();
		player = new Player(this, 200, 200);
		enemyManager = new EnemyManager(this, 10);
		isGameOver = false;
	}

	@Override
	public void update(Graphics g) {
		super.update(g);
		paint(g);
	}

	public void paint(Graphics graphics) {
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, getWidth(), getHeight());
		stage.draw(graphics);
		if (!isGameOver) {
			player.draw(graphics);
			enemyManager.draw(graphics);
		} else {
			graphics.setFont(new Font("Century Gothic", Font.BOLD, 24));
			graphics.drawString("Game Over", 350, 200);
		}


		graphics.dispose();
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		if (c == KeyEvent.VK_W) {
			player.setYd(-1);
		}
		if (c == KeyEvent.VK_S) {
			player.setYd(1);
		}
		if (c == KeyEvent.VK_A) {
			player.setXd(-1);
		}
		if (c == KeyEvent.VK_D) {
			player.setXd(1);
		}


	}

	@Override
	public void keyReleased(KeyEvent e) {
		player.setXd(0);
		player.setYd(0);

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	public static void main(String[] args) {
		Main game = new Main();
		JFrame jFrame = new JFrame();
		jFrame.setTitle("Initialize the rectangles");
		jFrame.add(game);
		jFrame.pack();
		jFrame.setResizable(false);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
	}

	public Stage getStage() {
		return stage;
	}

	public EnemyManager getEnemyManager() {
		return enemyManager;
	}

	public void setGameOver(boolean flag) {
		isGameOver = flag;
	}

}
