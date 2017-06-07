import java.util.Scanner;

/**
 * Created by B4RT on 2017-06-07.
 */
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hi! Give me three numbers from 1 to 100 and I'll arrangement it from the smallest to the largest");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("----------------------");
        System.out.println("Ok, it'll be that way:");

        for(int i = 0; i<=100; i++)
        {
            if (a==i)
                System.out.println(a + " ");
            if (b==i)
                System.out.println(b + " ");
            if (c==i)
                System.out.println(c + " ");
        }
    }
}
