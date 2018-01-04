import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JPanel implements KeyListener {
	private Player player;

	public Main() {
		setSize(new Dimension(800, 480));
		setPreferredSize(new Dimension(800, 480));
		setBackground(Color.BLACK);
		setFocusable(true);
		addKeyListener(this);

		player= new Player(200,200);
	}

	@Override
	public void update(Graphics g) {
		super.update(g);
		paint(g);
	}

	public void paint(Graphics graphics) {
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, getWidth(), getHeight());
		player.draw(graphics);
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0,400,800,20);
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
}
