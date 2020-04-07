package MVCDAO.View;

import java.util.Scanner;

public class RemoveView {
    Scanner s ;
    public RemoveView() {
        s = new Scanner(System.in);
    }

    public int Tela_Remover(){
        System.out.println("Digite o id que deseja remover: ");
        return s.nextInt();
    }

}
