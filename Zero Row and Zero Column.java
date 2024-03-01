import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int arr[][]=new int[n][m],arr1[][]=new int [n][m]; 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
                arr1[i][j]=arr[i][j];
            }
        }
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<m;j++)
            {
                if(arr1[i][j]==0);
                {
                   for(int k=0;k<m;k++)
                   {
                       arr1[i][k]=0;
                   }
                    for(int k=0;k<n;k++)
                    {
                        arr1[k][j]=0;
                    }
                }
            }
         }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            System.out.print(arr1[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
