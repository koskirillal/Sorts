import coollection.MyArrayList;
import coollection.MyLinkedList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> q = new ArrayList<>();
        ZapolnenieArrayList(q , 10000);
        for (Integer c : q){
            System.out.print(c + " ");
        }
        System.out.println();
        long time = System.currentTimeMillis();
        q=Quick_sort(q);
        System.out.println(System.currentTimeMillis() - time);
        System.out.println();
        for (Integer c : q){
            System.out.print(c + " ");
        }










        /*        100   1000    10000
        * Insert  1     10    67
        * Bubble  1     12    232
        * Quick   1     7     31
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
    public static void ZapolnenieArrayList(ArrayList<Integer> q ,int n){
        for (int i =0;i < n;i++){
            q.add((int)(Math.random() * 100));
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
    public static ArrayList<Integer> Quick_sort(ArrayList<Integer>q){
        if (q.size() <= 1){
            return q;
        }
        int elem = q.get(0);
        ArrayList<Integer> left= new ArrayList<Integer>();
        ArrayList<Integer> right= new ArrayList<Integer>();
        ArrayList<Integer> center= new ArrayList<Integer>();
        for (int i =0;i < q.size();i++){
            if(q.get(i) < elem){
                left.add(q.get(i));
            }else if (q.get(i) > elem){
                right.add(q.get(i));
            }else if (q.get(i)==elem){
                center.add(q.get(i));
            }
        }
        //return Quick_sort(left)+center+Quick_sort(right);
        return sumaraay(Quick_sort(left) , center , Quick_sort(right));

    }
    public static ArrayList<Integer> sumaraay(ArrayList<Integer> left , ArrayList<Integer> center , ArrayList<Integer> right){
        ArrayList<Integer> sum = new ArrayList<Integer>();
        for (Integer c : left){
            sum.add(c);
        }
        for (Integer c : center){
            sum.add(c);
        }
        for (Integer c : right){
            sum.add(c);
        }
        return sum;
    }













}