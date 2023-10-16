package br.com.fescfafic.hotel007.Model;

import java.time.LocalDate;

public class Reserva {
    public Cliente cliente;
    public Quarto1 quarto;
    public LocalDate dataCheckIn;
    public LocalDate dataCheckOut;

    public Reserva(Cliente cliente, Quarto1 quarto, LocalDate dataCheckIn, LocalDate dataCheckOut) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    public void exibirInfo() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Quarto: " + quarto);
        System.out.println("Data de Check-In: " + dataCheckIn);
        System.out.println("Data de Check-Out: " + dataCheckOut);
    }

    public double calcularTotal() {
        // Implemente a lógica para calcular o valor total com base nas datas e preço do quarto
        return 0.0;
    }
}
