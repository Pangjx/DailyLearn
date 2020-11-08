package com.execlayout;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import com.pjxpro.swingawt.SimpleGuilb;

public class Box {
//	JTextField field;
//	JTextField field2 ;
	JTextArea field;
	JTextArea field2;
	JFrame frame;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box gui = new Box();
		gui.go();
	}

	public void go() {
		frame= new JFrame("BOXlayout");
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();	
	
		field = new JTextArea("请输入要复制的内容位置");
		field.requestFocus();
		field.setLineWrap(true);
		field.setBackground(Color.cyan);
		field.setBorder(BorderFactory.createLineBorder(Color.black,5));
		field.setFont(new java.awt.Font("Dialog",1,50));
		field2= new JTextArea("被复制的内容位置");
		field2.setLineWrap(true);
		field2.setBackground(Color.gray);
		field2.setBorder(BorderFactory.createLineBorder(Color.black,5));
		field2.setFont(new java.awt.Font("Dialog",1,50));
		
		panel2.add(field);
		panel2.add(panel);
		panel2.add(field2);
		panel.setBackground(Color.darkGray);
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
       // 更改默认的flowlayout的布局，初始化boxlayout 规定那个部件用那个轴
		
		JButton button = new JButton("复制");
		JButton buttonTwo = new JButton("清空");
		button.addActionListener(new button());
		buttonTwo.addActionListener(new buttonTwo());
		panel.add(button);
		panel.add(buttonTwo);
		frame.getContentPane().add(BorderLayout.CENTER,panel2);
//		frame.getContentPane().add(BorderLayout.EAST,panel);
//		frame.getContentPane().add(BorderLayout.CENTER,field);
//		frame.getContentPane().add(BorderLayout.CENTER,field2);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	class button implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			field2.setText(field.getText());
			frame.repaint();
		}
	}
	class buttonTwo implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			field.setText("");
			field2.setText("");
			frame.repaint();
		}
	}

}
