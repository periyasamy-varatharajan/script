import javax.swing.*;
public class frame extends JFrame
{
public frame(String title)
{
	super(title);
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
intializationtest();
}
}
