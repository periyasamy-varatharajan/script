import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class menubar extends JMenuBar implements MenuListener
{
	public menubar()
	{
		super();
		JMenu file=new JMenu("File");
		JMenuItem n=new JMenuItem("New");
		JMenu edit=new JMenu("Edit");
		this.add(file);
		this.add(edit);
		file.add(n);
		file.addMenuListener(this);
	}
	public static void testingmenubar()
	{
		menubar m=new menubar();
		frame jf=new frame("script");
		jf.setJMenuBar(m);
	}
	public void menuSelected(MenuEvent e)
	{
		System.out.println(e.getSource().toString());
	}
	public void menuDeselected(MenuEvent e)
	{
	}
	public void menuCanceled(MenuEvent e)
	{
	}
	public static void main(String args[])
	{
		testingmenubar();
	}
}
