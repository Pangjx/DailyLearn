package com.md1104.neibulei;

import com.md1104.neibulei.Person.Bird;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Person p = new Person();
         p.eat();
//        Person.Bird b2 = new Person().new Bird();
         Bird b2 = new Person().new Bird();
         b2.display("Ð¡Äñ");
         System.out.println("");
         System.out.println("");
         Person.Bird b = p.new Bird();
         b.display("´óÄñ");
      
	}

}
