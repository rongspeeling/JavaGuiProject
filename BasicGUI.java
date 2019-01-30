/**
 * @(#)BasicGUI.java
 *
 *
 * @author 
 * @version 1.00 2019/1/10
 */

import javax.swing.*;
import java.awt.Button;
import java.awt.Color;

public class BasicGUI extends JFrame {
      
     		
      	   //declaring Components
      	   
      	   JLabel lblATN, lblN1, lblN2, lblR;
      	   JButton bAdd, bClear;
      	   JTextField txtN1, txtN2, txtR;
      	
      	
      	 public BasicGUI() {
      	 	
      	 	///Contruction/Instantiate
      	 	
      	 	setSize(400,400);
      	 	setVisible(true);
      	 	setTitle("Adding Two Number");
      	 	
      	 	lblATN = new JLabel("Adding Two Number");
      	 	lblN1 = new JLabel("Number 1");
      	 	lblN2 = new JLabel("Number 2");
      	 	lblR = new JLabel("Result");
      	 	
      	 	bAdd = new JButton("ADD");
      	 	bAdd.setBackground(Color.YELLOW);
      	 	
      	 	bClear = new JButton("CLEAR");
      	 	bClear.setBackground(Color.YELLOW);
      	 	
      	 	
      	 	txtN1 = new JTextField(20);
      	 	txtN2 = new JTextField(20);
      	 	txtR = new JTextField(20);
      	 	
      	 	
      	 
      	 	//Placing Component on the Frame
      	 	
      	 	add(lblATN);
      	 	lblATN.setBounds(100,30,200,50);
      	 	
      	 	add(lblN1);
      	 	lblN1.setBounds(50,100,100,30);
      	 	
      	 	add(txtN1);
      	 	txtN1.setBounds(170,100,100,30);
      	 	
      	 	add(lblN2);
      	 	lblN2.setBounds(50,150,100,30);
      	 	
      	 	add(txtN2);
      	 	txtN2.setBounds(170,150,100,30);
      	 	
      	 	add(lblR);
      	 	lblR.setBounds(50,200,100,30);
      	 	
      	 	add(txtR);
      	 	txtR.setBounds(170,200,100,30);
      	 	
      	 	add(bAdd);
      	 	bAdd.setBounds(170,250,80,30);
      	 	
      	 	
      	 	add(bClear);
      	 	bClear.setBounds(280,250,80,30);
      	 	
      	 	
      		
      	
      	
      	}
      
    public static void main(String[] args) {
			BasicGUI  BG = new BasicGUI();
			BG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
