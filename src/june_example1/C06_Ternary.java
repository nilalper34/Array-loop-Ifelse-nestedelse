package june_example1;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        //kullanıcıdan bir sayi alın ve sayinin tek veya çift olmasını yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sayiyi giriniz");

         int sayi=scan.nextInt();

        System.out.println (sayi%2==0 ? "çift sayi":"tek sayi");



    }
}
