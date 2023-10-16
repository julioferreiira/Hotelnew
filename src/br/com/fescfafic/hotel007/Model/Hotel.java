package br.com.fescfafic.hotel007.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Hotel implements IHotel {
    public String nome;
    public String endereco;
    public List<Quarto1> quartos;
    public List<Cliente> clientes;

    public Hotel(String nome, String endereco, int limiteDeQuartos) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
        this.clientes = new ArrayList<>();

        for (int i = 1; i <= limiteDeQuartos; i++) {
            quartos.add(new QuartoSimples(i, 100.0));
        }
    }

    @Override
    public void fazerReserva(Cliente cliente, Quarto1 quarto, LocalDate dataCheckIn, LocalDate dataCheckOut) {
        Reserva reserva = new Reserva(cliente, quarto, dataCheckIn, dataCheckOut);
        if (quarto.isDisponivel() && cliente.fazerReserva(reserva)) {
            quarto.ocuparQuarto();
        } else {
            System.out.println("Reserva não foi possível.");
        }
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome do Hotel: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Quartos Disponíveis:");
        for (Quarto1 quarto : quartos) {
            if (quarto.isDisponivel()) {
                quarto.exibirInfo();
            }
        }
        System.out.println("Clientes:");
        for (Cliente cliente : clientes) {
            cliente.exibirInfo();
        }
    }
}