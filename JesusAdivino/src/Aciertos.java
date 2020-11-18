import java.util.Scanner;
/*El proyecto plantea un juego: adivinar el número que genera de manera aleatoria el programa.
Primero se genera el número aleatorio, a continuación se pide al usuario que introduzca un número entero.
Si el valor es menor o mayor del número generado, se proporciona un texto orientativo y continua esperando un nuevo número. 
En caso de acierto se anuncia el éxito, y la aplicación finaliza.*/
public class Aciertos {

    public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) ((50-10)*Math.random()+10);
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
