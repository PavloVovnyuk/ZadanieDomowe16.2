import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TworzeniaZadan {

    public LocalDateTime wczytanieDaty() {

        String dataString1 = "yyyy-dd-MM HH:mm"; // 2018-27-10 19:00
        String dataString2 = "dd.MM.yyyy HH:mm"; // 27.10.2018 19:00

        Scanner scanner = new Scanner(System.in);
        String userImput = scanner.nextLine();

        if (userImput.contains("-")) {
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(dataString1);
            LocalDateTime localDateTime = LocalDateTime.parse(userImput, formatter1);
            return localDateTime;
        } else {
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(dataString2);
            LocalDateTime localDateTime1 = LocalDateTime.parse(userImput, formatter2);
            return localDateTime1;
        }
    }

    public Zadanie tworzenieObjectuZZadanie() {
        String tresc = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadż tresć zadania");
        tresc = scanner.nextLine();
        System.out.println("Wprowadz date");
        Zadanie zadanie = new Zadanie(tresc, wczytanieDaty());
        System.out.println(zadanie);
        return zadanie;
    }

    public ArrayList dodanieZadanDoListy() {
        Scanner scanner = new Scanner(System.in);
        String stop1 = "tak";
        ArrayList<Zadanie> listaZadan = new ArrayList<>();
        boolean stop = true;
        while (stop) {
            System.out.println("czy koniec zadan ?");
            if (scanner.nextLine().equals(stop1)) {
                stop = false;
            } else {
                listaZadan.add(tworzenieObjectuZZadanie());
            }
        }
        System.out.println(" wszystkie zadania " + listaZadan);
        return listaZadan;
    }

    ArrayList<Zadanie> lista2 = new ArrayList<>(dodanieZadanDoListy());
    LocalDateTime localDateTime = LocalDateTime.of(2019, 03, 03, 15, 33);

    public void przeszleZadania() {
        for (Zadanie z : lista2) {
            if (z.getData().isBefore(localDateTime)) {
                System.out.println("Zadania przeszle " + z);
            }
        }
    }

    public void przyszleZadania() {
        for (Zadanie z : lista2) {
            if (z.getData().isAfter(localDateTime)) {
                System.out.println("Zadania przyszle " + z);
            }
        }
    }

    public void zadaniaDoWykonania24() {
        LocalDateTime localDateTime2 = localDateTime.plusHours(24);
        for (Zadanie z : lista2) {
            if (z.getData().isAfter(localDateTime) && (z.getData().isBefore(localDateTime2))) {
                System.out.println("Zadania do wykonania w ciągu 24 H " + z);
            }
        }
    }

    public void zadaniaDoWykonaniaWTygodniu() {
        LocalDateTime localDateTime2 = LocalDateTime.of(2019, 03, 05, 12, 00);
        for (Zadanie z : lista2) {
            if (z.getData().isAfter(localDateTime) && (z.getData().isBefore(localDateTime2))) {
                System.out.println("Zadania do wykonania do konca tygodnia " + z);
            }
        }
    }

    public void zadaniaDoWykonaniaWMiesiacu() {
        LocalDateTime localDateTime2 = localDateTime.plusDays(30);
        for (Zadanie z : lista2) {
            if (z.getData().isAfter(localDateTime) && (z.getData().isBefore(localDateTime2))) {
                System.out.println("Zadania do wykonania w ciągu miesiąca " + z);
            }
        }
    }
}



