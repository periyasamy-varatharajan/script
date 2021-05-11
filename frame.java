import javax.swing.*;
public class frame extends JFrame
{
	public frame(String title)
	{
		super(title);
		this.init();
	}
	public void init()
	{
		this.initframe();
		this.initmenu();
	}
	public void initframe()
	{
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
	}
	public void initmenu()
	{
		menubar m=new menubar();
		this.setJMenuBar(m);
	}
	public static void intializationtest()
	{
		frame f= new frame("script");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
	}	
	public static void main(String args[])
	{
		System.out.println("intialization test executing");
		//intializationtest();
		frame f=new frame("script");
	}
}
