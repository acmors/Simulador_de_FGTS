package service;

import model.Movimentacao;

public class MovimentacaoService {
    public void registrarMovimentacao(Movimentacao mov){
        mov.getContaFGTS().setSaldo(
                mov.getTipo().equals("DEPOSITO") ?
                mov.getContaFGTS().getSaldo() + mov.getValor() :
                mov.getContaFGTS().getSaldo() - mov.getValor()
        );
    }
}
