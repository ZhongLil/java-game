package snake;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MainClass extends JFrame {
	ControlSnake control;

	Toolkit kit;

	Dimension dimen;

	public static void main(String[] args) {
		new MainClass("By Lwu");
	}

	public MainClass(String s) {
		super(s);
		control = new ControlSnake();
		control.setFocusable(true);
		kit = Toolkit.getDefaultToolkit();
		dimen = kit.getScreenSize();

		add(control);
		setLayout(new BorderLayout());
		setLocation(dimen.width / 3, dimen.height / 3);
		setSize(FWIDTH, FHEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

	public static final int FWIDTH = 315;

	public static final int FHEIGHT = 380;
}
