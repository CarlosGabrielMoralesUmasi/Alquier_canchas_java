import java.awt.GridLayout;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RealizarReservaFrame extends JFrame {

    private JTextField txtUsuarioId;
    private JTextField txtCanchaId;
    private JTextField txtFecha;
    private JTextField txtHoraInicio;
    private JTextField txtHoras;

    public RealizarReservaFrame() {
        setTitle("Realizar Reserva");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));

        JLabel lblUsuarioId = new JLabel("ID Usuario:");
        JLabel lblCanchaId = new JLabel("ID Cancha:");
        JLabel lblFecha = new JLabel("Fecha (YYYY-MM-DD):");
        JLabel lblHoraInicio = new JLabel("Hora Inicio (HH:MM):");
        JLabel lblHoras = new JLabel("Horas:");

        txtUsuarioId = new JTextField();
        txtCanchaId = new JTextField();
        txtFecha = new JTextField();
        txtHoraInicio = new JTextField();
        txtHoras = new JTextField();

        JButton btnReservar = new JButton("Reservar");
        btnReservar.addActionListener(e -> realizarReserva());

        add(lblUsuarioId);
        add(txtUsuarioId);
        add(lblCanchaId);
        add(txtCanchaId);
        add(lblFecha);
        add(txtFecha);
        add(lblHoraInicio);
        add(txtHoraInicio);
        add(lblHoras);
        add(txtHoras);
        add(btnReservar);

        setVisible(true);
    }

    private void realizarReserva() {
        try {
            int usuarioId = Integer.parseInt(txtUsuarioId.getText());
            int canchaId = Integer.parseInt(txtCanchaId.getText());
            String fecha = txtFecha.getText();
            String horaInicio = txtHoraInicio.getText();
            int horas = Integer.parseInt(txtHoras.getText());

            if (horas < 1 || horas > 3) {
                JOptionPane.showMessageDialog(this, "La reserva debe ser de 1 a 3 horas.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            GestorReservas gestor = new GestorReservas();
            gestor.realizarReserva(canchaId, usuarioId, fecha, horaInicio, horas);
            JOptionPane.showMessageDialog(this, "Reserva realizada exitosamente.");
            dispose();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al realizar la reserva: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
