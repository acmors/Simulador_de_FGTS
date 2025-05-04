package database;

import model.ContaFGTS;
import model.Movimentacao;
import model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Usuario> usuarios = new ArrayList<>();
    public static List<ContaFGTS> contas = new ArrayList<>();
    public static List<Movimentacao> movimentacoes = new ArrayList<>();

    static {
        // Usuário 1
        Usuario u1 = new Usuario(1, "João da Silva", "12345678900", "senha123");
        ContaFGTS c1 = new ContaFGTS(1, 800, "0001-9", u1);
        usuarios.add(u1);
        contas.add(c1);

        // Usuário 2
        Usuario u2 = new Usuario(2, "Maria Oliveira", "98765432100", "senha456");
        ContaFGTS c2 = new ContaFGTS(2, 1500,"0002-4", u2);
        usuarios.add(u2);
        contas.add(c2);
    }
}
