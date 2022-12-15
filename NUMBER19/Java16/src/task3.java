import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class task3 extends JFrame
{
    static JComboBox color;
    static JComboBox font;
    JTextArea textarea=new JTextArea("sample text");
    GridBagConstraints grid=new GridBagConstraints();
    JFrame frame=new JFrame();
    public task3()
    {
        frame.setSize(300,400);
        frame.setLayout(new GridBagLayout());
        String[] colors={"синий","красный","черный"};
        String[] fonts={"Times New Roman","MS Sans Serif","Courier New"};
        color = new JComboBox(colors);
        font = new JComboBox(fonts);

        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.gridx = 0;
        grid.gridy = 0;
        grid.ipady = 100;
        grid.insets=new Insets(0,0,0,0);
        grid.weightx = 0;
        grid.gridwidth = 4;
        frame.add(textarea, grid);

        grid.fill=GridBagConstraints.HORIZONTAL;
        grid.gridx=0;
        grid.gridy=1;
        grid.ipady=100;
        grid.weightx=0.5;
        frame.add(color,grid);

        grid.fill=GridBagConstraints.HORIZONTAL;
        grid.gridx=0;
        grid.gridy=2;
        grid.ipady=100;
        grid.weightx=0.5;
        frame.add(font,grid);

        color.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e)
            {
                if (color.getSelectedItem() == "синий") {
                    textarea.setForeground(Color.blue);
                }
                if (color.getSelectedItem() == "красный") {
                    textarea.setForeground(Color.red);
                }
                if (color.getSelectedItem() == "черный") {
                    textarea.setForeground(Color.black);
                }
            }
        });
        font.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e)
            {
                if(font.getSelectedItem()=="Times New Roman")
                {
                    textarea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
                }
                if(font.getSelectedItem()=="MS Sans Serif")
                {
                    textarea.setFont(new Font("MS Sans Serif", Font.PLAIN, 18));
                }
                if(font.getSelectedItem()=="Courier New")
                {
                    textarea.setFont(new Font("Courier New", Font.PLAIN, 18));
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new task3();
    }
}
