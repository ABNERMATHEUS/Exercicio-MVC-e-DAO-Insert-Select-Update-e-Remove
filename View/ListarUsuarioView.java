package MVCDAO.View;

import MVCDAO.DAO.UsuarioDAO;
import MVCDAO.Model.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarUsuarioView {




    public ListarUsuarioView() {

    }
    public void ListarUsuario(ResultSet s){
        try{

            while (s.next()){
                System.out.print("id : "+ s.getString("idusuario")+"| ");
                System.out.print("nome : "+s.getString("nome")+"| ");
                System.out.print("email : "+s.getString("email")+"| ");
                System.out.print("senha : "+s.getString("senha")+"| ");
                System.out.print("idade : "+s.getString("idade")+"| ");
                System.out.println("\n");
            }

        }catch (SQLException sql){
            sql.printStackTrace();
        }







    }
}
