import java.util.*;
import java.util.Scanner;


public class twosum {
    public static void main(String args[]){

       int t,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
       for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
       }
       int [] b = new int[2];
       System.out.println("enter the target:");
        t = sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
               
                sum = arr[i]+arr[j];

                if(sum==t){
                  b[0]=i;
                  b[1]=j;
                  break;
                }
            }
        }
        
        System.out.print(b);
      

    }
}
