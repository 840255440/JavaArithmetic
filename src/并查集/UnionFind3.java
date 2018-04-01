package ���鼯;

public class UnionFind3 {
//����union������find����������
	 private int[] parent;
	    private int[] weight;
	    private int size;
	 
	    public UnionFind3(int size) {
	        this.parent = new int[size];
	        this.weight = new int[size];
	        this.size = size;
	        for (int i = 0; i < size; i++) {
	            this.parent[i] = i;
	            this.weight[i] = 1;
	        }
	    }
	 
	    public int find(int element) {
	        while (element != parent[element]) {
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
	 
	        //����Ѿ�����ͬһ�������ˣ��Ͳ����ٺϲ��ˡ�
	        if (firstRoot == secondRoot) {
	            return;
	        }
	 
	        if (weight[firstRoot] > weight[secondRoot]) {
	            parent[secondRoot] = firstRoot;
	            weight[firstRoot] += weight[secondRoot];
	        } else {//weight[firstRoot] <= weight[secondRoot]
	            parent[firstRoot] = secondRoot;
	            weight[secondRoot] += weight[firstRoot];
	        }
	    }
	 
	    private void printArr(int[] arr){
	        for(int p : arr){
	            System.out.print(p+"\t");
	        }
	        System.out.println();
	    }
	 
	    public static void main(String[] args) {
	        int n = 10;
	        UnionFind3 union = new UnionFind3(n);
	 
	        System.out.println("��ʼparent��");
	        union.printArr(union.parent);
	        System.out.println("��ʼweight��");
	        union.printArr(union.weight);
	 
	        System.out.println("������5 6 ֮���parent��");
	        union.unionElements(5, 6);
	        union.printArr(union.parent);
	        System.out.println("������5 6 ֮���weight��");
	        union.printArr(union.weight);
	 
	        System.out.println("������1 2 ֮���parent��");
	        union.unionElements(1, 2);
	        union.printArr(union.parent);
	        System.out.println("������1 2 ֮���weight��");
	        union.printArr(union.weight);
	 
	        System.out.println("������2 3 ֮���parent��");
	        union.unionElements(2, 3);
	        union.printArr(union.parent);
	        System.out.println("������2 3 ֮���weight��");
	        union.printArr(union.weight);
	 
	        System.out.println("������1 4 ֮���parent��");
	        union.unionElements(1, 4);
	        union.printArr(union.parent);
	        System.out.println("������1 4 ֮���weight��");
	        union.printArr(union.weight);
	 
	        System.out.println("������1 5 ֮���parent��");
	        union.unionElements(1, 5);
	        union.printArr(union.parent);
	        System.out.println("������1 5 ֮���weight��");
	        union.printArr(union.weight);
	 
	        System.out.println("1  6 �Ƿ����ӣ�" + union.isConnected(1, 6));
	 
	        System.out.println("1  8 �Ƿ����ӣ�" + union.isConnected(1, 8));
	    }
}
