import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;

import javafx.beans.value.ObservableDoubleValue;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Hashtable<String, Double> articulo = new Hashtable<String, Double>();
		
		articulo.put("Sombrero",10.0); 	//1
		articulo.put("Gorra",5.5);		//2
		articulo.put("Cinturon",3.5);	//3
		articulo.put("Camiseta",9.9);	//4
		articulo.put("Camisa",12.0);	//5
		articulo.put("Colgante",1.5);	//6
		articulo.put("Anillo",1.7);		//7
		articulo.put("Pulsera",2.5);	//8
		articulo.put("Zapatillas",25.0);//9
		articulo.put("Gafas",20.0);		//10
		
		
int eleccion=0;
Double stock;
		
boolean loop = true;
		do {
			String opciones = JOptionPane.showInputDialog("\1 - Añadir articulo y cantidad \2 - Consulta de un articulo \3 - Consultar todo el stock \4 - Salir");
			eleccion = Integer.parseInt(opciones);
			
			switch(eleccion) {
			case 1:
				añadirArticulo();
				
			break;
			case 2:
				String art = JOptionPane.showInputDialog("Sobre que articulo quieres consultar?: ");
				consultaArticulo(art, stock);
			break;
			case 3:
				consultaStock(stock);
				break;
			case 4:
				loop=false;
				break;}
			}while(loop);
	}

	public static void añadirArticulo() {
		String opciones;
		String art;
		String precio;
		
		
		art = JOptionPane.showInputDialog("Articulo");
		precio = JOptionPane.showInputDialog("Precio");
		
	};


	public static void consultaArticulo(String opciones, String stock) {
		System.out.println("Articulo");
		System.out.println(stock.get(0));
	}

	public static void consultaStock(String stock) {
		System.out.println("Articulo - Cantidad");
		for (String i : stock.keySet()) {
			System.out.println(i + " - " + stock.get(i));
		}

	}
}
