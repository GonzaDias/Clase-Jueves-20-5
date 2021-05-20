package ejemplo1;
import java.util.*;
public class UsarAuto
{
     public static void main(String[] args){
         Scanner consola = new Scanner(System.in);
         String color;
         String marca;
         int velocidad ;
         int modelo;
         System.out.println("Ingrese el color del auto");
         color = consola.nextLine();
         System.out.println("Ingrese la marca del auto");
         marca = consola.nextLine();
         System.out.println("Ingrese la  velocidad del auto");
         velocidad = consola.nextInt();
         System.out.println("Ingrese el modelo auto");
         modelo = consola.nextInt();
         Auto auto1= new Auto(color, velocidad, modelo, marca);
         
         //Auto auto2 = new Auto(color, velocidad, modelo, marca);;
         /*
         auto1.color = "azul";
         auto1.marca = "ford";
         auto1.velocidad = 10;
         auto1.modelo = 2020;
         */
         System.out.println(auto1.getMostrarDatos());
         auto1.setVelocidad();
         auto1.setVelocidad();
         
         //System.out.println(auto2.getMostrarDatos());
         
                
         //System.out.println(auto1);
        }
}
