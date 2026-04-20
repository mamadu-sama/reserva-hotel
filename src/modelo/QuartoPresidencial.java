package modelo;

public class QuartoPresidencial extends  Quarto{

    private String nomePatrocinador;
    public QuartoPresidencial(int numero){
        super(numero, 250.00);
        this.nomePatrocinador = null;
    }

    public QuartoPresidencial(int numero, String nomePatrocinador){
        super(numero, 250.00);
        this.nomePatrocinador = nomePatrocinador;
    }

    @Override
    public String getTipo() {
        if (nomePatrocinador != null) {
            return "Suite Presidencial (" + nomePatrocinador + ")";
        } else {
            return "Suite Presidencial";
        }


    }
}
