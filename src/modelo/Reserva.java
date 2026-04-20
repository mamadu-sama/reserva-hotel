package modelo;

public class Reserva {
    private int id;
    private Hospedes hospede;
    private Quarto quarto;
    private String dataEntrada;
    private int numerosNoites;
    private boolean activa;
    private static int contadorNoite = 0;

    public Reserva(Hospedes hospede, Quarto quarto, String dataEntrada, int numerosNoites){
        contadorNoite ++;

        this.id = contadorNoite;
        this.hospede = hospede;
        this.quarto = quarto;
        dataEntradavalida(dataEntrada);
        numeroNoiteValida(numerosNoites);
        this.activa = true;
        this.quarto.ocupar();

    }

    public void numeroNoiteValida(int numerosNoites){
        if (numerosNoites < 0){
            throw new IllegalArgumentException("Numero de noite deve ser maior que zero");
        }
        this.numerosNoites = numerosNoites;

    }

    public void dataEntradavalida(String dataEntrada){
        if (dataEntrada == null || dataEntrada.isBlank()){
        throw new IllegalArgumentException("Data de entrada não deve ser nula");
        }
        this.dataEntrada = dataEntrada;
    }

    public double calcularPrecoTotal(){
        return quarto.getPrecoPorNoite() * numerosNoites;
    }

    public void cancelar(){
        if ((!activa)){
            System.out.println("modelo.Reserva #" + id + " já estava cancelada.");
            return;
        }
        this.activa = false;
        this.quarto.libertar(); // liberta o quarto
        System.out.println("modelo.Reserva #" + id + " cancelada. modelo.Quarto " + quarto.getNumero() + " agora livre.");
    }
    @Override
    public String toString() {
        String estado = activa ? "ACTIVA" : "CANCELADA";
        return String.format(
                "modelo.Reserva #%d [%s]%n" +
                        "  Hóspede: %s%n" +
                        "  modelo.Quarto: %s%n" +
                        "  Entrada: %s | %d noite(s)%n" +
                        "  Total: %.2f€",
                id, estado,
                hospede.getNome(),
                quarto,
                dataEntrada, numerosNoites,
                calcularPrecoTotal()
        );
    }


    public int getId() {
        return id;
    }

    public Hospedes getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public int getNumerosNoites() {
        return numerosNoites;
    }

    public boolean isActiva() {
        return activa;
    }

    public static int getContadorNoite() {
        return contadorNoite;
    }
}
