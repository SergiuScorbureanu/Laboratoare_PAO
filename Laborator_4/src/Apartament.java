import java.util.*;

public class Apartament {

    private Tip tip;
    private Integer nr;
    private Double pret;
    private Date dataCumparare;
    private Double dimensiune;
    private Boolean balcon;
    private Integer nrBai;
    private List<String> camere = new ArrayList<>();
    //private List<String> test = Arrays.asList("test", "test2");
    private Map<String, Boolean> utilitatiPeCamera;

    public Apartament () {}

    public Apartament(Tip tip, Integer nr, Double pret, Date dataCumparare, Double dimensiune, Boolean balcon,
                      Integer nrBai, List<String> camere, Map<String, Boolean> utilitatiPeCamera) {
        this.tip = tip;
        this.nr = nr;
        this.pret = pret;
        this.dataCumparare = dataCumparare;
        this.dimensiune = dimensiune;
        this.balcon = balcon;
        this.nrBai = nrBai;
        this.camere = camere;
        this.utilitatiPeCamera = utilitatiPeCamera;
    }

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

    public Integer getNr() {
        return nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public Date getDataCumparare() {
        return dataCumparare;
    }

    public void setDataCumparare(Date dataCumparare) {
        this.dataCumparare = dataCumparare;
    }

    public Double getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(Double dimensiune) {
        this.dimensiune = dimensiune;
    }

    public Boolean getBalcon() {
        return balcon;
    }

    public void setBalcon(Boolean balcon) {
        this.balcon = balcon;
    }

    public Integer getNrBai() {
        return nrBai;
    }

    public void setNrBai(Integer nrBai) {
        this.nrBai = nrBai;
    }

    public List<String> getCamera() {
        return camere;
    }

    public void setCamera(List<String> camere) {
        this.camere = camere;
    }

    public Map<String, Boolean> getUtilitatiPeCamera() {
        return utilitatiPeCamera;
    }

    public void setUtilitatiPeCamera(Map<String, Boolean> utilitatiPeCamera) {
        this.utilitatiPeCamera = utilitatiPeCamera;
    }
}
