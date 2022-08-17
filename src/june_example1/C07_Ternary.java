package june_example1;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {
       //kullanıcıdan iki sayi alın ve büyük olmayan sayıyı yazdırın
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int a= scanner.nextInt();
        System.out.println("lütfen ikinci sayiyi giriniz");
        int b= scanner.nextInt();

        System.out.println (a<b? a:b);

    }
}
