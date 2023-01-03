package proyecto;

import java.util.Random;

public class GenNombres {
    public static void generadorNombres(){
        String nombres []= {"Adriana", "Martín", "Lucas", "Mateo", "Leonardo", "Daniel", "Alejandro", "Pablo", "Manuel", "Andrea", "Daniela", "David", "Mario", "Valentina", "Diego", "Nadia", "Sofía", "Javier", "Marco", "Álex", "Bruno", "Dana", "Miguel", "Thiago", "Antonio", "Mariana", "Carlos", "Ángel", "Juan", "Gonzalo", "Gabriela", "Sergio", "Nicolás", "Dylan", "Nicole", "Jorge", "José", "Adam", "María", "Erick", "Samuel", "Denisse", "Héctor", "Luca", "Iker", "Galilea", "Rodrigo", "Saúl", "Víctor", "Jesús", "Jaime", "Arantza", "Rubén", "Ian", "Grecia", "Eli", "Mohamed", "Julia", "Luisa", "Paulina", "Rafael", "Alberto", "Santiago", "Rayan", "Noah", "Alonso", "Axel", "Luka", "Mauro", "Mayela"};
        String apellidos[]={"Hernández", "García", "Martínez", "López", "Gonzáles", "Pérez", "Rodríguez", "Sánchez", "Ramírez", "Cruz", "Flores", "Gómez", "Morales", "Vázquez", "Reyes", "Jiménez", "Torres", "Díaz", "Gutiérrez", "Ruiz", "Mendoza", "Aguilar", "Ortiz", "Moreno", "Castillo", "Romero", "Álvarez", "Méndez", "Chávez", "Rivera", "Juárez", "Ramos", "Domínguez", "Herrera", "Medina", "Castro", "Vargas", "Guzmán", "Velázquez", "Rojas", "Contreras", "Salazar", "Luna", "Ortega", "Guerrero", "Estrada", "Bautista", "Cortés", "Soto", "Alvarado", "Espinoza", "Lara", "Ávila", "Ríos", "Cervantes", "Silva", "Delgado", "Vega", "Márquez", "Sandoval", "Carrillo", "Fernández", "León", "Mejía", "Solís", "Rosas", "Ibarra", "Valdez", "Nuez", "Campos"};
        int max = 324000000;
        int min = 323000000;
    for(int i = 0;i<500;i++)
    {
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(randomInt + ", " +nombres[new Random().nextInt(nombres.length)]  + " "+ apellidos[new Random().nextInt(apellidos.length)] + " " + apellidos[new Random().nextInt(apellidos.length)]);
        //Alumno.setNombre(nombres[new Random().nextInt(nombres.length)]);
    }


}}
