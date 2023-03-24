import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Date azi = new Date();
        List<Apartament> apartamente = new ArrayList<>();

        Map<String, List<String>> ap1Utilitati = new HashMap<>();
        ap1Utilitati.put("living", Arrays.asList("TV", "birou", "canapea"));
        ap1Utilitati.put("dormitor", Arrays.asList("pat", "noptiera"));
        ap1Utilitati.put("bucatarie", Arrays.asList("aragaz", "hota", "masa", "scaune"));
        ap1Utilitati.put("baie", Arrays.asList("masina_de_spalat", "dulapior"));
        Apartament ap1 = new Apartament(Tip.DOUA_CAMERE, 1, 70000.0, azi, 55.0, false, 2, 1,
                Arrays.asList("dormitor", "living", "baie, bucatarie"), ap1Utilitati);
        apartamente.add(ap1);

        Map<String, List<String>> ap2Utilitati = new HashMap<>();
        ap2Utilitati.put("dormitor", Arrays.asList("pat", "noptiera", "birou", "AC"));
        ap2Utilitati.put("bucatarie", Arrays.asList("aragaz", "masa", "scaune"));
        ap1Utilitati.put("baie", Arrays.asList("masina_de_spalat", "bideu"));
        Apartament ap2 = new Apartament(Tip.GARSONIERA, 2, 40000.0, azi, 38.0, true, 1, 1,
                Arrays.asList("dormitor", "baie, bucatarie"), ap2Utilitati);
        apartamente.add(ap2);

        Map<String, List<String>> ap3Utilitati = new HashMap<>();
        ap3Utilitati.put("living", Arrays.asList("TV", "birou", "canapea", "plita_electrica", "AC"));
        ap3Utilitati.put("bucatarie", Arrays.asList("aragaz", "hota", "masa", "scaune"));
        ap1Utilitati.put("baie", Arrays.asList("masina_de_spalat", "bideu"));
        Apartament ap3 = new Apartament(Tip.OPEN_SPACE, 2, 40000.0, azi, 40.0, true, 2,1,
                Arrays.asList("living", "baie, bucatarie"), ap3Utilitati);
        apartamente.add(ap3);

        // Meniu
        String intro = """
                Introduceti opriunea dorita:
                (1) pentru sortarea apartamentelor dupa numarul de camere
                (2) pentru vizionarea utilitatilor fiecarui apartament
                (3) task 3...
                Optiunea:
                """;
        System.out.println();
        System.out.print(intro);
        int optiune = scanner.nextInt();

        switch (optiune) {
            case 1 -> {
                List<Apartament> apSortateNrCamere = sortareApNrCamere(apartamente);
                System.out.println("Apartamente sortate dupa numarul de camere: ");
                for (Apartament ap : apSortateNrCamere) {
                    System.out.println(ap);
                }
            }
            case 2 -> utilitatiApartamente(apartamente);
            default -> System.out.println("Optiune invalida!");
        }

    }

    static List<Apartament> sortareApNrCamere(List<Apartament> apartamente) {
        return apartamente.stream().sorted((ap1, ap2) -> ap1.getNrCamere().compareTo(ap2.getNrCamere())).toList();
    }

    static void utilitatiApartamente(List<Apartament> apartamente) {
        for(Apartament ap : apartamente) {
            System.out.println("Apartamentul " + ap.getNr() + " are urmatoarele utilitati: ");
            System.out.println(ap.getUtilitatiPeCamera());
        }
    }


}