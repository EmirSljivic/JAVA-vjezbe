import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // U ovom projektu korisnik ce moći unijeti koji proizvod kupuje, kolika je cijena tog proizvoda po komadu, te koliko proizvoda uzima, i nakon toga ce program izracunati tacnu cijenu koliko bi korisnik morao da plati.

        // Deklaracija skenera i ostalih varijabli
        Scanner scanner = new Scanner(System.in);
        String proizvod;
        int kolicina;
        double cijena;
        double konacnaCijena;

        // Koji korisnik proizvod kupuje
        System.out.println("Koji proizvod kupujete?:");
        proizvod = scanner.nextLine();

        //Koju kolicinu proizvoda korisnik kupuje
        System.out.println("Koja je količina " + proizvod + " koju kupujete?");
        kolicina = scanner.nextInt();

        // Koja je cijena proizvoda koju korisnik kupuje, do while petlja koja provjerava da li je cijena manja ili jednaka 0
        do {
            System.out.println("Koja je cijena po komadu " + proizvod + " u KM ?");
            cijena = scanner.nextDouble();
        }while(cijena <= 0);

        // Izracun i ispis konacne cijene
        konacnaCijena = kolicina * cijena;
        System.out.println("--------------------------------------------");
        System.out.println("Vaš račun je: " + konacnaCijena + "KM");


        // Zatvaranje skenera
        scanner.close();

    }
}