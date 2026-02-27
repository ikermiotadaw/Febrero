import java.util.Scanner;

public class VideoconferenciaS01C02 {
    public static void main(String[] args) {
        final int EDAD_MINIMA=18;
        final int IMPORTE_ENTRADA=20;

        Scanner input = new Scanner(System.in);
        int edad = input.nextInt();
        input.nextLine();
        if (edad>=EDAD_MINIMA) {
            System.out.println("Puedes entrar al local");
            System.out.println("Ahora puedes pagar los "+IMPORTE_ENTRADA+"€ de entrada");
            int pagoEntrada = input.nextInt();
            input.nextLine();
            if (pagoEntrada>=IMPORTE_ENTRADA)
                System.out.println("Puedes entral local. Tu cambio es: "+( pagoEntrada-20 )+"euros.");
            else{
                System.out.println("No puede entrar al local");
            }
        } else{
                System.out.println("No puedes entrar");
            }
        System.out.println("Fin del programa");
        }
    }

