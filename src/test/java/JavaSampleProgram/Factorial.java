package JavaSampleProgram;

import java.util.Scanner;

public class Factorial {



        public static void main(String[] args) {

            System.out.println("Enter the number");
            Scanner sc = new Scanner((System.in));
            int num = sc.nextInt();

            long factorial = 1;
            for(int i = 1; i <=num; ++i)
            {
                 factorial = factorial * i;

            }
            System.out.printf("Factorial value "+ factorial);
        }
    }


