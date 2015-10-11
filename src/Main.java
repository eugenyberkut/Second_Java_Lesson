import java.util.Scanner;

/**
 * Created by eugen on 11.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int x;
        if (a>b) {
            x = a;
        } else {
            x = b;
        }
        System.out.println("x = " + x);

        int y = a > b ? a : b;
        System.out.println("y = " + y);

        switch (a) {
            case 0:
                System.out.println("ноль");
                break;
            case 1:
                System.out.println("один");
                break;
            case 2:case 3:
                System.out.println("два-три");
                break;
            default:
                System.out.println("много");
        }

        for (int i=a; i<=b; i++) {
            System.out.print(i + " ");
        }

        while (a!=b) {
            if (a>b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("НОД="+a);
    }
}
