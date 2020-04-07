package MVCDAO.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private Connection connection;



    private final String banco = "jdbc:mysql://127.0.0.1/db_dvm?useSSL=false";

    public Conexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(banco,"root","root");
        } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
        }

    }

    public Connection getConnection() {
        return connection;
    }
}
