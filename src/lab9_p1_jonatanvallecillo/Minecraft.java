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
                        + "8. Picar diamante\n"
                        + "Seleccione: ");
                opcion = leer.nextInt(); 
                if(opcion >= 0 && opcion < 9){
                    submenu = 0;
                }else{
                    System.out.println("ERROR. Intente de nuevo.");
                }
            }

            switch(opcion){
                case 0:
                    jugar = 0;
                    break;
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
                    int val = 1;
                    int opcion2 = 0;
                    while(val == 1){
                        System.out.print("\n1. Crear hacha\n"
                            + "2. Crear pico\n"
                            + "Seleccione: ");
                        opcion2 = leer.nextInt();
                        if(opcion2> 0 && opcion2 < 3){
                            val = 0;
                        }else{
                            System.out.println("ERROR. Intente de nuevo");
                        }
                    }
                    
                    switch(opcion2){
                        case 1:
                            int val1 = 1;
                            int opcion1 = 0;
                            while(val1 == 1){
                                System.out.print("\n1. Madera\n"
                                    + "2. Piedra\n"
                                    + "3. Hierro\n"
                                    + "4. Diamante\n"
                                    + "Seleccione: ");
                                opcion1 = leer.nextInt();
                                if(opcion1 > 0 && opcion1 < 5){
                                    val1 = 0;
                                }else{
                                    System.out.println("ERROR. Intente de nuevo.");
                                }
                            }
                            
                            switch(opcion1){
                                case 1:
                                    if(inventario.getMadera() >= 5){
                                        Herramientas newherram = new Herramientas("Hacha", "Madera");
                                        tools.add(newherram);
                                        int madera = inventario.getMadera() - 5;
                                        inventario.setMadera(madera);
                                    }else{
                                        System.out.println("No tiene suficientes materiales");
                                    }
                                    break;
                                case 2:
                                    if(inventario.getMadera() >= 2 && inventario.getPiedra() >= 3){
                                        Herramientas newherram = new Herramientas("Hacha", "Piedra");
                                        tools.add(newherram);
                                        int madera = inventario.getMadera() - 2;
                                        inventario.setMadera(madera);
                                        int piedra = inventario.getPiedra();
                                        inventario.setPiedra(piedra);
                                    }else{
                                        System.out.println("No tiene suficientes materiales");
                                    }
                                    break;
                                case 3:
                                    if(inventario.getMadera() >= 2 && inventario.getHierro() >= 3){
                                        Herramientas newherram = new Herramientas("Hacha", "Hierro");
                                        tools.add(newherram);
                                        int madera = inventario.getMadera() - 2;
                                        inventario.setMadera(madera);
                                        int hierro = inventario.getHierro() - 2;
                                        inventario.setMadera(hierro);
                                    }else{
                                        System.out.println("No tiene suficientes materiales");
                                    }
                                    break;
                                case 4:
                                    if(inventario.getMadera() >= 2 && inventario.getDiamante() >= 3){
                                        Herramientas newherram = new Herramientas("Hacha", "Diamante");
                                        tools.add(newherram);
                                        int madera = inventario.getMadera() - 2;
                                        inventario.setMadera(madera);
                                        int diamante = inventario.getMadera() - 3;
                                        inventario.setMadera(diamante);
                                    }else{
                                        System.out.println("No tiene suficientes materiales");
                                    }
                                    break;
                            }
                            break;
                        case 2:
                            val1 = 1;
                            opcion1 = 0;
                            while(val1 == 1){
                                System.out.print("\n1. Madera\n"
                                    + "2. Piedra\n"
                                    + "3. Hierro\n"
                                    + "4. Diamante\n"
                                    + "Seleccione");
                                opcion1 = leer.nextInt();
                                if(opcion1 > 0 && opcion1 < 5){
                                    val1 = 0;
                                }
                            }
                            
                            switch(opcion1){
                                case 1:
                                    if(inventario.getMadera() >= 5){
                                        Herramientas newherram = new Herramientas("Pico", "Madera");
                                        tools.add(newherram);
                                    }else{
                                        System.out.println("No tiene suficientes materiales");
                                    }
                                    break;
                                case 2:
                                    if(inventario.getMadera() >= 2 && inventario.getPiedra() >= 3){
                                        Herramientas newherram = new Herramientas("Pico", "Piedra");
                                        tools.add(newherram);
                                    }else{
                                        System.out.println("No tiene suficientes materiales");
                                    }
                                    break;
                                case 3:
                                    if(inventario.getMadera() >= 2 && inventario.getHierro() >= 3){
                                        Herramientas newherram = new Herramientas("Pico", "Hierro");
                                        tools.add(newherram);
                                    }else{
                                        System.out.println("No tiene suficientes materiales");
                                    }
                                    break;
                                case 4:
                                    if(inventario.getMadera() >= 2 && inventario.getDiamante() >= 3){
                                        Herramientas newherram = new Herramientas("Pico", "Diamante");
                                        tools.add(newherram);
                                    }else{
                                        System.out.println("No tiene suficientes materiales");
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case 5:
                    if(inventario.objeto_actual.equals("Mano")){
                        int madera = inventario.getMadera();
                        madera += 1;
                        inventario.setMadera(madera);
                        System.out.println("\nConsiguio 1 de madera");
                    }else if(inventario.objeto_actual.contains("Pico")){
                        int madera = inventario.getMadera();
                        madera += 2;
                        inventario.setMadera(madera);
                        System.out.println("\nConsiguio 1 de madera");
                    }else if(inventario.objeto_actual.contains("Hacha")){
                        int madera = inventario.getMadera();
                        madera += 3;
                        inventario.setMadera(madera);
                        System.out.println("\nConsiguio 1 de madera");
                    }else{
                        System.out.println("\nCambie de material");
                    }
                    break;
                case 6:
                    if(inventario.objeto_actual.contains("Hacha")){
                        int piedra = inventario.getPiedra();
                        piedra += 1;
                        inventario.setPiedra(piedra);
                        System.out.println("\nConsiguio 1 de piedra");
                    }else if((inventario.objeto_actual.contains("Pico") || inventario.objeto_actual.contains("Hacha")) && inventario.objeto_actual.contains("Madera")){
                        int piedra = inventario.getPiedra();
                        piedra += 2;
                        inventario.setPiedra(piedra);
                        System.out.println("\nConsiguio 2 de piedra");
                    }else if((inventario.objeto_actual.contains("Pico") || inventario.objeto_actual.contains("Hacha")) && inventario.objeto_actual.contains("Piedra")){
                        int piedra = inventario.getPiedra();
                        piedra += 3;
                        inventario.setPiedra(piedra);
                        System.out.println("\nConsiguio 3 de piedra");
                    }else if((inventario.objeto_actual.contains("Pico") || inventario.objeto_actual.contains("Hacha")) && inventario.objeto_actual.contains("Hierro")){
                        int piedra = inventario.getPiedra();
                        piedra += 4;
                        inventario.setPiedra(piedra);
                        System.out.println("\nConsiguio 4 de piedra");
                    }else if((inventario.objeto_actual.contains("Pico") || inventario.objeto_actual.contains("Hacha")) && inventario.objeto_actual.contains("Diamante")){
                        int piedra = inventario.getPiedra();
                        piedra += 5;
                        inventario.setPiedra(piedra);
                        System.out.println("\nConsiguio 5 de piedra");
                    }else{
                        System.out.println("\nCambie de material");
                    }
                    break;
                case 7:
                    if((inventario.objeto_actual.contains("Pico") || inventario.objeto_actual.contains("Hacha")) && inventario.objeto_actual.contains("Piedra")){
                        int hierro = inventario.getHierro();
                        hierro += 3;
                        inventario.setHierro(hierro);
                        System.out.println("\nConsiguio 3 de hierro");
                    }else if((inventario.objeto_actual.contains("Pico") || inventario.objeto_actual.contains("Hacha")) && inventario.objeto_actual.contains("Hierro")){
                        int hierro = inventario.getHierro();
                        hierro += 4;
                        inventario.setHierro(hierro);
                        System.out.println("\nConsiguio 4 de hierro");
                    }else if((inventario.objeto_actual.contains("Pico") || inventario.objeto_actual.contains("Hacha")) && inventario.objeto_actual.contains("Diamante")){
                        int hierro = inventario.getHierro();
                        hierro += 5;
                        inventario.setHierro(hierro);
                        System.out.println("\nConsiguio 5 de hierro");
                    }else{
                        System.out.println("\nCambie de material");
                    }
                    break;
                case 8:
                    if((inventario.objeto_actual.contains("Pico") || inventario.objeto_actual.contains("Hacha")) && inventario.objeto_actual.contains("Hierro")){
                        int diamante = inventario.getDiamante();
                        diamante += 4;
                        inventario.setDiamante(diamante);
                        System.out.println("\nConsiguio 4 de diamante");
                    }else if((inventario.objeto_actual.contains("Pico") || inventario.objeto_actual.contains("Hacha")) && inventario.objeto_actual.contains("Diamante")){
                        int diamante = inventario.getDiamante();
                        diamante += 5;
                        inventario.setDiamante(diamante);
                        System.out.println("\nConsiguio 5 de diamante");
                    }else{
                        System.out.println("\nCambie de material");
                    }
                    break;
            }
        }
        System.out.println();
    }
}
