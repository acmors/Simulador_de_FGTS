package auth;
import database.DataBase;
import model.Usuario;

public class SistemaAutenticacao {

    public static Usuario login(String cpf, String senha){
        for(Usuario u : DataBase.usuarios){
            if(u.getCpf().equals(cpf) && u.getSenha().equals(senha)){
                return u;
            }
        }
        return null;
    }

}
