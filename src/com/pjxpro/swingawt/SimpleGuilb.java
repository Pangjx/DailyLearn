package com.pjxpro.swingawt;

import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuilb implements ActionListener {
	JLabel label;
	JFrame frame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGuilb gui = new SimpleGuilb();
		gui.go();
	}

	public void go() {

		// ����1
		// button = new JButton("click me ");
		// button.addActionListener(this);
		// MyDrawPanel drawP = new MyDrawPanel();
		// frame.getContentPane().add(BorderLayout.SOUTH, button);
		// frame.getContentPane().add(BorderLayout.CENTER, drawP);
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(300, 300);
		// frame.setVisible(true);
		/*
		 * ����2 �����ؼ���ͬһ������������ʵ��
		 */ frame = new JFrame();
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton labelButton = new JButton("change label");
		labelButton.addActionListener(new LabelListener());
	
		JButton colorButton = new JButton("change Circle");
		labelButton.addActionListener(new ColorListener());

		label = new JLabel("����label");
		MyDrawPanel drawPanel = new MyDrawPanel();

		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.setSize(900,900);
		frame.setVisible(true);
	}

	// public void actionPerformed(ActionEvent event) {
	// button.setText("I've been clicked!");
	// frame.repaint();
	// }
	/*
	 * ����2 �� �����ڲ���ļ����ӿڵ�ʵ��
	 */
	class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("ouch!");
		}
	}

	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	}

	// �ڲ�����дpaintCompoent����
	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
			GradientPaint gradient = new GradientPaint(70, 70, Color.BLUE, 150, 150, Color.green);
			g2d.setPaint(gradient);
			g2d.fillOval(10, 10, 200,200);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}
