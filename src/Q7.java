public class Q7 {

    public static void main(String[] args) {
int[] a = {2,3,4,5,6,7,8,9,1,2,3,4,};
        System.out.println(longestSortedSequence(a));

    }


    public static void swapall(int[] a1,int[] a2){ //same length
        int temp=0;
        for(int i = 0;i<a1.length;i++){
            temp = a1[i];
            a1[i] = a2[i];
            a2[i] = temp;
        }
    }


    static int count = 0;
    static int[] a3;

    public static int[] append(int[] a1, int[] a2){
        if(count == 0){ a3 = new int[a1.length+a2.length]; }

        if(count < a1.length){ a3[count]=a1[count]; count++;  append(a1,a2);}

        if(count >= a1.length&&count-a1.length<a2.length){ a3[count] = a2[count-a1.length]; count++; append(a1,a2); }


        return a3;
    }


    public static int minGap(int[] a){
        if(a.length < 2){return 0;}
        int minG=0,temp=a[1]-a[0];
        for(int i = 0;i<a.length-1;i++){

            if(a[i+1]-a[i]<temp){
                minG=a[i+1]-a[i];
                temp = minG;
            }

        }

        return  minG;
    }


    public static double percentEven(int[] a){
        double percent = 0,evenElm = 0;

        for(int i = 0;i<a.length;i++)
            if(a[i]%2==0) evenElm++;


        percent = (evenElm/a.length)*100.0;
        return percent;
    }


    public static int longestSortedSequence(int[] a){
        int longest = 0,temp=0;
        for (int i=0;i<a.length-1;i++) {
            if(a[i]>a[i+1]) {
                if(longest>temp)
                    temp = longest;
                longest = 0;
            }
            longest++;
        }

    return temp;
    }











    public void display(int [] a)             // displays array contents
    {
        for(int j=0; j<a.length; j++)       // for each element,
            System.out.print(a[j] + " ");  // display it
        System.out.println("");
    }

}//END OF CLASS
