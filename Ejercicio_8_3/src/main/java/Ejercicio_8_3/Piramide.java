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
    //TODO Revisar las formulas cuidadosamente
    public void calcularVolumen(){
        this.volumen = (altura*base)/3;
    }

    public void calcularSuperficie(){
        this.superficie = (base*apotema)/2+Math.pow(base, 2);
    }

}