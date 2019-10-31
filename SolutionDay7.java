import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        
        for (int i=0;i<arr.length;i++){
            
            int num = sc.nextInt();
            arr[i]=num;
        }
        
        int raa[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            raa[i]=arr[arr.length-1-i];
            System.out.print(raa[i]+ " ");
        }

        sc.close();
    }
}
