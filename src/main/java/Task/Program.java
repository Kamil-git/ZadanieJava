package Task;


import java.util.*;

public class Program {
    public static void main(String[] args) {
        Student student = new Student();
        Nauczyciel nauczyciel = new Nauczyciel();

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
                    tabelaStudenci.addRow(student.pobierzImie(), student.pobierzNazwisko(), student.pobierzWiek(), student.pobierzEmail(), student.pobierzKierunek());
                    studenci.add(student);
                    break;
                case 2:
                    nauczyciel.ustawImie();
                    nauczyciel.ustawNazwisko();
                    nauczyciel.ustawWiek();
                    nauczyciel.ustawEmail();
                    nauczyciel.ustawPrzedmiot();
                    tabelaNauczyciele.addRow(nauczyciel.pobierzImie(), nauczyciel.pobierzNazwisko(), nauczyciel.pobierzWiek(), nauczyciel.pobierzEmail(), nauczyciel.pobierzPrzedmiot());
                    nauczyciele.add(nauczyciel);
                    break;
                case 3:
                    tabelaStudenci.print();
                    break;
                case 4:
                    tabelaNauczyciele.print();
                    break;
                case 5:
                    System.out.print("Podaj imie wyszukiwanego studenta: ");

                    String imie = sc.nextLine();
                    for (Student szukanyStudent : studenci) {
                        if (szukanyStudent.pobierzImie().equals(imie.substring(0,1).toUpperCase()+imie.substring(1))) {
                            System.out.println("Wyszukiwanie zakonczone powodzeniem: ");
                            znalezionyStudent.addRow(szukanyStudent.pobierzImie(), szukanyStudent.pobierzNazwisko(), szukanyStudent.pobierzWiek(), szukanyStudent.pobierzEmail(), szukanyStudent.pobierzKierunek());
                            znalezionyStudent.print();
                        }
                    }


                    break;
                case 6:
                    System.out.print("Podaj imie wyszukiwanego nauczyciela: ");
                     imie = sc.nextLine();
                    for (Nauczyciel szukanyNauczyciel : nauczyciele) {
                        if (szukanyNauczyciel.pobierzImie().equals(imie.substring(0,1).toUpperCase()+imie.substring(1))) {
                            System.out.println("Wyszukiwanie zakonczone powodzeniem: ");
                            znalezionyNauczyciel.addRow(szukanyNauczyciel.pobierzImie(), szukanyNauczyciel.pobierzNazwisko(), szukanyNauczyciel.pobierzWiek(), szukanyNauczyciel.pobierzEmail(), szukanyNauczyciel.pobierzPrzedmiot());
                            znalezionyNauczyciel.print();
                        }
                    }
                    break;
//                case 6:
//                    System.out.println("\nDziekuje za skorzystanie z programu.");
//                    System.exit(1);
//                    break;


            }
        }

    }
}
