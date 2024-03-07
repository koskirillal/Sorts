import coollection.MyArrayList;
import coollection.MyLinkedList;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]  Arr = new int[10000];
        Zapolnenie_Na_sanoe_bolshoe_vremi(Arr);
        for (int i =0;i < Arr.length;i++){
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
        long time = System.currentTimeMillis();
        Bubble(Arr);
        System.out.println(System.currentTimeMillis() - time);


        System.out.println();

        for (int i =0;i < Arr.length;i++){
            System.out.print(Arr[i] + " ");
        }
        /*        100ms   1000ms    10000ms
        * Insert  1       10        67
        * Bubble  1       12        232
        *                   */


    }
    public static void Bubble(int[] Arr){

        for (int i =0;i < Arr.length;i++){
            for (int j =0;j < (Arr.length -1);j++){
                if(Arr[j] > Arr[j + 1]){
                    int c;
                    c=Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1]=c;
                }
            }
        }
    }
    public static void Innsertssort(int[] a){
        for (int i =1;i< a.length;i++){
            for (int j =i;j >=1;j--){
                if (a[j] < a[j-1]){
                    int c;
                    c=a[j];
                    a[j]=a[j-1];
                    a[j-1]=c;
                }
            }
        }
    }
    public static void RandomZapolnenie(int[] a){
        for (int i =0;i < a.length;i++){
            a[i] =(int)(Math.random()*100);
        }
    }
    public static void RandomZapolnenie_ot_0_do_n(int[] a , int n){
        for (int i =0;i < a.length;i++){
            a[i] =(int)(Math.random()*n);
        }
    }
    public static void Zapolnenie_Na_sanoe_bolshoe_vremi(int[] a){
        for (int i = 0;i<a.length;i++){
            a[i]=a.length-1 - i;
        }
    }










}