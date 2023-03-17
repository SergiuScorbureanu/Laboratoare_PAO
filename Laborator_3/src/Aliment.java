import java.util.Date;

public class Aliment {

    private Double pret;
    private Date dataExpirare;
    private String ingredient;
    private Double calorii;
    private Categorie categorie;

    public Aliment() {
        this.pret = 0D;
        this. dataExpirare = new Date();
        this.ingredient = "";
        this. calorii = 0D;
        this.categorie = null;
    }

    public Aliment(Double pret, Date dataExpirare, String ingredient, Double calorii, Categorie categorie) {
        this.pret = pret;
        this. dataExpirare = dataExpirare;
        this.ingredient = ingredient;
        this. calorii = calorii;
        this.categorie = categorie;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public Date getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(Date dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public Double getCalorii() {
        return calorii;
    }

    public void setCalorii(Double calorii) {
        this.calorii = calorii;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public String afisare()
    {
        return getClass().getSimpleName() + "[calorii = " + calorii + "]";
    }
}
