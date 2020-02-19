import javax.swing.*;
import java.awt.event.*;
class PuzzleGame implements ActionListener
{

JFrame f;
JButton b[];
JButton full;
JTextField tf;
JLabel j;
ImageIcon ic;

String []str={"1.JPG","2.JPG","3.JPG","4.JPG","5.JPG","6.JPG","7.JPG","8.JPG",""};

PuzzleGame(String s)
{
f=new JFrame(s);
b=new JButton[10];
ic=new ImageIcon("");
j=new JLabel(ic);
full=new JButton(new ImageIcon("full..JPG"));
full.setBounds(100,100,300,300);
f.add(full);
tf=new JTextField("GAME STARTS");
tf.setBounds(100,850,300,100);
f.add(tf);

for(int i=0;i<9;i++)
{
 b[i]=new JButton(new ImageIcon(str[i]));
if(i<3)
 {b[i].setBounds(100*(i+1),500,100,100);
 }
if(i<6&&i>2)
{b[i].setBounds(100*(i+1-3),600,100,100);
}
if(i<9&&i>5)
{
b[i].setBounds(100*(i+1-6),700,100,100);
}
b[i].addActionListener(this);
f.add(b[i]);
}

f.setLayout(null);
f.setSize(600,1100);
f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
f.setVisible(true);
}



public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b[0])
{
//Icon i=b[1].getIcon();
JLabel a=new JLabel(b[1].getIcon());
if(a.getIcon().toString().equals(j.getIcon().toString()))
{
b[1].setIcon(b[0].getIcon());
b[0].setIcon(ic);
}

JLabel a1=new JLabel(b[3].getIcon());
if(a1.getIcon().toString().equals(j.getIcon().toString()))
{
b[3].setIcon(b[0].getIcon());
b[0].setIcon(ic);
}
tf.setText("Game Starts");
}

if(e.getSource()==b[1])
{
//Icon i=b[1].getIcon();
JLabel a=new JLabel(b[0].getIcon());
if(a.getIcon().toString().equals(j.getIcon().toString()))
{
b[0].setIcon(b[1].getIcon());
b[1].setIcon(ic);
}

JLabel a1=new JLabel(b[2].getIcon());
if(a1.getIcon().toString().equals(j.getIcon().toString()))
{
b[2].setIcon(b[1].getIcon());
b[1].setIcon(ic);
}

JLabel a2=new JLabel(b[4].getIcon());
if(a2.getIcon().toString().equals(j.getIcon().toString()))
{
b[4].setIcon(b[1].getIcon());
b[1].setIcon(ic);
}
tf.setText("Game Starts");
}


if(e.getSource()==b[2])
{
//Icon i=b[1].getIcon();
JLabel a=new JLabel(b[1].getIcon());
if(a.getIcon().toString().equals(j.getIcon().toString()))
{
b[1].setIcon(b[2].getIcon());
b[2].setIcon(ic);
}

JLabel a1=new JLabel(b[5].getIcon());
if(a1.getIcon().toString().equals(j.getIcon().toString()))
{
b[5].setIcon(b[2].getIcon());
b[2].setIcon(ic);
}
tf.setText("Game Starts");
}

if(e.getSource()==b[3])
{
//Icon i=b[1].getIcon();
JLabel a=new JLabel(b[0].getIcon());
if(a.getIcon().toString().equals(j.getIcon().toString()))
{
b[0].setIcon(b[3].getIcon());
b[3].setIcon(ic);
}

JLabel a1=new JLabel(b[4].getIcon());
if(a1.getIcon().toString().equals(j.getIcon().toString()))
{
b[4].setIcon(b[3].getIcon());
b[3].setIcon(ic);
}

JLabel a2=new JLabel(b[6].getIcon());
if(a2.getIcon().toString().equals(j.getIcon().toString()))
{
b[6].setIcon(b[3].getIcon());
b[3].setIcon(ic);
}
tf.setText("Game Starts");
}

if(e.getSource()==b[4])
{
//Icon i=b[1].getIcon();
JLabel a=new JLabel(b[1].getIcon());
if(a.getIcon().toString().equals(j.getIcon().toString()))
{
b[1].setIcon(b[4].getIcon());
b[4].setIcon(ic);
}

JLabel a1=new JLabel(b[3].getIcon());
if(a1.getIcon().toString().equals(j.getIcon().toString()))
{
b[3].setIcon(b[4].getIcon());
b[4].setIcon(ic);
}

JLabel a2=new JLabel(b[5].getIcon());
if(a2.getIcon().toString().equals(j.getIcon().toString()))
{
b[5].setIcon(b[4].getIcon());
b[4].setIcon(ic);
}
JLabel a3=new JLabel(b[7].getIcon());
if(a3.getIcon().toString().equals(j.getIcon().toString()))
{
b[7].setIcon(b[4].getIcon());
b[4].setIcon(ic);
}
tf.setText("Game Starts");
}


