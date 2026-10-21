// Aluna: Maria Eduarda Feliciano Lunelli
// RA: 2768410

public class Espumante extends Bebida {

    private String tipoFermentacao;
    private double precoAdicionalBrut;
    
    public Espumante() {
        super();
        this.tipoFermentacao = "";
        this.precoAdicionalBrut = 0.0;
    }
    
    //Sobrecarga
    public Espumante(String nome, int volumeMl, double precoBase, String tipoFermentacao, double precoAdicionalBrut) throws PrecoInvalidoException, VolumeInvalidoException {
        super(nome, precoBase, volumeMl); 
        this.tipoFermentacao = tipoFermentacao;
        this.precoAdicionalBrut = precoAdicionalBrut;
    }
    
    public String getTipoFermentacao() { return tipoFermentacao; }  
    public void setTipoFermentacao(String tipoFermentacao) { this.tipoFermentacao = tipoFermentacao; }  
    
    public double getPrecoAdicionalBrut(){ return precoAdicionalBrut; } 
    public void setPrecoAdicionalBrut(double precoAdicionalBrut) { this.precoAdicionalBrut = precoAdicionalBrut; }
    
    //Sobrescrita
    public double calcularPrecoFinal() {
        return getPrecoBase() + this.precoAdicionalBrut;
    }   

    //Sobrescrita
    public String definirCategoria() {
        if (this.precoAdicionalBrut > 30.0) {
            return "Luxo / Champenoise";
        } else {
            return "Comercial";
        }   
    }
}