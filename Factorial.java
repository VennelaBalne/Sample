import java.util.Scanner;
class Factorial
{
    public static void main(String args[])
    {  
        Scanner s=new Scanner(System.in);
        int factorial=1;  
        int input=s.nextInt();   
        for(int i=1;i<=input;i++)
        {    
            factorial=factorial*i;    
        }    
        System.out.println(factorial);    
    }  
}