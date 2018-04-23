package ×Ö·û´®;

public class InternTest{
	public static void main(String[] args) {
		String a1="1";
		String b1= new String("1");
		System.out.println(a1 == b1);
		String b2="2";
		String a2=new String("2");
//		a2 = a2.intern();
		System.out.println(a2==b2);
		String a3 = new String("3");
		a3.intern();
		String b3 = "3";
		System.out.println(a3==b3);
		String a4 = "4";
		String b4 = "4";
		System.out.println(a4 == b4);
		String a5 = (new String("123")+new String("456"));//123456
		a5.intern();
		String b5 = "123456";
		System.out.println(a5 == b5);
	}
}
