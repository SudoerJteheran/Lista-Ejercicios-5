/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_8_2;

/**
 *
 * @author Jhojan
 */
public class Notas {
    double[] listaNotas;

    //Constructor
    public Notas(){
        listaNotas = new double[5];
    }

    /*
    * Método que calcula el promedio de notas
    * @return El promedio de notas calculado
    */
    double calcularPromedio(){
        double suma = 0;
        for(int i = 0; i < listaNotas.length; i++){
            suma += listaNotas[i];
        }
        return suma/listaNotas.length;
    }

    /**
    * Método que calcula la desviación estándar del array de notas
    * @return La desviación estándar del array de notas
    */
    double calcularDesviacion() {
        double promedio = calcularPromedio();
        double suma = 0;
        for(int i = 0; i < listaNotas.length; i++){
            suma += Math.pow(listaNotas[i] - promedio, 2);
        }
        return Math.sqrt(suma/(listaNotas.length - 1));
    }

    /**
    * Método que calcula el valor menor del array de notas
    * @return El valor menor del array de notas
    */
    double calcularMenor() {
        double menor = listaNotas[0];
        for(int i = 1; i < listaNotas.length; i++){
            if(listaNotas[i] < menor){
                menor = listaNotas[i];
            }
        }
        return menor;
    }

    /**
    * Método que calcula el valor mayor del array de notas
    * @return El valor mayor del array de notas
    */
    double calcularMayor() {
        double mayor = listaNotas[0];
        for(int i = 1; i < listaNotas.length; i++){
            if(listaNotas[i] > mayor){
                mayor = listaNotas[i];
            }
        }
        return mayor;
    }

        
}

