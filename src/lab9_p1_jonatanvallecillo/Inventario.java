package lab9_p1_jonatanvallecillo;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    String objeto_actual = "";
    int madera = 0;
    int piedra = 0;
    int hierro = 0;
    int diamante = 0;
    ArrayList <Herramientas> tools;
    static Scanner leer = new Scanner(System.in);

    public Inventario(String objeto_actual, int madera, int piedra, int hierro, int diamante) {
        this.madera = madera;
        this.hierro = hierro;
        this.diamante = diamante;
    }

    public Inventario(ArrayList<Herramientas> tools) {
        this.tools = tools;
    }
    
    public String getObjeto_actual() {
        return objeto_actual;
    }

    public void setObjeto_actual(String objeto_actual) {
        this.objeto_actual = objeto_actual;
    }

    public int getMadera() {
        return madera;
    }

    public void setMadera(int madera) {
        this.madera = madera;
    }

    public int getPiedra() {
        return piedra;
    }

    public void setPiedra(int piedra) {
        this.piedra = piedra;
    }

    public int getHierro() {
        return hierro;
    }

    public void setHierro(int hierro) {
        this.hierro = hierro;
    }

    public int getDiamante() {
        return diamante;
    }

    public void setDiamante(int diamante) {
        this.diamante = diamante;
    }

    public ArrayList<Herramientas> getTools() {
        return tools;
    }

    public void setTools(ArrayList<Herramientas> tools) {
        this.tools = tools;
    }
    
    
    public void listar(ArrayList<Herramientas> tools){
        int cont = 1;
        System.out.println();
        for(int i = 0; i < tools.size() + 5; i++){
            if(i == 0){
                System.out.println(i+". Madera: "+madera);
            }else if(i == 1){
                System.out.println(i+". Piedra: "+piedra);
            }else if(i == 2){
                System.out.println(i+". Hierro: "+hierro);
            }else if(i == 3){
                System.out.println(i+". Diamante: "+diamante);
            }else{
                if(i >= 4 && i < tools.size() + 3){
                    Herramientas herram = new Herramientas();
                    herram = tools.get(cont);
                    cont ++;
                    System.out.println(i+". "+herram.getNombre()+": "+herram.getMaterial());
                }else if(i == (tools.size() + 4)){
                    System.out.println(i+". Objeto equipado: "+objeto_actual);
                }else{
                    Herramientas herram = new Herramientas();
                    herram = tools.get(0);
                    System.out.println(i+". "+herram.getNombre()+": "+herram.getMaterial());
                }
            }
            if(i > 0){
                
            }
        } 
        System.out.println();
    }
    
    public void eliminar(ArrayList<Herramientas> tools){
        Herramientas herram = new Herramientas();
        int cont = tools.size() + 4;
        int val = 1;
        while(val == 1){
            System.out.print("\nSeleccione el objeto: ");
                int objeto = leer.nextInt();
                herram = tools.get(objeto);
                if(objeto > 3 && objeto < tools.size() + 2){
                    objeto -= 3;
                    tools.remove(objeto);
                    val = 0;
                }else if(objeto >= 0 && objeto < 4){
                    if(objeto == 0){
                        madera = 0;
                        val = 0;
                    }else if(objeto == 1){
                        piedra = 0;
                        val = 0;
                    }else if(objeto == 2){
                        hierro = 0;
                        val = 0;
                    }else if(objeto == 3){
                        diamante = 0;
                        val = 0;
                    }
                }else{
                    System.out.println("ERROR. Intente de nuevo");
                }   
        }
    }
    
    public String obtenerNombreObjeto(ArrayList<Herramientas> tools){
        String objeto = "";
        int val = 1;
        int opcion = 0;
        while(val == 1){
            System.out.print("\n0. Regresar\n"
                    + "1. Cambiar objeto actual\n"
                    + "Seleccione: ");
            opcion = leer.nextInt();
            if(opcion >= 0 && opcion < 2){
                val = 0;
            }else{
                System.out.println("ERROR. Intente de nuevo");
            }
        }
        
        switch(opcion){
            case 0:
                break;
            case 1:
                Herramientas herram = new Herramientas();
                int val2 = 1;
                int seleccion = 0;
                while(val2 == 1){
                    System.out.print("\nSeleccione el objeto: ");
                    seleccion = leer.nextInt();
                    if(seleccion >= 0 && seleccion < (tools.size() + 3)){
                        val2 = 0;
                    }
                }
                
                if(seleccion >= 0 && seleccion < 4){
                    if(seleccion == 0){
                        objeto_actual = "Madera";
                    }else if(seleccion == 1){
                        objeto_actual = "Piedra";
                    }else if(seleccion == 2){
                        objeto_actual = "Hierra";
                    }else if(seleccion == 3){
                        objeto_actual = "Diamante";
                    }
                }else{
                    herram = tools.get(seleccion - 3);
                    objeto_actual = herram.getNombre()+herram.getMaterial();
                }
                
                break;
        }
        return objeto;
    }
}
