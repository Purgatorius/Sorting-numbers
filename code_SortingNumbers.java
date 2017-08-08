import java.util.Scanner;

/**
 * Created by B4RT on 2017-08-08.
 */
public class SortingNumbers {
    public static void main (String[] args)
    {
        System.out.println("User enter three numbers between 1-1000. Program is going to arrange it in ascending order");
        System.out.println("Give me yours three numbers: ");

        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Number one is: ");
        a = scanner.nextInt();
        System.out.println("Number two is: ");
        b = scanner.nextInt();
        System.out.println("And number three iiiss: ");
        c = scanner.nextInt();

        System.out.println("In ascending order it'll be that way: ");

        for (int i = 0; i <= 1000; i++)
        {
            if (a==i)
                System.out.println(a + " ");
            if (b==i)
                System.out.println(b + " ");
            if (c==i)
                System.out.println(c + " ");

        }

        System.out.println("Thank you, have a nice day.");
    }
}
