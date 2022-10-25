//package DataBase_Connector;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import java.awt.*;
 
 
class Ranjit_Calculator implements ActionListener
{
JFrame frame;
JTextField t;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
JLabel label;
 
static double a=0,b=0,result=0;
static int operator=0;
 
Ranjit_Calculator()
{
frame=new JFrame("Ranjit_Calculator");
Border border = BorderFactory.createLineBorder(Color.decode("#292d2e"));
ImageIcon img = new ImageIcon("C:\\Users\\Windows 10\\IdeaProjects\\Intellij_Project\\src\\DataBase_Connector\\Calculator_512.png"); // set your own icon for this application just put the icon location like this 
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(Color.decode("#1d2021"));
        label = new JLabel("Enter the Number:");
        label.setBackground(Color.decode("#292d2e"));
        label.setForeground(Color.WHITE);
        label.setBorder(border);
        label.setFont(new Font("Arial",Font.BOLD,20));
t=new JTextField();
t.setFont(new Font(" Arial",Font.PLAIN,20));
b1=new JButton("1");
b1.setBackground(Color.decode("#292d2e"));
        b1.setForeground(Color.WHITE);
        b1.setBorder(border);
        b1.setFont(new Font("Arial",Font.BOLD,25));
b2=new JButton("2");
b2.setBackground(Color.decode("#292d2e"));
        b2.setForeground(Color.WHITE);
        b2.setBorder(border);
        b2.setFont(new Font("Arial",Font.BOLD,25));
b3=new JButton("3");
b3.setBackground(Color.decode("#292d2e"));
        b3.setForeground(Color.WHITE);
        b3.setBorder(border);
        b3.setFont(new Font("Arial",Font.BOLD,25));
b4=new JButton("4");
b4.setBackground(Color.decode("#292d2e"));
        b4.setForeground(Color.WHITE);
        b4.setBorder(border);
        b4.setFont(new Font("Arial",Font.BOLD,25));
b5=new JButton("5");
b5.setBackground(Color.decode("#292d2e"));
        b5.setForeground(Color.WHITE);
        b5.setBorder(border);
        b5.setFont(new Font("Arial",Font.BOLD,25));
b6=new JButton("6");
b6.setBackground(Color.decode("#292d2e"));
        b6.setForeground(Color.WHITE);
        b6.setBorder(border);
        b6.setFont(new Font("Arial",Font.BOLD,25));
b7=new JButton("7");
b7.setBackground(Color.decode("#292d2e"));
        b7.setForeground(Color.WHITE);
        b7.setBorder(border);
        b7.setFont(new Font("Arial",Font.BOLD,25));
b8=new JButton("8");
b8.setBackground(Color.decode("#292d2e"));
        b8.setForeground(Color.WHITE);
        b8.setBorder(border);
        b8.setFont(new Font("Arial",Font.BOLD,25));
b9=new JButton("9");
b9.setBackground(Color.decode("#292d2e"));
        b9.setForeground(Color.WHITE);
        b9.setBorder(border);
        b9.setFont(new Font("Arial",Font.BOLD,25));
b0=new JButton("0");
b0.setBackground(Color.decode("#292d2e"));
        b0.setForeground(Color.WHITE);
        b0.setBorder(border);
        b1.setBackground(Color.decode("#292d2e"));
        b1.setForeground(Color.WHITE);
        b1.setBorder(border);
        b1.setFont(new Font("Arial",Font.BOLD,25));
        b0.setFont(new Font("Arial",Font.BOLD,25));
        b1.setBackground(Color.decode("#292d2e"));
        b1.setForeground(Color.WHITE);
        b1.setBorder(border);
        b1.setFont(new Font("Arial",Font.BOLD,25));
bdiv=new JButton("/");
bdiv.setBackground(Color.decode("#292d2e"));
        bdiv.setForeground(Color.WHITE);
        bdiv.setBorder(border);
        bdiv.setFont(new Font("Arial",Font.BOLD,25));
bmul=new JButton("*");
bmul.setBackground(Color.decode("#292d2e"));
        bmul.setForeground(Color.WHITE);
        bmul.setBorder(border);
        bmul.setFont(new Font("Arial",Font.BOLD,25));
bsub=new JButton("-");
bsub.setBackground(Color.decode("#292d2e"));
        bsub.setForeground(Color.WHITE);
        bsub.setBorder(border);
        bsub.setFont(new Font("Arial",Font.BOLD,25));
badd=new JButton("+");
badd.setBackground(Color.decode("#292d2e"));
        badd.setForeground(Color.WHITE);
        badd.setBorder(border);
        badd.setFont(new Font("Arial",Font.BOLD,25));
bdec=new JButton(".");
bdec.setBackground(Color.decode("#292d2e"));
        bdec.setForeground(Color.WHITE);
        bdec.setBorder(border);
        bdec.setFont(new Font("Arial",Font.BOLD,25));
beq=new JButton("=");
beq.setBackground(Color.decode("#292d2e"));
        beq.setForeground(Color.WHITE);
        beq.setBorder(border);
        beq.setFont(new Font("Arial",Font.BOLD,25));
bdel=new JButton("Delete");
bdel.setBackground(Color.decode("#292d2e"));
        bdel.setForeground(Color.WHITE);
        bdel.setBorder(border);
        bdel.setFont(new Font("Arial",Font.BOLD,25));
bclr=new JButton("Clear");
bclr.setBackground(Color.decode("#292d2e"));
        bclr.setForeground(Color.WHITE);
        bclr.setBorder(border);
        bclr.setFont(new Font("Arial",Font.BOLD,25));
        label.setBounds(5, 5, 1, 20);
t.setBounds(5,35,315,50);
b7.setBounds(5,100,75,40);
b8.setBounds(85,100,75,40);
b9.setBounds(165,100,75,40);
bdiv.setBounds(245,100,75,40);

b4.setBounds(5,150,75,40);
b5.setBounds(85,150,75,40);
b6.setBounds(165,150,75,40);
bmul.setBounds(245,150,75,40);

b1.setBounds(5,200,75,40);
b2.setBounds(85,200,75,40);
b3.setBounds(165,200,75,40);
bsub.setBounds(245,200,75,40);

bdec.setBounds(5,250,75,40);
b0.setBounds(85,250,75,40);
beq.setBounds(165,250,75,40);
badd.setBounds(245,250,75,40);

bdel.setBounds(5,300,155,40);
bclr.setBounds(165,300,155,40);
frame.add(label);
frame.add(t);
frame.add(b7);
frame.add(b8);
frame.add(b9);
frame.add(bdiv);
frame.add(b4);
frame.add(b5);
frame.add(b6);
frame.add(bmul);
frame.add(b1);
frame.add(b2);
frame.add(b3);
frame.add(bsub);
frame.add(bdec);
frame.add(b0);
frame.add(beq);
frame.add(badd);
frame.add(bdel);
frame.add(bclr);
frame.setLayout(null);
frame.setVisible(true);
frame.setSize(340,385);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setResizable(false);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
badd.addActionListener(this);
bdiv.addActionListener(this);
bmul.addActionListener(this);
bsub.addActionListener(this);
bdec.addActionListener(this);
beq.addActionListener(this);
bdel.addActionListener(this);
bclr.addActionListener(this);
}
 
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
t.setText(t.getText().concat("1"));
if(e.getSource()==b2)
t.setText(t.getText().concat("2"));
if(e.getSource()==b3)
t.setText(t.getText().concat("3"));
if(e.getSource()==b4)
t.setText(t.getText().concat("4"));
if(e.getSource()==b5)
t.setText(t.getText().concat("5"));
if(e.getSource()==b6)
t.setText(t.getText().concat("6"));
if(e.getSource()==b7)
t.setText(t.getText().concat("7"));
if(e.getSource()==b8)
t.setText(t.getText().concat("8"));
if(e.getSource()==b9)
t.setText(t.getText().concat("9"));
if(e.getSource()==b0)
t.setText(t.getText().concat("0"));
if(e.getSource()==bdec)
t.setText(t.getText().concat("."));
if(e.getSource()==badd)
{
a=Double.parseDouble(t.getText());
operator=1;
t.setText("");
}
if(e.getSource()==bsub)
{
a=Double.parseDouble(t.getText());
operator=2;
t.setText("");
}
if(e.getSource()==bmul)
{
a=Double.parseDouble(t.getText());
operator=3;
t.setText("");
}
if(e.getSource()==bdiv)
{
a=Double.parseDouble(t.getText());
operator=4;
t.setText("");
}
if(e.getSource()==beq)
{
b=Double.parseDouble(t.getText());
switch(operator)
{
case 1: result=a+b;
break;
case 2: result=a-b;
break;
case 3: result=a*b;
break;
case 4: result=a/b;
break;
default: result=0;
}
t.setText(""+result);
}
if(e.getSource()==bclr)
t.setText("");
if(e.getSource()==bdel)
{
String s=t.getText();
t.setText("");
for(int i=0;i<s.length()-1;i++)
t.setText(t.getText()+s.charAt(i));
}
}
 
public static void main(String...s)
{
new Ranjit_Calculator();
}
}
