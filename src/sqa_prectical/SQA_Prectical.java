/*SQA All Prectical*/
package sqa_prectical;

import java.util.Scanner;

public class SQA_Prectical {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        prime();
    }
    public static void prime()
    {
        System.out.println("Check your number is Prime Or Not");
        System.out.print("Enter Number:");
        int num = sc.nextInt();
        if(num==1 || num==0)
        {
            System.out.println("Prime");
        }
        else
        {
            int flag=0;
            for(int i=2 ; i<num ;i++)
            {
                if(num%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println(num+" is Not Prime");
            }
            else
            {
                System.out.println(num + " is Prime");
            }
        }
        
    }
    
}
