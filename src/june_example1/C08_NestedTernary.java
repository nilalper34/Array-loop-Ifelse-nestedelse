package Batch80.src.june_example1;

import java.util.Scanner;

public class C08_NestedTernary {
    public static void main(String[] args) {
        //kullanıcıdan dikdörtgenin uzunluklarını isteyin verilen degerlere göre dikdörtgenin kare olup olmadığını yazın.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin kenar uzunluğunu yazınız");
        int a= scan.nextInt();
        System.out.println("lütfen dikdörtgenin genişliğini yazınız");
        int b= scan.nextInt();
        System.out.println(a==b ? "karedir":"kare değildir");










    }
}
