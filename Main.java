import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
                List<estudiante> estudiantes = new ArrayList<>();
                estudiantes.add(new estudiante("Patri", 12, 170));
                estudiantes.add(new estudiante("Manuel", 43, 173));
                estudiantes.add(new estudiante("Javier", 72, 189));
                estudiantes.add(new estudiante("Alicia", 52, 168));
                estudiantes.add(new estudiante("Alberto", 35, 189));

                System.out.println("Estudiantes sin ordenar:");
                imprimirEstudiantes(estudiantes);

                Collections.sort(estudiantes);

                System.out.println("\nEstudiantes ordenados:");
                imprimirEstudiantes(estudiantes);
        Rectangulo rectangulo = new Rectangulo(2, 3);

        System.out.println("Área del Rectángulo: " + rectangulo.getArea());
        System.out.println("Perímetro del Rectángulo: " + rectangulo.getPerimeter());

        rectangulo.redimensionar(2);

        Rectangulo[] rectangulos = {
                new Rectangulo(5, 4),
                new Rectangulo(3, 6),
                new Rectangulo(7, 2),
                new Rectangulo(1, 9),
                new Rectangulo(8, 3),
                new Rectangulo(4, 7),
                new Rectangulo(6, 5),
                new Rectangulo(2, 8),
                new Rectangulo(9, 1),
                new Rectangulo(10, 10)
        };

        Arrays.sort(rectangulos);

        System.out.println("Rectángulos ordenados por área:");
        for (Rectangulo r : rectangulos) {
            System.out.println(r);
            }
        }
    private static void imprimirEstudiantes(List<estudiante> estudiantes) {
        int i = 1;
        for (estudiante estudiante : estudiantes) {
            System.out.println(i + ". " + estudiante);
            i++;
        }
    }
}






