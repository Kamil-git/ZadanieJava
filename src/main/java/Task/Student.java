package Task;


import javax.lang.model.element.VariableElement;
import java.util.List;
import java.util.Scanner;


public class Student {
    private String imie,nazwisko,email,kierunek;
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

    public Integer ustawWiek() {
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

    public String ustawKierunek() {
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

    public Student find(
            String name, List<Student> studenci) {

        for (Student student : studenci) {
            if (student.pobierzImie().equals(name)) {
                return student;
            }
        }
        return null;
    }
}

