package MVCDAO.Controller;

import MVCDAO.View.MenuView;

import java.util.Scanner;

public class MenuController {
    private Scanner s;
    private int opcao;
    private MenuView menuView;
    public MenuController() {
        s = new Scanner(System.in);
        menuView = new MenuView();
        while (true){
            opcao = menuView.Menu();
            switch (opcao){
                case 1 :
                    CadastrUsuarioController cadastrUsuarioController= new CadastrUsuarioController();
                    break;
                case 2:
                    ListarUsuarioController listarUsuarioController = new ListarUsuarioController();
                    break;
                case 3:
                    AtualizarController atualizarController = new AtualizarController();
                    break;
                case 4:
                    RemoveController removeController = new RemoveController();
                    break;
            }

        }
    }
}
