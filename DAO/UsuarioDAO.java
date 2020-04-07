package MVCDAO.DAO;

import MVCDAO.Model.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    Conexao conexao;
    private String query;
    private PreparedStatement preparedStatement;
    private ResultSet result;

    public UsuarioDAO() {
        this.conexao = new Conexao();
    }

    public void InserirUsuario(Usuario u){

        query = "INSERT INTO usuario(nome, senha, idade, email) VALUES (" +
                "'" + u.getNome()  + "'," +
                "'" + u.getSenha() + "'," +
                + u.getIdade() + ","  +
                "'" + u.getEmail() + "')";

        try {
            preparedStatement = conexao.getConnection().prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public ResultSet listarUsuario(){

        query = "SELECT * FROM usuario";
        try {
            preparedStatement = conexao.getConnection().prepareStatement(query);
            result = preparedStatement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;


    }

    public void AtualizarUsuario(Usuario u){

        query = "UPDATE usuario set  nome= ' "+u.getNome()+" ', email = ' "+u.getEmail()+" ', senha=' "+u.getSenha()+" ',idade ="+u.getIdade()+" WHERE idusuario ="+u.getId();
        try {
            preparedStatement = conexao.getConnection().prepareStatement(query);
            preparedStatement.executeUpdate();
        }catch (SQLException SQL){
            SQL.printStackTrace();
        }

    }

    public void Remover(int i){
        query = "DELETE FROM usuario\n" +
                "WHERE idusuario="+i;
        try{
        preparedStatement = conexao.getConnection().prepareStatement(query);
        preparedStatement.executeUpdate();
        }catch (SQLException SQL){
            SQL.printStackTrace();
        }
    }


}
