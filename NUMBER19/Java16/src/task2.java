import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class task2
{

    JFrame frame=new JFrame();
    JLabel north,south,west,east,center;
    public task2()
    {
        frame.setSize(300,400);
        frame.setLayout(new BorderLayout());
        north=new JLabel("north");
        south=new JLabel("south");
        west=new JLabel("west");
        east=new JLabel("east");
        center=new JLabel("center");

        north.addMouseListener(new MyMouse("САО",frame));
        south.addMouseListener(new MyMouse("ЮАО",frame));
        east.addMouseListener(new MyMouse("ВАО",frame));
        west.addMouseListener(new MyMouse("ЗАО",frame));
        center.addMouseListener(new MyMouse("ЦАО",frame));
        frame.add(north,BorderLayout.NORTH);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(west,BorderLayout.WEST);
        frame.add(east,BorderLayout.EAST);
        frame.add(center,BorderLayout.CENTER);
        frame.setVisible(true);
    }

    class MyMouse extends MouseAdapter
    {
        String place;
        JFrame frame;
        MyMouse(String place,JFrame frame){
            this.place = place;
            this.frame = frame;
    }
        public void mouseEntered (MouseEvent e)
        {
            JOptionPane.showMessageDialog(frame, "Добро пожаловать в "+place+"!");
        }
    }
    public static void main(String[] args)
    {
        new task2();
    }
}
