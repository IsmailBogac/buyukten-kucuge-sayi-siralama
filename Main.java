import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz :");
        a = input.nextInt();

        System.out.print("İkinci sayıyı giriniz :");
        b = input.nextInt();

        System.out.print("Üçüncü sayıyı giriniz");
        c = input.nextInt();

        if (c > b && b > a) {
            if (b > a) {
                System.out.print("c>b>a");
            } else {
                System.out.print("c>a>b");
            }

        } else if (b > c && b > a) {
            if (c > a) {
                System.out.println("b>c>a");
            } else {
                System.out.println("b>a>c");
            }
        }else {
            if (c>b){
                System.out.println("a>c>b");
            }else {
                System.out.print("a>b>c");
            }

        }

    }
}
