package MVCDAO.Controller;

import MVCDAO.DAO.UsuarioDAO;
import MVCDAO.Model.Usuario;
import MVCDAO.View.CadastroUsuarioView;

public class CadastrUsuarioController {

    private CadastroUsuarioView cadastroUsuarioView;
    private Usuario u;
    private UsuarioDAO usuarioDAO;


    public CadastrUsuarioController() {
         cadastroUsuarioView = new CadastroUsuarioView();
         u = cadastroUsuarioView.teladeCadastro();
         System.out.println("Funcionou");
         usuarioDAO = new UsuarioDAO();
         usuarioDAO.InserirUsuario(u);

    }
}
