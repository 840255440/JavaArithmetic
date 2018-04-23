package ƒ£ Ω∆•≈‰À„∑®;

public class Index_KMP {
	private String s1;
	private String s2;
	private int[] next;
	
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	
	public Index_KMP(String s1, String s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public int Find(){
		int n = 0;
		get_next();
		for(int i=0;i<next.length;i++){
			System.out.print(next[i]+" ");
		}
		System.out.println();
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		int i=0;
		int j=0;
		while(i<a1.length && j<a2.length){
			if(a1[i]==a2[j]){
				i++;
				j++;
			}else{
				j=next[j];
			}
		}
		if(j==a2.length){
			return i-j;
		}
		return 0;
	}
	
	public void get_next(){
		char[] p = s2.toCharArray();
		next = new int[p.length];
		next[0] = -1;
	    int j = 0;
	    int k = -1;
	    while (j < p.length - 1) {
	       if (k == -1 || p[j] == p[k]) {
	           next[++j] = ++k;
	       } else {
	           k = next[k];
	       }
	    }
	}
	public static void main(String[] args) {
		Index_KMP kmp = new Index_KMP("ababaabcacwejds", "abaabcac");
		System.out.println(kmp.Find());
	}
}
