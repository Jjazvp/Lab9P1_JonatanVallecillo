package lab9_p1_jonatanvallecillo;

import java.util.ArrayList;
import java.util.Scanner;

public class Minecraft {
    
    ArrayList <Herramientas> tools;
    Scanner leer = new Scanner(System.in);
    Inventario inventario;

    public Minecraft(ArrayList<Herramientas> tools, Inventario inventario) {
        this.tools = tools;
        this.inventario = inventario;
    }
    
    public void play(){
        Herramientas herram = new Herramientas ();
        herram = tools.get(0);
        inventario.setObjeto_actual(herram.getNombre());
        int jugar = 1;
        while(jugar == 1){
            int submenu = 1;
            int opcion = 0;
            while(submenu == 1){
                System.out.print("\n0. Salir\n"
                        + "1. Listar inventario\n"
                        + "2. Remover objeto del inventario\n"
                        + "3. Cambiar objeto actual\n"
                        + "4. Crear herramienta\n"
                        + "5. Talar arbol\n"
                        + "6. Picar piedra\n"
                        + "7. picar hierro\n"
                        + "8. Picaar diamante\n"
                        + "Seleccione: ");
                opcion = leer.nextInt(); 
                if(opcion >= 0 && opcion < 9){
                    submenu = 0;
                }else{
                    System.out.println("ERROR. Intente de nuevo.");
                }
            }

            switch(opcion){
                case 1:
                    inventario.listar(tools);
                    break;
                case 2:
                    inventario.eliminar(tools);
                    System.out.println();
                    break;
                case 3:
                    inventario.obtenerNombreObjeto(tools);
                    break;
                case 4:
                    
                    break;
            }
        }
    }
}
