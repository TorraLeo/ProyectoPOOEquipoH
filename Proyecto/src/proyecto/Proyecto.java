package proyecto;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) throws IOException {

        System.out.println("Bienvenido al programa de registros de la FI \nPorfavor espere mientras se carga la base de datos");
        LinkedList<Alumno> alumnos = new LinkedList<Alumno>();
        ModuloRegistros inicializar = new ModuloRegistros(alumnos);

        Scanner entrada = new Scanner(System.in);
        int salida = 1;

        do {// repetición de menú de selección
            System.out.println("");
            System.out.println("Menu");

            System.out.println("1)Mostrar registros");
            System.out.println("2)Modificar registro");
            System.out.println("3)Exportar excel");
            System.out.println("4)Salir");
            int opc = entrada.nextInt();

            switch (opc) {
                case 1: {
                    for (Alumno i : alumnos) {
                        System.out.println(i);
                    }
                    break;
                }

                case 2: {
                    System.out.println("Seleccione el campo que desea modificar");
                    System.out.println("Recuerde que no se puede modificar el número de inscripción");

                    System.out.println("1)");
                    System.out.println("2)");
                    System.out.println("4)Volver al menú anterior");
                    int opc2 = entrada.nextInt();
                    switch (opc2) {
                    }
                    break;
                }
            }

        } while (salida != 0);

    }

}
