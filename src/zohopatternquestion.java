import java.util.Scanner;
public class zohopatternquestion {
    public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to print pattern");
            int n  = scanner.nextInt();
            for(int i=0;i<n;i++)
            {
                int spaces = n - (i + 1); // n = 4 i = 3, 4 -(3 + 1) = 4 - 4 = 0
                for(int k = 1; k<= spaces;k++)
                    System.out.print(" ");
                for(int j = i;j >= 0;j--)
                    System.out.print(j);
                for(int j = 1;j <= i;j++)
                    System.out.print(j);
                if(i != n-1)
                    System.out.println();
            }
        }
    }
