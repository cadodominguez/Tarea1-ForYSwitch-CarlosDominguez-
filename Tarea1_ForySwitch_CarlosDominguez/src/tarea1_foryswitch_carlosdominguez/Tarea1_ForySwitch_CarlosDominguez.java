
package tarea1_foryswitch_carlosdominguez;
import java.util.Scanner;
public class Tarea1_ForySwitch_CarlosDominguez {
 
    public static void main(String[] args) {
        Scanner brazil = new Scanner(System.in);
        boolean out = true;
        do {
            System.out.println("**********MENU**********");
            System.out.println("1.Cuantos números pares e impares hay entre este rango?");
            System.out.println("2.Triangulos y mas Triangulos");
            System.out.println("3.Anita lava la tina");
            System.out.println("4.Codigos secretos");
            System.out.println("5.Salir");
            int opcion = brazil.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un numero:");
                    int n = brazil.nextInt();
                    int pares =0;
                    int impares =0;
                    for (int i = 0; i <= n; i++) {
                        if (i%2==0 || i == 0){
                            pares +=1;
                        }else if(i%2!=0 && i/i==1){
                            impares +=1;
                        }
                    }
                    System.out.print("Entre 0 y "+n+" existen "+pares+" numeros pares y estos son : ");
                    for (int i = 0; i <= n; i++) {
                        if (i%2==0 || i == 0){
                            System.out.print(i);
                            if (i==n-1 && n%2!=0){
                                System.out.print("");
                            }else{
                                if (n==i){
                                    System.out.println("");
                                }else{
                                    System.out.print(",");
                                }
                            }
                        }
                    }
                    System.out.println("");
                    System.out.print("Entre 0 y "+n+" existen "+impares+" numeros impares y estos son : ");
                    for (int i = 0; i <= n; i++) {
                        if (i%2!=0 && i/i==1){
                            System.out.print(i);
                            if (i==n-1 && n%2==0){
                                System.out.print("");
                            }else{
                                if (n==i){
                                    System.out.println("");
                                }else{
                                    System.out.print(",");
                                }
                            }
                        }
                    }
                    System.out.println("");
                    break;
                case 2:
                    boolean out2 = true;
                    do {
                        System.out.println("1.triángulo equilátero");
                        System.out.println("2.triángulo rectángulo");
                        System.out.println("3.Salir del submenu");
                        int opcion2 = brazil.nextInt();
                        switch (opcion2) {
                            case 1:
                                
                                break;
                            case 2:
                                
                                break;
                             case 3:
                                
                                break;       
                            default:
                                System.out.println("La opcion no es valida");
                                System.out.println("");
                        }
                    } while (out2);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("Saliendo.....");
                    out = false;
                    break;    
                default:
                    System.out.println("La opcion no es valida");
                    System.out.println("");
            }
            
        } while (out);
    }
    
}
