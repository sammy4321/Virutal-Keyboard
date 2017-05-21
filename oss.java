import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import java.awt.*;
import java.awt.event.*;

class keyboard extends JFrame implements ActionListener
{
JButton f[] = new JButton[13];
JButton n[] = new JButton[14];
JButton q[] = new JButton[14];
JButton a[] = new JButton[13];
JButton z[] = new JButton[12];
JButton sp[] = new JButton[7];
JButton x[] = new JButton[10];
JButton u[] = new JButton[10];
JLabel vol;
JLabel disp;
 Robot robot;
 int shift=0,ctrl=0,alt=0,caps=0,numlock=0,brightness=100;
	
	public keyboard()
	{addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e) { releaseAll(); releaseCaps(); }});
	 setLayout(null);
	 setFocusableWindowState(false);
	 setSize(1080,300);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setAlwaysOnTop(true);
	 setVisible(true);
	 try{robot = new Robot();}
	 catch(Exception e){}
	 buttonsinitialize();	
	}
	//Initializing buttons.
	public void buttonsinitialize()
	{
	 f[0] = new JButton("Esc");
	 f[1] = new JButton("F1");
	 f[2] = new JButton("F2");
	 f[3] = new JButton("F3");
	 f[4] = new JButton("F4");
	 f[5] = new JButton("F5");
	 f[6] = new JButton("F6");
	 f[7] = new JButton("F7");
	 f[8] = new JButton("F8");
	 f[9] = new JButton("F9");
	 f[10] = new JButton("F10");
	 f[11] = new JButton("F11");
	 f[12] = new JButton("F12");
	 n[0] = new JButton("`");
	 n[1] = new JButton("1");
	 n[2] = new JButton("2");
	 n[3] = new JButton("3");
	 n[4] = new JButton("4");
	 n[5] = new JButton("5");
	 n[6] = new JButton("6");
	 n[7] = new JButton("7");
	 n[8] = new JButton("8");
	 n[9] = new JButton("9");
	 n[10] = new JButton("0");
	 n[11] = new JButton("-");
	 n[12] = new JButton("=");
	 n[13] = new JButton("BckSp");
	 q[0] = new JButton("Tab");
	 q[1] = new JButton("q");
	 q[2] = new JButton("w");
	 q[3] = new JButton("e");
	 q[4] = new JButton("r");
	 q[5] = new JButton("t");
	 q[6] = new JButton("y");
	 q[7] = new JButton("u");
	 q[8] = new JButton("i");
	 q[9] = new JButton("o");
	 q[10] = new JButton("p");
	 q[11] = new JButton("[");
	 q[12] = new JButton("]");
	 q[13] = new JButton("\\");
	 a[0] = new JButton("Caps");
	 a[1] = new JButton("a");
	 a[2] = new JButton("s");
	 a[3] = new JButton("d");
	 a[4] = new JButton("f");
	 a[5] = new JButton("g");
	 a[6] = new JButton("h");
	 a[7] = new JButton("j");
	 a[8] = new JButton("k");
	 a[9] = new JButton("l");
	 a[10] = new JButton(";");
	 a[11] = new JButton("'");
	 a[12] = new JButton("Enter");
	 z[0] = new JButton("Shift");
	 z[1] = new JButton("z");
	 z[2] = new JButton("x");
	 z[3] = new JButton("c");
	 z[4] = new JButton("v");
	 z[5] = new JButton("b");
	 z[6] = new JButton("n");
	 z[7] = new JButton("m");
	 z[8] = new JButton(",");
	 z[9] = new JButton(".");
	 z[10] = new JButton("/");
	 z[11] = new JButton("Shift");
	 sp[0] = new JButton("Ctrl");
	 sp[1] = new JButton();
	 sp[2] = new JButton("Alt");
	 sp[3] = new JButton(" ");
	 sp[4] = new JButton("Alt");
	 sp[5] = new JButton();
	 sp[6] = new JButton("Ctrl");
	 x[0]= new JButton("Ins");
	 x[1]= new JButton("Del");
	 x[2]= new JButton("Home");
	 x[3]= new JButton("PgUp");
	 x[4]= new JButton("End");
	 x[5]= new JButton("PgDn");
	 x[6]= new JButton("^");
	 x[7]= new JButton("v");
	 x[8]= new JButton("<");
	 x[9]= new JButton(">");
	 u[0]=new JButton("Cut");
	 u[1]=new JButton("Copy");
	 u[2]=new JButton("Paste");
	 u[3]=new JButton("Print");
	 u[4]=new JButton("Undo");
	 u[9]=new JButton("Terminal");
	 u[5]=new JButton("+");
	 u[6]=new JButton("-");
	 u[7]=new JButton("+");
	 u[8]=new JButton("-");
	 
	 //Adding buttons
	 for(int i=0;i<13;i++)add(f[i]);
	 for(int i=0;i<=13;i++)add(n[i]);
	 for(int i=0;i<=13;i++)add(q[i]);
	 for(int i=0;i<=12;i++)add(a[i]);
	 for(int i=0;i<=11;i++)add(z[i]);
	 for(int i=0;i<=6;i++)add(sp[i]);
	 for(int i=0;i<10;i++)add(x[i]);
	 for(int i=0;i<10;i++)add(u[i]);
	 
	 vol = new JLabel();
	 disp = new JLabel();
	 add(vol);
	 add(disp);
	 
	 //Setting the layout
	 int i;
	 
	 //Function keys
	 f[0].setBounds(5,5,58,35);
	 for(i=1;i<13;i++)
	 f[i].setBounds(63+(63*(i-1))+5,5,59,35);
	 //Numbers
	 for( i=0;i<=12;i++)
 	 n[i].setBounds((55*i)+5,47,50,37);
	 n[13].setBounds((55*i)+5,47,100,37);
	 //Q-Row
	 q[0].setBounds(5,89,75,37);
	 for(i=1;i<13;i++)
	 q[i].setBounds(85+(55*(i-1)),89,50,37);
	 q[13].setBounds(85+(55*(i-1)),89,75,37);
	 //A-Row
	 a[0].setBounds(5,131,85,37);
	 for(i=1;i<12;i++)
	 a[i].setBounds(95+(55*(i-1)),131,50,37);
	 a[12].setBounds(95+(55*(i-1)),131,120,37);
	 //Z-Row
	 z[0].setBounds(5,173,125,37);
	 for(i=1;i<11;i++)
	 z[i].setBounds(135+(55*(i-1)),173,50,37);
	 z[11].setBounds(135+(55*(i-1)),173,135,37);
	 //Ctrl-Row
	 sp[0].setBounds(5,215,75,37);
	 sp[1].setBounds(85,215,50,37);
	 sp[2].setBounds(140,215,75,37);
	 sp[1].setIcon(new ImageIcon(getClass().getResource("win.jpg")));
	 sp[5].setIcon(new ImageIcon(getClass().getResource("win.jpg")));
	 sp[3].setBounds(220,215,375,37);
	 sp[4].setBounds(600,215,75,37);
	 sp[5].setBounds(680,215,50,37);
	 sp[6].setBounds(735,215,85,37);
	 //Special
	 x[0].setBounds(830,5,60,40);
	 x[1].setBounds(895,5,60,40);
	 x[2].setBounds(830,50,60,40);
	 x[3].setBounds(895,50,60,40);
	 x[4].setBounds(830,95,60,40);
	 x[5].setBounds(895,95,60,40);
	 x[8].setBounds(830,207,70,75);
	 x[6].setBounds(905,207,70,35);
	 x[7].setBounds(905,247,70,35);
	 x[9].setBounds(980,207,70,75);
	 //Utilities
	 u[0].setBounds(10,257,150,40);
	 u[1].setBounds(175,257,150,40);
	 u[2].setBounds(340,257,150,40);
	 u[3].setBounds(505,257,150,40);
	 u[4].setBounds(670,257,150,40);
	 u[6].setBounds(965,17,50,30);
	 u[5].setBounds(1020,17,50,30);
	 u[8].setBounds(965,75,50,30);
	 u[7].setBounds(1020,75,50,30);
	 u[9].setBounds(830,140,125,40);
	 	 
	 for(i=0;i<6;i++) x[i].setMargin(new Insets(2,2,2,2));
	 for(i=0;i<5;i++) u[i].setMargin(new Insets(2,2,2,2));
	 vol.setBounds(960,2,115,50);
	 disp.setBounds(960,60,115,50);
	 vol.setBorder(BorderFactory.createTitledBorder("Volume"));
	 Border one = BorderFactory.createTitledBorder("Volume");
	 disp.setBorder(BorderFactory.createTitledBorder("Brightness"));
	 Border two = BorderFactory.createTitledBorder("Brightness");
	 
	 //Adding functionality to the buttons
 	 for(i=0;i<13;i++)
	 f[i].addActionListener(this);
 	 for(i=0;i<14;i++)
	 n[i].addActionListener(this);
	 for(i=0;i<14;i++)
	 q[i].addActionListener(this);
	 for(i=0;i<13;i++)
	 a[i].addActionListener(this);
	 for(i=0;i<12;i++)
	 z[i].addActionListener(this);
	 for(i=0;i<7;i++)
	 sp[i].addActionListener(this);
	 for(i=0;i<10;i++)
	 x[i].addActionListener(this);
	 for(i=0;i<10;i++)
	 u[i].addActionListener(this);
	}
	//Changing text on number keys for Shift keypress
	public void changeNum(){
	if(shift==1)
	{n[0].setText("~");
	n[1].setText("!");
	n[2].setText("@");
	n[3].setText("#");
	n[4].setText("$");
	n[5].setText("%");
	n[6].setText("^");	
	n[7].setText("&");
	n[8].setText("*");
	n[9].setText("(");
	n[10].setText(")");
	n[11].setText("_");
	n[12].setText("+");
	q[11].setText("{");
	q[12].setText("}");
	q[13].setText("|");
	a[10].setText(":");
	a[11].setText("\"");
	z[8].setText("<");
	z[9].setText(">");
	z[10].setText("?");
	}
	else
	{n[0].setText("`");
	n[1].setText("1");
	n[2].setText("2");
	n[3].setText("3");
	n[4].setText("4");
	n[5].setText("5");
	n[6].setText("6");	
	n[7].setText("7");
	n[8].setText("8");
	n[9].setText("9");
	n[10].setText("0");
	n[11].setText("-");
	n[12].setText("=");
	q[11].setText("[");
	q[12].setText("]");
	q[13].setText("\\");
	a[10].setText(";");
	a[11].setText("'");
	z[8].setText(",");
	z[9].setText(".");
	z[10].setText("/");
	}
	}
	//Changing text for alphabet keys on caps lock or shift 
	public void changeText(){
	if((shift==1^caps==1))
	{q[1].setText("Q");
	q[2].setText("W");
	q[3].setText("E");
	q[4].setText("R");
	q[5].setText("T");
	q[6].setText("Y");
	q[7].setText("U");
	q[8].setText("I");
	q[9].setText("O");
	q[10].setText("P");
	a[1].setText("A");
	a[2].setText("S");
	a[3].setText("D");
	a[4].setText("F");
	a[5].setText("G");
	a[6].setText("H");
	a[7].setText("J");
	a[8].setText("K");
	a[9].setText("L");
	z[1].setText("Z");
	z[2].setText("X");
	z[3].setText("C");
	z[4].setText("V");
	z[5].setText("B");
	z[6].setText("N");
	z[7].setText("M");
	}
	else
	{q[1].setText("q");
	q[2].setText("w");
	q[3].setText("e");
	q[4].setText("r");
	q[5].setText("t");
	q[6].setText("y");
	q[7].setText("u");
	q[8].setText("i");
	q[9].setText("o");
	q[10].setText("p");
	a[1].setText("a");
	a[2].setText("s");
	a[3].setText("d");
	a[4].setText("f");
	a[5].setText("g");
	a[6].setText("h");
	a[7].setText("j");
	a[8].setText("k");
	a[9].setText("l");
	z[1].setText("z");
	z[2].setText("x");
	z[3].setText("c");
	z[4].setText("v");
	z[5].setText("b");
	z[6].setText("n");
	z[7].setText("m");
	}
	}
	//Utility functions	
	public void pressShift() {shift=1; z[0].setBackground(Color.gray); robot.keyPress(16); z[11].setBackground(Color.gray); 	changeNum(); changeText();}
	public void releaseShift() {shift=0; z[0].setBackground(null); robot.keyRelease(16); z[11].setBackground(null);    		changeNum(); changeText();}
	
	public void pressCaps() {caps=1; type(20); a[0].setBackground(Color.gray); }
	public void releaseCaps() {caps=0; type(20);  a[0].setBackground(null); }
	
	public void pressCtrl(){ctrl=1; sp[0].setBackground(Color.gray); robot.keyPress(17); sp[6].setBackground(Color.gray);}
	public void releaseCtrl(){ctrl=0; sp[0].setBackground(null); robot.keyRelease(17); sp[6].setBackground(null);} 
	
	public void pressAlt(){alt=1; sp[2].setBackground(Color.gray); robot.keyPress(18); sp[4].setBackground(Color.gray);}
	public void releaseAlt(){alt=0; sp[2].setBackground(null); robot.keyRelease(18); sp[4].setBackground(null);}
	
	public void type(int kv) {robot.keyPress(kv); robot.keyRelease(kv); releaseAll(); }
	public void arrow(int kv) {robot.keyPress(kv); robot.keyRelease(kv); }
	
	//This function releases all special keys which are pressed and not released before closing the application.
	public void releaseAll()
	{if(shift==1) releaseShift(); if(ctrl==1) releaseCtrl(); if(alt==1) releaseAlt(); }
		
	//Keypress
	public void actionPerformed(ActionEvent ae)
	{//Special keys
	 //Left shift
	 if(ae.getSource()==z[0]) 
	 {if(shift==0) pressShift(); 
	  else releaseShift();
	 }
	 //Right shift
	 if(ae.getSource()==z[11]) 
	 {if(shift==0) pressShift(); 
	  else releaseShift();
	 }
	 //Caps Lock
	 if(ae.getSource()==a[0]) 
	 {if(caps==0) pressCaps();
	  else releaseCaps();
	  changeText();
	 }
	 //Left Ctrl 
	 if(ae.getSource()==sp[0])
	 {if(ctrl==0) pressCtrl();
	  else releaseCtrl();
	 }
	 //Right Ctrl
	 if(ae.getSource()==sp[6])
	 {if(ctrl==0) pressCtrl();
	  else releaseCtrl();
	 }
	 //L-Alt
	 if(ae.getSource()==sp[2])
	 {if(alt==0) pressAlt();
	  else releaseAlt();
	 }
	 //R-Alt
	 if(ae.getSource()==sp[4])
	 {if(alt==0) pressAlt();
	  else releaseAlt();
	 }
	 
	 if(ae.getSource()==f[0]) type(27); 	//Esc
	 if(ae.getSource()==f[1]) type(112);
	 if(ae.getSource()==f[2]) type(113);
	 if(ae.getSource()==f[3]) type(114);
	 if(ae.getSource()==f[4]) type(115);
	 if(ae.getSource()==f[5]) type(116);
	 if(ae.getSource()==f[6]) type(117);
	 if(ae.getSource()==f[7]) type(118);
	 if(ae.getSource()==f[8]) type(119);
	 if(ae.getSource()==f[9]) type(120);
	 if(ae.getSource()==f[10]) type(121);
	 if(ae.getSource()==f[11]) type(122);
	 if(ae.getSource()==f[12]) type(123);
	 if(ae.getSource()==a[1]) type(65);
	 if(ae.getSource()==z[5]) type(66);
	 if(ae.getSource()==z[3]) type(67);
	 if(ae.getSource()==a[3]) type(68);
	 if(ae.getSource()==q[3]) type(69);
	 if(ae.getSource()==a[4]) type(70);
	 if(ae.getSource()==a[5]) type(71);
	 if(ae.getSource()==a[6]) type(72);
	 if(ae.getSource()==q[8]) type(73);
	 if(ae.getSource()==a[7]) type(74);
	 if(ae.getSource()==a[8]) type(75);
	 if(ae.getSource()==a[9]) type(76);
	 if(ae.getSource()==z[7]) type(77);
	 if(ae.getSource()==z[6]) type(78);
	 if(ae.getSource()==q[9]) type(79);
	 if(ae.getSource()==q[10]) type(80);
	 if(ae.getSource()==q[1]) type(81);
	 if(ae.getSource()==q[4]) type(82);
	 if(ae.getSource()==a[2]) type(83);
	 if(ae.getSource()==q[5]) type(84);
	 if(ae.getSource()==q[7]) type(85);
	 if(ae.getSource()==z[4]) type(86);
	 if(ae.getSource()==q[2]) type(87);
	 if(ae.getSource()==z[2]) type(88);
	 if(ae.getSource()==q[6]) type(89);
	 if(ae.getSource()==z[1]) type(90);
	 if(ae.getSource()==sp[3]) type(32);	//Space
	 if(ae.getSource()==n[13]) type(8);	//Backspace
	 if(ae.getSource()==q[0]) type(9);	//Tab
	 if(ae.getSource()==a[12]) type(13); 	//Enter
	 if(ae.getSource()==n[0]) type(192);
	 if(ae.getSource()==n[1]) type(49);
	 if(ae.getSource()==n[2]) type(50);
	 if(ae.getSource()==n[3]) type(51);
	 if(ae.getSource()==n[4]) type(52);
	 if(ae.getSource()==n[5]) type(53);
	 if(ae.getSource()==n[6]) type(54);
	 if(ae.getSource()==n[7]) type(55);
	 if(ae.getSource()==n[8]) type(56);
	 if(ae.getSource()==n[9]) type(57);
	 if(ae.getSource()==n[10]) type(48);
	 if(ae.getSource()==n[11]) type(189);
	 if(ae.getSource()==n[12]) type(187);
	 if(ae.getSource()==q[11]) type(219);
	 if(ae.getSource()==q[12]) type(221);
	 if(ae.getSource()==q[13]) type(220);
	 if(ae.getSource()==a[10]) type(186);
	 if(ae.getSource()==a[11]) type(222);
	 if(ae.getSource()==z[8]) type(188);
	 if(ae.getSource()==z[9]) type(190);
	 if(ae.getSource()==z[10]) type(191);
	 if(ae.getSource()==x[0]) type(45);		//Insert
	 if(ae.getSource()==x[1]) {type(39); type(8);}	//Delete
	 if(ae.getSource()==x[2]) type(36);		//Home
	 if(ae.getSource()==x[3]) type(33);		//PgUp
	 if(ae.getSource()==x[4]) type(35);		//End
	 if(ae.getSource()==x[5]) type(34);		//PgDn
	 if(ae.getSource()==x[6]) arrow(38);
	 if(ae.getSource()==x[7]) arrow(40);
	 if(ae.getSource()==x[8]) arrow(37);
	 if(ae.getSource()==x[9]) arrow(39);
	 if(ae.getSource()==sp[1]) type(8);
	 if(ae.getSource()==u[0]) { releaseAll(); pressCtrl(); type(88); }
	 if(ae.getSource()==u[1]) { releaseAll(); pressCtrl(); type(67); }
	 if(ae.getSource()==u[2]) { releaseAll(); pressCtrl(); type(86); }
	 if(ae.getSource()==u[3]) { releaseAll(); pressCtrl(); type(80); }
	 if(ae.getSource()==u[4]) { releaseAll(); pressCtrl(); type(90); }
	 if(ae.getSource()==u[5]) 
	 {try{Process proc = Runtime.getRuntime().exec("pactl -- set-sink-volume 0 +10%");}catch(Exception e){} }
	 if(ae.getSource()==u[6]) 
	 {try{Process proc = Runtime.getRuntime().exec("pactl -- set-sink-volume 0 -10%");}catch(Exception e){}  }
	 if(ae.getSource()==u[7]) 
	 {if(brightness<95) {brightness+=5; String comm="0."+Integer.toString(brightness);
	  try{Process proc = Runtime.getRuntime().exec(new String[]{"xrandr","--output","LVDS-1","--brightness",comm});}
	  catch(Exception e){}  }}
	 if(ae.getSource()==u[8]) 
	 {if(brightness>50) {brightness-=5;  String comm="0."+Integer.toString(brightness);
	  try{Process proc = Runtime.getRuntime().exec(new String[]{"xrandr","--output","LVDS-1","--brightness",comm});}
	  catch(Exception e){}  } }
	 if(ae.getSource()==u[9]) 
	 {try{Process proc = Runtime.getRuntime().exec("gnome-terminal");}catch(Exception e){}   }
}
}
public class oss
{	public static void main(String args[])
	{
	keyboard key = new keyboard();
	}
}
