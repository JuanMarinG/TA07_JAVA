import java.util.Hashtable;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num;
		String nombre;
		String cantidad;
		
		
		Hashtable<String, Double> producto = new Hashtable<String, Double>();
		
		producto.put("Tomate",1.5);
		producto.put("Arroz",1.5);
		producto.put("Leche",2.0);
		producto.put("Atun",3.5);
		
		
		do {
		Scanner productos = new Scanner(System.in);
		System.out.println("Que producto lleva el carrito? (Tomate, Arroz, Leche o Atun): ");
		nombre= productos.nextLine(); 
		
		Scanner cantidad1 = new Scanner(System.in);
		System.out.println("Que cantidad lleva de ese producto?: ");
		cantidad= cantidad1.nextLine(); 
		
		Scanner iva = new Scanner(System.in);
		System.out.println("Que IVA tiene aplicado este producto, 21% o 4%?: ");
		num= iva.nextLine(); 
		
		}while(contidad1=cantidad);
		
		
		
		
		
		
		
		
		
		
	}
	
}
		
		
		
		
		



