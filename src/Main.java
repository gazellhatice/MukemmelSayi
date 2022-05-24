/*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana
 “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Bir sayının kendisi hariç pozitif tam sayı çarpanları
        // (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
        System.out.print("Bir sayı giriniz: ");
        int number = scan.nextInt();
        int sum = 0;

        for(int i = 1; i < number; i++){
            if (number % i == 0){
                sum +=i;
            }
        }
        if (sum == number){
            System.out.println(number + " bir mükemmel sayıdır.");
        }else{
            System.out.println(number + " bir mükemmel sayı değildir.");
        }
    }
    }

