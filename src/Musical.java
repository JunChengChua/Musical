import javax.swing.*;


public class Musical extends JFrame{
	
	public Musical()
	{
		setTitle("Musical Notes");
		setSize(1200,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		OptionPanel menu = new OptionPanel();
		
		MusicSheet lines = new MusicSheet();
		
		
		add(menu);
		add(lines);
		
		
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(() -> {
			Musical start = new Musical();
			
			start.setVisible(true);
		});
	}
	
	
}