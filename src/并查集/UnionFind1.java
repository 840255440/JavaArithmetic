package ���鼯;

public class UnionFind1 {
    /**
     * ���飬��ʾ���鼯����Ԫ��
     */
    private int[] id;
 
    /**
     * ���鼯��Ԫ�ظ���
     */
    private int size;
 
    /**
     * ����һ���µĲ��鼯
     *
     * @param size ��ʼ��С
     */
    public UnionFind1(int size) {
        //��ʼ������
        this.size = size;
        //��ʼ�����飬ÿ�����鼯��ָ���Լ�
        id = new int[size];
        for (int i = 0; i < size; i++) {
            id[i] = i;
        }
    }
 
    /**
     * �鿴Ԫ���������ĸ�����
     *
     * @param element Ҫ�鿴��Ԫ��
     * @return elementԪ�����ڵļ���
     */
    private int find(int element) {
        return id[element];
    }
 
    /**
     * �ж�����Ԫ���Ƿ�ͬ����һ������
     *
     * @param firstElement  ��һ��Ԫ��
     * @param secondElement �ڶ���Ԫ��
     * @return <code>boolean</code> ������򷵻�true��
     */
    public boolean isConnected(int firstElement, int secondElement) {
        return find(firstElement) == find(secondElement);
    }
 
    /**
     * �ϲ�����Ԫ�����ڵļ��ϣ�Ҳ������������Ԫ��
     *
     * @param firstElement  ��һ��Ԫ��
     * @param secondElement �ڶ���Ԫ��
     */
    public void unionElements(int firstElement, int secondElement) {
        //�ҳ�firstElement���ڵļ���
        int firstUnion = find(firstElement);
        //�ҳ�secondElement���ڵļ���
        int secondUnion = find(secondElement);
 
        //�������������ͬһ�����ϣ���ô�ϲ���
        if (firstUnion != secondUnion) {
            //�������飬ʹԭ����firstUnion��secondUnion�ϲ�ΪsecondUnion
            for (int i = 0; i < this.size; i++) {
                if (id[i] == firstUnion) {
                    id[i] = secondUnion;
                }
            }
        }
    }
 
    /**
     * �����鼯ʹ������ʵ�֣�Ϊ�˸�ֱ�۵ؿ����ڲ����ݣ����ô�ӡ����
     */
    private void printArr() {
        for (int id : this.id) {
            System.out.print(id + "\t");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
    	
        int n = 10;
        UnionFind1 union = new UnionFind1(n);
        System.out.println("��ʼ��");
        union.printArr();
 
        System.out.println("������5 6");
        union.unionElements(5, 6);
        union.printArr();
 
        System.out.println("������1 2");
        union.unionElements(2, 1);
        union.printArr();
 
        System.out.println("������2 3");
        union.unionElements(3, 2);
        union.printArr();
 
        System.out.println("������1 4");
        union.unionElements(1, 4);
        union.printArr();
 
        System.out.println("������1 5");
        union.unionElements(1, 5);
        union.printArr();
        
        long startTime =  System.currentTimeMillis();      
        System.out.println("1  6 �Ƿ����ӣ�" + union.isConnected(1, 6));
        long endTime = System.currentTimeMillis();
        System.out.println("�����ٶ�"+(endTime-startTime));
        
        System.out.println("1  8 �Ƿ����ӣ�" + union.isConnected(1, 8));
    }
}