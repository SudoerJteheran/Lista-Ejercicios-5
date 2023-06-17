package Ejercicio_8_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPiramide extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel lblBase, lblAltura, lblApotema,lblVolumen, lblSuperficie;
    private JTextField txtBase, txtAltura, txtApotema;
    private JButton btnCalcular;

    public VentanaPiramide(){
        setTitle("Piramide");
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        inicializarComponentes();
    }

    private void inicializarComponentes(){
        contenedor = getContentPane();
        contenedor.setLayout(null);

        lblBase = new JLabel("Base (cms):");
        lblBase.setBounds(10, 10, 100, 30);

        lblAltura = new JLabel("Altura (cms):");
        lblAltura.setBounds(10, 50, 100, 30);

        lblApotema = new JLabel("Apotema (cms):");
        lblApotema.setBounds(10, 90, 100, 30);

        lblVolumen = new JLabel("Volumen (en cms3):");
        lblVolumen.setBounds(10, 130, 200, 30);

        lblSuperficie = new JLabel("Superficie (en cms2):");
        lblSuperficie.setBounds(10, 170, 200, 30);

        txtBase = new JTextField();
        txtBase.setBounds(120, 10, 100, 30);

        txtAltura = new JTextField();
        txtAltura.setBounds(120, 50, 100, 30);

        txtApotema = new JTextField();
        txtApotema.setBounds(120, 90, 100, 30);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(10, 210, 100, 30);
        btnCalcular.addActionListener(this);

        contenedor.add(lblBase);
        contenedor.add(lblAltura);
        contenedor.add(lblApotema);
        contenedor.add(lblVolumen);
        contenedor.add(lblSuperficie);
        contenedor.add(txtBase);
        contenedor.add(txtAltura);
        contenedor.add(txtApotema);
        contenedor.add(btnCalcular);
    }
    
    public void actionPerformed(ActionEvent event) {
        boolean error = false;

        if(event.getSource() == btnCalcular) {
            try {
                double base = Double.parseDouble(txtBase.getText());
                double altura = Double.parseDouble(txtAltura.getText());
                double apotema = Double.parseDouble(txtApotema.getText());
                Piramide piramide = new Piramide(base, altura, apotema);
                lblVolumen.setText("Volumen (cm^3): " + String.format("%.2f", piramide.getVolumen()));
                lblSuperficie.setText("Superficie (cm^2): " + String.format("%.2f", piramide.getSuperficie()));
            } catch (Exception e) {
                error = true;
            }
            if (error) {
                JOptionPane.showMessageDialog(this, "Error en el ingreso de datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}