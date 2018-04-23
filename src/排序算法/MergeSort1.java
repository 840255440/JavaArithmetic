package �����㷨;

public class MergeSort1 {
	 public static void sort(Comparable[] a){  
		    //����������㷨ʵ�ִ���  
		 //ԭ�ع鲢
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
			 System.out.println("�Ƚ�"+b[i]+i+":"+b[j]+j);
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
	    	String[] a = {"E","E","G","M","R","A","C","E","R","T"}; 
	        sort(a);  
	        assert isSorted(a);  
	        show(a);	          
	    }  
}
