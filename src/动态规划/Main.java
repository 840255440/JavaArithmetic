package 动态规划;

import java.util.Scanner;

public class Main {
/*
 * 面的数字三角形中寻找一条从顶部到底边的路径，使得路径上所经过的数字之和最大。路径上的每一步都只能往左下或 右下走。
 * 只需要求出这个最大和即可，不必给出具体路径。 三角形的行数大于1小于等于100，数字为 0 - 99
 */
	public static void main(String[] args) {
		int[] SumMax = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数n：");
		int n = sc.nextInt();
		int[][] num = new int[n+1][n+1];
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				num[i][j] = sc.nextInt();
			}
		}
		for(int i=1; i<=n; i++){
			SumMax[i] = num[n][i];
		}
		show(num,n);
		for(int i=n-1; i>=1; --i){
			for(int j=1; j<=i; ++j){
				SumMax[j] = max(SumMax[j],SumMax[j+1]) + num[i][j];
				System.out.println("SumMax["+j+"]="+SumMax[j]);
			}
		}
		System.out.println(SumMax[1]);
	}
	
	public static void show(int[][] num,int n){
		for(int i=1; i<=n; i++){
			{
				int m=n-i;
				while(--m>=0){
					System.out.print(" ");
				}
			}
			for(int j=1; j<=i;j++){
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int max(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
}
