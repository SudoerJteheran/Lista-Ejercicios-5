package Ejercicio_8_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEsfera extends JFrame implements ActionListener{
    private Container contenedor;
    private JLabel lblRadio, lblVolumen, lblSuperficie;
    private JTextField txtRadio;
    private JButton btnCalcular;

    public VentanaEsfera(){
        setTitle("Esfera");
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        inicializarComponentes();
    }

    private void inicializarComponentes(){
        contenedor = getContentPane();
        contenedor.setLayout(null);

        lblRadio = new JLabel("Radio(cms):");
        lblRadio.setBounds(10, 10, 100, 30);

        lblVolumen = new JLabel("Volumen(cm^3):");
        lblVolumen.setBounds(10, 50, 200, 30);

        lblSuperficie = new JLabel("Superficie(cm^2):");
        lblSuperficie.setBounds(10, 90, 200, 30);

        txtRadio = new JTextField();
        txtRadio.setBounds(120, 10, 100, 30);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(10, 130, 100, 30);
        btnCalcular.addActionListener(this);

        contenedor.add(lblRadio);
        contenedor.add(lblVolumen);
        contenedor.add(lblSuperficie);
        contenedor.add(txtRadio);
        contenedor.add(btnCalcular);
    }

    public void actionPerformed(ActionEvent event){
        boolean error = false;

        if(event.getSource() == btnCalcular) {
            try {
                double radio = Double.parseDouble(txtRadio.getText());
                Esfera esfera = new Esfera(radio);
                lblVolumen.setText("Volumen(cm^3): " + String.format("%.2f", esfera.getVolumen()));
                lblSuperficie.setText("Superficie(cm^2): " + String.format("%.2f", esfera.getSuperficie()));
            } catch (Exception e) {
                error = true;;
            } finally {
                if(error){
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}