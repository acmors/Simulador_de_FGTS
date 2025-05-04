package service;

import database.DataBase;
import model.ContaFGTS;
import model.Movimentacao;
import model.Usuario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaService {

    public double visualizarSaldo(Usuario usuario){
        ContaFGTS conta = getContaPorUsuario(usuario);
        return conta != null ? conta.getSaldo() : 0;
    }

    public List<Movimentacao> listarMovimentacoes(Usuario usuario){
        ContaFGTS conta = getContaPorUsuario(usuario);
        List<Movimentacao> result = new ArrayList<>();
        for (Movimentacao m : DataBase.movimentacoes){
            if (m.getContaFGTS().equals(conta)){
                result.add(m);
            }
        }
        return result;
    }

    public List<Movimentacao> filtrarMovimentacoesPorData(Usuario usuario, LocalDate inicio, LocalDate fim){
        List<Movimentacao> todas = listarMovimentacoes(usuario);
        List<Movimentacao> filtradas = new ArrayList<>();

        for (Movimentacao m : todas){
            if ((m.getData().isEqual(inicio) || m.getData().isAfter(fim) && (m.getData().isEqual(inicio) || m.getData().isBefore(fim)))){
                filtradas.add(m);
            }
        }
        return filtradas;
    }

    private ContaFGTS getContaPorUsuario(Usuario usuario){
        for(ContaFGTS conta : DataBase.contas){
            if(conta.getUsuario().equals(usuario)){
                return conta;
            }
        }
        return null;
    }
}
