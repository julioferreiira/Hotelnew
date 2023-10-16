package br.com.fescfafic.hotel007.Model;

import java.util.ArrayList;
import java.util.List;
public class Cliente {
    public String nome;
    public String id;
    public String email;
    public List<Reserva> reservas;

    public Cliente(String nome, String id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.reservas = new ArrayList<>();
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("E-mail: " + email);
        System.out.println("Reservas:");
        for (Reserva reserva : reservas) {
            reserva.exibirInfo();
        }
    }

    public boolean fazerReserva(Reserva reserva) {
        if (reservas.size() < 3) {
            reservas.add(reserva);
            return true;
        } else {
            System.out.println("Limite de reservas atingido para este cliente.");
            return false;
        }
    }
}