import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorReservas {

    public void insertarUsuario(String nombre, String telefono) throws SQLException {
        String query = "INSERT INTO Usuarios (nombre, telefono) VALUES (?, ?)";
        try (Connection conn = ConexionBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.setString(2, telefono);
            stmt.executeUpdate();
        }
    }

    public void realizarReserva(int canchaId, int usuarioId, String fecha, String horaInicio, int horas) throws SQLException {
        String query = "INSERT INTO Reservas (cancha_id, usuario_id, fecha, hora_inicio, horas) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexionBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, canchaId);
            stmt.setInt(2, usuarioId);
            stmt.setString(3, fecha);
            stmt.setString(4, horaInicio);
            stmt.setInt(5, horas);
            stmt.executeUpdate();
        }
    }
}
