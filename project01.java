
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class project01 extends JFrame implements ActionListener {
	
	//components
	
	JLabel lbl_top, lbl_01, lbl_02, lbl_03, lbl_04,lbl_05, img_lbl, bk01_lbl, bk02_lbl, bk03_lbl, bk04_lbl, bk05_lbl, bk06_lbl, bk07_lbl, bk08_lbl, bk09_lbl, bk10_lbl, bk11_lbl, bk12_lbl, bk13_lbl, bk14_lbl, bk15_lbl, bk16_lbl, bk17_lbl, bk18_lbl, bk19_lbl, bk20_lbl,
	pr01_lbl, pr02_lbl, pr03_lbl, pr04_lbl, pr05_lbl, pr06_lbl, pr07_lbl, pr08_lbl, pr09_lbl, pr10_lbl, pr11_lbl, pr12_lbl, pr13_lbl, pr14_lbl, pr15_lbl, pr16_lbl, pr17_lbl, pr18_lbl, pr19_lbl, pr20_lbl,
	q01_lbl, q02_lbl, q03_lbl, q04_lbl, q05_lbl, q06_lbl, q07_lbl, q08_lbl, q09_lbl, q10_lbl, q11_lbl, q12_lbl, q13_lbl, q14_lbl, q15_lbl, q16_lbl, q17_lbl, q18_lbl, q19_lbl, q20_lbl;
	JButton btn_total, btn_clear,btn_new, btn_show, btn_buy01, btn_buy02, btn_buy03, btn_buy04, btn_buy05, btn_buy06, btn_buy07, btn_buy08, btn_buy09, btn_buy10, btn_buy11, btn_buy12, btn_buy13, btn_buy14, btn_buy15, btn_buy16, btn_buy17, btn_buy18, btn_buy19, btn_buy20;
	JTextField txt_01, txt_02, txt_03, txt_04, txt_q01, txt_q02, txt_q03, txt_q04, txt_q05, txt_q06, txt_q07, txt_q08, txt_q09, txt_q10, txt_q11, txt_q12, txt_q13, txt_q14, txt_q15, txt_q16, txt_q17, txt_q18, txt_q19, txt_q20;
	JTextArea txt_display;
	
    	String BookList="";
    	int qty1 = 0;
    	int x1=300,x2=470,x3=270,x4=320,x5=350,x6=215,x7=450,x8=295,x9=390,x0=430;
    	double total = 0;
    	double pay = 0;
    	double change = pay - total;
    	String img = "C:Users/Tony/Desktop/JavaProject/img/";
   
   		public project01() {
   			//constrcution or instantiate
   			setSize(1200,800);
   			setTitle("BOOK FAIR (Book Sale System)");
   			setVisible(true);
   			
   			//BG COLOR
   			Container BG = getContentPane();
      	 	BG.setBackground(new Color(236,244,146));
      	 	
      	 	
   			
   			//label
   			lbl_01 = new JLabel("Product:");
   			lbl_02 = new JLabel("Purchase Quantity:");
   			lbl_03 = new JLabel("Cost");
   			lbl_04 = new JLabel("Total Cost:");
   			lbl_05 = new JLabel("Book Products:");
   			
   			//logo
   			img_lbl = new JLabel();
   			
   			//books
			bk01_lbl = new JLabel();
			bk02_lbl = new JLabel();
			bk03_lbl = new JLabel();
			bk04_lbl = new JLabel();
			bk05_lbl = new JLabel();
			bk06_lbl = new JLabel();
			bk07_lbl = new JLabel();
			bk08_lbl = new JLabel();
			bk09_lbl = new JLabel();
			bk10_lbl = new JLabel();
			bk11_lbl = new JLabel();
			bk12_lbl = new JLabel();
			bk13_lbl = new JLabel();
			bk14_lbl = new JLabel();
			bk15_lbl = new JLabel();
			bk16_lbl = new JLabel();
			bk17_lbl = new JLabel();
			bk17_lbl = new JLabel();
			bk18_lbl = new JLabel();
			bk19_lbl = new JLabel();
			bk20_lbl = new JLabel();
			
			//price
			pr01_lbl = new JLabel("Php 300.00");
			pr02_lbl = new JLabel("Php 470.00");
			pr03_lbl = new JLabel("Php 470.00");
			pr04_lbl = new JLabel("Php 270.00");
			pr05_lbl = new JLabel("Php 320.00");
			pr06_lbl = new JLabel("Php 350.00");
			pr07_lbl = new JLabel("Php 215.00");
			pr08_lbl = new JLabel("Php 450.00");
			pr09_lbl = new JLabel("Php 300.00");
			pr10_lbl = new JLabel("Php 300.00");
			pr11_lbl = new JLabel("Php 300.00");
			pr12_lbl = new JLabel("Php 470.00");
			pr13_lbl = new JLabel("Php 470.00");
			pr14_lbl = new JLabel("Php 270.00");
			pr15_lbl = new JLabel("Php 320.00");
			pr16_lbl = new JLabel("Php 350.00");
			pr17_lbl = new JLabel("Php 295.00");
			pr18_lbl = new JLabel("Php 450.00");
			pr19_lbl = new JLabel("Php 390.00");
			pr20_lbl = new JLabel("Php 430.00");
			
   			btn_total = new JButton("Payment");
   			btn_clear = new JButton("Clear");
   			btn_new = new JButton("New Customer");
   			btn_show = new JButton("Show Purchase");
   			//books
   			btn_buy01 = new JButton("Buy");
   			btn_buy02 = new JButton("Buy");
   			btn_buy03 = new JButton("Buy");
   			btn_buy04 = new JButton("Buy");
   			btn_buy05 = new JButton("Buy");
   			btn_buy06 = new JButton("Buy");
   			btn_buy07 = new JButton("Buy");
   			btn_buy08 = new JButton("Buy");
   			btn_buy09 = new JButton("Buy");
   			btn_buy10 = new JButton("Buy");
   			btn_buy11 = new JButton("Buy");
   			btn_buy12 = new JButton("Buy");
   			btn_buy13 = new JButton("Buy");
   			btn_buy14 = new JButton("Buy");
   			btn_buy15 = new JButton("Buy");
   			btn_buy16 = new JButton("Buy");
   			btn_buy17 = new JButton("Buy");
   			btn_buy18 = new JButton("Buy");
   			btn_buy18 = new JButton("Buy");
   			btn_buy19 = new JButton("Buy");
   			btn_buy20 = new JButton("Buy");
   			
   			//book quantity
   			
   			q01_lbl = new JLabel("QTY:");
   			q02_lbl = new JLabel("QTY:");
   			q03_lbl = new JLabel("QTY:");
   			q04_lbl = new JLabel("QTY:");
   			q05_lbl = new JLabel("QTY:");
   			q06_lbl = new JLabel("QTY:");
   			q07_lbl = new JLabel("QTY:");
   			q08_lbl = new JLabel("QTY:");
   			q09_lbl = new JLabel("QTY:");
   			q10_lbl = new JLabel("QTY:");
   			q11_lbl = new JLabel("QTY:");
   			q12_lbl = new JLabel("QTY:");
   			q13_lbl = new JLabel("QTY:");
   			q14_lbl = new JLabel("QTY:");
   			q15_lbl = new JLabel("QTY:");
   			q16_lbl = new JLabel("QTY:");
   			q17_lbl = new JLabel("QTY:");
   			q18_lbl = new JLabel("QTY:");
   			q19_lbl = new JLabel("QTY:");
   			q20_lbl = new JLabel("QTY:");
   			
   			
   			txt_01 = new JTextField(20);txt_01.setEditable(false);
   			txt_02 = new JTextField(20); txt_02.setEditable(false);
   			txt_03 = new JTextField(20);txt_03.setEditable(false);
   			txt_04 = new JTextField(20);txt_04.setEditable(false);
   			txt_q01 = new JTextField(20); txt_q01.setText("10"); txt_q01.setEditable(false); 
   			txt_q02 = new JTextField(20); txt_q02.setText("10"); txt_q02.setEditable(false);
   			txt_q03 = new JTextField(20); txt_q03.setText("10"); txt_q03.setEditable(false);
   			txt_q04 = new JTextField(20); txt_q04.setText("10"); txt_q04.setEditable(false);
   			txt_q05 = new JTextField(20); txt_q05.setText("10"); txt_q05.setEditable(false);
   			txt_q06 = new JTextField(20); txt_q06.setText("10"); txt_q06.setEditable(false);
   			txt_q07 = new JTextField(20); txt_q07.setText("10"); txt_q07.setEditable(false);
   			txt_q08 = new JTextField(20); txt_q08.setText("10"); txt_q08.setEditable(false);
   			txt_q09 = new JTextField(20); txt_q09.setText("10"); txt_q09.setEditable(false);
   			txt_q10 = new JTextField(20); txt_q10.setText("10"); txt_q10.setEditable(false);
   			txt_q11 = new JTextField(20); txt_q11.setText("10"); txt_q11.setEditable(false);
   			txt_q12 = new JTextField(20); txt_q12.setText("10"); txt_q12.setEditable(false);
   			txt_q13 = new JTextField(20); txt_q13.setText("10"); txt_q13.setEditable(false);
   			txt_q14 = new JTextField(20); txt_q14.setText("10"); txt_q14.setEditable(false);
   			txt_q15 = new JTextField(20); txt_q15.setText("10"); txt_q15.setEditable(false);
   			txt_q16 = new JTextField(20); txt_q16.setText("10"); txt_q16.setEditable(false);
   			txt_q17 = new JTextField(20); txt_q17.setText("10"); txt_q17.setEditable(false);
   			txt_q18 = new JTextField(20); txt_q18.setText("10"); txt_q18.setEditable(false);
   			txt_q19 = new JTextField(20); txt_q19.setText("10"); txt_q19.setEditable(false);
   			txt_q20 = new JTextField(20); txt_q20.setText("10"); txt_q20.setEditable(false);
   			
   			txt_display = new JTextArea(250, 400); txt_display.setEditable(false);//ROWS & COLUMNS
   			
   			add(img_lbl);
      	 	img_lbl.setIcon(new ImageIcon(img + "book-logo.png"));
      	 	img_lbl.setBounds (10,10,200,200);
      	 	
      	 	add(lbl_01);
      	 	lbl_01.setBounds(240,10,200,30);
      	 	
      	 	add(txt_01);
      	 	txt_01.setBounds(390,10,270,30);
      	 	
      	 	add(lbl_02);
      	 	lbl_02.setBounds(240,50,200,30);
      	 	
      	 	add(txt_02);
      	 	txt_02.setBounds(390,50,270,30);
      	 	
      	 	add(lbl_03);
      	 	lbl_03.setBounds(240,90,200,30);
      	 	
      	 	add(txt_03);
      	 	txt_03.setBounds(390,90,270,30);
      	 	
      	 	add(lbl_04);
      	 	lbl_04.setBounds(240,130,200,30);
      	 	
      	 	add(txt_04);
      	 	txt_04.setBounds(390,130,270,30);
      	 	
      	 	add(btn_total);
      	 	btn_total.setBounds(420,180,90,30);
      	 	
      	 	add(btn_clear);
      	 	btn_clear.setBounds(550,180,90,30);
      	 	
      	 	add(btn_new);
      	 	btn_new.setBounds(800,180,150,30);
      	 	
      	 	add(btn_show);
      	 	btn_show.setBounds(990,180,150,30);
      	 	
      	 	add(txt_display);
      	 	txt_display.setBounds(680,10,460,150);
      	 	
      	 	add(lbl_05);
      	 	lbl_05.setBounds(100,220,200,30);
      	 	
      	 	add(bk01_lbl);
      	 	bk01_lbl.setIcon(new ImageIcon(img + "book/bk01.jpg"));
      	 	bk01_lbl.setBounds (100,250,90,130);
      	 	
      	 	add(pr01_lbl);
      	 	pr01_lbl.setBounds(105,380,80,30);
      	 	
      	 	add(q01_lbl);
      	 	q01_lbl.setBounds(105,410,80,25);
      	 	
      	 	add(txt_q01);
      	 	txt_q01.setBounds(145,415,40,20);
      	 	
      	 	add(btn_buy01);
      	 	btn_buy01.setBounds(105,445,80,30);
      	 	
      	 	add(bk02_lbl);
      	 	bk02_lbl.setIcon(new ImageIcon(img + "book/bk02.jpg"));
      	 	bk02_lbl.setBounds (200,250,90,130);
      	 	
      	 	add(pr02_lbl);
      	 	pr02_lbl.setBounds(205,380,80,30);
      	 	
      	 	add(q02_lbl);
      	 	q02_lbl.setBounds(205,410,80,25);
      	 	
      	 	add(txt_q02);
      	 	txt_q02.setBounds(245,415,40,20);
      	 	
      	 	
      	 	add(btn_buy02);
      	 	btn_buy02.setBounds(205,445,80,30);
      	 	
      	 	add(bk03_lbl);
      	 	bk03_lbl.setIcon(new ImageIcon(img + "book/bk03.jpg"));
      	 	bk03_lbl.setBounds (300,250,90,130);
      	 	
      	 	add(pr03_lbl);
      	 	pr03_lbl.setBounds(305,380,80,30);
      	 	
      	 	add(q03_lbl);
      	 	q03_lbl.setBounds(305,410,80,25);
      	 	
      	 	add(txt_q03);
      	 	txt_q03.setBounds(345,415,40,20);
      	 	
      	 	add(btn_buy03);
      	 	btn_buy03.setBounds(305,445,80,30);
      	 	
      	 	add(bk04_lbl);
      	 	bk04_lbl.setIcon(new ImageIcon(img + "book/bk04.jpg"));
      	 	bk04_lbl.setBounds (400,250,90,130);
      	 	
      	 	add(pr04_lbl);
      	 	pr04_lbl.setBounds(405,380,80,30);
      	 	
      	 	add(q04_lbl);
      	 	q04_lbl.setBounds(405,410,80,25);
      	 	
      	 	add(txt_q04);
      	 	txt_q04.setBounds(445,415,40,20);
      	 	
      	 	add(btn_buy04);
      	 	btn_buy04.setBounds(405,445,80,30);
      	 	
      	 	add(bk05_lbl);
      	 	bk05_lbl.setIcon(new ImageIcon(img + "book/bk05.jpg"));
      	 	bk05_lbl.setBounds (500,250,90,130);
      	 	
      	 	add(pr05_lbl);
      	 	pr05_lbl.setBounds(505,380,80,30);
      	 	
      	 	add(q05_lbl);
      	 	q05_lbl.setBounds(505,410,80,25);
      	 	
      	 	add(txt_q05);
      	 	txt_q05.setBounds(545,415,40,20);
      	 	
      	 	add(btn_buy05);
      	 	btn_buy05.setBounds(505,445,80,30);
      	 	
      	 	add(bk06_lbl);
      	 	bk06_lbl.setIcon(new ImageIcon(img + "book/bk06.jpg"));
      	 	bk06_lbl.setBounds (600,250,90,130);
      	 	
      	 	add(pr06_lbl);
      	 	pr06_lbl.setBounds(605,380,80,30);
      	 	
      	 	add(q06_lbl);
      	 	q06_lbl.setBounds(605,410,80,25);
      	 	
      	 	add(txt_q06);
      	 	txt_q06.setBounds(645,415,40,20);
      	 	
      	 	add(btn_buy06);
      	 	btn_buy06.setBounds(605,445,80,30);
      	 	
      	 	add(bk07_lbl);
      	 	bk07_lbl.setIcon(new ImageIcon(img + "book/bk07.jpg"));
      	 	bk07_lbl.setBounds (700,250,90,130);
      	 	
      	 	add(pr07_lbl);
      	 	pr07_lbl.setBounds(705,380,80,30);
      	 	
      	 	add(q07_lbl);
      	 	q07_lbl.setBounds(705,410,80,25);
      	 	
      	 	add(txt_q07);
      	 	txt_q07.setBounds(745,415,40,20);
      	 	
      	 	add(btn_buy07);
      	 	btn_buy07.setBounds(705,445,80,30);
      	 	
      	 	add(bk08_lbl);
      	 	bk08_lbl.setIcon(new ImageIcon(img + "book/bk08.jpg"));
      	 	bk08_lbl.setBounds (800,250,90,130);
      	 	
      	 	add(pr08_lbl);
      	 	pr08_lbl.setBounds(805,380,80,30);
      	 	
      	 	add(q08_lbl);
      	 	q08_lbl.setBounds(805,410,80,25);
      	 	
      	 	add(txt_q08);
      	 	txt_q08.setBounds(845,415,40,20);
      	 	
      	 	add(btn_buy08);
      	 	btn_buy08.setBounds(805,445,80,30);
      	 	
      	 	add(bk09_lbl);
      	 	bk09_lbl.setIcon(new ImageIcon(img + "book/bk09.jpg"));
      	 	bk09_lbl.setBounds (900,250,90,130);
      	 	
      	 	add(pr09_lbl);
      	 	pr09_lbl.setBounds(905,380,80,30);
      	 	
      	 	add(q09_lbl);
      	 	q09_lbl.setBounds(905,410,80,25);
      	 	
      	 	add(txt_q09);
      	 	txt_q09.setBounds(945,415,40,20);
      	 	
      	 	add(btn_buy09);
      	 	btn_buy09.setBounds(905,445,80,30);
      	 	
      	 	add(bk10_lbl);
      	 	bk10_lbl.setIcon(new ImageIcon(img + "book/bk10.jpg"));
      	 	bk10_lbl.setBounds (1000,250,90,130);
      	 	
      	 	add(pr10_lbl);
      	 	pr10_lbl.setBounds(1005,380,80,30);
      	 	
      	 	add(q10_lbl);
      	 	q10_lbl.setBounds(1005,410,80,25);
      	 	
      	 	add(txt_q10);
      	 	txt_q10.setBounds(1045,415,40,20);
      	 	
      	 	add(btn_buy10);
      	 	btn_buy10.setBounds(1005,445,80,30);
      	 	
      	 	add(bk11_lbl);
      	 	bk11_lbl.setIcon(new ImageIcon(img + "book/bk11.jpg"));
      	 	bk11_lbl.setBounds (100,500,90,130);
      	 	
      	 	add(pr11_lbl);
      	 	pr11_lbl.setBounds(105,630,80,30);
      	 	
      	 	add(q11_lbl);
      	 	q11_lbl.setBounds(105,660,80,25);
      	 	
      	 	add(txt_q11);
      	 	txt_q11.setBounds(145,660,40,20);
      	 	
      	 	add(btn_buy11);
      	 	btn_buy11.setBounds(105,685,80,30);
      	 	
      	 	add(bk12_lbl);
      	 	bk12_lbl.setIcon(new ImageIcon(img + "book/bk12.jpg"));
      	 	bk12_lbl.setBounds (200,500,90,130);
      	 	
      	 	add(pr12_lbl);
      	 	pr12_lbl.setBounds(205,630,80,30);
      	 	
      	 	add(q12_lbl);
      	 	q12_lbl.setBounds(205,660,80,25);
      	 	
      	 	add(txt_q12);
      	 	txt_q12.setBounds(245,660,40,20);
      	 	
      	 	add(btn_buy12);
      	 	btn_buy12.setBounds(205,685,80,30);
      	 	
      	 	add(bk13_lbl);
      	 	bk13_lbl.setIcon(new ImageIcon(img + "book/bk13.jpg"));
      	 	bk13_lbl.setBounds (300,500,90,130);
      	 	
      	 	add(pr13_lbl);
      	 	pr13_lbl.setBounds(305,630,80,30);
      	 	
      	 	add(q13_lbl);
      	 	q13_lbl.setBounds(305,660,80,25);
      	 	
      	 	add(txt_q13);
      	 	txt_q13.setBounds(345,660,40,20);
      	 	
      	 	add(btn_buy13);
      	 	btn_buy13.setBounds(305,685,80,30);
      	 	
      	 	add(bk14_lbl);
      	 	bk14_lbl.setIcon(new ImageIcon(img + "book/bk14.jpg"));
      	 	bk14_lbl.setBounds (400,500,90,130);
      	 	
      	 	add(pr14_lbl);
      	 	pr14_lbl.setBounds(405,630,80,30);
      	 	
      	 	add(q14_lbl);
      	 	q14_lbl.setBounds(405,660,80,25);
      	 	
      	 	add(txt_q14);
      	 	txt_q14.setBounds(445,660,40,20);
      	 	
      	 	add(btn_buy14);
      	 	btn_buy14.setBounds(405,685,80,30);
      	 	
      	 	add(bk15_lbl);
      	 	bk15_lbl.setIcon(new ImageIcon(img + "book/bk15.jpg"));
      	 	bk15_lbl.setBounds (500,500,90,130);
      	 	
      	 	add(pr15_lbl);
      	 	pr15_lbl.setBounds(505,630,80,30);
      	 	
      	 	add(q15_lbl);
      	 	q15_lbl.setBounds(505,660,80,25);
      	 	
      	 	add(txt_q15);
      	 	txt_q15.setBounds(545,660,40,20);
      	 	
      	 	add(btn_buy15);
      	 	btn_buy15.setBounds(505,685,80,30);
      	 	
      	 	add(bk16_lbl);
      	 	bk16_lbl.setIcon(new ImageIcon(img + "book/bk16.jpg"));
      	 	bk16_lbl.setBounds (600,500,90,130);
      	 	
      	 	add(pr16_lbl);
      	 	pr16_lbl.setBounds(605,630,80,30);
      	 	
      	 	add(q16_lbl);
      	 	q16_lbl.setBounds(605,660,80,25);
      	 	
      	 	add(txt_q16);
      	 	txt_q16.setBounds(645,660,40,20);
      	 	
      	 	add(btn_buy16);
      	 	btn_buy16.setBounds(605,685,80,30);
      	 	
      	 	add(bk17_lbl);
      	 	bk17_lbl.setIcon(new ImageIcon(img + "book/bk17.jpg"));
      	 	bk17_lbl.setBounds (700,500,90,130);
      	 	
      	 	add(pr17_lbl);
      	 	pr17_lbl.setBounds(705,630,80,30);
      	 	
      	 	add(q17_lbl);
      	 	q17_lbl.setBounds(705,660,80,25);
      	 	
      	 	add(txt_q17);
      	 	txt_q17.setBounds(745,660,40,20);
      	 	
      	 	add(btn_buy17);
      	 	btn_buy17.setBounds(705,685,80,30);
      	 	
      	 	add(bk18_lbl);
      	 	bk18_lbl.setIcon(new ImageIcon(img + "book/bk18.jpg"));
      	 	bk18_lbl.setBounds (800,500,90,130);
      	 	
      	 	add(pr18_lbl);
      	 	pr18_lbl.setBounds(805,630,80,30);
      	 	
      	 	add(q18_lbl);
      	 	q18_lbl.setBounds(805,660,80,25);
      	 	
      	 	add(txt_q18);
      	 	txt_q18.setBounds(845,660,40,20);
      	 	
      	 	add(btn_buy18);
      	 	btn_buy18.setBounds(805,685,80,30);
      	 	
      	 	add(bk19_lbl);
      	 	bk19_lbl.setIcon(new ImageIcon(img + "book/bk19.jpg"));
      	 	bk19_lbl.setBounds (900,500,90,130);
      	 	
      	 	add(pr19_lbl);
      	 	pr19_lbl.setBounds(905,630,80,30);
      	 	
      	 	add(q19_lbl);
      	 	q19_lbl.setBounds(905,660,80,25);
      	 	
      	 	add(txt_q19);
      	 	txt_q19.setBounds(945,660,40,20);
      	 	
      	 	add(btn_buy19);
      	 	btn_buy19.setBounds(905,685,80,30);
      	 	
      	 	add(bk20_lbl);
      	 	bk20_lbl.setIcon(new ImageIcon(img + "book/bk20.jpg"));
      	 	bk20_lbl.setBounds (1000,500,90,130);
      	 	
      	 	add(pr20_lbl);
      	 	pr20_lbl.setBounds(1005,630,80,30);
      	 	
      	 	add(q20_lbl);
      	 	q20_lbl.setBounds(1005,660,80,25);
      	 	
      	 	add(txt_q20);
      	 	txt_q20.setBounds(1045,660,40,20);
      	 	
      	 	add(btn_buy20);
      	 	btn_buy20.setBounds(1005,685,80,30);
      	 	
      	 	
      	 	
      	 	setLayout(null);
      	 	
      	 	btn_buy01.addActionListener(this);
      	 	btn_buy02.addActionListener(this);
      	 	btn_buy03.addActionListener(this);
      	 	btn_buy04.addActionListener(this);
      	 	btn_buy05.addActionListener(this);
      	 	btn_buy06.addActionListener(this);
      	 	btn_buy07.addActionListener(this);
      	 	btn_buy08.addActionListener(this);
      	 	btn_buy09.addActionListener(this);
      	 	btn_buy10.addActionListener(this);
      	 	btn_buy11.addActionListener(this);
      	 	btn_buy12.addActionListener(this);
      	 	btn_buy13.addActionListener(this);
      	 	btn_buy14.addActionListener(this);
      	 	btn_buy15.addActionListener(this);
      	 	btn_buy16.addActionListener(this);
      	 	btn_buy17.addActionListener(this);
      	 	btn_buy18.addActionListener(this);
      	 	btn_buy19.addActionListener(this);
      	 	btn_buy20.addActionListener(this);
      	 	btn_clear.addActionListener(this);
      	 	btn_new.addActionListener(this);
      	 	btn_total.addActionListener(this);
      	 	btn_show.addActionListener(this);
   		}
   		
   	public void actionPerformed (ActionEvent e){
   		if (e.getSource()==btn_total){
   			double pay = Double.parseDouble(JOptionPane.showInputDialog("Total Cost is: Php " + total + "\nInput Payment: "));
   			if (pay>=total){
   				double change = pay - total;
   				JOptionPane.showMessageDialog(null,"Total Change is: Php " + change);
   				BookList+= "\nTotal Cost: Php " + total + "\nPayment : Php " + pay + "\nChange : Php " + change;
   				txt_display.setText(BookList);
   			}
   			else
   				JOptionPane.showMessageDialog(null,"Your Payment is Lacking");
   		
   		}
   		if (e.getSource()==btn_show){
   		
   			JOptionPane.showMessageDialog(null,"Purchase Summary :" + BookList);
   			
   		}
   		
   		if (e.getSource()==btn_new){
			txt_01.setText("");
   			txt_02.setText("");
   			txt_03.setText("");
   			BookList=("");
   			total= 0;
   			txt_display.setText(BookList);
   			txt_04.setText(Double.toString(total));
   			txt_04.setText("");
   		}
   		if (e.getSource()==btn_clear){ //clear
   			txt_01.setText("");
   			txt_02.setText("");
   			txt_03.setText("");
   			total = 0;
   			txt_04.setText(Double.toString(total));
   			txt_04.setText("");
   		}   	
   		if(e.getSource()==btn_buy01){
   			int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q01.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   			int rmn = stock - qty;
   			double subtotal = x1 * qty;
   			total += subtotal;
   			 txt_03.setText(Integer.toString(x1));
   			 txt_02.setText(Integer.toString(qty1+qty));
   		     txt_q01.setText(Integer.toString(rmn));
   		     txt_01.setText("American Gods - Neil Gaiman");
   		     txt_04.setText(Double.toString(total));
   		     BookList+= "\nAmerican Gods - Neil Gaiman x" + qty;
   		     txt_display.setText(BookList);
   			}
   		     else {
   		     	int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x1));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q01.setText(Integer.toString(rmn));
   		        txt_01.setText("American Gods - Neil Gaiman");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nAmerican Gods - Neil Gaiman x" + qty;
   		        txt_display.setText(BookList);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		        btn_buy01.setEnabled(false);
   		     }
   		}//end btn1
   	//correct
   	   if (e.getSource()==btn_buy02){
   	    	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q02.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x2 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q02.setText(Integer.toString(rmn));
   		        txt_01.setText("Patriot Games - Tom Clancy");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nPatriot Games - Tom Clancy x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q02.setText(Integer.toString(rmn));
   		        txt_01.setText("Patriot Games - Tom Clancy");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nPatriot Games - Tom Clancy x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy02.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy03){
  	   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q03.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x2 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q03.setText(Integer.toString(rmn));
   		        txt_01.setText("Piranha - Michael Dimercurio");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nPiranha - Michael Dimercurio x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q03.setText(Integer.toString(rmn));
   		        txt_01.setText("Piranha - Michael Dimercurio");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nPiranha - Michael Dimercurio x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy03.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}	
   	 		
   	   	if (e.getSource()==btn_buy04){
   	   		int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q04.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x3 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x3));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q04.setText(Integer.toString(rmn));
   		        txt_01.setText("Hunter Killer - George Wallace");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nHunter Killer - George Wallace x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x3 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x3));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q04.setText(Integer.toString(rmn));
   		        txt_01.setText("Hunter Killer - George Wallace");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nHunter Killer - George Wallace x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy04.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}	
   		if (e.getSource()==btn_buy05){
   			int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q05.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x4 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x4));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q05.setText(Integer.toString(rmn));
   		        txt_01.setText("Kilo Class - Patrick Robinson");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nKilo Class - Patrick Robinson x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x4 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x4));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q05.setText(Integer.toString(rmn));
   		        txt_01.setText("Kilo Class - Patrick Robinson");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nKilo Class - Patrick Robinson x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy05.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   		if (e.getSource()==btn_buy06){
   	   		int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q06.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x5 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x5));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q06.setText(Integer.toString(rmn));
   		        txt_01.setText("Casino Royale - Ian Fleming");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nCasino Royale - Ian Fleming x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x5 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x5));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q06.setText(Integer.toString(rmn));
   		        txt_01.setText("Casino Royale - Ian Fleming");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nCasino Royale - Ian Fleming x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy06.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   		if (e.getSource()==btn_buy07){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q07.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x6 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x6));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q07.setText(Integer.toString(rmn));
   		        txt_01.setText("The Wrecking Crew - Donald Hamilton");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nThe Wrecking Crew - Donald Hamilton x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x6 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x6));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q07.setText(Integer.toString(rmn));
   		        txt_01.setText("The Wrecking Crew - Donald Hamilton");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nThe Wrecking Crew - Donald Hamilton x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy07.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}

   		if (e.getSource()==btn_buy08){
   			int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q08.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x7 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x7));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q08.setText(Integer.toString(rmn));
   		        txt_01.setText("The Fault In Our Stars - John Green");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nThe Fault In Our Stars - John Green x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x7 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x7));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q08.setText(Integer.toString(rmn));
   		        txt_01.setText("The Fault In Our Stars - John Green");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nThe Fault In Our Stars - John Green x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy08.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   		if (e.getSource()==btn_buy09){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q09.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x1));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q09.setText(Integer.toString(rmn));
   		        txt_01.setText("Crazy Rich Asians - Kevin Kwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nCrazy Rich Asians - Kevin Kwan x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x1));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q09.setText(Integer.toString(rmn));
   		        txt_01.setText("Crazy Rich Asians - Kevin Kwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nCrazy Rich Asians - Kevin Kwan x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy09.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}	
   		if (e.getSource()==btn_buy10){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q10.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x1));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q10.setText(Integer.toString(rmn));
   		        txt_01.setText("China Rich Girlfriend - Kevin Kwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nChina Rich Girlfriend - Kevin Kwan x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x1));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q10.setText(Integer.toString(rmn));
   		        txt_01.setText("China Rich Girlfriend - Kevin Kwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nChina Rich Girlfriend - Kevin Kwan x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy10.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy11){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q11.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x1));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q11.setText(Integer.toString(rmn));
   		        txt_01.setText("Rich People Problem - Kevin Kwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nRich People Problem - Kevin Kwan x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x1));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q11.setText(Integer.toString(rmn));
   		        txt_01.setText("Rich People Problem - Kevin Kwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nRich People Problem - Kevin Kwan x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy11.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   		if (e.getSource()==btn_buy12){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q12.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x2 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q12.setText(Integer.toString(rmn));
   		        txt_01.setText("Harry Potter: Chamber of Secrets - J.K. Rowling");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nHarry Potter: Chamber of Secrets - J.K. Rowling x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x2 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q12.setText(Integer.toString(rmn));
   		        txt_01.setText("Harry Potter: Chamber of Secrets - J.K. Rowling");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nHarry Potter: Chamber of Secrets - J.K. Rowling x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy12.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   		if (e.getSource()==btn_buy13){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q13.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x2 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q13.setText(Integer.toString(rmn));
   		        txt_01.setText("Harry Potter: The Philosophers Stone - J.K. Rowling");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nHarry Potter: The Philosophers Stone - J.K. Rowling x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x2 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q13.setText(Integer.toString(rmn));
   		        txt_01.setText("Harry Potter: The Philosophers Stone - J.K. Rowling");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nHarry Potter: The Philosophers Stone - J.K. Rowling x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy13.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy14){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q14.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x3 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x3));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q14.setText(Integer.toString(rmn));
   		        txt_01.setText("37 Hours - J.F. Kirwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\n37 Hours - J.F. Kirwan x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x3 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x3));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q14.setText(Integer.toString(rmn));
   		        txt_01.setText("37 Hours - J.F. Kirwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\n37 Hours - J.F. Kirwan x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy14.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy15){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q15.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x4 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x4));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q15.setText(Integer.toString(rmn));
   		        txt_01.setText("The Midnight Cool - Lydia Peele");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nThe Midnight Cool - Lydia Peele x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x4 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x4));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q15.setText(Integer.toString(rmn));
   		        txt_01.setText("The Midnight Cool - Lydia Peele");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nThe Midnight Cool - Lydia Peele x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy15.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
  
   	   	if (e.getSource()==btn_buy16){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q16.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x5 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x5));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q16.setText(Integer.toString(rmn));
   		        txt_01.setText("You Me Everything - Catherine Isaac");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nYou Me Everything - Catherine Isaac x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x5 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x5));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q16.setText(Integer.toString(rmn));
   		        txt_01.setText("You Me Everything - Catherine Isaac");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nYou Me Everything - Catherine Isaac x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy16.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy17){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q17.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x8 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x8));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q17.setText(Integer.toString(rmn));
   		        txt_01.setText("A Wrinkle In Time - Madeleine L'Engle");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nA Wrinkle In Time - Madeleine L'Engle x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x8 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x8));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q17.setText(Integer.toString(rmn));
   		        txt_01.setText("A Wrinkle In Time - Madeleine L'Engle");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nA Wrinkle In Time - Madeleine L'Engle x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy17.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy18){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q18.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x7 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x7));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q18.setText(Integer.toString(rmn));
   		        txt_01.setText("IT - Stephen King");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nIT - Stephen King x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x7 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x7));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q18.setText(Integer.toString(rmn));
   		        txt_01.setText("IT - Stephen King");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nIT - Stephen King x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy18.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy19){
   	   int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q19.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x9 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x9));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q19.setText(Integer.toString(rmn));
   		        txt_01.setText("Girl At War - Sara Novic");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nGirl At War - Sara Novic x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x9 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x9));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q19.setText(Integer.toString(rmn));
   		        txt_01.setText("Girl At War - Sara Novic");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nGirl At War - Sara Novic x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy19.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy20){
   	   		int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q20.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				int rmn = stock - qty;
   			    double subtotal = x0 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x0));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q20.setText(Integer.toString(rmn));
   		        txt_01.setText("A Tale For The Time Being - Ruth Ozeki");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nA Tale For The Time Being - Ruth Ozeki x"+qty;
   		        txt_display.setText(BookList);
   	   }
   			
   		     
   		    else {
   		     int rmn = stock - qty;
   			    double subtotal = x0 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x0));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q20.setText(Integer.toString(rmn));
   		        txt_01.setText("A Tale For The Time Being - Ruth Ozeki");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nA Tale For The Time Being - Ruth Ozeki x"+qty;
   		        txt_display.setText(BookList);
   		        btn_buy20.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}	
   	}//emd actionPerformed
   	
   		
   		
   
    public static void main(String[] args) {
       project01  tp = new project01();
			tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



//references:
//http://www.ntu.edu.sg/home/ehchua/programming/java/j4a_gui.html
//http://zetcode.com/tutorials/javaswingtutorial/
//https://www.youtube.com/playlist?list=PLY-H7Nl6qqgntwySdPesG8eLJRpdjin19