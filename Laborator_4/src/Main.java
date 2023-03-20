import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Date azi = new Date();

        Map<String, Boolean> a1Utilitati = new HashMap<>();
        a1Utilitati.put("Tv", true);
        a1Utilitati.put("AC", true);
        a1Utilitati.put("Aragaz", true);
        Apartament a1 = new Apartament(Tip.DOUA_CAMERE, 1, 70000.0, azi, 55.0, false, 1,
                Arrays.asList("dormitor", "living", "baie, bucatarie"), a1Utilitati);

        Map<String, Boolean> a2Utilitati = new HashMap<>();
        a2Utilitati.put("Tv", true);
        a2Utilitati.put("AC", false);
        a2Utilitati.put("Aragaz", true);
        Apartament a2 = new Apartament(Tip.GARSONIERA, 2, 40000.0, azi, 38.0, true, 1,
                Arrays.asList("dormitor", "baie, bucatarie"), a2Utilitati);

        Map<String, Boolean> a3Utilitati = new HashMap<>();
        a3Utilitati.put("Tv", false);
        a3Utilitati.put("AC", true);
        a3Utilitati.put("Aragaz", true);
        a3Utilitati.put("Masina de spalat", true);
        Apartament a3 = new Apartament(Tip.OPEN_SPACE, 2, 40000.0, azi, 40.0, true, 1,
                Arrays.asList("living", "baie, bucatarie"), a3Utilitati);
    }
}