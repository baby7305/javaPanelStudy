import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JPanel implements KeyListener {
	private int x = 5;
	private int y = 5;

	public Main() {
		setSize(new Dimension(800, 480));
		setPreferredSize(new Dimension(800, 480));
		setBackground(Color.BLACK);
		setFocusable(true);
		addKeyListener(this);
	}

	@Override
	public void update(Graphics g) {
		super.update(g);
		paint(g);
	}

	public void paint(Graphics graphics) {
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, getWidth(), getHeight());
		graphics.setColor(Color.WHITE);
		graphics.fillOval(x, y, 20, 20);
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		if (c == KeyEvent.VK_W) {
			y -= 5;
		}
		if (c == KeyEvent.VK_S) {
			y += 5;
		}
		if (c == KeyEvent.VK_A) {
			x -= 5;
		}
		if (c == KeyEvent.VK_D) {
			x += 5;
		}


	}

	@Override
	public void keyReleased(KeyEvent e) {

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
