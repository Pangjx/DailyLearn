package com.pjxpro.io;

import java.io.*;

public class Box implements Serializable {
	private int width;
	private int height;

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Box mybox = new Box();
          mybox.setWidth(50);
          mybox.setHeight(20);
          /*
           * ���л����
           */
//          try {
//        	  FileOutputStream fs  = new FileOutputStream("foo.ser");
//        	  ObjectOutputStream os = new ObjectOutputStream(fs);
//        	  os.writeObject(mybox);
//        	  System.out.print("д��ɹ�");
//        	  os.close();
//          }catch(Exception e) {
//        	  e.printStackTrace();
//          }
          /*
           * �ַ������Ϊtxt
           */
          
          try {
        	  FileWriter writer = new FileWriter("Foo.txt");
        	  writer.write("������");
        	  writer.close();    	  
          }catch(IOException e) {
        	  e.printStackTrace();
          }
	}

}
