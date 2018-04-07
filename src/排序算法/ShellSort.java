package �����㷨;

import java.io.FileNotFoundException;

public class ShellSort {
	
	public static void sort(Comparable[] a){  
		    //����������㷨ʵ�ִ���  
		 int N = a.length;
		 int h = 1;
		 while(h<N/3) h = 3*h+1;//1��4��7��13
				 while(h>=1){
					 for(int i=h;i<N;i++){
						 for(int j=i; j>=h; j-=h){
							 if(less(a[j],a[j-h]))
								 exch(a, j-h, j);
						 }
					 }
					 h= h/3;
				 }
	}
	private static boolean less(Comparable v, Comparable w){  
		        return v.compareTo( w) < 0;  
		    }  
	private static  void exch(Comparable[] a, int i, int j){  
		        Comparable t = a[i];  
		        a[i] = a[j];  
		        a[j] = t;  
		    }  
	private static void show(Comparable[] a){  
		        //�ڵ����д�ӡ����  
		        for (int i = 0; i < a.length; i++) {  
		            System.out.print(a[i] + " ");  		     
		        } 
		        System.out.println();  
		    }  
	public static  boolean isSorted(Comparable[] a){  
		        //��������Ԫ���Ƿ�����  
		        for (int i = 0; i < a.length; i++) {  
		            if(less(a[i], a[i-1]))  
		                return false;  
		        }  
		        return true;  
		    }  
	public static void main(String[] args){  
		        // TODO Auto-generated method stub  
		    	String[] a = {"S","O","R","T","E","X","A","M","P","L","E"}; 
		        sort(a);  
		        assert isSorted(a);  
		        show(a);	          
		    }  
}
