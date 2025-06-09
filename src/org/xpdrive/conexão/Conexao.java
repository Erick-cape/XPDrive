package org.xpdrive.conexão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cadastro_produtos";
        String usuario = "root";
        String senha = "XPdrive08";
        return DriverManager.getConnection(url, usuario, senha);
    }
}
