// permite leer lo escrito por el usuario 
import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {

        System.out.println("CALCULADORA TRIGONOMÉTRICA");
        System.out.println("1. seno (sin)");
        System.out.println("2. coseno (cos)");
        System.out.println("3. tangente (tan)");
        System.out.println("4. arcoseno (arcsin)");
        System.out.println("5. arcocoseno (arccos)");
        System.out.println("6. arcotangente (arctan)");
        System.out.println("7. seno hiperbólico (sinh)");
        System.out.println("8. coseno hiperbólico (cosh)");
        System.out.println("9. tangente hiperbólica (tanh)");
        
        // Se crea un objeto Scanner llamado teclado para leer datos escritos por el usuario
        Scanner teclado = new Scanner(System.in);

        System.out.print("Seleccione una opción: ");
        
        // Se lee un número entero escrito por el usuario y se guarda en la variable valor
        int valor = teclado.nextInt();
        
        // Se muestra la opción que el usuario seleccionó
        System.out.println("Usted seleccionó: " + valor);

    }
}