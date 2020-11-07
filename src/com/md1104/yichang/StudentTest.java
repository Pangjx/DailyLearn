package com.md1104.yichang;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student stu = new Student();
        try {
			stu.regist(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(stu.toString());
	}

}
