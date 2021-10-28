package SANDQ;

public class Queue {
    int[] arr;
    int nElems;
    int Cap;
    int front = 0, rear = -1;

    public Queue(int s) {
        Cap = s;
        nElems = 0;
        arr = new int[Cap];
    }

    public void enqueue(int i) {
        rear = (rear + 1) % arr.length;
        nElems++;
        arr[rear] = i;

    }//end "enqueue"

    public int dequeue() {
        int temp = arr[front];
        nElems--;
        front = (front + 1) % arr.length;

        return temp;
    }//end "dequeue"

    public boolean isFull() {
        return nElems == Cap;
    }//end "isFull"

    public boolean isEmpty() {
        return nElems == 0;
    }//end "isEmpty"

    public int size() {
        return nElems;
    }//end "size"

    static int[] a = {1,2};
    public static void main(String[] args) {
        Stack s = new Stack(10);
    Queue q = new Queue(10);


        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(2);
        s.push(q.dequeue());
        s.push(q.dequeue());
        s.pop();
        s.disp();
        System.out.println(q.dequeue());


    }
    static int nElem = 2;

    static void insert(int e){
        if(nElem>=a.length){
            int[] t = new int[a.length*2];
            for(int i=0;i<nElem;i++)
                t[i]=a[i];
            a=t;
        }
        a[nElem]=e;
        nElem++;
    }




    public static void greator(int[] a){
        int sum = 0;
        for (int i=0;i<a.length;i++) {
            sum+=a[i];
        }
        int avg = sum/a.length,count=0;
        for(int i = 0;i<a.length;i++)
            if(a[i]>avg){count++;}
        System.out.println(count);
    }

    static void disp(int[] a){
        for (int l : a) {
            System.out.println(l);
        }
    }

    static void insertO(int v, int[] a) {
        int spot = 0;
        for (int i : a) {
            if (v <= a[i]) {
                spot = i;
                break;      //FIND THE SPOT TO SHIFT FROM :D
            }
        }
        for (int k = a.length - 1; k > spot; k--) {
            a[k] = a[k - 1];   //SHIFT RIGHT
        }
        a[spot] = v;


        for (int l : a) {
            System.out.println(l);
        }

    }


    static void removeel(int[] a){
        for(int i = 0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
    }


    public void shiftleft(int[] a, int index) {

        for (int k = index; k < a.length - 1; k++) {
            a[k] = a[k + 1];
        }
        for (int l : a) {
            System.out.println(l);
        }
    }

    public static int searcharr(int[] a, int s) {
        int left = 0, right = a.length - 1;

        while (right >= left) {
            int pivot = (left + right) / 2;
            if (a[pivot] > s) {
                right = pivot - 1;
            }
            if (a[pivot] < s) {
                left = pivot + 1;
            } else {
                return pivot;

            }
        }

        return -1;
    }//end searcharr
}
