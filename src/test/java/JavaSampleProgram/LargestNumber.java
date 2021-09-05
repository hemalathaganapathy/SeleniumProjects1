package JavaSampleProgram;

import java.util.Scanner;

public class LargestNumber {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            int i,n,large;

            System.out.println("Enter the number of elements:") ;
            n = sc.nextInt();
            int[] a = new int[n];

           /* if ( n % 2 == 0 )
                System.out.println("Entered number is even");
            else
                System.out.println("Entered number is odd"); */

            System.out.println("Enter the elements") ;
            for(i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
            }

            large = a[0];
            for(i=1;i<n;i++)
            {
                if(large<a[i])
                {
                    large = a[i];
                }
            }

            System.out.println("Largest of "+n+" elements in an array = "+large);
        }
    }

