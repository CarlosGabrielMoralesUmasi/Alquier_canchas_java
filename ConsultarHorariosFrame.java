import java.awt.GridLayout;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ConsultarHorariosFrame extends JFrame {

    private JTextField txtCanchaId;
    private JTextField txtFecha;

    public ConsultarHorariosFrame() {
        setTitle("Consultar Horarios Disponibles");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        JLabel lblCanchaId = new JLabel("ID Cancha:");
        JLabel lblFecha = new JLabel("Fecha (YYYY-MM-DD):");

        txtCanchaId = new JTextField();
        txtFecha = new JTextField();

        JButton btnConsultar = new JButton("Consultar");
        btnConsultar.addActionListener(e -> consultarHorarios());

        add(lblCanchaId);
        add(txtCanchaId);
        add(lblFecha);
        add(txtFecha);
        add(btnConsultar);

        setVisible(true);
    }

    private void consultarHorarios() {
        try {
            int canchaId = Integer.parseInt(txtCanchaId.getText());
            String fecha = txtFecha.getText();

            ConsultarHorarios consulta = new ConsultarHorarios();
            consulta.verHorariosDisponibles(fecha, canchaId);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al consultar horarios: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
