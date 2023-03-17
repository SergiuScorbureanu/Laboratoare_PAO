import java.util.Date;

public class Carne extends Aliment {

    public Carne() {
        super();
        this.setCalorii(1.05);
    }

    public Carne(Double pret, Date dataExpirare, String ingredient, Double calorii, Categorie categorie) {
        super(pret, dataExpirare, ingredient, calorii, categorie);
    }
}
