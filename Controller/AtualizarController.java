package MVCDAO.Controller;

import MVCDAO.DAO.UsuarioDAO;
import MVCDAO.View.AtualizarView;

public class AtualizarController {
    private UsuarioDAO usuarioDAO;
    private AtualizarView atualizarView;
    public AtualizarController() {
        atualizarView = new AtualizarView();
        usuarioDAO = new UsuarioDAO();
        usuarioDAO.AtualizarUsuario(atualizarView.TelaAtualizar());


    }
}
