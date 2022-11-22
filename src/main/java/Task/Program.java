package Task;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Student student = new Student();
        Nauczyciel nauczyciel = new Nauczyciel();
        Scanner sc = new Scanner(System.in);
        Tabela tabelaUczniowie = new Tabela();
        tabelaUczniowie.setShowVerticalLines(true);
        tabelaUczniowie.setHeaders("Imie", "Nazwisko", "Wiek", "Email", "Kierunek");
        Tabela tabelaNauczyciele = new Tabela();
        tabelaNauczyciele.setShowVerticalLines(true);
        tabelaNauczyciele.setHeaders("Imie", "Nazwisko", "Wiek", "Email", "Przedmiot");

        int wybor;

        while (true) {
            System.out.println("\n-------------------");
            System.out.println("Lista studentow i nauczycieli");
            System.out.println("-------------------\n");
            System.out.println("1. Dodaj ucznia");
            System.out.println("2. Dodaj Nauczyciela");
            System.out.println("3. Wyswietl liste wszystkich uczniow");
            System.out.println("4. Wyswietl liste wszystkich nauczycieli");
            System.out.println("5. Wyjdz");
            System.out.print("\nWprowadz swoj wybor : ");
            wybor = sc.nextInt();
            sc.nextLine();
            switch (wybor) {
                case 1:
                    student.ustawImie();
                    student.ustawNazwisko();
                    student.ustawWiek();
                    student.ustawEmail();
                    student.ustawKierunek();
                    tabelaUczniowie.addRow(student.pobierzImie(), student.pobierzNazwisko(), student.pobierzWiek(), student.pobierzEmail(), student.pobierzKierunek());
                    break;
                case 2:
                    nauczyciel.ustawImie();
                    nauczyciel.ustawNazwisko();
                    nauczyciel.ustawWiek();
                    nauczyciel.ustawEmail();
                    nauczyciel.ustawPrzedmiot();
                    tabelaNauczyciele.addRow(nauczyciel.pobierzImie(), nauczyciel.pobierzNazwisko(), nauczyciel.pobierzWiek(), nauczyciel.pobierzEmail(), nauczyciel.pobierzPrzedmiot());
                case 3:
                    tabelaUczniowie.print();
                    break;
                case 4:
                tabelaNauczyciele.print();
                break;
                case 5:
                    System.out.println("\nDziekuje za skorzystanie z programu.");
                    System.exit(1);
                    break;
            }
        }

    }
}
