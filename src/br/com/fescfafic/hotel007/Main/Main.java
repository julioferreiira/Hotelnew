package br.com.fecfafic.hotel007.Main;
import java.time.LocalDate;
import br.com.fescfafic.hotel.Model.Cliente;
import br.com.fescfafic.hotel.Model.QuartoDuplo;
import br.com.fescfafic.hotel.Model.QuartoSimples;
import br.com.fescfafic.hotel.Model.Hotel;

public class Main{
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Hotel Exemplo", "Endereço do Hotel", 10);

        Cliente cliente1 = new Cliente("Laíza", "12345", "Laíza@example.com");
        Cliente cliente2 = new Cliente("Júlio", "54321", "Júlio@example.com");

        QuartoSimples quarto1 = new QuartoSimples(1, 100.0);
        QuartoDuplo quarto2 = new QuartoDuplo(2, 150.0);

        LocalDate dataCheckIn1 = LocalDate.of(2023, 10, 20);
        LocalDate dataCheckOut1 = LocalDate.of(2023, 10, 25);
        LocalDate dataCheckIn2 = LocalDate.of(2023, 10, 22);
        LocalDate dataCheckOut2 = LocalDate.of(2023, 10, 27);

        hotel.fazerReserva(cliente1, quarto1, dataCheckIn1, dataCheckOut1);
        hotel.fazerReserva(cliente2, quarto2, dataCheckIn2, dataCheckOut2);

        System.out.println("Informações do Hotel:");
        hotel.exibirInfo();

        System.out.println("\nInformações dos Clientes:");
        cliente1.exibirInfo();
        cliente2.exibirInfo();
    }
}
