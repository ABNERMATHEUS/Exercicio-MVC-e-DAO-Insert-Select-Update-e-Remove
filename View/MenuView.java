package MVCDAO.View;

import java.util.Scanner;

public class MenuView {
    private int opcao;
    private Scanner s;
    public MenuView() {
        s = new Scanner(System.in);
    }

    public int Menu (){
        System.out.println("============ \nCadastrar - 1\nListar - 2\nAtualizar - 3\nRemover - 4\n============");
        opcao = s.nextInt();
        return opcao;
    }
}
