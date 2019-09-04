package lv.javaguru.homeworks.homework2;
import java.util.Scanner;

public class Level2 {

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter three integers: ");
        Scanner in = new Scanner(System.in);

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a > b && a > c)
            System.out.println("First number is largest.");
        else if (b > a && b > c)
            System.out.println("Second number is largest.");
        else if (c > a && c > b)
            System.out.println("Third number is largest.");
        else
            System.out.println(a=b=c);
    }
}


