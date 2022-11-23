package Task;

import java.util.List;
import java.util.Scanner;


public class Nauczyciel {
    private String imie,nazwisko,email,przedmiot;

    private Integer wiek;


    public String ustawImie() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadź imię: ");
        String imie;
        do {
            imie = sc.nextLine();
            if (imie.length() < 2) {
                System.out.println("Wprowadź poprawnę imię! Minimum 2 znaki!");
            }
        } while (imie.length() < 2);
        return this.imie = imie.substring(0,1).toUpperCase()+imie.substring(1);
    }

    public String ustawNazwisko() {
        System.out.print("Wprowadź nazwisko: ");
        Scanner sc = new Scanner(System.in);
        String nazwisko = sc.nextLine();
        return this.nazwisko = nazwisko.substring(0,1).toUpperCase()+nazwisko.substring(1);
    }

    public int ustawWiek() {
        Integer wiek;
        System.out.print("Wprowadź wiek: ");
        Scanner sc = new Scanner(System.in);
        do {
            wiek = sc.nextInt();
            if (wiek < 18) {
                System.out.println("Wprowadź poprawny wiek! Minimum 18 lat!");
            }
        } while (wiek < 18);
        return this.wiek = wiek;
    }

    public String ustawEmail() {
        String email;
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadź email:");
        do {
            email = sc.nextLine();
            if (!email.matches("^(.+)@(.+)$")) {
                System.out.println("Wprowadź poprawny adres email!");
            }

        } while (!email.matches("^(.+)@(.+)$"));
        return this.email = email;
    }

    public String ustawPrzedmiot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadź przedmiot: ");
        String przedmiot = sc.nextLine();
        return this.przedmiot = przedmiot;
    }
    public String pobierzImie(){
        return imie;
    }
    public String pobierzNazwisko(){
        return nazwisko;
    }
    public String pobierzWiek(){
        return wiek.toString();
    }
    public String pobierzEmail(){
        return email;
    }
    public String pobierzPrzedmiot(){
        return przedmiot;
    }
}
