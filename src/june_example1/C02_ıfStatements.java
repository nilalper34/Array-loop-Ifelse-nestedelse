package Batch80.src.june_example1;

import java.util.Locale;
import java.util.Scanner;

public class C02_ıfStatements {
    public static void main(String[] args) {

        //soru:1 Kullanıcıdan bir tam sayı isteyin tek veya cıft oldugunu yazdırın

        //Scanner scan=new Scanner(System.in);
        //System.out.println("lütfen bir tam sayı giriniz");
        //int sayi=scan.nextInt();

        // if(sayi%2==0) {
        //     System.out.println("Bu bir çift sayidir: "+sayi);
        // } else {
        //     System.out.println("Bu bir tek sayidir: "+sayi);
        // }


        //soru:2 kullanıcıdan gün isimlerinden birinin ilk harfini isteeyin v eo harfle baslayan gunleri yazdırın.

       // Scanner scan = new Scanner(System.in);
       // System.out.println("Gun isimlerinden birinin ilk harfini giriniz: ");
       // String ilkHarf = scan.next().toUpperCase();

       // if (ilkHarf.equals("P")) {

       //     System.out.println("pazartesi,persembe,pazar");
       // }

       // if ( ilkHarf.equals("C")) {

       //     System.out.println("cuma,cumartesi,carsamba");
       // }

       // if ( ilkHarf.equals("S")){
       //     System.out.println("salı");
       // }  else{
       //     System.out.println("lütfen gecerli bir harf giriniz");
       // }

     // soru:4 kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin ve dikdörtgenin kare olup olmadıgını yazdırın.

      // Scanner scan= new Scanner(System.in);
      // System.out.println("lütfen dikdörtgenin kenar uzunluklarını giriniz :");

      // int ku1= scan.nextInt();
      // int ku2= scan.nextInt();

      // if(ku1==ku2){
      //     System.out.println("dikdörtgen bir karedir"); /*eşit ifade yazmazsan konsolda sonuc cıkmaz cunku değilse
      //                                                       ile ilgilenmedik*/
      // }


         /* soru:5 kullanıcıdan bir gün ismi alın eğer cuma ise müslümanlar için mübarek gün,
         cumartesi ise yahudiler için mübarek gün,pazar ise hristiyanlar için mübarek gün yazdırın.
          */

       Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir ismi yazınız: ");
        String gunIsmı = scanner.next();

        if(gunIsmı.equals("cuma")){
            System.out.println("müslümanlar için mübarek gün");
        }

        if(gunIsmı.equals("cumartesi")){
            System.out.println("yahudiler için mübarek gün");
        }

        if(gunIsmı.equals("pazar")){
            System.out.println("hristiyanlar için mübarek gün");
        }else{
            System.out.println("hiçbir din için bir önemi yok");
        }






    }


}


