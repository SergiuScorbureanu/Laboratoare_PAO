import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Date astazi = new Date();
        List<Aliment> alimente = new ArrayList<>();

        Aliment a1 = new Aliment(30.0, astazi, "ingredient1, ingr2", 9.45, Categorie.LACTATE);
        Aliment a2 = new Carne();
        Carne salam = new Carne(35.6, astazi, "piept, sare, piper", 20.2, Categorie.MEZELURI);
        Lapte a4 = new Lapte();
        Lapte iaurt = new Lapte(8.5, astazi, "lapte", 3.07, Categorie.LACTATE);
        Cereale a6 = new Cereale();
        Cereale a7 = new Cereale(12.8, astazi, "ingredient1, ingredient2, ingredient3", 6.78, Categorie.PAINE);

        alimente.add(a1);
        alimente.add(a2);
        alimente.add(salam);
        alimente.add(a4);
        alimente.add(iaurt);
        alimente.add(a6);
        alimente.add(a7);

        alimente.stream().sorted((p1, p2) -> p1.getCalorii().compareTo(p2.getCalorii())).forEach( p -> System.out.println(p.afisare()));
    }
}