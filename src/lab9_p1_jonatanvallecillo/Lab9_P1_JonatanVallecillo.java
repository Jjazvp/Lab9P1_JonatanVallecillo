package lab9_p1_jonatanvallecillo;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab9_P1_JonatanVallecillo {
    
    static Scanner leer = new Scanner(System.in);
    static ArrayList <Herramientas> tools = new ArrayList <Herramientas>();

    public static void main(String[] args) {
        Herramientas herram = new Herramientas ("Mano", "mano");
        tools.add(herram);
        Minecraft minecraft = new Minecraft(tools);
        int val = 1;
        int opcion = 0;
        while (val == 1){
            int menu = 1;
            while(menu == 1){
                System.out.print("**** MENU ****\n"
                        + "1. Jugar Minecraft\n"
                        + "2. Salir\n"
                        + "Ingrese la opcion: ");
                opcion = leer.nextInt();
                if(opcion > 0 && opcion < 3){
                    menu = 0;
                }else{
                    System.out.println("ERROR. Intente de nuevo.");
                }
            }

            switch(opcion){
                case 1:
                    minecraft.play();
                    break;
                case 2:
                    break;
            }
        }
    }
}
