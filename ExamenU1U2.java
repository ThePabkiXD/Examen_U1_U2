package examenu1u2;
import java.util.Scanner;
public class ExamenU1U2 {

    public static void main(String[] args) {
        Scanner precio = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del primer producto: ");
        String v1 = precio.nextLine();
        System.out.println("Ingrese el costo original del producto: ");
        double p1 = precio.nextDouble();
        precio.nextLine();
        System.out.println("Ingrese el Nombre del segundo producto: ");
        String v2 = precio.nextLine();
        System.out.println("Ingrese el costo original del producto: ");
        double p2 = precio.nextDouble();
        precio.nextLine();
        System.out.println("Ingrese el Nombre del tercer producto: ");
        String v3 = precio.nextLine();
        System.out.println("Ingrese el costo original del producto: ");
        double p3 = precio.nextDouble();
        
        double d1 = p1*0.30;
        double d2 = p2*0.65;
        double d3 = p3*0.15;
        
        double pf1 = p1-d1;
        double pf2 = p2-d2;
        double pf3 = p3-d3;
        
        System.out.println("******************");
        System.out.println("El precio final de: " + v1 + " Es " + pf1 + " Pesos");
        System.out.println("El precio final de: " + v2 + " Es " + pf2 + " Pesos");
        System.out.println("El precio final de: " + v3 + " Es " + pf3 + " Pesos");
        System.out.println("******************");
    }
    
}
