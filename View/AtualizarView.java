package MVCDAO.View;

import MVCDAO.Model.Usuario;

import java.util.Scanner;

public class AtualizarView {


    private Scanner s;
    private Usuario u;
    public AtualizarView() {
        s = new Scanner(System.in);
    }

    public Usuario TelaAtualizar(){
        u = new Usuario();
        System.out.println("Digite o id que deseja Atualizar: ");
         u.setId( s.nextInt() );
        System.out.println("Digite nome: ");
        u.setNome(s.next());
        System.out.println("Digite email: ");
        u.setEmail(s.next());
        System.out.println("Digite idade: ");
        u.setIdade( s.nextInt());
        System.out.println("Digite senha");
        u.setSenha(s.next());
        return u;


    }
}
