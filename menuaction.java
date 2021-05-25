import java.awt.event.*;
public class menuaction implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(e.getSource().toString());
	}
}

