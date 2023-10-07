import java.util.Scanner;

public class promedios3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener el número de grupos y el número de alumnos por grupo
        System.out.print("Ingrese el numero de grupos: ");
        int numGrupos = scanner.nextInt();
        System.out.print("Ingrese el numero de alumnos por grupo: ");
        int numAlumnosPorGrupo = scanner.nextInt();

        // Crear un arreglo para almacenar los promedios de cada alumno
        double[][] promediosPorAlumno = new double[numGrupos][numAlumnosPorGrupo];

        // Leer los promedios de cada alumno
        for (int i = 0; i < numGrupos; i++) {
            System.out.println("Ingrese los promedios para el grupo " + (i + 1) + ":");
            for (int j = 0; j < numAlumnosPorGrupo; j++) {
                System.out.print("Alumno " + (j + 1) + ": ");
                promediosPorAlumno[i][j] = scanner.nextDouble();
            }
        }

        // Calcular el promedio por grupo y almacenarlo en un arreglo "grupos"
        double[] grupos = new double[numGrupos];
        for (int i = 0; i < numGrupos; i++) {
            double suma = 0;
            for (int j = 0; j < numAlumnosPorGrupo; j++) {
                suma += promediosPorAlumno[i][j];
            }
            grupos[i] = suma / numAlumnosPorGrupo;
        }

        // Calcular el promedio general
        double promedioGeneral = 0;
        for (int i = 0; i < numGrupos; i++) {
            promedioGeneral += grupos[i];
        }
        promedioGeneral /= numGrupos;

        // Imprimir el arreglo de promedios por grupo
        System.out.println("Promedios por grupo:");
        for (int i = 0; i < numGrupos; i++) {
            System.out.println("Grupo " + (i + 1) + ": " + grupos[i]);
        }

        System.out.println("El promedio general de la carrera es: " + promedioGeneral);

        scanner.close();
    }
}