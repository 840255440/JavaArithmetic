package 排序算法;

import java.io.FileNotFoundException;

public class InsertSort {
	
	public static void sort(Comparable[] a){  
		    //具体的排序算法实现代码  
		int N = a.length;
		for(int i=1; i< N; i++){
			for(int j=i;j>0;j--){
				if(less(a[j], a[j-1]))
					exch(a, j-1, j);
			}
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
		        //在单行中打印数组  
		        for (int i = 0; i < a.length; i++) {  
		            System.out.print(a[i] + " ");  		     
		        } 
		        System.out.println();  
		    }  
	public static  boolean isSorted(Comparable[] a){  
		        //测试数组元素是否有序  
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
