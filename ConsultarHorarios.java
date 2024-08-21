import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultarHorarios {

    public void verHorariosDisponibles(String fecha, int canchaId) throws SQLException {
        String query = "SELECT hora_inicio, hora_inicio + INTERVAL horas HOUR AS hora_fin FROM Reservas WHERE fecha = ? AND cancha_id = ?";
        try (Connection conn = ConexionBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, fecha);
            stmt.setInt(2, canchaId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println("Reservado desde: " + rs.getTime("hora_inicio") + " hasta: " + rs.getTime("hora_fin"));
                }
            }
        }
    }
}
