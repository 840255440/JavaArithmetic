package ’€∞Î≤È’“;

import java.util.Arrays;

public class BinaryResearch {
	public static int find(Comparable[] a,Comparable temp){
		int N = a.length;
		int start = 0;
		int end = N-1;
		while(start<=end){
			int mid = (end + start)/2;
			if(a[mid] == temp){
				return mid;
			}else if(a[mid].compareTo(temp)>0){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String[] a = {"A", "E", "E", "L", "M" ,"O", "P", "R", "S", "T", "X"};
		System.out.println(find(a, "P"));
		System.out.println();
		System.out.println(Arrays.binarySearch(a, "L"));
	}
}
