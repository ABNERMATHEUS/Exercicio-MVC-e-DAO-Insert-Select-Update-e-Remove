package MVCDAO.Controller;

import MVCDAO.DAO.UsuarioDAO;
import MVCDAO.View.ListarUsuarioView;

public class ListarUsuarioController {

    private ListarUsuarioView listarUsuarioView;
     private UsuarioDAO usuarioDAO;


    public ListarUsuarioController() {
        usuarioDAO = new UsuarioDAO();
        listarUsuarioView = new ListarUsuarioView();
        listarUsuarioView.ListarUsuario(usuarioDAO.listarUsuario());
    }
}
