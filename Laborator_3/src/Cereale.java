import java.util.Date;

public class Cereale extends Aliment {

    Cereale() {
        super();
        this.setCalorii(2.56);
    }

    Cereale(Double pret, Date dataExpirare, String ingredient, Double calorii, Categorie categorie) {
        super(pret, dataExpirare, ingredient, calorii, categorie);
    }
}