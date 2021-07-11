import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a limit of prime numbers:");
        int n=input.nextInt();
        input.close();
        for(int i=2;i<=n;i++)
        {
            int count=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }    
            }
            if(count==0)
                System.out.print(i+" ");

        }
        
    }
}