package 矩阵转移90度;

import java.util.Scanner;

public class Relivation {
	int[][] a;
	int N;
	public Relivation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组的大小N:");
		N = sc.nextInt();
		a = new int[N][N];
		System.out.println("请输入矩阵:");
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		// TODO Auto-generated constructor stub
	}
	
	public void show(){
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void Relivation1(){//旋转90度
		System.out.println("旋转90度");
		int b[][] = new int[N][N];
		 for(int i=0;i<N;i++){  
	            for(int j=0;j<N;j++){  
	                b[i][j]=a[N-j-1][i];;  
	            }  
	        }            
		 for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
	}
	
	public void Relivation2(){//旋转180度
		System.out.println("旋转180度");
		int b[][] = new int[N][N];
		 for(int i=0;i<N;i++){  
	            for(int j=0;j<N;j++){  
	                b[i][j]=a[N-i-1][N-j-1];;  
	            }  
	        }            
		 for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
	}
	public static void main(String[] args) {
//		System.out.println(Integer.toBinaryString(2));
//		System.out.println(Integer.toBinaryString(-2));
//		int c = -2 >>> 1;
//		 System.out.println(c);
//		 System.out.println(Integer.toBinaryString(c));
		Relivation r = new Relivation();
		r.show();
		r.Relivation1();
		r.Relivation2();
	}
}
