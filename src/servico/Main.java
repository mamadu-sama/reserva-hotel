//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    Hotel hotel = new Hotel("Hotel Atlântico");
    Scanner scanner = new Scanner(System.in);

    boolean continuar = true;
    while (continuar) {
        System.out.println("\n=============================");
        System.out.println("   HOTEL ATLÂNTICO - MENU");
        System.out.println("=============================");
        System.out.println("1. Listar todos os quartos");
        System.out.println("2. Fazer reserva");
        System.out.println("3. Cancelar reserva");
        System.out.println("4. Listar reservas activas");
        System.out.println("5. Ver resumo");
        System.out.println("0. Sair");
        System.out.print("Escolha: ");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // limpar o buffer

        switch (opcao) {
            case 1:
                hotel.listarQuartos();
                break;

            case 2:
                System.out.print("Nome do hóspede: ");
                String nome = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                System.out.print("Número de identificação: ");
                String nrId = scanner.nextLine();
                System.out.print("Número do quarto: ");
                int nrQuarto = scanner.nextInt();
                System.out.print("Data de entrada (AAAA-MM-DD): ");
                scanner.nextLine();
                String data = scanner.nextLine();
                System.out.print("Número de noites: ");
                int noites = scanner.nextInt();
                scanner.nextLine();

                try {
                    Hospedes h = new Hospedes(nome, email, nrId);
                    hotel.criarReserva(h, nrQuarto, data, noites);
                } catch (IllegalArgumentException e) {
                    System.out.println("Dados inválidos: " + e.getMessage());
                }
                break;

            case 3:
                System.out.print("ID da reserva a cancelar: ");
                int idReserva = scanner.nextInt();
                scanner.nextLine();
                hotel.cancelarReserva(idReserva);
                break;

            case 4:
                hotel.listarReservasActivas();
                break;

            case 5:
                hotel.resumo();
                break;

            case 0:
                continuar = false;
                System.out.println("Até logo!");
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
    scanner.close();




}










