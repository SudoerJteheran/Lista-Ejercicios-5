package Ejercicio_8_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCilindro extends JFrame implements ActionListener{
    // Atributo para definir el contenedor de la interfaz gráfica
    private Container contenedor;
    // Atributos para identificar los campos de texto
    private JLabel lblRadio, lblAltura, lblVolumen, lblSuperficie;
    //Campos para ingresar los valores
    private JTextField txtRadio, txtAltura;
    //Botón para calcular el volumen y la superficie
    private JButton btnCalcular;

    // Constructor de la clase
    public VentanaCilindro(){
        // Título de la ventana
        setTitle("Cilindro");
        // Tamaño de la ventana
        setSize(400, 300);
        // No permite modificar la ventana
        setResizable(false);
        // Ubicación de la ventana en el centro de la pantalla
        setLocationRelativeTo(null);
        // Método para inicializar los atributos
        inicializarComponentes();
    }

    // Método para inicializar los componentes
    private void inicializarComponentes() {
        contenedor = getContentPane(); // Instanciamos el contenedor
        contenedor.setLayout(null); // No usamos ningún layout, solo asi podremos dar posiciones a los componentes

        // Establecemos las características del lblRadio
        lblRadio = new JLabel("Radio(cms):"); // Instanciamos el objeto lblRadio
        lblRadio.setBounds(10, 10, 100, 30); // Ubicación del lblRadio

        // Establecemos las características del lblAltura
        lblAltura = new JLabel("Altura(cms):"); // Instanciamos el objeto lblAltura
        lblAltura.setBounds(10, 50, 100, 30); // Ubicación del lblAltura

        // Ahora instanciamos los objetos de tipo JTextField
        txtRadio = new JTextField(); // Instanciamos el objeto txtRadio
        txtRadio.setBounds(120, 10, 100, 30); // Ubicación del txtRadio

        txtAltura = new JTextField(); // Instanciamos el objeto txtAltura
        txtAltura.setBounds(120, 50, 100, 30); // Ubicación del txtAltura

        btnCalcular = new JButton("Calcular"); // Instanciamos el objeto btnCalcular
        btnCalcular.setBounds(10, 170, 100, 30); // Ubicación del btnCalcular
        /*Agregamos al boton el ActionListener para poder realizar los calculos
        al presionar el botón*/
        btnCalcular.addActionListener(this);

        //Establecemos las características del lblVolumen
        lblVolumen = new JLabel("Volumen(cm^3):"); // Instanciamos el objeto lblVolumen
        lblVolumen.setBounds(10, 90, 170, 30); // Ubicación del lblVolumen

        //Establecemos las características del lblSuperficie
        lblSuperficie = new JLabel("Superficie(cm^2):"); // Instanciamos el objeto lblSuperficie
        lblSuperficie.setBounds(10, 130, 170, 30); // Ubicación del lblSuperficie

        // Agregamos los componentes al contenedor
        contenedor.add(lblRadio);
        contenedor.add(lblAltura);
        contenedor.add(txtRadio);
        contenedor.add(txtAltura);
        contenedor.add(btnCalcular);
        contenedor.add(lblVolumen);
        contenedor.add(lblSuperficie);
    }

        public void actionPerformed(ActionEvent event) {
            boolean error = false; // Variable para verificar si hay error
            double radio = 0;
            double altura = 0;

            if (event.getSource() == btnCalcular) {
                try {
                    radio = Double.parseDouble(txtRadio.getText()); // Obtenemos el radio
                    altura = Double.parseDouble(txtAltura.getText()); // Obtenemos la altura
                    Cilindro cilindro = new Cilindro(radio, altura); // Instanciamos el objeto cilindro

                    //Calculamos el volumen y la superficie
                    lblVolumen.setText("Volumen(cm^3): " + String.format("%.2f", cilindro.getVolumen()));
                    lblSuperficie.setText("Superficie(cm^2): " + String.format("%.2f", cilindro.getSuperficie()));
                } catch (Exception e) {
                    error = true;
                } finally {
                    if (error) {
                        JOptionPane.showMessageDialog(null, "Error, ingrese valores numéricos", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
    }
}