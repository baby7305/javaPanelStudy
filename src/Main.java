import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
	public Main() {
		setSize(new Dimension(800, 480));
		setPreferredSize(new Dimension(800, 480));
		setBackground(Color.BLACK);
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
