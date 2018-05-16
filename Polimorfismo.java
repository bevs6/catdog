/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.Scanner;
import java.util.ArrayList;

public class Polimorfismo {

    private ArrayList<Vehiculo> listaD = new ArrayList();

    Scanner leer = new Scanner(System.in);

    public void Registrar() {
        System.out.println("\n ======= Mini menu ========");
        System.out.println("Que tipo de vehiculo deseas registrar:");
        System.out.println("1-vehiculo");
        System.out.println("2-terrestre");
        System.out.println("3-pickup");
        System.out.println("4-motocicleta");
        System.out.println("5-Regresar a menu");
        int opc;
        do {
            System.out.print("Ingresa su opcion ---");
            opc = leer.nextInt();
        } while (!(opc == 1 || opc == 2 || opc == 3 || opc == 4 || opc == 5));
        System.out.println("");
        Vehiculo v;

        switch (opc) {
            case 1:
                v = new Vehiculo();
                System.out.println("Registrar vehiculo :");
                listaD.add(PedirDatos(v));

                break;
            case 2:
                v = new Terrestre();
                System.out.println("registrar terrestre:");
                listaD.add(PedirDatos(v));

                break;
            case 3:
                v = new PickUp();
                System.out.println("Registrar pickup:");
                listaD.add(PedirDatos(v));

                break;
            case 4:
                v = new Motocicleta();
                System.out.println("Registrar motocicleta:");
                listaD.add(PedirDatos(v));
                break;

            case 5:
                System.out.println("Regresar a menu:");
                Menu();
                break;

        }

    }

    public Vehiculo PedirDatos(Vehiculo v) {

        System.out.print("marca:");
        v.setMarca(leer.next());
        System.out.print("placa:");
        v.setPlaca(leer.next());
        System.out.print("precio:");
        v.setPrecio(leer.nextInt());

        if (v instanceof Terrestre) {
            System.out.print("Kilometros por hora:");
            ((Terrestre) v).setKmHoraMax(leer.nextInt());
        }

        if (v instanceof PickUp) {
            System.out.print("Capacidad de cargo:");

            ((PickUp) v).setCapacidadCarga(leer.nextFloat());

        }
        if (v instanceof Motocicleta) {
            System.out.print("Tipo:");
            ((Motocicleta) v).setTipo(leer.next());

        }
        return v;
    }

    public void despliegarTodos() {
        for (int i = 0; i < listaD.size(); i++) {
            if (listaD.get(i) instanceof PickUp) {
                System.out.println("PickUp  ---");
            } else if (listaD.get(i) instanceof Motocicleta) {
                System.out.println("Motocicleta ---");
            } else if (listaD.get(i) instanceof Terrestre) {
                System.out.println("Terrestre ---");
            } else if (listaD.get(i) instanceof Vehiculo) {
                System.out.println("Vehiculo ---");
            } else {
            }

            System.out.println(listaD.get(i).Consultar());

        }
    }

    public void despliegarUnos(int a) {
        for (int i = 0; i < listaD.size(); i++) {
            switch (a) {
                case 1:
                    if (listaD.get(i) instanceof Vehiculo) {
                        listaD.get(i).Consultar();
                    }
                    break;
                case 2:
                    if (listaD.get(i) instanceof Terrestre) {
                        listaD.get(i).Consultar();
                    }
                    break;
                case 3:
                    if (listaD.get(i) instanceof Motocicleta) {
                        listaD.get(i).Consultar();
                    }
                    break;
                case 4:
                    if (listaD.get(i) instanceof PickUp) {
                        listaD.get(i).Consultar();
                    }
                    break;
            }

        }
    }

    public void despliegar() {
        System.out.println("\n ======== Mini despliegar menu=======");
        System.out.println("1-todos");
        System.out.println("2-Vehiculo");
        System.out.println("3-Terrestre");
        System.out.println("4-Motocicleta");
        System.out.println("5-PickUp");
        System.out.println("6-Salir del sistema");
        int opc;
        do {
            System.out.print("Ingrese su eleción--");
            opc = leer.nextInt();
        } while (!(opc == 1 || opc == 2 || opc == 3 || opc == 4 || opc == 5 || opc == 6));
        System.out.println("");
        switch (opc) {
            case 1:
                System.out.println("Despliegar Todos");
                despliegarTodos();
                break;
            case 2:
                System.out.println("Despliegar Vehiculo");
                despliegarUnos(1);
                break;
            case 3:
                System.out.println("Despliegar Terrestre");
                despliegarUnos(2);
                break;
            case 4:
                System.out.println("Despliegar Motocicleta");
                despliegarUnos(3);
                break;
            case 5:
                System.out.println("Despliegar PickUp");
               despliegarUnos(4);
                break;

        }

    }

