import java.util.Scanner;
import java.util.Hashtable;


public class ex01 {

	
	
	public static void main(String[] args) {
		
		 int n;
	        double nota, suma = 0;
		
		Hashtable <String, String>Alumnos= new Hashtable<String,String>();
		
		Alumnos.put(nota, suma);
	
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Nota media, mayor y menor de una clase");
        System.out.println("\n");

        do {
            System.out.print("Introduce numero de alumnos: ");
            n = sc.nextInt();  
        } while (n <= 0);

        System.out.print("Nota del alumno 1: ");
        nota = sc.nextDouble(); // 
        suma = suma + nota; 
       
       
        for (int i = 2; i <= n; i++) {         
            System.out.print("Nota del alumno " + i + ": ");
            nota = sc.nextDouble();
            suma = suma + nota; 
        }

        // mostrar resultados
        System.out.printf("Nota media:" , suma/n);
        
        
    }
	

}
	
