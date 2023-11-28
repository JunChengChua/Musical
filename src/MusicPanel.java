import javax.swing.*;

import java.awt.*;

public class MusicPanel extends JPanel{
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(getGraphics());
		
		Graphics2D g2d = (Graphics2D) g;
		int lineHeight = getHeight() / 2;
		
		g2d.drawLine(50, lineHeight, getWidth() - 50, lineHeight);

	}
}
