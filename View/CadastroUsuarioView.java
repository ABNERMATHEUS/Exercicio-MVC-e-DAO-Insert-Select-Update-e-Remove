package MVCDAO.View;

import MVCDAO.DAO.UsuarioDAO;
import MVCDAO.Model.Usuario;

import java.sql.ResultSet;
import java.util.Scanner;

public class CadastroUsuarioView {

    private  Usuario u ;
    private UsuarioDAO usuarioDAO;


    public Usuario teladeCadastro(){
        u= new Usuario();
        Scanner s = new Scanner(System.in);

        System.out.print("Digite nome:");
        u.setNome(s.next());

        System.out.print("Digite email:");
        u.setEmail(s.next());

        System.out.print("Digite idade:");
        u.setIdade(s.nextInt());

        System.out.print("Digite senha:");
        u.setSenha(s.next());
        return u;
    }


}