    public void Menu() {
        int opc;
        String resp;
        do {
            System.out.println("\n =======Menu========");
            System.out.println("1-Registrar");
            System.out.println("2-Despliegar");
            System.out.println("3-Salir del sistema");
            System.out.print("Ingrese su elección:");
            opc = leer.nextInt();
            System.out.println("");
            switch (opc) {
                case 1:
                    Registrar();
                    break;
                case 2:
                    despliegar();
                    break;
                case 3:
                    System.out.println("Salir del sistema");
                    break;

                default:
                    System.out.println("Opcion incorrecta");

            }
            
           
            
        } while (opc!=3);
        System.out.println("Gracias par usarlo :) ");

    }

    public static void main(String[] args) {
        Polimorfismo obj = new Polimorfismo();
        obj.Menu();
    }

}
/*
Motocicleta m;
        m = new Motocicleta();
        PickUp p;
        p = new PickUp();
        Terrestre t;
        t = new Terrestre();
        Vehiculo v;
        v = new Vehiculo();

        t = new Motocicleta();
        t = new PickUp();
        v = new Terrestre();
        v = new Motocicleta();

        m = new Motocicleta("deportivo ", 250, "IRF-8725", " VENTO", 67000);
        p = new PickUp(1.2f, 210, "XTR-7856", "CHEVROLET ", 375000);
        t = new Terrestre(320, "GHT-6735", "ferrari", 760000);
        v = new Vehiculo("FDT-9876", "TOYOTA", 430000);

        this.listaD.add(m);
        this.listaD.add(p);
        this.listaD.add(t);
        this.listaD.add(v);

        listaE[0] = v;
        listaE[1] = p;
        listaE[2] = t;
        listaE[3] = v;

        System.out.println("Lista estatica ");
        for (int i = 0; i < 4; i++) {

            if (listaE[i] instanceof PickUp) {
                System.out.print("PickUp \n");
            } else if (listaE[i] instanceof Motocicleta) {
                System.out.print("Motocicleta \n");
            } else if (listaE[i] instanceof Terrestre) {
                System.out.print("Terrestre \n");
            } else if (listaE[i] instanceof Vehiculo) {
                System.out.print("Vehiculo \n");
            } else {
            }

            System.out.println(listaE[i].Consultar());

        }

        System.out.println("\n");
        System.out.println("lista dinamica ");
        for (int i = (listaD.size() - 1); i >= 0; i--) {

            if (listaD.get(i) instanceof PickUp) {
                System.out.print("PickUp \n");
            } else if (listaD.get(i) instanceof Motocicleta) {
                System.out.print("Motocicleta \n");
            } else if (listaD.get(i) instanceof Terrestre) {
                System.out.print("Terrestre \n");
            } else if (listaD.get(i) instanceof Vehiculo) {
                System.out.print("Vehiculo \n");
            } else {
            }

            System.out.println(listaD.get(i).Consultar());
        }

        System.out.println("\n LISTA AL REVES ");
        for (Vehiculo x : listaD) {

            if (x instanceof PickUp) {
                System.out.print("PickUp \n");
            } else if (x instanceof Motocicleta) {
                System.out.print("Motocicleta \n");
            } else if (x instanceof Terrestre) {
                System.out.print("Terrestre \n");
            } else if (x instanceof Vehiculo) {
                System.out.print("Vehiculo \n");
            } else {
            }

            System.out.println(x.Consultar());
        }

        System.out.println("Lista vehiculos ");

        for (Vehiculo x : listaD) {

            if (x instanceof Vehiculo) {
                System.out.print(x.Consultar());
            } else {
            }
        }

        Vehiculo v2;//no has instanciado pedido menoria 
        v2 = new Vehiculo();
        v2.placa = "yzz";
        v2.marca = "Toyota";
        v2.precio = 230000.0f;

        System.out.println(v2.Consultar());

        Vehiculo v3; //no has instanciado pedido menoria 
        v3 = new Motocicleta();
        v3.placa = "yzz";
        v3.marca = "Toyota";
        v3.precio = 230000.0f;
        ((Terrestre) v3).kmHoraMax = 230;

        System.out.println(v3.Consultar());

 */
