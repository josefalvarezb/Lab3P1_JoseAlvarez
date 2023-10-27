/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_josealvarez;
import java.util.Scanner;
public class Lab3P1_JoseAlvarez {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Bienvenido al programa ");
        System.out.println("1. Sucesiones y más sucesiones!");
        System.out.println("2. Pocket Monsters");
        System.out.println("3. Asterisco en Casa");
        System.out.println("4. Salir");
        System.out.println("Ingrese su opcion: ");
        int opcion = leer.nextInt();
        
        
            switch (opcion){
                   
                case 1:
                    System.out.println("Sucesiones y más sucesiones");
                    System.out.println("Diferencia: ");
                    int num = leer.nextInt();
                    System.out.println("Inicial: ");
                    int num2 = leer.nextInt();
                    System.out.println("Cantidad: ");
                    int num3 = leer.nextInt();
                  
                    
                    int sumarciclo= 0;
                    for(int x = 0; x < num3; x++){  
                    int numtot = num2 + x * num + sumarciclo;
                    sumarciclo += x;
                    
                    System.out.print(numtot + " , ");
                    
                    
                    }
                    
                    break;
                    
            
                           
                    
                    
                    
                    
                    
                    
                    
                case 2:
                    System.out.println("Pocket Monsters");
                    System.out.println("Ingrese el modo de pelea que desea: ");
                    System.out.println("Hasta la muerte: ");
                    int muerte = leer.nextInt();
                    System.out.println("Por rondas");
                    int rondas = leer.nextInt();
                    
                    switch(rondas){
                        
                    case 1:
                    System.out.println("Estadisticas de los pokemonoes"); 
                    System.out.println("Sylveon Vida: 280 Ataque: 80 Defensa: 15%");   
                    System.out.println("Gyarados Vida: 300 Ataque: 50 Defensa: 10%");   
                    System.out.println("Giratina Vida: 300 Ataque: 70 Defensa: 25%");   
                    System.out.println("Dragonite Vida: 250 Ataque: 75 Defensa: 20%");  
                    
                    
                    
                    
                    
                    }
                    
                    break;
                    
                    
                    
                    
                    
                case 3:
                    System.out.println("Asterisco en Casa");
                    System.out.print("Ingrese fila: ");
                    int fila = leer.nextInt();
                    System.out.print("Ingrese col: ");
                    int col = leer.nextInt();

                    for (int i = 1; i <= fila; i++) {
                        for (int x = 1; x <= col; x++) {
                            if (i == 1 || i == fila || x == 1 || x == col){
                               System.out.print("*");
                            } else {
                            System.out.print(" ");
                            }
                        }
                        
                     System.out.println(" ");
                    }
                    
                    break;
                
                    
                    
                    
                    
                    
        
        
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
            }//Cierre switch grande
                
    }
    
}
