package Task;


import java.util.*;

public class Program {
    public static Student znajdzStudenta(
            List<Student> studenci) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wpisz nazwe studenta: ");
        String name = sc.nextLine();
        for (Student student : studenci) {
            if (student.pobierzImie().equals(name.substring(0, 1).toUpperCase() + name.substring(1))) {
                System.out.println("Wyszukiwanie zakończone powodzeniem");
                return student;
            }
        }
        return null;
    }

    public static Nauczyciel znajdzNauczyciela(
             List<Nauczyciel> nauczyciele) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wpisz nazwe nauczyciela: ");
        String name = sc.nextLine();
        for (Nauczyciel nauczyciel : nauczyciele) {
            if (nauczyciel.pobierzImie().equals(name.substring(0, 1).toUpperCase() + name.substring(1))) {
                System.out.println("Wyszukiwanie zakończone powodzeniem");
                return nauczyciel;
            }
        }
        return null;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //tabela studenci
        List<Student> studenci = new ArrayList<>();
        Tabela tabelaStudenci = new Tabela();
        tabelaStudenci.setShowVerticalLines(true);
        tabelaStudenci.setHeaders("Imie", "Nazwisko", "Wiek", "Email", "Kierunek");
        //tabela nauczyciele
        List<Nauczyciel> nauczyciele = new ArrayList<>();
        Tabela tabelaNauczyciele = new Tabela();
        tabelaNauczyciele.setShowVerticalLines(true);
        tabelaNauczyciele.setHeaders("Imie", "Nazwisko", "Wiek", "Email", "Przedmiot");
        //tabela znalezieni studenci
        Tabela znalezionyStudent = new Tabela();
        znalezionyStudent.setShowVerticalLines(true);
        znalezionyStudent.setHeaders("Imie", "Nazwisko", "Wiek", "Email", "Kierunek");
        //tabela znalezieni nauczyciele
        Tabela znalezionyNauczyciel = new Tabela();
        znalezionyNauczyciel.setShowVerticalLines(true);
        znalezionyNauczyciel.setHeaders("Imie", "Nazwisko", "Wiek", "Email", "Przedmiot");
        //tabela posortowani studenci
        Tabela posortowaniStudenci = new Tabela();
        posortowaniStudenci.setHeaders("Imie", "Nazwisko", "Wiek", "Email", "Kierunek");
        posortowaniStudenci.setShowVerticalLines(true);
        //tabela posortowani nauczyciele
        Tabela posortowaniNauczyciele = new Tabela();
        posortowaniNauczyciele.setHeaders("Imie", "Nazwisko", "Wiek", "Email", "Przedmiot");
        posortowaniNauczyciele.setShowVerticalLines(true);


        int wybor;

        while (true) {
            System.out.println("\n-------------------");
            System.out.println("Lista Studentow i Nauczycieli");
            System.out.println("-------------------\n");
            System.out.println("1. Dodaj Studenta");
            System.out.println("2. Dodaj Nauczyciela");
            System.out.println("3. Wyswietl liste wszystkich Studentow");
            System.out.println("4. Wyswietl liste wszystkich Nauczycieli");
            System.out.println("5. Znajdz studenta");
            System.out.println("6. Znajdz nauczyciela");
            System.out.println("7. Posortuj i wyswietl Nauczycieli");
            System.out.println("8. Posortuj i wyswietl Studentow");
            System.out.println("9. Przypisz nauczyciela");
            System.out.println("10. Przypisz studenta");
            System.out.println("0. Wyjdz z programu");
            System.out.print("\nWprowadz swoj wybor : ");
            wybor = sc.nextInt();

            switch (wybor) {
                case 1:
                    Student student = new Student();
                    student.ustawImie();
                    student.ustawNazwisko();
                    student.ustawWiek();
                    student.ustawEmail();
                    student.ustawKierunek();
                    tabelaStudenci.addRow(student.pobierzImie(), student.pobierzNazwisko(), student.pobierzWiek(), student.pobierzEmail(), student.pobierzKierunek());
                    studenci.add(student);

                    break;
                case 2:
                    Nauczyciel nauczyciel = new Nauczyciel();
                    nauczyciel.ustawImie();
                    nauczyciel.ustawNazwisko();
                    nauczyciel.ustawWiek();
                    nauczyciel.ustawEmail();
                    nauczyciel.ustawPrzedmiot();
                    tabelaNauczyciele.addRow(nauczyciel.pobierzImie(), nauczyciel.pobierzNazwisko(), nauczyciel.pobierzWiek(), nauczyciel.pobierzEmail(), nauczyciel.pobierzPrzedmiot());
                    nauczyciele.add(nauczyciel);
                    break;
                case 3:
                    System.out.println("Lista studentów: ");
                    tabelaStudenci.print();
                    break;
                case 4:
                    System.out.println("Lista Nauczycieli: ");
                    tabelaNauczyciele.print();
                    break;
                case 5:
                    System.out.print("Podaj imie wyszukiwanego studenta: ");
                    Student szukanyStudent = Program.znajdzStudenta(studenci);

                    znalezionyStudent.addRow(szukanyStudent.pobierzImie(), szukanyStudent.pobierzNazwisko(), szukanyStudent.pobierzWiek(), szukanyStudent.pobierzEmail(), szukanyStudent.pobierzKierunek());
                    znalezionyStudent.print();

                    break;
                case 6:
                    System.out.print("Podaj imie wyszukiwanego nauczyciela: ");
                    Nauczyciel szukanyNauczyciel = Program.znajdzNauczyciela(nauczyciele);
                    znalezionyNauczyciel.addRow(szukanyNauczyciel.pobierzImie(), szukanyNauczyciel.pobierzNazwisko(), szukanyNauczyciel.pobierzWiek(), szukanyNauczyciel.pobierzEmail(), szukanyNauczyciel.pobierzPrzedmiot());
                    znalezionyNauczyciel.print();
                    break;
                case 7:
                    nauczyciele.sort(Comparator.comparing(Nauczyciel::pobierzImie));
                    nauczyciele.forEach((o1) -> {
                        posortowaniNauczyciele.addRow(o1.pobierzImie(), o1.pobierzNazwisko(), o1.pobierzWiek(), o1.pobierzEmail(), o1.pobierzPrzedmiot());
                    });
                    System.out.println("Posortowano Nauczycieli po imieniu: ");
                    posortowaniNauczyciele.print();

                    break;
                case 8:
                    studenci.sort(Comparator.comparing(Student::pobierzImie));
                    studenci.forEach((o1) -> {
                        posortowaniStudenci.addRow(o1.pobierzImie(), o1.pobierzNazwisko(), o1.pobierzWiek(), o1.pobierzEmail(), o1.pobierzKierunek());
                    });
                    System.out.println("Posortowano Studentow po imieniu: ");
                    posortowaniStudenci.print();

                    break;
                case 9:
                    Student znalezionyStudent1 = Program.znajdzStudenta(studenci);
                    Nauczyciel znalezionyNauczyciel1 = Program.znajdzNauczyciela(nauczyciele);
                    znalezionyStudent1.przypiszNauczyciela(znalezionyNauczyciel1);
                    break;
                case 10:
                    Nauczyciel znalezionyNauczyciel2 = Program.znajdzNauczyciela(nauczyciele);
                    Student znalezionyStudent2 = Program.znajdzStudenta(studenci);
                    znalezionyNauczyciel2.przypiszStudenta(znalezionyStudent2);
                    break;

                case 11:
                    System.out.println("\nDziekuje za skorzystanie z programu.");
                    System.exit(1);
                    break;


            }
        }

    }
}
