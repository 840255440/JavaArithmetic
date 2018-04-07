package 最大字串算法;

import static org.junit.Assert.*;

import java.util.Scanner;

public class Test {
	int[] str = new int[10];
	Scanner sc = new Scanner(System.in);
	
	@org.junit.Test
	public void test1() {
		for(int i=0; i<10; i++){
			str[i] = sc.nextInt();
		}
		
		int Maxsum = 0;
		int sum = 0;
		
		for(int j=0; j<10; j++){
			sum += str[j];
			if(sum < 0){
				sum = 0;
			}
			if(sum > Maxsum){
				Maxsum = sum;
			}
		}
		System.out.println(Maxsum);
	}
	
	@org.junit.Test
	public void test2(){
		for(int i=0; i<10; i++){
			str[i] = sc.nextInt();
		}
		int Maxsum = 0;
		int left = 0;
		int right = 0;
		
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				int sum=0;
				for(int k=i; k<10;k++){
					sum += str[k];
					if(sum>Maxsum){
						Maxsum = sum;
						left = i;
						right = k;
					}
				}
			}
		}
		 System.out.println("起始位置:"+left);
		 System.out.println("终止位置:"+right);
		 System.out.println(Maxsum);
	}

}

