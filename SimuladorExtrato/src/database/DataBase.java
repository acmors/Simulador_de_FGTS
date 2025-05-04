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
}
