import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Main extends JFrame
{
    JTextArea textarea=new JTextArea("Введите число от 0 до 20");
    JButton but;
    GridBagConstraints grid=new GridBagConstraints();
    Random r=new Random();
    int k=r.nextInt(0,20);
    JFrame frame=new JFrame();
    int count=0;
public Main()
{
    frame.setSize(300,400);
    count=0;
    frame.setLayout(new GridBagLayout());
    but=new JButton("Угадать");

    grid.fill = GridBagConstraints.HORIZONTAL;
    grid.gridx = 0;
    grid.gridy = 0;
    grid.ipady = 100;
    grid.insets=new Insets(0,0,0,0);
    grid.weightx = 0;
    grid.gridwidth = 4;
    frame.add(textarea, grid);

    grid.fill = GridBagConstraints.HORIZONTAL;
    grid.anchor=GridBagConstraints.CENTER;
    grid.insets=new Insets(20,50,20,50);
    grid.ipady = 50;
    grid.weightx = 0.5;
    grid.gridx = 0;
    grid.gridy = 1;
    frame.add(but, grid);
    JOptionPane.showMessageDialog(frame, k+"");

    textarea.addMouseListener(new MyListener());
    but.addMouseListener(new MyListener1());
    frame.setVisible(true);
}

    class MyListener1 extends MouseAdapter
    {
        public void mouseClicked (MouseEvent e)
        {
            if(count<3) {
                try {
                    int d = Integer.parseInt(textarea.getText());
                    if (d > 0 && d < 20) {
                        count++;
                        if (d < k) {
                            JOptionPane.showMessageDialog(frame, "Число меьше загаданного");
                        } else if (d > k) {
                            JOptionPane.showMessageDialog(frame, "Число больше загаданного");
                        } else {
                            JOptionPane.showMessageDialog(frame, "Ура! Вы угадали. Перезапустите, чтобы начать заново");
                            System.exit(0);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame, "Ошибка!!! Число от 0 до 20");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Ошибка во вводе");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(frame, "Вы превысили максимальнео число попыток. Перезапустите, чтобы начать заново");
                System.exit(0);
            }
        }
    }
    class MyListener extends MouseAdapter
    {
        public void mouseClicked (MouseEvent e)
        {
            textarea.setText("");
        }
    }
    public static void main(String[] args)
    {
        new Main();
    }
}
