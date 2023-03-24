import java.util.*;

public class Apartament {

    private Tip tip;
    private Integer nr;
    private Double pret;
    private Date dataCumparare;
    private Double dimensiune;
    private Boolean balcon;
    private Integer nrCamere;
    private Integer nrBai;
    private List<String> camere = new ArrayList<>();
    //private List<String> test = Arrays.asList("test", "test2");
    private Map<String, List<String>> utilitatiPeCamera;

    public Apartament () {}

    public Apartament(Tip tip, Integer nr, Double pret, Date dataCumparare, Double dimensiune, Boolean balcon, Integer nrCamere,
                      Integer nrBai, List<String> camere, Map<String, List<String>> utilitatiPeCamera) {
        this.tip = tip;
        this.nr = nr;
        this.pret = pret;
        this.dataCumparare = dataCumparare;
        this.dimensiune = dimensiune;
        this.balcon = balcon;
        this.nrCamere = nrCamere;
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

    public Integer getNrCamere() {
        return nrCamere;
    }

    public void setNrCamere(Integer nrCamere) {
        this.nrCamere = nrCamere;
    }

    public void setNrBai(Integer nrBai) {
        this.nrBai = nrBai;
    }

    public List<String> getCamere() {
        return camere;
    }

    public void setCamere(List<String> camere) {
        this.camere = camere;
    }

    public Map<String, List<String>> getUtilitatiPeCamera() {
        return utilitatiPeCamera;
    }

    public void setUtilitatiPeCamera(Map<String, List<String>> utilitatiPeCamera) {
        this.utilitatiPeCamera = utilitatiPeCamera;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartament that = (Apartament) o;
        return tip == that.tip && Objects.equals(nr, that.nr) && Objects.equals(pret, that.pret) && Objects.equals(dataCumparare, that.dataCumparare) && Objects.equals(dimensiune, that.dimensiune) && Objects.equals(balcon, that.balcon) && Objects.equals(nrCamere, that.nrCamere) && Objects.equals(nrBai, that.nrBai) && Objects.equals(camere, that.camere) && Objects.equals(utilitatiPeCamera, that.utilitatiPeCamera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tip, nr, pret, dataCumparare, dimensiune, balcon, nrCamere, nrBai, camere, utilitatiPeCamera);
    }

    @Override
    public String toString() {
        return "Apartament{" +
                "tip=" + tip +
                ", nr=" + nr +
                ", pret=" + pret +
                ", dataCumparare=" + dataCumparare +
                ", dimensiune=" + dimensiune +
                ", balcon=" + balcon +
                ", nrCamere=" + nrCamere +
                ", nrBai=" + nrBai +
                ", camere=" + camere +
                ", utilitatiPeCamera=" + utilitatiPeCamera +
                '}';
    }
}
