/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 *
 * @author isabe
 */
public class ConnectionFactory {
    public Connection getConnection() {

        Properties propriedades = new Properties();

        try (FileInputStream arquivo = new FileInputStream("../conexao.properties")) {

            propriedades.load(arquivo);

            String usuarioBanco = propriedades.getProperty("DB_USER");
            String senhaBanco = propriedades.getProperty("DB_ROOT_PASSWORD");

            return DriverManager.getConnection("jdbc:mysql://localhost/CrudPet", usuarioBanco, senhaBanco);
        } 
        catch (IOException | SQLException excecao) {
            throw new RuntimeException("Erro ao conectar com o banco de dados", excecao);
        }
    }
}
