package Ejercicio_8_3;

public class Cilindro{
    //Atributos propios de la clase
    double radio;
    double altura;

    public Cilindro(double radio, double altura){
        this.radio = radio;
        this.altura = altura;
        this.volumen = calcularVolumen();
        this.superficie = calcularSuperficie();
    }

    //Metodos para calcular atributos

    public void calcularVolumen(){
        this.volumen = Math.PI*Math.pow(radio, 2)*altura;
    }

    public void calcularSuperficie(){
        this.superficie = 2*Math.PI*radio*(radio+altura);
    }
}