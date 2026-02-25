# -_-_serie_de_2_en_2_java_- :. 
# 🔢 Serie de 2 en 2 (Java):

<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/89e671db-4666-4954-9ea2-6d3777893f21" />  

Programa en **Java** que solicita al usuario un número límite y muestra en pantalla una **serie de números incrementados de 2 en 2**, comenzando desde 0 hasta el valor ingresado.

---

## 📌 Descripcion:

- Solicita al usuario un número entero como límite.
- Recorre los números desde `0` hasta el límite indicado.
- Incrementa el contador de **2 en 2**.
- Imprime la serie resultante en una sola línea.

---

## 🧠 Codigo fuente completo:

```java
import java.util.Scanner;

public class SerieDeDosEnDos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número límite: ");
        int limite = scanner.nextInt();

        System.out.println("Serie de números de 2 en 2:");

        for (int i = 0; i <= limite; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}

▶️ Ejemplo de ejecucion:
Ingrese el número límite: 10
Serie de números de 2 en 2:
0 2 4 6 8 10

🧪 Consideraciones:
El programa asume que el usuario ingresa un número entero válido.
Si el límite es impar, la serie se detiene en el último número par menor que el límite.
Puede adaptarse fácilmente para iniciar desde otro valor distinto de 0.

📚 Tecnologias utilizadas:
Lenguaje: Java
Entrada de datos: Scanner
Estructura de control: for

✍️ Ejercicio básico ideal para reforzar el uso de ciclos, entrada por consola y lógica secuencial en Java .
