package Task;


import java.util.List;
import java.util.Scanner;


public class Student {
    private String imie;
    private String nazwisko;
    private Integer wiek;
    private String email;
    private String kierunek;
    private List<Nauczyciel> nauczyciele;

    public void dodaj() {
        ustawImie();
        ustawNazwisko();
        ustawWiek();
        ustawEmail();
        ustawKierunek();


    }

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
        return this.imie = imie;
    }

    private String ustawNazwisko() {
        System.out.print("Wprowadź nazwisko: ");
        Scanner sc = new Scanner(System.in);
        String nazwisko = sc.nextLine();
        return this.nazwisko = nazwisko;
    }

    private Integer ustawWiek() {
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

    private String ustawEmail() {
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

    private String ustawKierunek() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadź kierunek: ");
        String kierunek = sc.nextLine();
        return this.kierunek = kierunek;
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
    public String pobierzKierunek(){
        return kierunek;
    }

}

