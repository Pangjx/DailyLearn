package com.pjxpro.swingio;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.io.*;
public class QuizCardBuilder {
      private JTextArea question;
      private JTextArea answer;
      private ArrayList<QuizCard> cardList;
      private JFrame frame;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       QuizCardBuilder builder = new QuizCardBuilder();
       builder.go();
	}
	public void go() {
		frame = new JFrame("Qui Card Builder");
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif",Font.BOLD,24);
		question = new JTextArea(6,20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(bigFont);
		
		JScrollPane qScorller = new JScrollPane(question);
	    qScorller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    qScorller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);


	    answer = new JTextArea(6,20);
	    answer.setLineWrap(true);
	    answer.setWrapStyleWord(true);
	    answer.setFont(bigFont);
	    JScrollPane aScorller = new JScrollPane(answer);
	    aScorller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    aScorller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	
	    JButton nextButton = new JButton("Next Card");
	    
	    cardList = new ArrayList<QuizCard>();
	    
	    JLabel qLabel = new JLabel("Question");
	    JLabel aLabel = new JLabel("Answer");
	    
	    mainPanel.add(qLabel);
	    mainPanel.add(qScorller);
	    mainPanel.add(aLabel);
	    mainPanel.add(aScorller);
	    mainPanel.add(nextButton);
	    nextButton.addActionListener(new NextCardListener());
	    JMenuBar menuBar = new JMenuBar();
	    JMenu fileMenu = new JMenu("File");
	    JMenuItem newMenuItem = new JMenuItem("New");
	    JMenuItem saveMenuItem = new JMenuItem("Save");
	    newMenuItem.addActionListener(new NewMenListener());
	    
	    saveMenuItem.addActionListener(new SaveMenuListener());
	    fileMenu.add(newMenuItem);
	    fileMenu.add(saveMenuItem);
	    menuBar.add(fileMenu);
	    frame.setJMenuBar(menuBar);
	    frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
	    frame.setSize(500,600);
	    frame.setVisible(true);
	}
	
   public class NextCardListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  QuizCard card = new QuizCard(question.getText(),answer.getText());
	       cardList.add(card);
	       clearCard();
	}

   }
   
	
 	

    public class NewMenListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		   cardList.clear();
		   clearCard();
	}

   }
   
    
    public class SaveMenuListener implements ActionListener{
    	public void actionPerformed(ActionEvent e) {
    		// TODO Auto-generated method stub
    		QuizCard card = new QuizCard(question.getText(), answer.getText());
    	    cardList.add(card);
    	    
    	    JFileChooser fileSave = new JFileChooser();
    	    fileSave.showSaveDialog(frame);
    	    saveFile(fileSave.getSelectedFile());
    	}

		private void saveFile(File file) {
			// TODO Auto-generated method stub
			try {
			   BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			   for(QuizCard card:cardList) {
				   writer.write(card.getQuestion()+"/");
				   writer.write(card.getAnswer()+"\n");
			   }
			   writer.close();
			
			}catch(IOException e) {
				 System.out.println("couldn't write the cardList out");
			     e.printStackTrace();
			}
			}

       }
       
   
	private void clearCard() {
		// TODO Auto-generated method stub
		question.setText("");
		answer.setText("");
		question.requestFocus();
	}
   

}
