import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejemploarreglo2 {

    // Para abrir buffer de entrada
        public static BufferedReader bufer=new BufferedReader(new InputStreamReader(System.in));
        public static String entrada;
    // Método ue regrsa un arreglo de un double y recibe un parámetro entero
    public static double[]LeerPromedios(int n)throws IOException {
        double[]proms = new double[n];
        System.out.println("Introduccción de los promedios individuales de cada estudiante");
        for(int i = 0;i < n; i++){
            System.out.println("Escribe el promedio individual del estudiante con el id" +i+"i");
            entrada = bufer.readLine();
            proms[i] = Double.parseDouble(entrada);
        }
        return proms;// Regresa todos los elementos del arreglo proms
    }


    //Regresa UN double, y recibe una rreglo de double como parámetro
    public static double calcularPromedioGrupo(double[]p){
    double suma = 0;
    for(int i=0; i<p.length; i++)
        suma = suma +p[i];
    
    return suma/p.length;
}

//Metodo que no regresa valores y recibe un areeglo 
public static void imprimirPromedio(double[] p ){
    int i = 0;
    System.out.println("Promedios individuales del grupo");
    System.out.println(" IdAlumno           Promedio Individual");
    System.out.println(" ----------------------------------------");
    for(double prom : proms){
        System.out.println("  "+i+"                   "+prom);
        i++;
    }
}


    public static void main(String[] args) throws IOException {
        final int T = 5; // declarando una constante
        
        
        
        // Declarando y construyendo el arreglo
        int[] arreglo=new int[5];
        
        //Un arreglo de char
        char[] caracteres=new char[T];
        //declaramos, contruimos
        double[] promedios={9.1, 8.6, 7.4, 5.3, 9.2,6.5 };
        
        // Declaración de un arreglo de valores booleanos
        boolean[] datos;
        int t; // tamaño de variable de arreglo
        
        double[] dobles;
        
        // Inicializamos todas las casillas del arreglo 0
        for(int i=0; i<5; i++)
            arreglo[i] = 0;
        
        // Así no se puede imprimir las casillas del arreglo
        //System.out.println("arreglo: ");
        //System.out.println(arreglo);
            
        // Así se imprime el contenido de un arreglo
        System.out.println("Contenido del arreglo");
        for(int i=0; i < arreglo.length; i++)
            System.out.println("arreglo[" + i + "]= " + arreglo[i]);
         
        // Leer los valores del arreglo caracteres
        System.out.println("Escribe los valores del arreglo caracteres");
        for(int i=0; i<T; i++){
            System.out.println("Escribe el valor ["+ i + "]:");
            entrada = bufer.readLine();
            caracteres[i] = entrada.charAt(0);
        }
        
        System.out.println("Contenido de caracteres");
        for(int i=0; i < caracteres.length; i++)
            System.out.println("caracteres[" + i + "]= " + caracteres[i]);
        
        System.out.println("Escribe el tamaño del arreglo de datos:");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);
        
        datos = new boolean[t];// construimos el arreglo de datos con el tamaño
        
        //Rellenando datos con valores booleanos 
        for(int i = 0; i<t;i++){
            System.out.println("Escribe el valor["+i+"] de datos");
            entrada = bufer.readLine();
            datos[i]=Boolean.parseBoolean(entrada);
        }
        //Mostrando valores del arreglo de datos, usando un for extendido
        for(boolean unDato:datos)
            System.out.println(unDato);

        // Calcular el promedio de un grupo
        System.out.println();
        System.out.println("Escribe el tamaño del grupo: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada); //t es el tamaño del grupo

        promedios = LeerPromedios(t);
        imprimirPromedios( promedios );
        promedioGrupo = calcularPromedioGrupo( promedios );
        System.out.println("El promedio de grupo es: "+ promedioGrupo);        
    }

}
