import java.awt.Dimension;

import javax.swing.*;


public class OptionPanel extends JPanel{
	
	public OptionPanel()
	{
		setPreferredSize(new Dimension(50,35));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JButton a = new JButton();
		JButton b = new JButton();
		
		a.setPreferredSize(new Dimension(5000,100));
		
		add(a);
		add(b);
	}
	
}
