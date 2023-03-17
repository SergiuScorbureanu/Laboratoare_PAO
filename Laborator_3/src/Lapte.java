import java.util.Date;

public class Lapte extends Aliment {

    Lapte() {
        super();
        this.setCalorii(3.05);
    }

    Lapte(Double pret, Date dataExpirare, String ingredient, Double calorii, Categorie categorie) {
        super(pret, dataExpirare, ingredient, calorii, categorie);
    }
}
