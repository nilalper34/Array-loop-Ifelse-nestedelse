package june_example1;

import java.util.Scanner;

public class C05_NestedElse {
    public static void main(String[] args) {
        /*kullanıcıdan maaşiçin bir teklif isteyin 80.000 üzeri ise kabul ediyorum,60.000-80.000
        arası ise konuşabiliriz,60.000 altı ise kabul etmiyorum.
         */

        Scanner sccan=new Scanner(System.in);
        System.out.println("lütfen  maaş için teklif giriniz");
        int a= sccan.nextInt();

        if (a>80000){
            System.out.println("kabul ediyorum");
        } else if (60000<a && a<80000){
            System.out.println("konuşabiliriz");
        }else{
            System.out.println("kabul etmiyorum");
        }


    }
}
