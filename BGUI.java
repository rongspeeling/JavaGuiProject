/**
 * @(#)BasicGUI.java
 *
 *
 * @author 
 * @version 1.00 2019/1/10
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class BGUI extends JFrame implements ActionListener {
      
     
      	   //declaring Components
      	   
      	   JLabel lblATN, lblN1, lblN2, lblR, lblx, lblBG;
      	   JButton bAdd, bClear;
      	   JTextField txtN1, txtN2, txtR;
      	   Icon Pic1 = new ImageIcon("C:/Users/student/Documents/image/Koala.jpg");
      	
      	
      	 public BGUI() {
      	 	
      	 	///Contruction/Instantiate
      	 	
      	 	setSize(400,500);
      	 	setVisible(true);
      	 	setTitle("ADDING TWO NUMBER");
      	 	
      	 	//set background for JFrame
      	 	Container C = getContentPane();
      	 	C.setBackground(new Color(197,27,99));
      	 	
      	 	lblATN = new JLabel("ADDING TWO NUMBERS");
      	 	lblN1 = new JLabel("NUMBER 1");
      	 	lblN2 = new JLabel("NUMBER 2");
      	 	lblR = new JLabel("RESULT");
      	 	
      	 	lblBG = new JLabel(Pic1);
      	 	
      	 	
      	 	bAdd = new JButton("ADD");
      	 	bClear = new JButton("CLEAR");
      	 	
      	 	txtN1 = new JTextField(20);
      	 	txtN2 = new JTextField(20);
      	 	txtR = new JTextField(20);
      	 	
      	 	lblx= new JLabel("");
      	 	
      	 	//Placing Component on the Frame
      	 	
      	 	add(lblATN);
      	 	lblATN.setBounds(100,50,200,50);
      	 	
      	 	add(lblN1);
      	 	lblN1.setBounds(50,120,100,30);
      	 	
      	 	add(txtN1);
      	 	txtN1.setBounds(170,120,100,30);
      	 	
      	 	add(lblN2);
      	 	lblN2.setBounds(50,150,100,30);
      	 	
      	 	add(txtN2);
      	 	txtN2.setBounds(170,150,100,30);
      	 	
      	 	add(lblR);
      	 	lblR.setBounds(50,180,100,30);
      	 	
      	 	add(txtR);
      	 	txtR.setBounds(170,180,100,30);
      	 	
      	 	add(bAdd);
      	 	bAdd.setBounds(50,230,100, 30);
      	 	
      	 	add(bClear);
      	 	bClear.setBounds(170,230,100,30);
      	 	
      	 	add(lblBG);
      	 	lblBG.setBounds(0,0,400,500);
      	 	
      		add(lblx);
      	
      	
      	   bAdd.addActionListener(this);
      	   bClear.addActionListener(this);
      	
      	}//end of contructor
      	
      	
    //Event Handlers
    
    public void actionPerformed (ActionEvent e){
    	
    	   if (e.getSource() == bAdd){
    	   		int a,b,sum;
    	   		
    	   		a = Integer.parseInt(txtN1.getText());
    	   		b = Integer.parseInt(txtN2.getText());
    	   		sum = a+ b;
    	   		txtR.setText(Integer.toString(sum));
    	   	
    	   	}//end of bAdd event
    	   	
    	   	
    	   if (e.getSource()== bClear){
    	   		txtN1.setText("");
    	   		txtN2.setText("");
    	   		txtR.setText("");
    	   	
    	   	}	
    	
    	
    	}//end of Event Handler  	
      	
      
    public static void main(String[] args) {
			BGUI  BG = new BGUI();
			BG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
