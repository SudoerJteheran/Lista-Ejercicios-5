package Ejercicio_8_3;

public class Piramide extends FiguraGeometrica{
    //Atributos propios de la clase
    double altura;
    double base;
    double apotema;

    public Piramide(double altura, double base, double apotema){
        this.volumen = calcularVolumen();
        this.superficie = calcularSuperficie();
        this.altura = altura;
        this.base = base;
        this.apotema = apotema;
    }

    //Metodos para calcular atributos

    public void calcularVolumen(){
        this.volumen = (altura*base)/3;
    }

    public void calcularSuperficie(){
        this.superficie = base*apotema/2+base*base;
    }

}