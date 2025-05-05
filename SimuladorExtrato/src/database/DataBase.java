package database;

import model.ContaFGTS;
import model.Movimentacao;
import model.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Usuario> usuarios = new ArrayList<>();
    public static List<ContaFGTS> contas = new ArrayList<>();
    public static List<Movimentacao> movimentacoes = new ArrayList<>();

    static {
        Usuario u1 = new Usuario(1, "João da Silva", "12345678900", null, "senha123");
        ContaFGTS c1 = new ContaFGTS(1, 800, "0001-9", u1);
        u1.setContaFGTS(c1);
        usuarios.add(u1);
        contas.add(c1);

        movimentacoes.add(new Movimentacao(c1, LocalDate.of(2024, 5, 1), "Depósito", 500));
        movimentacoes.add(new Movimentacao(c1, LocalDate.of(2024, 5, 3), "Saque", -200));

        Usuario u2 = new Usuario(2, "Maria Oliveira", "98765432100", null, "senha456");
        ContaFGTS c2 = new ContaFGTS(2, 1500, "0002-4", u2);
        u2.setContaFGTS(c2);
        usuarios.add(u2);
        contas.add(c2);

        movimentacoes.add(new Movimentacao(c2, LocalDate.of(2024, 4, 20), "Depósito", 1000));
        movimentacoes.add(new Movimentacao(c2, LocalDate.of(2024, 4, 25), "Saque", -300));
    }

    public static double calcularSaldo(ContaFGTS conta) {
        double saldoCalculado = conta.getSaldo();
        for (Movimentacao mov : movimentacoes) {
            if (mov.getContaFGTS().equals(conta)) {
                saldoCalculado += mov.getValor();
            }
        }
        return saldoCalculado;
    }
}
