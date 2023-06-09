package Ejercicio_8_3;

public class Esfera extends FiguraGeometrica{
    //Atributos propios de la clase
    double radio;

    public Esfera(double radio){
        this.radio = radio;
        calcularVolumen();
        calcularSuperficie();
    }

    //Metodos para calcular atributos

    public void calcularVolumen(){
        this.volumen = (4/3)*Math.PI*Math.pow(radio, 3);
    }

    public void calcularSuperficie(){
        this.superficie = 4*Math.PI*Math.pow(radio, 2);
    }
}