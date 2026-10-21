// Aluna: Maria Eduarda Feliciano Lunelli
// RA: 2768410

public class Vinho extends Bebida {

    private String tipoUva;
    private int anoSafra;
    
    public Vinho() {
        super();
        this.tipoUva = "";
        this.anoSafra = 0;
    }
	
    //Sobrecarga
    public Vinho(String nome, int volumeMl, double precoBase, String tipoUva, int anoSafra) throws PrecoInvalidoException, VolumeInvalidoException {
        super(nome, precoBase, volumeMl);
        this.tipoUva = tipoUva;
        this.anoSafra = anoSafra;
    }

    public String getTipoUva() { return tipoUva; }
    public void setTipoUva(String tipoUva) { this.tipoUva = tipoUva; }

    public int getAnoSafra() { return anoSafra; }
    public void setAnoSafra(int anoSafra) { this.anoSafra = anoSafra; }

    //Sobrescrita
    public double calcularPrecoFinal() {
        if (this.anoSafra < 2015) {
            return getPrecoBase() * 1.20;
        }
        return getPrecoBase();
    }

    //Sobrescrita
    public String definirCategoria() {
        if (this.tipoUva.equalsIgnoreCase("Cabernet") || this.tipoUva.equalsIgnoreCase("Merlot")) {
            return "Premium";
        } else {
            return "Standard";
        }
    }
}