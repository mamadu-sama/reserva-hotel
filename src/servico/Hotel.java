package servico;

import modelo.*;

public class Hotel {
    private String nome;
    private Quarto[] quartos;
    private Reserva[] reservas;
    private int totalReservas;

    public Hotel(String nome){
        this.nome = nome;
        this.quartos = new Quarto[20];
        this.reservas = new Reserva[100];
        this.totalReservas = 0;
        inicializarQuartos();
    }

    private void inicializarQuartos(){
        // quartos 102-110: standard
        for (int i = 0; i < 10; i++){
            quartos[i] = new QuartoStandard(101 + 1);

        }
        for (int i = 10 ; i < 17 ; i ++){
            quartos[i] = new QuartoSuite(201 + (i - 10));
        }
        quartos[17] = new QuartoPresidencial(301);
        quartos[18] = new QuartoPresidencial(302);
        quartos[19] = new QuartoPresidencial(303, "Banco Atlantico");
    }


    public void listarQuartos(){
        System.out.println("\n=== Quartod do " + nome + " ===");
        for (Quarto quarto: quartos){
            System.out.println(quarto);
        }
    }

    public Quarto encontrarQuarto(int numero){
        for (Quarto q : quartos){
            if(q.getNumero() == numero){ return q;}

        }
        return null;
    }

    public Quarto quartoDisponivelDoTipo(String tipo){
        for (Quarto qrto: quartos){
            if (!qrto.isOcupado() && qrto.getTipo().equalsIgnoreCase(tipo)){
                return qrto;
            }
        }
            return null;
    }

    public Reserva criarReserva(Hospedes hospede, int numeroQuarto, String dataEntrada, int noites){
     if(totalReservas >= reservas.length){
         System.out.println("Sistema Cheio: Não é possivel criar reservas");
         return null;
     }
     Quarto quarto = encontrarQuarto(numeroQuarto);
     if (quarto == null){
         System.out.println("modelo.Quarto " + numeroQuarto + "Não existe.");
         return  null;
     }
     try {

         Reserva reserva = new Reserva(hospede, quarto, dataEntrada, noites);
         reservas[totalReservas++] = reserva;
         System.out.println("modelo.Reserva criada com sucesso: #" + reserva.getId());
         return reserva;

     } catch (IllegalArgumentException e) {
         System.out.println("Erro ao criar reserva: " + e.getMessage());
         return null;
     }

    }

    public void cancelarReserva(int idReserva){
        for (int i = 0; i < totalReservas; i++){
            if(reservas[i].getId() == idReserva){
                reservas[i].cancelar();
                return ;
            }
        }
        System.out.println("modelo.Reserva #" + idReserva + " não encontrado");
    }

    public void listarReservasActivas() {
        System.out.println("\n=== Reservas activas ===");
        int count = 0;
        for (int i = 0; i < totalReservas; i++) {
            if (reservas[i].isActiva()) {
                System.out.println(reservas[i]);
                System.out.println();
                count++;
            }
        }
        if (count == 0) System.out.println("Nenhuma reserva activa.");
    }

    public void resumo() {
        int livres = 0, ocupados = 0;
        for (Quarto q : quartos) {
            if (q.isOcupado()) ocupados++; else livres++;
        }
        double receita = 0;
        for (int i = 0; i < totalReservas; i++) {
            if (reservas[i].isActiva())
                receita += reservas[i].calcularPrecoTotal();
        }
        System.out.println("\n=== Resumo do " + nome + " ===");
        System.out.println("Quartos livres:  " + livres);
        System.out.println("Quartos ocupados: " + ocupados);
        System.out.printf("Receita activa:  %.2f€%n", receita);
    }
}
