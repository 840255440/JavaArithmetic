package Dijkstra双栈算法;

import java.util.Scanner;
import java.util.Stack;

public class Evaluate {
	String s;
	public Evaluate(String s) {
		// TODO Auto-generated constructor stub
		s.replace(" ", "");
		this.s = s;
	}
	
	public double Result(){
		double result = 0;
		Stack<Character> ops = new Stack<Character>();
		Stack<Double> vals = new Stack<Double>();
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length; i++){
			if(ch[i] == '(');
			else if(ch[i] == '+') ops.push(ch[i]);
			else if(ch[i] == '-') ops.push(ch[i]);
			else if(ch[i] == '*') ops.push(ch[i]);
			else if(ch[i] == '/') ops.push(ch[i]);
			else if(ch[i] == ')') 
			{
				char op = ops.pop();
				double val = vals.pop();
				if(op == '+') val = vals.pop() + val;
				if(op == '-') val = vals.pop() - val;
				if(op == '*') val = vals.pop() * val;
				if(op == '/') val = vals.pop() / val;
				System.out.println(op + " " +val);
				vals.push(val);
				result = val;
			}
			else{
				vals.push(Double.parseDouble(Character.toString(ch[i])));
			}
		}

		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入表达式：");
		String s = sc.next();
		Evaluate e = new Evaluate(s);
		System.out.println(s+"="+e.Result());
	}
}
