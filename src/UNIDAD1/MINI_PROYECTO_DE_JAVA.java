package UNIDAD1;

import java.util.Scanner;

public class MINI_PROYECTO_DE_JAVA {
	

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 System.out.print("Introduce tu nombre: ");
 String nombre  = sc.nextLine();
 
 System.out.print("Introduce tu edad : ");
 int edad = sc.nextInt();
 

 

 System.out.println("Hola "+nombre+", tienes  " + edad+ "años" );
 
 }
 
}
