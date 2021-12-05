package SANDQ;

public class Stack {
    int[] stack;
    int top=-1;
    int nElms;
    int Capacity;
    public Stack(int s) {
        Capacity = s;
        stack = new int[s];
    }

    public void push(int v){
        if(!isFull()){
            stack[++top] = v;
            nElms++;
        }
    }


    public int pop() {
            if(!isEmpty()){
            nElms--;

            return stack[top--];
            }
            else return 0;
    }

    public int peek(){
    return stack[top];
    }

    boolean isEmpty(){ return nElms==0; }

    boolean isFull(){ return nElms==Capacity; }

    void disp(){
        if(!isEmpty())
        for (int i=0;i<nElms;i++) System.out.println(stack[i]);
        else System.out.println("Stack is Empty");

    }

    public static int mystery3(int n) {
        int count = 1;
        while(count <= n){
            count = count + 2;
        }
        System.out.println(count);
        return count;
    }


    public static int[] RD(int[] a){
        int nElems = a.length;

        for(int i = 0;i<a.length;i++){
            for(int j = i;j<nElems;j++){
                if(a[i]==a[j]&&i!=j){
                    for(int t = j;t<nElems-1;t++)
                        a[t]=a[t+1];
                    nElems--;
                }
            }
        }
    int[] t = new int[nElems];
        for(int i = 0 ;i<nElems;i++){
            t[i]=a[i];
        }
    return t;
    }



    public static void main(String[] args){
    mystery1(64);




    }
    public static int mystery1(int n) {
        int count = 1;
        while(count < n){
            count = count +1;
            n = n/2;
        }
        System.out.println(count);
        return count;
    }




static void test(int[] a,int searchk){
int left = 0,right = a.length-1;

while(left<=right){
   int pivot = (left+right)/2;
   if(a[pivot]==searchk) System.out.println(pivot);
    if(a[pivot]>searchk){
        right = pivot-1;
    }
    else {
        left = pivot+1;
    }
}
    }




    static void srl(int[] a,int index,int stop){
        for(int i = stop;i>index;i--){
            a[i] = a[i-1];
        }
    }

    static void insertionSort(int[] a){
        int j = 1,temp=0,count=0;
        for(int i = 0;i<a.length;i++){
            for(j=0;j<i;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    for(int k = i;k>j;k--){
                        a[k] = a[k-1];
                        count++;
                    }
                    a[j]=temp;
                }
                count++;
            }

        }
        System.out.println(count);
    }



    static void selectionAF(int[] a){
        int u=0,count = 0,temp=0;
        for(int i = 0;i<a.length;i++){
            for(int j = u;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                count++;
            }
            u++;
        }
        System.out.println(count);
    }//end selectionAF


    static void disp(int[] a){
        for (int i=0;i<a.length;i++) System.out.println(a[i]);
    }




}


