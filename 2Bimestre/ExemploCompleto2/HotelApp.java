import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservaController controller = new ReservaController();

        try {
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o número de hóspedes: ");
            int numeroHospedes = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite a data de entrada (yyyy-mm-dd): ");
            LocalDate dataEntrada = LocalDate.parse(scanner.nextLine());

            System.out.println("Escolha o tipo de quarto:");
            for (TipoQuarto tipo : TipoQuarto.values()) {
                System.out.println("- " + tipo);
            }

            String tipoStr = scanner.nextLine().toUpperCase();
            TipoQuarto tipoQuarto = TipoQuarto.valueOf(tipoStr);

            Reserva reserva = new Reserva(nome, numeroHospedes, dataEntrada, tipoQuarto);

            double precoTotal = controller.calcularPreco(reserva);

            System.out.println("\n--- RESERVA CONFIRMADA ---");
            System.out.println("Cliente: " + reserva.getNomeCliente());
            System.out.println("Tipo de quarto: " + reserva.getTipoQuarto());
            System.out.println("Data de entrada: " + reserva.getDataEntrada());
            System.out.println("Número de hóspedes: " + reserva.getNumeroHospedes());
            System.out.println("Preço total: R$ " + precoTotal);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Número de hóspedes inválido.");
        } catch (DateTimeParseException e) {
            System.out.println("Erro: Data de entrada em formato inválido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: Tipo de quarto inválido.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
