package ����ת��90��;

import java.util.Scanner;

public class Relivation {
	int[][] a;
	int N;
	public Relivation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������Ĵ�СN:");
		N = sc.nextInt();
		a = new int[N][N];
		System.out.println("���������:");
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
	
	public void Relivation1(){//��ת90��
		System.out.println("��ת90��");
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
	
	public void Relivation2(){//��ת180��
		System.out.println("��ת180��");
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
