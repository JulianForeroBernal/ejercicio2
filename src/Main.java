import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Personaje> listaPersonajes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        byte opcion1;
        boolean salir1 = false;
        byte opcion2;
        boolean salir2 = false;
        do {
            System.out.println("""
                    MENU:\s
                    1. crear personaje\s
                    2. mostrar personajes\s
                    3. buscar personaje\s
                    4. salir \s
                    """);
            opcion1 = scan.nextByte();
            switch (opcion1){
                case 1:
                    System.out.println("ingrese el nombre del personaje: ");
                    String nombre = scan.nextLine();
                    Personaje pj = new Personaje(nombre);
                    listaPersonajes.add(pj);
                    break;
                case 2:
                    if (listaPersonajes.isEmpty()){
                        System.out.println("no hay personajes creados");
                        break;
                    }else {
                        for (Personaje p : listaPersonajes){
                            System.out.println(p.toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("escriba el nombre del personaje: ");
                    String nombreBusqueda = scan.nextLine();
                    Personaje personajeSeleccionado;
                    for (Personaje p : listaPersonajes){
                        if (nombreBusqueda.equalsIgnoreCase(p.getNombre())){
                            personajeSeleccionado = p;
                            do {
                                System.out.println("""
                                MENU 2:\s
                                1. mostrar estado\s
                                2. ganar xp\s
                                3. subir de nivel\s
                                4. aplicar daño\s
                                5. curar\s
                                6. salir\s
                                """);
                                opcion2 = scan.nextByte();
                                switch (opcion2){
                                    case 1:
                                        System.out.println(personajeSeleccionado);
                                        break;
                                    case 2:
                                        System.out.println("escriba la cantidad de xp que gano: ");
                                        int cantidad = scan.nextInt();
                                        personajeSeleccionado.ganarXp(cantidad);
                                        System.out.println(personajeSeleccionado.getNombre() + "tiene " + personajeSeleccionado.getXp() + "pts de xp");
                                        break;
                                    case 3:
                                        personajeSeleccionado.subirNivel();
                                        System.out.println(personajeSeleccionado.getNombre() + "es nivel: " + personajeSeleccionado.getNivel());
                                        break;
                                    case 4:
                                        System.out.println("ingrese la cantidad de daño que recibio: ");
                                        int daño = scan.nextInt();
                                        if (!personajeSeleccionado.recibirDaño(daño)){
                                            System.out.println("su personaje murio...");
                                        }else {
                                            System.out.println(personajeSeleccionado.getNombre() + "tiene: " + personajeSeleccionado.getVida() + "pts de vida");
                                        }
                                        break;
                                    case 5:
                                        System.out.println("ingrese la cantidad de curacion que recibio: ");
                                        int curacion = scan.nextInt();
                                        personajeSeleccionado.curarse(curacion);
                                        System.out.println(personajeSeleccionado.getNombre() + "tiene: " + personajeSeleccionado.getVida() + "pts de vida");
                                        break;
                                    case 6:
                                        salir2 = true;
                                        break;
                                }
                            }while (!salir2);
                        }else {
                            System.out.println("no se encontro ningun personaje con ese nombre (" + nombreBusqueda + ")");
                        }
                    }
                    break;
                case 4:
                    salir1 = true;
                    break;
            }
        }while (!salir1);
    }
}
