package com.p30.exer;


/*
 *
 */
public class ComparableCircle extends Circle implements CompareObject {
   public ComparableCircle(double radius) {
	   super(radius);  
   }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this == o) {
		return 0;
		}
		if( o instanceof ComparableCircle)
		{
			ComparableCircle c = (ComparableCircle)o;
//			�����
//			return (int) (this.getRadius()-c.getRadius());
//		��ȷ��
//		if(this.getRadius()>c.getRadius()) {
//			return 1;
//		}else if(this.getRadius()<c.getRadius()) {
//			return -1;
//		}else{
//			return 0;
//		}
			//����������ΪDouble����ʱ���Ե��ð�װ��ıȽϷ���
			this.getRadius().compareTo(c.getRadius());
	}
		return 0;
//		 throw new RuntimeException("������������Ͳ�ƥ��");
}}
