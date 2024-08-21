import java.awt.GridLayout;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RegistrarUsuarioFrame extends JFrame {

    private JTextField txtNombre;
    private JTextField txtTelefono;

    public RegistrarUsuarioFrame() {
        setTitle("Registrar Usuario");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblTelefono = new JLabel("Telefono:");
        txtNombre = new JTextField();
        txtTelefono = new JTextField();

        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.addActionListener(e -> registrarUsuario());

        add(lblNombre);
        add(txtNombre);
        add(lblTelefono);
        add(txtTelefono);
        add(btnRegistrar);

        setVisible(true);
    }

    private void registrarUsuario() {
        String nombre = txtNombre.getText();
        String telefono = txtTelefono.getText();

        if (nombre.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            GestorReservas gestor = new GestorReservas();
            gestor.insertarUsuario(nombre, telefono);
            JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente.");
            dispose();  // Cerrar la ventana
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al registrar usuario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
