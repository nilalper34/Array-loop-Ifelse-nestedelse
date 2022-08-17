package june_example1;

import java.util.Scanner;

public class C09_NestadTernary {
    public static void main(String[] args) {
       // kullanıcıdan Sdet kısaltmasındaki harflerden birini yazmasını isteyin.
        // kullanıcı S girerse software,d girerse developer,E girerse engineer,
       // T girerse testing yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf=scan.next().toLowerCase().charAt(0);

        switch(harf) {
                case 'S':
                System.out.println("Software");
                case 'D':
                    System.out.println("Developer");
            case 'E':
                    System.out.println("Enginner");
            case 'T':
                System.out.println("Testing");
            default:

                System.out.println("lütfen başka bir harf giriniz");


        }








    }
}
