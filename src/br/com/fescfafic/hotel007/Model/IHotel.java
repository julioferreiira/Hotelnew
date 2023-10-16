package br.com.fescfafic.hotel007.Model;
import java.time.LocalDate;
public interface IHotel {
    void fazerReserva(Cliente cliente, Quarto1 quarto, LocalDate dataCheckIn, LocalDate dataCheckOut);
    void exibirInfo();
}
