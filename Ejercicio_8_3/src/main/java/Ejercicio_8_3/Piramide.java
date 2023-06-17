package Ejercicio_8_3;

public class Piramide extends FiguraGeometrica{
    //Atributos propios de la clase
    double altura;
    double base;
    double apotema;

    public Piramide(double altura, double base, double apotema){
        this.altura = altura;
        this.base = base;
        this.apotema = apotema;
        calcularVolumen();
        calcularSuperficie();
    }

    //Metodos para calcular atributos
    public void calcularVolumen(){
        this.volumen = (Math.pow(base, 2) * altura) / 3;
    }

    public void calcularSuperficie(){
        double áreaBase = Math.pow(base, 2);
        double áreaLado = 2 * base * apotema;
        this.superficie = áreaBase + áreaLado;
    }

}