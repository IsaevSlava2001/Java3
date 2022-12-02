import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class task4 extends JFrame
{

    JButton plus=new JButton("+");
    JButton minus=new JButton("-");
    JButton del=new JButton("/");
    JButton umnog=new JButton("*");
    JButton point=new JButton(".");
    JButton rez=new JButton("=");
    JButton one=new JButton("1");
    JButton two=new JButton("2");
    JButton three=new JButton("3");
    JButton four=new JButton("4");
    JButton five=new JButton("5");
    JButton six=new JButton("6");
    JButton seven=new JButton("7");
    JButton eight=new JButton("8");
    JButton nine=new JButton("9");
    JButton zero=new JButton("0");
    JTextArea textarea=new JTextArea("");
    GridBagConstraints c = new GridBagConstraints();
    boolean znak=false;
    boolean tochka=false;
    boolean Isrez=false;
    boolean IsPrevZnak=false;
    public task4()
    {
        JFrame frame = new JFrame("Test frame");
        frame.setSize(2000,1370);
        JLabel k=new JLabel();
        frame.setLayout(new GridBagLayout());
        textarea.setFont(new Font("Courier New", Font.PLAIN, 20));
        textarea.setEditable(false);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;
        c.weightx = 0.25;
        c.gridx = 0;
        c.gridy = 1;
        c.anchor=GridBagConstraints.CENTER;
        c.insets=new Insets(20,200,20,200);
        frame.add(seven, c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 1;
        c.gridy = 1;
        frame.add(eight, c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 2;
        c.gridy = 1;
        frame.add(nine, c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 3;
        c.gridy = 1;
        frame.add(del, c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 0;
        c.gridy = 2;
        frame.add(four,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 1;
        c.gridy = 2;
        frame.add(five,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 2;
        c.gridy = 2;
        frame.add(six,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 3;
        c.gridy = 2;
        frame.add(umnog,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 0;
        c.gridy = 3;
        frame.add(one,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 1;
        c.gridy = 3;
        frame.add(two,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 2;
        c.gridy = 3;
        frame.add(three,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 3;
        c.gridy = 3;
        frame.add(minus,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 0;
        c.gridy = 4;
        frame.add(zero,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 1;
        c.gridy = 4;
        frame.add(point,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 2;
        c.gridy = 4;
        frame.add(rez,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.25;
        c.gridx = 3;
        c.gridy = 4;
        frame.add(plus,c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 100;
        c.insets=new Insets(0,0,0,0);
        c.weightx = 0;
        c.gridwidth = 4;
        c.gridx = 0;
        c.gridy = 5;
        frame.add(textarea, c);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        one.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(Isrez)
                {
                    textarea.setText("1");
                    Isrez=false;
                    IsPrevZnak=false;
                }
                else
                {
                    textarea.setText(textarea.getText() + "1");
                    IsPrevZnak=false;
                }
            }
        });
        two.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(Isrez)
                {
                    textarea.setText("2");
                    Isrez=false;
                    IsPrevZnak=false;
                }
                else
                {
                    textarea.setText(textarea.getText() + "2");
                    IsPrevZnak=false;
                }
            }
        });
        three.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(Isrez)
                {
                    textarea.setText("3");
                    Isrez=false;
                    IsPrevZnak=false;
                }
                else
                {
                    textarea.setText(textarea.getText() + "3");
                    IsPrevZnak=false;
                }
            }
        });
        four.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(Isrez)
                {
                    textarea.setText("4");
                    Isrez=false;
                    IsPrevZnak=false;
                }
                else
                {
                    textarea.setText(textarea.getText() + "4");
                    IsPrevZnak=false;
                }
            }
        });
        five.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(Isrez)
                {
                    textarea.setText("5");
                    Isrez=false;
                    IsPrevZnak=false;
                }
                else
                {
                    textarea.setText(textarea.getText() + "5");
                    IsPrevZnak=false;
                }
            }
        });
        six.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(Isrez)
                {
                    textarea.setText("6");
                    Isrez=false;
                    IsPrevZnak=false;
                }
                else
                {
                    textarea.setText(textarea.getText() + "6");
                    IsPrevZnak=false;
                }
            }
        });
        seven.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(Isrez)
                {
                    textarea.setText("7");
                    Isrez=false;
                    IsPrevZnak=false;
                }
                else
                {
                    textarea.setText(textarea.getText() + "7");
                    IsPrevZnak=false;
                }
            }
        });
        eight.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(Isrez)
                {
                    textarea.setText("8");
                    Isrez=false;
                    IsPrevZnak=false;
                }
                else
                {
                    textarea.setText(textarea.getText() + "8");
                    IsPrevZnak=false;
                }
            }
        });
        nine.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(Isrez)
                {
                    textarea.setText("9");
                    Isrez=false;
                    IsPrevZnak=false;
                }
                else
                {
                    textarea.setText(textarea.getText() + "9");
                    IsPrevZnak=false;
                }
            }
        });
        zero.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(textarea.getText()!=""&&!IsPrevZnak)
                {
                    if (Isrez)
                    {
                        textarea.setText("0");
                        Isrez = false;
                        IsPrevZnak=false;
                    } else
                    {
                        textarea.setText(textarea.getText() + "0");
                        IsPrevZnak=false;
                    }
                }
            }
        });
        point.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(!tochka&&!IsPrevZnak)
                {
                    textarea.setText(textarea.getText() + ".");
                    tochka=true;
                }
            }
        });
        plus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(!znak)
                {
                    textarea.setText(textarea.getText() + "+");
                    znak=true;
                    tochka=false;
                    IsPrevZnak=true;
                }
            }
        });
        umnog.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(!znak)
                {
                    textarea.setText(textarea.getText() + "*");
                    znak=true;
                    tochka=false;
                    IsPrevZnak=true;
                }
            }
        });
        del.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(!znak)
                {
                    textarea.setText(textarea.getText() + "/");
                    znak=true;
                    tochka=false;
                    IsPrevZnak=true;
                }
            }
        });
        minus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(!znak)
                {
                    textarea.setText(textarea.getText() + "-");
                    znak=true;
                    tochka=false;
                    IsPrevZnak=true;
                }
            }
        });
        rez.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String wordsp[]={"",""},wordsm[]={"",""},wordsu[]={"",""},wordsd[]={"",""};
                int del=0;
                String word=textarea.getText();
                wordsp=word.split("\\+");
                if(wordsp.length==2)
                {
                    del=1;
                }
                else
                {
                    wordsm = word.split("\\-");
                    if(wordsm.length==2)
                    {
                        del=2;
                    }
                    else
                    {
                        wordsd = word.split("\\/");
                        if(wordsd.length==2)
                        {
                            del=3;
                        }
                        else
                        {
                            wordsu = word.split("\\*");
                            if(wordsu.length==2)
                            {
                                del=4;
                            }
                            else
                            {
                                textarea.setText(textarea.getText());
                            }
                        }
                    }

                }
                double fir,sec,rez;
                switch (del)
                {
                    case 1:
                        fir=Double.parseDouble(wordsp[0]);
                        sec=Double.parseDouble(wordsp[1]);
                        rez=fir+sec;
                        textarea.setText(textarea.getText()+"=\n"+Double.toString(rez));
                        break;
                    case 2:
                        fir=Double.parseDouble(wordsm[0]);
                        sec=Double.parseDouble(wordsm[1]);
                        rez=fir-sec;
                        textarea.setText(textarea.getText()+"=\n"+Double.toString(rez));
                        break;
                    case 3:
                        fir=Double.parseDouble(wordsd[0]);
                        sec=Double.parseDouble(wordsd[1]);
                        rez=fir/sec;
                        textarea.setText(textarea.getText()+"=\n"+Double.toString(rez));
                        break;
                    case 4:
                        fir=Double.parseDouble(wordsu[0]);
                        sec=Double.parseDouble(wordsu[1]);
                        rez=fir*sec;
                        textarea.setText(textarea.getText()+"=\n"+Double.toString(rez));
                        break;
                }
                tochka=false;
                znak=false;
                Isrez=true;
                //textarea.setText(textarea.getText()+"1");
            }
        });
        point.addMouseListener(new MyListener());
        frame.setVisible(true);
    }
    class MyListener  extends MouseAdapter
    {
        public void mouseClicked (MouseEvent e)
        {
            if(e.getClickCount() == 3)
            {				// write here your event handling code
                textarea.setText("");
            }
        }
    }
    public static void main(String[] args)
    {
        new task4();
    }
}
