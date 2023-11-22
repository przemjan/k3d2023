public class Zmienne {
    public static void main(String[] args) {

        int liczba1, liczba3 = 10;
        liczba1 = 15;

        double liczba2 = 0.9;

        System.out.println("Moja liczba " + liczba1 + " dalszy");

        //liczba1 = (int)liczba2;

        liczba2 = liczba1;

        int hours = 8;
        int days = 5;
        int weeks = 52;

        // komentarz
        int workHoursPerYear = hours * days * weeks;

        System.out.println(workHoursPerYear);


        String napis = "Dzisiaj\t jest \"ładnie\".";

        napis += "Na pewno?";

        System.out.println("Mój napis: "  + napis);
        System.out.print("Mój\t napis: "  + napis + "\n");
        System.out.print("Mój napis: "  + napis + "\n");


        char znak = '#';

        boolean isSun = false; //true

    }
}
