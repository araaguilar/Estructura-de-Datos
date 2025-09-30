package mx.edu.arreglos;

import javax.swing.*;
import mx.edu.uttt.poo.Alumno;

public class AlumnoVector {
    public static void main(String[] args) {
        int tamanio = 0;
        tamanio = obtenerTamanio();
        Alumno alumnos[] = new Alumno[tamanio];


    }

    public static int obtenerTamanio() {
        return Integer.parseInt(JOptionPane.showInputDialog
                ("Introduce el numero de alumnos a registrar"));
    }

    public static String menu() {
        return "===== MENU PRINCIPAL =====\n" +
                "1) Llenar arreglo\n" +
                "2) Imprimir arreglo\n" +
                "3) Salir\n" +
                "Elegir Opcion";
    }

    public static void operaciones(Alumno[] alumnos) {
        String opcion = "";
        boolean sentinel = true;

        do {
            opcion = JOptionPane.showInputDialog(menu());
            switch (opcion) {
                case "1":

                    break;

                case "2":
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, "Bye");
                    break;

                default:
                    JOptionPane.showInputDialog("Opcion no valida");
            }
        } while (sentinel);
    }
    public static void llenarArreglo(Alumno[]alumnos){
        int i=0;
        while (i<alumnos.length){
            Alumno alumno=new Alumno();
            boolean activo=false;

            alumno.setNombre(JOptionPane.showInputDialog
                    ("Introduce el nombre del alumno [ " +i+ " ]"));
            alumno.setEdad(Integer.parseInt(JOptionPane.showInputDialog
                    ("Introduce la edad del alumno[ " +i+ " ]")));
            alumno.setSexo(JOptionPane.showInputDialog
                    ("Introduce el sexo del alumno [ " +i+ " ]").charAt(0));
            activo= JOptionPane.showInputDialog
                    ("Introduce el status del alumno [ " +i+ " ]Activo/Inactivo"
                    ).equalsIgnoreCase("Activo")?true:false;
                    alumno.setActivo(activo);

                    alumno.setPromedio(Double.parseDouble(
                            JOptionPane.showInputDialog("Introduce el promedio del alumno")));
            i++;
        }
    }
}
