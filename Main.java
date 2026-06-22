// permite leer lo escrito por el usuario 
import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        
        //Generación de menú y título del menú 
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
        
        // Se lee un número entero escrito por el usuario y se guarda en la variable opcion
        int opcion = teclado.nextInt();
        
        // Se muestra la opción que el usuario seleccionó
        System.out.println("Usted seleccionó: " + opcion);
        
        // Se le solicita al usuario el ángulo sobre el cual se realizará el cálculo
        System.out.print("Ingrese el ángulo: ");
        
        // Se lee el ángulo ingresado por el usuario y se guarda en la variable angulo
        double angulo = teclado.nextDouble();
        
        // Se muestra el ángulo ingresado por el usuario
        System.out.println("Ángulo ingresado: " + angulo);
        
        // Se evalúa la opción elegida por el usuario
        switch(opcion) {

            // Caso 1: calcular el seno
            case 1:

                // Se convierte el ángulo de grados a radianes y se calcula el seno
                double resultado = Math.sin(Math.toRadians(angulo));

                // Se muestra el resultado obtenido
                System.out.println("Resultado: " + resultado);

                // Finaliza este caso
                break;

            // Caso 2: calcular el coseno
            case 2:

                // Se convierte el ángulo de grados a radianes y se calcula el coseno
                resultado = Math.cos(Math.toRadians(angulo));

                // Se muestra el resultado obtenido
                System.out.println("Resultado: " + resultado);

                // Finaliza este caso
                break;

            // Caso 3: calcular la tangente
            case 3:

                // Se convierte el ángulo de grados a radianes y se calcula la tangente
                resultado = Math.tan(Math.toRadians(angulo));

                // Se muestra el resultado obtenido
                System.out.println("Resultado: " + resultado);

                // Finaliza este caso
                break;

            // Si el usuario escribe una opción no válida
            default:

                // Se informa que la opción ingresada no existe
                System.out.println("Opción inválida");

                // Finaliza el caso default
                break;
                        // Caso 4: calcular el arcoseno
            case 4:

                // Se calcula el arcoseno del valor ingresado
                resultado = Math.asin(angulo);

                // Se muestra el resultado obtenido
                System.out.println("Resultado: " + resultado);

                // Finaliza este caso
                break;

            // Caso 5: calcular el arcocoseno
            case 5:

                // Se calcula el arcocoseno del valor ingresado
                resultado = Math.acos(angulo);

                // Se muestra el resultado obtenido
                System.out.println("Resultado: " + resultado);

                // Finaliza este caso
                break;

            // Caso 6: calcular la arcotangente
            case 6:

                // Se calcula la arcotangente del valor ingresado
                resultado = Math.atan(angulo);

                // Se muestra el resultado obtenido
                System.out.println("Resultado: " + resultado);

                // Finaliza este caso
                break;

            // Caso 7: calcular el seno hiperbólico
            case 7:

                // Se calcula el seno hiperbólico
                resultado = Math.sinh(angulo);

                // Se muestra el resultado obtenido
                System.out.println("Resultado: " + resultado);

                // Finaliza este caso
                break;

            // Caso 8: calcular el coseno hiperbólico
            case 8:

                // Se calcula el coseno hiperbólico
                resultado = Math.cosh(angulo);

                // Se muestra el resultado obtenido
                System.out.println("Resultado: " + resultado);

                // Finaliza este caso
                break;

            // Caso 9: calcular la tangente hiperbólica
            case 9:

                // Se calcula la tangente hiperbólica
                resultado = Math.tanh(angulo);

                // Se muestra el resultado obtenido
                System.out.println("Resultado: " + resultado);

                // Finaliza este caso
                break;
        }

        // Se cierra el Scanner para liberar recursos
        teclado.close();

    }
}