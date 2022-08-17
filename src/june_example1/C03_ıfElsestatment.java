package june_example1;

import java.util.Scanner;

public class C03_ıfElsestatment {
    public static void main(String[] args) {
        // kullanıcıdan üç kenar alınız kenarlar biribirine eşitse eşkenar üçgen değilse eşkenar üçgen değil yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kenar uzunluklarını yazınız");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();

        if (a==b && b==c ){
            System.out.println("eşkenar üçgen");
        }else{ System.out.println("eşkenar üçgen değil");

    }
}
    }

