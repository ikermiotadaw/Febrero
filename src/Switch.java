import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Es un programa para saber tu nivel de programación");
        System.out.println("Introduce tu nivel del 1 al 5");
        int nivel = input.nextInt();
        input.nextLine();

        switch (nivel){
            case 1:
                System.out.println("Nivel bajo");
                break;
            case 2:
                System.out.println("Nivel medio-bajo");
                break;
            case 3:
                System.out.println("Nivel medio");
                break;
            case 4:
                System.out.println("Nivel medio-alto");
                break;
            case 5:
                System.out.println("Nivel alto");
                break;
            default:
                System.out.println("No has introducido un nivel correcto");

        }
    }
}
