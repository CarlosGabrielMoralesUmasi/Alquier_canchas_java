import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/alquilercanchas", "root", "tu_contraseña");
            if (connection != null) {
                System.out.println("Conexión exitosa!");
            } else {
                System.out.println("Fallo en la conexión!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver no encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error de conexión.");
            e.printStackTrace();
        }
    }
}
