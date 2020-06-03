
package uygulama6;

import java.util.Scanner;

public class Uygulama6 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double vize;
        double finall;
        double ortalama;
        System.out.print("Vize Notunuzu Giriniz: ");
        vize = sc.nextDouble();
       System.out.print("Final Notunuzu Giriniz:");
        finall = sc.nextDouble();
        ortalama = vize*0.4 + finall*0.6;
        System.out.println("Ortalamanız :"+ortalama);
        
        if (ortalama >= 90 && ortalama<=100)
        {
            System.out.println("Harf Notunuz: AA ");
            
        }
        else if(ortalama >= 80 && ortalama <90)
        {
            System.out.println("Harf notunuzu : BB");
        
        }
        else if(ortalama >=70 && ortalama <80)
        {
            System.out.println("Harf notunuzu : CC");
        }
        else if (ortalama >=60 && ortalama <70)
        {
            
            System.out.println("Harf notunuzu : DD");
        }
        else if (ortalama >=50 && ortalama <60)
        {
            System.out.println("Harf notunuz :  FF");
        } 
        else 
        {
            System.out.println("Kaldınız : ");
            
        }
        
      } 
        
    }

   
    

