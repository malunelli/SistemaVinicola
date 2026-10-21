// Aluna: Maria Eduarda Feliciano Lunelli
// RA: 2768410

public abstract class Bebida implements Classificavel {
    
    private String nome;
    private double precoBase;
    private int volumeMl;

    public Bebida() {
        this.nome = "";
        this.precoBase = 0.0;
        this.volumeMl = 0;
    }

    //Sobrecarga
    public Bebida(String nome, double precoBase, int volumeMl) throws PrecoInvalidoException, VolumeInvalidoException {
        this.nome = nome;
        this.setPrecoBase(precoBase); 
        this.setVolumeMl(volumeMl);   
    }

    // Getters E Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPrecoBase() { return precoBase; }

    public void setPrecoBase(double precoBase) throws PrecoInvalidoException {
        if (precoBase < 0) {
            throw new PrecoInvalidoException();
        }
        this.precoBase = precoBase;
    }

    public int getVolumeMl() { return volumeMl; }

    public void setVolumeMl(int volumeMl) throws VolumeInvalidoException {
        if (volumeMl <= 0) {
            throw new VolumeInvalidoException();
        }
        this.volumeMl = volumeMl;
    }

    public abstract double calcularPrecoFinal();
}