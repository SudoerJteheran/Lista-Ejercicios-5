package Ejercicio_8_3;

public class FiguraGeometrica {
    double volumen;
    double superficie;

    //Se crea el constructor

    public FiguraGeometrica(double volumen, double superficie) {
        this.volumen = volumen;
        this.superficie = superficie;
    }
    
    //Se crean los getters y setters
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getSuperficie() {
        return superficie;
    }
}