package mx.edu.arreglos;

public class TestOperacionesArreglos {
    public static void main(String[] args) {
        OperacionesArreglos op1 = new OperacionesArreglos();
        OperacionesArreglos op2 = new OperacionesArreglos(tamanio);

        double vector[]={1.2,4.5,7.8};
        OperacionesArreglos op3 = new OperacionesArreglos(vector);
    }

}

/* Resolver el sigueinte problema empleando vectores
        mostrar n productos(nombre, precio y existencia) debe mostrar el costo del inventario*/
