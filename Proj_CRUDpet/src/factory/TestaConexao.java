/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author isabe
 */
public class TestaConexao {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) {
        try {
            Connection connection = new ConnectionFactory() .getConnection();
            System.out.println("Conexão aberta com sucesso!");
            connection.close();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}