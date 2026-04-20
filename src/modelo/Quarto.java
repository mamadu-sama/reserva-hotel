
/**
 * Representa um quarto do Hotel Atlântico.
 * Cada quarto tem um número único, um preço por noite e um estado
 * (livre ou ocupado). Esta classe é abstracta: não pode ser instanciada
 * directamente. Usa QuartoStandard, QuartoSuite ou QuartoPresidencial.
 */
public abstract class Quarto {
    private int numero;
    private double precoPorNoite;
    private boolean ocupado ;


    /**
     * Cria um quarto com o número e preço indicados.
     * O quarto começa sempre no estado livre.
     *
     * @param numero       o número do quarto (ex: 101, 201)
     * @param precoPorNoite o preço em euros por noite
     */
    public Quarto(int numero, double precoPorNoite){
        this.numero = numero;
        this.precoPorNoite = precoPorNoite;
        this.ocupado = false;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public boolean libertar(){
        return this.ocupado = false;
    }

    public boolean ocupar(){
        return this.ocupado = true;
    }



    /**
     * Devolve o tipo de quarto como texto.
     * Implementado por cada subclasse.
     *
     * @return o nome do tipo (ex: "Standard", "Suite")
     */
    public abstract  String getTipo();

    @Override
    public String toString() {
        return "Quarto{" +
                "numero=" + numero +
                ", precoPorNoite=" + precoPorNoite +
                ", ocupado=" + ocupado +
                ", tipo=" + getTipo() +
                '}';
    }
}
