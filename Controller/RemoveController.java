package MVCDAO.Controller;

import MVCDAO.DAO.UsuarioDAO;
import MVCDAO.View.RemoveView;

public class RemoveController {
    private RemoveView removeView;
    private UsuarioDAO usuarioDAO;
    public RemoveController() {
        usuarioDAO = new UsuarioDAO();
        removeView= new RemoveView();
        usuarioDAO.Remover(removeView.Tela_Remover());

    }
}
