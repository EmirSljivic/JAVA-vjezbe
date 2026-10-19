import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Deklaracija random, scanner i drugih varijabli
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int prviBroj;
        int drugiBroj;
        int treciBroj;
        int prviUnos;
        int drugiUnos;
        int treciUnos;
        int pogodjeni = 0;

        // Objašnjenje aplikacije
        System.out.println("Pozdrav, u ovoj igri ćete unijeti 3 broja koja su u granici od 1 do 6(uključujući 1 i 6), zatim će sistem generisati 3 random broja u istom rangu. Da vidimo koliko možete predviti sistem!");

        // Unos brojeva od strane korisnika
        do {
            System.out.println("Unesite prvi broj(1-6): ");
            prviUnos = scanner.nextInt();
        }while(prviUnos < 1 || prviUnos > 6);

        do {
            System.out.println("Unesite drugi broj(1-6): ");
            drugiUnos = scanner.nextInt();
        }while(drugiUnos < 1 || drugiUnos > 6);

        do {
            System.out.println("Unesite treći broj(1-6): ");
            treciUnos = scanner.nextInt();
        }while(treciUnos < 1 || treciUnos > 6);

        // Generisanje random brojeva
        prviBroj = random.nextInt(6) + 1;
        drugiBroj = random.nextInt(6) + 1;
        treciBroj = random.nextInt(6) + 1;

        // Poredjenje brojeva
        System.out.println("---------------------------------------");
        System.out.println("Vaši brojevi su: " + prviUnos + "," + drugiUnos + " i " + treciUnos);
        System.out.println("Brojevi sistema su: " + prviBroj + "," + drugiBroj + " i " + treciBroj);
        System.out.println(prviUnos + "=" + prviBroj);
        System.out.println(drugiUnos + "=" + drugiBroj);
        System.out.println(treciUnos + "=" + treciBroj);

        // Brojanje bodova
        if(prviBroj == prviUnos){
            pogodjeni++;
        }
        if(drugiBroj == drugiUnos){
            pogodjeni++;
        }
        if(treciBroj == treciUnos){
            pogodjeni++;
        }

        // Prikaz bodova
        if(pogodjeni == 0){
            System.out.println("Pogodili ste 0 brojeva, pokušajte ponovo!");
        }
        if(pogodjeni == 1){
            System.out.println("Pogodili ste 1 broj, možete to još bolje!");
        }
        if(pogodjeni == 2){
            System.out.println("Pogodili ste 2 broja, još jedan vam fali za 3/3!");
        }
        if(pogodjeni == 3){
            System.out.println("ČESTITAMO, POGODILI STE SVA TRI BROJA I PREDVIDJELI NAŠ SISTEM!!!!!");
        }

        // Zatvaranje skenera
        scanner.close();
    }
}2