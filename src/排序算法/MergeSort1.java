package 排序算法;

public class MergeSort1 {
	 public static void sort(Comparable[] a){  
		    //具体的排序算法实现代码  
		 //原地归并
		 int lo=0;
		 int i =lo;
		 int mid = a.length/2;
		 int j = mid;
		 int hi = a.length-1;
		 Comparable[] b = new Comparable[a.length];
		 for(int k=lo;k<=hi;k++){
			 b[k] = a[k];
		 }
		 for(int k=lo; k<=hi; k++){
			 System.out.println("比较"+b[i]+i+":"+b[j]+j);
			 if(i>mid) a[k] = b[j++];
			 else if(j>hi) a[k] = b[i++];
			 else if(less(b[j],b[i])) a[k] = b[j++];
			 else a[k] = b[i++];
			 System.out.println(a[k]);
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
	    	String[] a = {"E","E","G","M","R","A","C","E","R","T"}; 
	        sort(a);  
	        assert isSorted(a);  
	        show(a);	          
	    }  
}
