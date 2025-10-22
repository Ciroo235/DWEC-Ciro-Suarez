package es;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("123","BMW","Abc",15000);
        Vehiculo vehiculo2 = new Vehiculo("456","Citroen", "bcs",20000);
        Vehiculo vehiculo3 = new Vehiculo("780","Open","asd",12000);

        Coche coche1 = new Coche("13131A","Renault","cd",13333,"blanco","d");
        Coche coche2 = new Coche("12312B","Citroen","ab",19999,"rojo","d");
        Coche coche3 = new Coche("11231C","Nissan","asda",20000,"azul","d");

        Moto moto1 = new Moto("1313A","Hero","asdas",13000,20,12);
        Moto moto2 = new Moto("12313B","Yamaha","asdas",12,12,13);
        Moto moto3 = new Moto("23133C","Suzuki","sadas",121212,13,14);

        Camion camion1 = new Camion("12312C","Mercedes-Benz","asdasd",40000,false,20000);
        Camion camion2 = new Camion("1231312C","Volvo","asdasd",30000,true,30000);
        Camion camion3 = new Camion("123131B","Iveco","asdasd",30000,true,300000);

        System.out.println(vehiculo1.toString());

        double precioConIVA = conIVA(vehiculo1);
        System.out.println(precioConIVA);

        Descuento();

        menu();
    }

    public static double conIVA(Vehiculo vehiculo){
        return vehiculo.getPrecio() + vehiculo.getPrecio() * 0.16;
    }

    public static void Descuento(){
        // Aquí puedes poner el código de descuento si quieres
        System.out.println("Función descuento llamada");
    }

    public static void menu() {
        int opcion=0;
        String matricula;
        String marca;
        String modelo;
        int precio;
        int cilindrada;
        int caballos;
        boolean nacional;
        int peso;
        String color;
        String tipo;
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();



        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.println("Menu");
                System.out.println("1. Crear Coche");
                System.out.println("2. Crear Moto");
                System.out.println("3. Crear Camion");
                System.out.println("4. Mostrar ArrayList");
                System.out.println("5. Salir");
                System.out.print("Selecciona una opción: ");

                opcion = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error letra introducida");
                sc.next();
            }if(opcion<1 || opcion>5)
                System.out.println("Error numero no valido,introduzca otro:");
            sc.next();

            switch (opcion) {
                case 1:
                    System.out.println("Crear Coche seleccionado");
                    System.out.println("Matricula");
                    matricula=sc.next();
                    System.out.println("Marca");
                    marca=sc.next();
                    System.out.println("Modelo");
                    modelo=sc.next();
                    System.out.println("Precio");
                    precio=sc.nextInt();
                    System.out.println("Color");
                    color=sc.next();
                    System.out.println("Tipo");
                    tipo=sc.next();
                    listaVehiculos.add(new Coche(matricula,marca,modelo,precio,color,tipo));
                    break;
                case 2:
                    System.out.println("Crear Moto seleccionado:");

                    System.out.println("Matricula:");
                    matricula=sc.next();
                    System.out.println("Marca:");
                    marca=sc.next();
                    System.out.println("Modelo:");
                    modelo=sc.next();
                    System.out.println("Cilindrada:");
                    cilindrada=sc.nextInt();
                    System.out.println("Precio:");
                    precio=sc.nextInt();
                    System.out.println("caballos:");
                    caballos=sc.nextInt();
                    listaVehiculos.add(new Moto(matricula,marca,modelo,precio,cilindrada,caballos));

                    break;
                case 3:
                    System.out.println("Crear Camion seleccionado");
                    System.out.println("Crear Camion seleccionado:");

                    System.out.println("Matricula:");
                    matricula=sc.next();
                    System.out.println("Marca:");
                    marca=sc.next();
                    System.out.println("Modelo:");
                    modelo=sc.next();
                    System.out.println("Nacional:");
                    nacional=sc.nextBoolean();
                    System.out.println("Precio:");
                    precio=sc.nextInt();
                    System.out.println("Peso:");
                    peso=sc.nextInt();
                    listaVehiculos.add(new Camion(matricula,marca,modelo,precio,nacional,peso));

                    break;
                case 4:
                    System.out.println("Mostrar ArrayList seleccionado");
                    for(Vehiculo v : listaVehiculos){
                        System.out.println(v);

                    }

                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 5);


    }
}
