// Aluna: Maria Eduarda Feliciano Lunelli
// RA: 2768410

public class Suco extends Bebida {

    private double teorFruta;
    private boolean contemConservante;

    public Suco() {
        super();
        this.teorFruta = 0.0;
        this.contemConservante = true;
    }

    //Sobrecarga
    public Suco(String nome, int volumeMl, double precoBase, double teorFruta, boolean contemConservante) throws PrecoInvalidoException, VolumeInvalidoException {
        super(nome, precoBase, volumeMl); 
        this.teorFruta = teorFruta;
        this.contemConservante = contemConservante;
    }
    
    public double getTeorFruta() { return teorFruta; }
    public void setTeorFruta(double teorFruta) { this.teorFruta = teorFruta; }
    
    public boolean isContemConservante(){ return contemConservante; }
    public void setContemConservante(boolean contemConservante) { this.contemConservante = contemConservante; }
    
    //Sobrescrita
    public double calcularPrecoFinal() {
        if (!this.contemConservante) { 
            return getPrecoBase() * 0.90; 
        }
        return getPrecoBase();
    }   
        
    //Sobrescrita
    public String definirCategoria() {
        if (this.teorFruta >= 80.0) {
            return "Integral / Natural";
        } else {
            return "Néctar / Refresco";
        }
    }
}