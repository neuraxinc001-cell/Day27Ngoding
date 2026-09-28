import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int angka = in.nextInt();

        System.out.println("nilai awal: " + angka);

        angka++;
        System.out.println(angka);

        angka--;
        System.out.println(angka);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

        in.close();
    }
}
