import javax.swing.*;
public class menubar extends JMenuBar
{
	public menubar()
	{
		super();
		JMenu file=new JMenu("File");
		JMenuItem n=new JMenuItem("New");
		JMenu edit=new JMenu("Edit");
		this.add(file);
		this.add(edit);
	}
	public static void testingmenubar()
	{
		menubar m=new menubar();
		frame jf=new frame("script");
		jf.setJMenuBar(m);
	}
	public static void main(String args[])
	{
		testingmenubar();
	}
}
