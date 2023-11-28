import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;


public class MusicSheet extends JPanel{

	private MusicPanel firstString, secondString, thirdString, fourthString, fifthString, sixthString;
	
	public MusicSheet()
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		setBorder(new LineBorder(Color.black, 1));
		
		firstString = new MusicPanel();
		secondString = new MusicPanel();
		thirdString = new MusicPanel();
		fourthString = new MusicPanel();
		fifthString = new MusicPanel();
		sixthString = new MusicPanel();
		
		
		add(firstString);
		add(secondString);
		add(thirdString);
		add(fourthString);
		add(fifthString);
		add(sixthString);

	}
}
