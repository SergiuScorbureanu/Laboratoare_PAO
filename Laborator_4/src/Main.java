import java.util.*;

public class Main {
    public static void main(String[] args) {

        Date azi = new Date();

        Map<String, List<String>> ap1Utilitati = new HashMap<>();
        ap1Utilitati.put("living", Arrays.asList("TV", "birou", "canapea"));
        ap1Utilitati.put("dormitor", Arrays.asList("pat", "noptiera"));
        ap1Utilitati.put("bucatarie", Arrays.asList("aragaz", "hota", "masa", "scaune"));
        ap1Utilitati.put("baie", Arrays.asList("masina_de_spalat", "dulapior"));
        Apartament ap1 = new Apartament(Tip.DOUA_CAMERE, 1, 70000.0, azi, 55.0, false, 2, 1,
                Arrays.asList("dormitor", "living", "baie, bucatarie"), ap1Utilitati);

        Map<String, List<String>> ap2Utilitati = new HashMap<>();
        ap2Utilitati.put("dormitor", Arrays.asList("pat", "noptiera", "birou", "AC"));
        ap2Utilitati.put("bucatarie", Arrays.asList("aragaz", "masa", "scaune"));
        ap1Utilitati.put("baie", Arrays.asList("masina_de_spalat", "bideu"));
        Apartament ap2 = new Apartament(Tip.GARSONIERA, 2, 40000.0, azi, 38.0, true, 1, 1,
                Arrays.asList("dormitor", "baie, bucatarie"), ap2Utilitati);

        Map<String, List<String>> ap3Utilitati = new HashMap<>();
        ap3Utilitati.put("living", Arrays.asList("TV", "birou", "canapea", "plita_electrica", "AC"));
        ap3Utilitati.put("bucatarie", Arrays.asList("aragaz", "hota", "masa", "scaune"));
        ap1Utilitati.put("baie", Arrays.asList("masina_de_spalat", "bideu"));
        Apartament ap3 = new Apartament(Tip.OPEN_SPACE, 2, 40000.0, azi, 40.0, true, 2,1,
                Arrays.asList("living", "baie, bucatarie"), ap3Utilitati);
    }


}