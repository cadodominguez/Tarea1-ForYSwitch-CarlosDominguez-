
package tarea1_foryswitch_carlosdominguez;
import java.util.Scanner;
public class Tarea1_ForySwitch_CarlosDominguez {
 
    public static void main(String[] args) {
        Scanner brazil = new Scanner(System.in);
        boolean out = true;
        do {
            System.out.println("**********MENU**********");
            System.out.println("1.Cuantos numeros pares e impares hay entre este rango?");
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
                        System.out.println("1.triangulo equilatero");
                        System.out.println("2.triangulo rectangulo");
                        System.out.println("3.Salir del submenu");
                        int opcion2 = brazil.nextInt();
                        switch (opcion2) {
                            case 1:
                                int alturae;
                                System.out.println("Ingrese la altura :");
                                alturae = brazil.nextInt();
                                for (int i = 0; i < alturae; i++) {
                                    for (int j = alturae - i; j > 1; j--) {
                                        System.out.print(" ");
                                        //para sacar los puntos vacio
                                    }
                                    for (int j = 0; j <= i * 2; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }    
                                break;
                            case 2:
                                int alturar;
                                System.out.println("Ingrese la altura :");
                                alturar = brazil.nextInt();
                                for (int i = 0; i < alturar; i++) {
                                    for (int j = 0; j <= i; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                System.out.println("Saliendo del Submenu......."); 
                                out2=false;
                                break;       
                            default:
                                System.out.println("La opcion no es valida");
                                System.out.println("");
                        }
                    } while (out2);
                    break;
                case 3:
                    String Palabrai;
                    brazil.nextLine();
                    System.out.println("Ingrese una palabra");
                    Palabrai = brazil.nextLine();
                    String editada = Palabrai.replace(" ", "");
                    editada = editada.toLowerCase();
                    
                    String reversa="";
                    for (int i = editada.length()-1; i >= 0; i--) {
                        reversa+= editada.charAt(i);
                    }
                    if(reversa.equals(editada)){
                        System.out.println("La palabra "+Palabrai+" si es Palindroma");
                    }else{
                        System.out.println("La palabra "+Palabrai+" no es Palindroma");
                    }
                    System.out.println("");
                    break;
                case 4:
                    String palabrac;
                    brazil.nextLine();
                    System.out.println("Ingrese un palabra para hacer el codigo");
                    palabrac = brazil.nextLine();
                    int rep =0;
                    String repletra = "";
                    for (int i = 0; i < palabrac.length(); i++) {
                        if(palabrac.charAt(i)>97 && palabrac.charAt(i)<122){
                            rep = palabrac.charAt(i);
                            for (int j = 0; j < rep; j++) {
                                repletra+=palabrac.charAt(i-1);  
                            }
                        }
                    }
                    System.out.println("El codigo es : ");
                    System.out.println(repletra);
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
