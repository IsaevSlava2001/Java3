import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class task2 extends JFrame{

    JMenu File;
    JMenu Help;
    JMenu Edit;
    File file;
    JButton but1=new JButton("Button1");
    JButton but2=new JButton("Button2");
    JTextArea textarea=new JTextArea("Текст писать сюда");
    GridBagConstraints c = new GridBagConstraints();
    public task2()
    {
        JFrame frame = new JFrame("Test frame");
        frame.setSize(2000,1370);
        frame.setLayout(new GridBagLayout());
        JMenuBar menuBar = new JMenuBar();
        File=new JMenu("Файл");
        JMenuItem save=new JMenuItem("Сохранить");
        File.add(save);
        save.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                FileWriter writer = null;
                try
                {
                    writer = new FileWriter(file);
                } catch (IOException ex)
                {
                    throw new RuntimeException(ex);
                }
                try
                {
                    writer.write(textarea.getText());
                }
                catch (IOException ex)
                {
                    throw new RuntimeException(ex);
                }
                try {
                    writer.close();
                } catch (IOException ex)
                {
                    throw new RuntimeException(ex);
                }
            }
        });
        JMenuItem exit=new JMenuItem("Выйти");
        File.add(exit);
        exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

        Edit = new JMenu("Правка");
        JMenuItem copy=new JMenuItem("Копировать");
        Edit.add(copy);
        copy.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String myString = textarea.getText();
                StringSelection stringSelection = new StringSelection(myString);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
            }
        });
        JMenuItem paste=new JMenuItem("Вставить");
        Edit.add(paste);
        paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
                Transferable t = c.getContents( null );
                try
                {
                    String data = (String)t.getTransferData( DataFlavor.stringFlavor );
                    textarea.setText(textarea.getText()+data);
                } catch (UnsupportedFlavorException ex)
                {
                    throw new RuntimeException(ex);
                } catch (IOException ex)
                {
                    throw new RuntimeException(ex);
                }
            }
        });
        JMenuItem cut=new JMenuItem("Вырезать");
        Edit.add(cut);
        cut.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String myString = textarea.getText();
                StringSelection stringSelection = new StringSelection(myString);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
                textarea.setText("");
            }
        });

        Help = new JMenu("Справка");

        Help.addMenuListener(new MenuListener()
        {
            @Override
            public void menuSelected(MenuEvent e)
            {
                JOptionPane.showMessageDialog(frame,"Оно работает и не спрашивайте как");
            }
            @Override
            public void menuDeselected(MenuEvent e)
            {

            }
            @Override
            public void menuCanceled(MenuEvent e)
            {

            }
        });
        menuBar.add(File);
        menuBar.add(Edit);
        menuBar.add(Help);

        frame.setJMenuBar(menuBar);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor=GridBagConstraints.CENTER;
        c.insets=new Insets(20,50,20,50);
        c.ipady = 50;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 1;
        frame.add(but1, c);
        but1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textarea.setText(textarea.getText()+"¯\\_(ツ)_/¯");
            }
        });

        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 50;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 1;
        frame.add(but2, c);
        but2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textarea.setText(textarea.getText()+"\uD835\uDD5A❜\uD835\uDD5E \uD835\uDD65\uD835\uDD5A\uD835\uDD63\uD835\uDD56\uD835\uDD55 \uD835\uDD65\uD835\uDD60 \uD835\uDD55\uD835\uDD60\uD835\uDD5A\uD835\uDD5F\uD835\uDD58 \uD835\uDD65\uD835\uDD59\uD835\uDD5A\uD835\uDD64 \uD835\uDD65\uD835\uDD52\uD835\uDD64\uD835\uDD5C");
            }
        });


        textarea.setBounds(1000,800,1280,600);
        textarea.setFont(new Font("Serif", Font.PLAIN, 18));
        textarea.setLineWrap(true);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets=new Insets(0,0,0,0);
        c.gridx = 1;
        c.gridy = 2;
        c.ipady = 100;
        c.insets=new Insets(0,0,0,0);
        c.weightx = 0;
        c.gridwidth = 4;
        frame.add(textarea, c);
        //mypanel=new JPanel();
       // mypanel.setLayout(null);
       // worldLabel.setBounds(100, 200, 60, 30);
        //mypanel.add(worldLabel);
       // this.add(mypanel);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(500, 400);
        frame.setVisible(true);

        file = new File("c://java//file.txt");
    }

    public static void main(String[] args)
    {
        new task2();
    }
}
