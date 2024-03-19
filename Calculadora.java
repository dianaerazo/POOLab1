import java.util.Scanner;

public class Calculadora {

    public double sumar (double numero1, double numero2){
        return numero1 + numero2;
    }

    public double restar (double numero1, double numero2){
        return numero1 - numero2;
    }

    public double multiplicar (double numero1, double numero2){
        return numero1 * numero2;
    }

    public double dividir (double numero1, double numero2){
        return numero1 / numero2;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Menu");
            System.out.println("1 Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multipicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.println("Eliga una opcion :");
            opcion = sc.nextInt();

            if (opcion == 5){
                break;
            }

            System.out.println("Introduce el primer numero ");
            double numero1 = sc.nextDouble();

            System.out.println("Introduce el segundo numero ");
            double numero2 = sc.nextDouble();

            double resultado = 0;
            switch (opcion ) {
                case 1:
                    resultado = calculadora.sumar(numero1, numero2);

                    break;
                case 2:
                    resultado = calculadora.restar(numero1, numero2)
                    break;
                case 3:
                    resultado = calculadora.multiplicar(numero1, numero2);
                    break;
                case 4:
                    resultado = calculadora.dividir(numero1, numero2);
                    break;

                default:
                System.out.println("Opcion no valida");

                    break;
            }

            System.out.println("Resultado: " + resultado);
        }
    }
}