package Ejercicio_8_3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Interfaz grafica para el menu que permite seleccionar las figuras geométricas.

public class VentanaPrincipal extends JFrame implements ActionListener{
    private Container contenedor;
    private JLabel lblTitulo;
    private JButton btnEsfera, btnPiramide, btnCilindro, btnSalir;

    public VentanaPrincipal(){
        setTitle("Menu");
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        inicializarComponentes();
    }

    private void inicializarComponentes(){
        contenedor = getContentPane();
        contenedor.setLayout(null);

        lblTitulo = new JLabel("Seleccione una figura:");
        lblTitulo.setBounds(10, 10, 200, 30);

        btnEsfera = new JButton("Esfera");
        btnEsfera.setBounds(10, 50, 100, 30);
        btnEsfera.addActionListener(this);

        btnPiramide = new JButton("Piramide");
        btnPiramide.setBounds(10, 90, 100, 30);
        btnPiramide.addActionListener(this);

        btnCilindro = new JButton("Cilindro");
        btnCilindro.setBounds(10, 130, 100, 30);
        btnCilindro.addActionListener(this);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(10, 170, 100, 30);
        btnSalir.addActionListener(this);

        contenedor.add(lblTitulo);
        contenedor.add(btnEsfera);
        contenedor.add(btnPiramide);
        contenedor.add(btnCilindro);
        contenedor.add(btnSalir);
    }

    public void actionPerformed(ActionEvent event){
        if(event.getSource() == btnEsfera) {
            VentanaEsfera ventanaEsfera = new VentanaEsfera();
            ventanaEsfera.setVisible(true);
        } else if(event.getSource() == btnPiramide) {
            VentanaPiramide ventanaPiramide = new VentanaPiramide();
            ventanaPiramide.setVisible(true);
        } else if (event.getSource() == btnCilindro) {
            VentanaCilindro ventanaCilindro = new VentanaCilindro();
            ventanaCilindro.setVisible(true);
        } else if(event.getSource() == btnSalir) {
            System.exit(0);
        }
    }
}