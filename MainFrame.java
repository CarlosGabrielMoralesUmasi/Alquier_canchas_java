import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Sistema de Alquiler de Canchas de Fútbol");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        // Panel de botones
        JPanel panelBotones = new JPanel(new GridLayout(3, 1));
        
        JButton btnRegistrarUsuario = new JButton("Registrar Usuario");
        JButton btnRealizarReserva = new JButton("Realizar Reserva");
        JButton btnConsultarHorarios = new JButton("Consultar Horarios Disponibles");

        // Agregar acciones a los botones
        btnRegistrarUsuario.addActionListener(e -> new RegistrarUsuarioFrame());
        btnRealizarReserva.addActionListener(e -> new RealizarReservaFrame());
        btnConsultarHorarios.addActionListener(e -> new ConsultarHorariosFrame());

        panelBotones.add(btnRegistrarUsuario);
        panelBotones.add(btnRealizarReserva);
        panelBotones.add(btnConsultarHorarios);

        add(panelBotones, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
