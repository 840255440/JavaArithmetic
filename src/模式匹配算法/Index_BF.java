package ƒ£ Ω∆•≈‰À„∑®;

public class Index_BF {
	private String S;
	private String T;
	public Index_BF(String s, String t) {
		super();
		S = s;
		T = t;
	}
	public String getS() {
		return S;
	}
	public void setS(String s) {
		S = s;
	}
	public String getT() {
		return T;
	}
	public void setT(String t) {
		T = t;
	}
	
	public  int BF(){
		int i = 0;
		int j = 0;
	
		char[] ss = this.S.toCharArray();
		char[] tt = this.T.toCharArray();
		
		while(i<ss.length && j<tt.length){
			if(ss[i] == tt[j]){
				++i;
				++j;
			}else{
				i=i-j+1;
				j=0;
			}
		}
		if(j>=tt.length) return i-T.length();
		else	
		return 0;
	}
	public static void main(String[] args) {
	
		String c = new String("aaabbaaa")+new String("a");
		c.intern();
		String a = "aaabbcaa";
		String e = "aaabbaaaa";
		System.out.println(e == c);
		String a1 = "123";
		String a2 = new String("123").intern();
		a2.intern();
		System.out.println(a1==a2);
		String b = "caa";
		Index_BF bf = new Index_BF(a, b);
		System.out.println(bf.BF());
		System.out.println(a.indexOf(b));
	}
}
