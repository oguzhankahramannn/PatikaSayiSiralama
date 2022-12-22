import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
        int birinci,ikinci,ucuncu;
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz : ");
        birinci = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        ikinci= scan.nextInt();
        System.out.println("Üçüncü sayıyı giriniz : ");
        ucuncu= scan.nextInt();
        if (birinci<ikinci && birinci<ucuncu) {
            if (ikinci<ucuncu) {
                System.out.println("Sayıların büyükten küçüğe sıralanışı : birinci<ikinci<ucuncu ");
            }
            else if (ucuncu<ikinci) {
                System.out.println("Sayıların büyükten küçüğe sıralanışı : birinci<ucuncu<ikinci ");
            }
        }
        else if (ikinci<birinci && ikinci<ucuncu) {
            if (birinci<ucuncu) {
                System.out.println("Sayıların büyükten küçüğe sıralanışı : ikinci<birinci<ucuncu ");
            }
            else if (ucuncu<birinci) {
                System.out.println("Sayıların büyükten küçüğe sıralanışı : ikinci<ucuncu<birinci ");
            }
        }
        else if (ucuncu<birinci && ucuncu<ikinci) {
            if (birinci<ikinci) {
                System.out.println("Sayıların büyükten küçüğe sıralanışı : ucuncu<birinci<ikinci ");
            }
            else if (ikinci<birinci) {
                System.out.println("Sayıların büyükten küçüğe sıralanışı : ucuncu<ikinci<birinci ");
            }
        }


    }
}