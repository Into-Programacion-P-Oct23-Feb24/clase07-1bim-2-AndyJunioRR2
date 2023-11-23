/*
 Utiliza la potencia como limite en el contador, luego se multiplica por el numero
luego el resultado toma un nuevo valor y se vuelve a realizar la misma multiplicacion
dando un nuevo valor, este ciclo se sigue repitiendo hasta que el contador sea igual
a la potencia
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. numero, i[0, n]
        int numero;
        // 3. potencia, i[0, n]
        int potencia;
        // 6. resultado, i[0, n]
        int resultado;
        // numero <-- 4
        numero = 3;
        // 8. potencia <-- 3
        potencia = 2;
        // 9. resultado <-- 1
        resultado = 1;

        int contador = 1;

        do {
            resultado = resultado * numero;
            contador = contador + 1;
        } while (contador <= potencia);

        System.out.printf("%d\n", resultado);
    }
}
