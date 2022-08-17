package june_example1;

import java.util.Scanner;

public class C04_NestedElse {
    public static void main(String[] args) {

        /*kullanıcıdan iki sayi isteyiniz syıların ikiside pozitif ise sayıların toplamını yazdırın.sayıların ikisi
        de negetifse sayıların carpımını  yazdırın.sayıların ikisi farklı ise farklı işaretli sayılarda işlem yapamazsın
        sayılardan 0 a eşit olan varsa 0 carpmaya göre yutan eleman yazdırın.
         */

        Scanner sccan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int a= sccan.nextInt();
        System.out.println("lütfen ikinci sayıyı giriniz");
        int b= sccan.nextInt();

        if (a>0 && b>0){
            System.out.println("toplam "+(a+b));
        } else if (a<0 && b < 0) {
            System.out.println("carpım "+(a*b));

        } else if (a ==0 || b==0) {
            System.out.println("0 yutan elemandır");

        }else{
            System.out.println("farklı işaretlerde işlem yapamazsınız");

        }


    }
}
