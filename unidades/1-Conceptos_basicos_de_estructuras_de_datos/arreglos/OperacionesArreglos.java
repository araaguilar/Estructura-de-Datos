
package mx.edu.arreglos;

import javax.swing.*;

public class OperacionesArreglos {
    private double[] vector;
    private final int TAMANIO = 5;

    // Constructor por defecto
    public OperacionesArreglos() {
        this.vector = new double[TAMANIO];
    }
    public void llenarArreglo(){
        int i = 0;
        do{
            this.vector[i] =
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor decimal: "));
            i++;
        }while(i<this.vector.length);
    }

    // Constructor con tamaño
    public OperacionesArreglos(int tamanio) {
        this.vector = new double[tamanio];
    }

    // Constructor con arreglo
    public OperacionesArreglos(double[] vector) {
        this.vector = new double[vector.length];
        this.vector = vector;
        imprimir(vector);
    }


    public static double[] crearYLLenarArreglo() {
        int tamanio = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce el tamaño del arreglo:")
        );
        double[] vector = new double[tamanio];

        for (int i = 0; i < tamanio; i++) {
            vector[i] = Double.parseDouble(
                    JOptionPane.showInputDialog("Introduce el valor de la posición [" + i + "]:")
            );
        }

        return vector;
    }

    // Imprimir arreglo
    public static void imprimir(double[] vector) {
        String salida = "";
        for (double valor : vector) {
            salida += "| " + valor + " | ";
        }
        JOptionPane.showMessageDialog(null, salida, "Contenido del arreglo", JOptionPane.INFORMATION_MESSAGE);
    }


    public double sumarValores() {
        double suma = 0.0;
        for (int i = 0; i < this.vector.length; i++) {
            suma += this.vector[i];
        }

        return suma;
    }


    public static double obtenerMayor() {
        double mayor = 0.0;
       int i=0;
       while (i<this.vector.length){
           if (mayor < this.vector[i])
               mayor=this.vector[i];
           i++;

           }
       return mayor;
           }


    public static double obtenerMenor() {
        double menor = this.vector[0];
        for (double valor : this.vector) {
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }
    public void cambiarTamaño(int tamanio) {
        double temp[]=new double[tamanio];

        for (int i = 0; i < this.vector.length; i++) {
            temp[i] = this.vector[i];
        }
        this.vector = temp;
        temp=null;
    }


    public String buscar(double valor) {
        String salida = "";
        boolean sentinel = false;
        for (int i = 0; i < this.vector.length; i++) {
            if (valor == this.vector[i]) {
                sentinel = true;
                salida="El valor " + valor + "esta en la posicion " + i;
                break;
            }
            }
        if(!sentinel)
            salida="El valor no se encontro en el arreglo";
            return salida;
        }
        JOptionPane.showMessageDialog(null, "El valor " + valorBuscado + " no fue encontrado.");
        return -1;
    }

    // Getter
    public double[] getVector() {
        return vector;
    }

}