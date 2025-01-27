//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Kreirati uvjet koji ispisuje poruku "Broj X je paran" odnosno "Broj X je neparan"
//        int x = 11;
//
//        if (x % 2 == 0) {
//            System.out.println("Broj " + x + " je paran!");
//        } else {
//            System.out.println("Broj " + x + " je neparan!");
//        }

        //Ispisati poruku ovisno o unesenom spolu, ako je unesen znak "m" ispisati poruku Korisnik je muška osoba, ako je unesen znak "ž",
        //korisnik je ženska osoba.

//        char x = 'ž';
//
//        if (x == 'm') {
//            System.out.println("Korisnik je muško ");
//        } else {
//            System.out.println("Korisnik je žensko ");
//        }

        //Proširiti kod koji će ispisati poruku da Spol nije prepoznat ukoliko se unese neki drugi znak osim "m" i "ž"
//        char x = 'ž';
//
//        if (x == 'm') {
//            System.out.println("Korisnik je muško!");
//        } else if (x == 'ž') {
//            System.out.println("Korisnik je žensko!");
//        } else {
//            System.out.println("Korisnik ne postoji!");
//        }
//Kreiraj kod koji će ispisati ocjene nedovoljan do odličan ovisno o unesenom broju:
        int ocjena = 2;

//        if (ocjena == 1) {
//            System.out.println("Nažalost ocjena je nedovoljan!");
//        } else if (ocjena == 2) {
//            System.out.println("Nažalost ocjena je dovoljan!");
//        } else if (ocjena == 3) {
//            System.out.println("Ocjena je dobar!");
//        } else if (ocjena == 4) {
//            System.out.println("Ocjena je vrlo dobar!");
//        } else if (ocjena == 5) {
//            System.out.println("Ocjena je odličan!");
//        }else {
//            System.out.println("Ocjena ne postoji!");
//        }

        switch (ocjena) {
            case 1:
                System.out.println("Nažalost ocjena je nedovoljan!");
                break;
            case 2:
                System.out.println("Nažalost ocjena je dovoljan!");
                break;
            case 3:
                System.out.println("Nažalost ocjena je dobar!");
                break;
            case 4:
                System.out.println("Nažalost ocjena je vrlo dobar!");
                break;
            case 5:
                System.out.println("OCjena je odličan");
                break;
            default:
                System.out.println("Ocjena nije ispravna");

        }

//Primjer grupiranja case-a
//        switch (ocjena) {
//            case 1:
//            case 3:
//
//            case 5:
//                System.out.println("Broj je neparan");
//                break;
//            case 2:
//
//            case 4:
//                System.out.println("Broj je paran");
//                break;
//
//            default:
//                System.out.println("Ocjena nije ispravna");
//
//        }
        //Ternarni operator ? https://prnt.sc/kqSVs-Lc3jGz
//        int a = 3;
//        int b = 6;
//        int c;
//        c = a > b ? a : b;


    }
}