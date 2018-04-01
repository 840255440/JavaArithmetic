package ���鼯;

public class UnionFind2 {
	//����Union����Find
	int parent[];
	int size;
	
	public UnionFind2(int size) {
		parent = new int[size];
		 for (int i = 0; i < size; i++) {
	            parent[i] = i;
	        }
		// TODO Auto-generated constructor stub
		
	}
	
	public int find(int element){
		while(element != parent[element]){
			element = parent[element];
		}
		return element;
	}
	
	public boolean isConnected(int firstElement, int secondElement) {
        return find(firstElement) == find(secondElement);
    }
	
	public void unionElements(int firstElement, int secondElement) {
		int firstRoot = find(firstElement);
		int secondRoot = find(secondElement);
		
		if(firstElement == secondElement){
			return;
		}else{
			parent[firstRoot] = secondRoot;
		}
	}
	
	 private void printArr() {
	        for (int parent : this.parent) {
	            System.out.print(parent + "\t");
	        }
	        System.out.println();
	    }

	 public static void main(String[] args) {
	        int n = 10;
	        UnionFind2 union = new UnionFind2(n);
	        System.out.println("��ʼ��");
	        union.printArr();
	 
	        System.out.println("������5 6");
	        union.unionElements(5, 6);
	        union.printArr();
	 
	        System.out.println("������1 2");
	        union.unionElements(1, 2);
	        union.printArr();
	 
	        System.out.println("������2 3");
	        union.unionElements(2, 3);
	        union.printArr();
	 
	        System.out.println("������1 4");
	        union.unionElements(1, 4);
	        union.printArr();
	 
	        System.out.println("������1 5");
	        union.unionElements(1, 5);
	        union.printArr();
	 
	        System.out.println("1  6 �Ƿ����ӣ�" + union.isConnected(1, 6));
	 
	        System.out.println("1  8 �Ƿ����ӣ�" + union.isConnected(1, 8));
	    }
}