if(e.getSource()==b[5])
{
//Icon i=b[1].getIcon();
JLabel a=new JLabel(b[2].getIcon());
if(a.getIcon().toString().equals(j.getIcon().toString()))
{
b[2].setIcon(b[5].getIcon());
b[5].setIcon(ic);
}

JLabel a1=new JLabel(b[4].getIcon());
if(a1.getIcon().toString().equals(j.getIcon().toString()))
{
b[4].setIcon(b[5].getIcon());
b[5].setIcon(ic);
}

JLabel a2=new JLabel(b[8].getIcon());
if(a2.getIcon().toString().equals(j.getIcon().toString()))
{
b[8].setIcon(b[5].getIcon());
b[5].setIcon(ic);
}
tf.setText("Game Starts");
}

if(e.getSource()==b[6])
{
//Icon i=b[1].getIcon();
JLabel a=new JLabel(b[3].getIcon());
if(a.getIcon().toString().equals(j.getIcon().toString()))
{
b[3].setIcon(b[6].getIcon());
b[6].setIcon(ic);
}

JLabel a1=new JLabel(b[7].getIcon());
if(a1.getIcon().toString().equals(j.getIcon().toString()))
{
b[7].setIcon(b[6].getIcon());
b[6].setIcon(ic);
}
tf.setText("Game Starts");
}

if(e.getSource()==b[7])
{
//Icon i=b[1].getIcon();
JLabel a=new JLabel(b[4].getIcon());
if(a.getIcon().toString().equals(j.getIcon().toString()))
{
b[4].setIcon(b[7].getIcon());
b[7].setIcon(ic);
}

JLabel a1=new JLabel(b[6].getIcon());
if(a1.getIcon().toString().equals(j.getIcon().toString()))
{
b[6].setIcon(b[7].getIcon());
b[7].setIcon(ic);
}

JLabel a2=new JLabel(b[8].getIcon());
if(a2.getIcon().toString().equals(j.getIcon().toString()))
{
b[8].setIcon(b[7].getIcon());
b[7].setIcon(ic);
}
tf.setText("Game Starts");
}

if(e.getSource()==b[8])
{
//Icon i=b[1].getIcon();
JLabel a=new JLabel(b[5].getIcon());
if(a.getIcon().toString().equals(j.getIcon().toString()))
{
b[5].setIcon(b[8].getIcon());
b[8].setIcon(ic);
}

JLabel a1=new JLabel(b[7].getIcon());
if(a1.getIcon().toString().equals(j.getIcon().toString()))
{
b[7].setIcon(b[8].getIcon());
b[8].setIcon(ic);
}
//tf.setText("Game Starts");
}


JLabel a1=new JLabel(new ImageIcon("1.JPG"));

JLabel a2=new JLabel(new ImageIcon("2.JPG"));
JLabel a3=new JLabel(new ImageIcon("3.JPG"));
JLabel a4=new JLabel(new ImageIcon("4.JPG"));
JLabel a5=new JLabel(new ImageIcon("5.JPG"));
JLabel a6=new JLabel(new ImageIcon("6.JPG"));
JLabel a7=new JLabel(new ImageIcon("7.JPG"));
JLabel a8=new JLabel(new ImageIcon("8.JPG"));
JLabel a9=new JLabel(new ImageIcon(""));

if((new JLabel(b[0].getIcon())).getIcon().toString().equals(a1.getIcon().toString())&&(new JLabel(b[1].getIcon())).getIcon().toString().equals(a2.getIcon().toString())&&(new JLabel(b[2].getIcon())).getIcon().toString().equals(a3.getIcon().toString())&&(new JLabel(b[3].getIcon())).getIcon().toString().equals(a4.getIcon().toString())&&(new JLabel(b[4].getIcon())).getIcon().toString().equals(a5.getIcon().toString())&&(new JLabel(b[5].getIcon())).getIcon().toString().equals(a6.getIcon().toString())&&(new JLabel(b[6].getIcon())).getIcon().toString().equals(a7.getIcon().toString())&&(new JLabel(b[7].getIcon())).getIcon().toString().equals(a8.getIcon().toString())&&(new JLabel(b[8].getIcon())).getIcon().toString().equals(a9.getIcon().toString()))
{
System.out.println("Game won");
tf.setText("GAME WON");
}





}



public static void main(String [] args)
{
new PuzzleGame("Puzzle");
}
}