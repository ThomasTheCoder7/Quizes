

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.*;
import java.sql.Time;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main  {

    public static void main(String[] args) {
         int[] a1 = {1,2,3,4};
         int[] a2 = {8,9};
        int[] temparr= merge(a1,a2);
        int j;
        for (j = 0; j < temparr.length; j++)       // for each element,
            System.out.print(temparr[j] + " ");  // display it
        System.out.println("");
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
    public static int[] merge(int[] a1,int[] a2){
        if(count == 0){
         a3 = new int[a1.length+a2.length];
        }
        if(count < a1.length){ a3[count]=a1[count]; count++;  merge(a1,a2);}

        if(count >= a1.length&&count-a1.length<a2.length){ a3[count] = a2[count-a1.length]; count++; merge(a1,a2); }


        return a3;
    }



}//END OF CLASS

