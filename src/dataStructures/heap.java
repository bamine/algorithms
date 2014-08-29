package dataStructures;

/**
 * Created by amine on 28/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
 */
public class heap {
    private int[] A;
    private int heapsize;

    public heap(int[] A) {
        this.A = A;
        this.heapsize = A.length;
    }

    public int getLength() {
        return A.length;
    }
    public int getHeapsize() {
        return heapsize;
    }
    public void setHeapsize(int newHeapSize) {
        heapsize=newHeapSize;
    }

    public int[] getArray(){
        return A;
    }

    public int get(int i) {
        return A[i];
    }

    public void display() {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(" ");
    }

    public void swap(int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public int heapMaximum(){
        return A[0];
    }

    public int heapExtractMax(){
        if(heapsize<1){
            System.out.println("heap underflow");
            return -Integer.MAX_VALUE;
        }
        int max=A[0];
        A[0]=A[heapsize-1];
        heapsize=heapsize-1;
        heapUtil.maxHeapify(this,0);
        return max;
    }

    public void maxHeapInsert(int key){
        heapsize+=1;
        int[] B=new int[heapsize];
        for(int i=0;i<heapsize-1;i++){
            B[i]=A[i];
        }
        B[heapsize-1]=-Integer.MAX_VALUE;
        A=B;
        heapIncreaseKey(heapsize,key);
    }

    public void heapIncreaseKey(int i,int key){
        if(key<A[i]){
            System.out.println("error : new key is smaller than current key. Nothing changed");
        }
        A[i]=key;
        while(i>1 && A[parent(i)]<A[i]){
            swap(i,parent(i));
            i=parent(i);
        }
    }

    public int left(int i) {
        return 2 * i + 1;
    }

    public int right(int i) {
        return 2 * i + 2;
    }

    public int parent(int i) {
        return i / 2;
    }
}
