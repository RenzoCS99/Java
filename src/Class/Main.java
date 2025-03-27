
package Class;
// para scanner
import java.util.Scanner;

//para gui
import javax.swing.JOptionPane;

//para random
import java.util.Random; 

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		//String a, b;
		
		/*int a,b;
		a = 10;
		b = 20;
		a=b;
		b=30;
		System.out.println("X: "+a);
		System.out.println("Y: "+b);
		
		String s1 = "Hola";
		String s2 = s1;
		s1 = "Mundo";

		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		
		*/
		
		//Scanner entrada = new Scanner(System.in);
		/*
		System.out.println("Cual es tu nombre?");
		String nombre = entrada.nextLine();
		
		System.out.println("Cual es tu apellido?");
		String apellido = entrada.nextLine();
		
		System.out.println("Cual es tu edad?");
		double edad = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Cual es tu comida favorita?");
		String comida = entrada.nextLine();

		System.out.print("tu nombre es "+nombre+" "+apellido);
		System.out.print(" tienes "+edad);
		System.out.println(" te gusta la "+comida);
		
		
		System.out.println("Ingresa tu peso en kg");
		double peso = entrada.nextDouble();
		
		System.out.println("Ingresa tu altura en metros");
		double metros = entrada.nextDouble();
		
		double altura_en_cm = metros/100;
		
		double imc = peso/(altura_en_cm*altura_en_cm);
		
		System.out.println(peso);
		System.out.println(metros);
		System.out.println(imc);
		
		
		System.out.println("Ingresa el radio del circulo: ");
		double radio = entrada.nextDouble();
		
		double area = 3.1416*(radio*radio);
		
		System.out.println("El área es: "+area);
		
		
		System.out.println("Ingresa minutos: ");
		int minutos = entrada.nextInt();
		
		int horas = minutos/60;
		int min = minutos%60;
		
		System.out.println("El área es: "+horas+" y "+min+" minutos");
		
		
		System.out.println("Ingresa N1: ");
		int N1= entrada.nextInt();
		
		System.out.println("Ingresa N2: ");
		int N2= entrada.nextInt();
		
		System.out.println("Ingresa N3: ");
		int N3= entrada.nextInt();
		
		double prom = (N1+N2+N3)/3;
		
		System.out.println("El promedio es: "+prom);
		
		
		
		System.out.println("Ingrese número: ");
		int n = entrada.nextInt();
		
		double res = n%2;
		
		if(res == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
		
		
		String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
		JOptionPane.showMessageDialog(null, "Hola "+nombre);
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad: "));
		JOptionPane.showMessageDialog(null, "Tu edad es "+edad+" años");
		
		double alt = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu altura"));
		JOptionPane.showMessageDialog(null, "Mides "+alt+" cm");
		
		*/
		
		//double x, y, z;
		
		//double Z = Math.max(x, y);
		//double Z = Math.min(x, y);
		//double Z = Math.abs(y);
		//double Z = Math.sqrt(y);
		//double Z = Math.round(x);
		//double Z = Math.ceil(x);//ceil redondea hacia arriba
		//double Z = Math.floor(x);//ceil redondea hacia abajo
		
		//System.out.println(Z);
		
		/*System.out.println("Ingrese X: ");
		x = entrada.nextDouble();
		
		System.out.println("Ingrese Y:");
		y = entrada.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("La hipotenusa es: "+z);
		
		
		int x = random.nextInt(6)+1;
		double y = random.nextDouble();
		boolean z = random.nextBoolean();
		
		System.out.println("Numero: "+z);
		
		
		
		String dia = "Martes";
		
		switch(dia) {
		case "Lunes": 
			System.out.println("Es Lunes"); 
			break;
			
		case "Martes": 
			System.out.println("Es Martes"); 
			break;
			
		case "Miercoles": 
			System.out.println("Es Miercoles"); 
			break;
			
		default:
			System.out.println("Default");
		}
		
		//respuesta.equals(?);
		
		String nombre = "";
		while(nombre.isBlank()) {
			System.out.println("Ingrese su nombre");
			nombre = entrada.nextLine();
		}
		
		System.out.println("Hola "+nombre);
		
		
		String nombre = "";
		do{
			System.out.println("Ingrese su nombre");
			nombre = entrada.nextLine();
		}while(nombre.isBlank());
		
		System.out.println("Hola "+nombre);
		
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);;
		}
		System.out.println("Feliz año");
		*/
		
		int opcion;
		do {
		System.out.println("========Calculadora========");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Potencia");
		System.out.println("6. Modulo");
		System.out.println("7. Salir");
		
		System.out.println("Elige una opción: ");
		opcion = entrada.nextInt();
		
		if (opcion >= 1 && opcion <= 6) {
		System.out.println("Ingresa primer número: ");
		double N1 = entrada.nextDouble();
		System.out.println("Ingresa segundo número: ");
		double N2 = entrada.nextDouble();
		double resultado = 0;
		switch(opcion) {
		case 1: 
			resultado = N1 + N2;
			break;
		case 2: 
			resultado = N1 - N2;
			break;
		case 3: 
			resultado = N1 * N2;
			break;
		case 4: 
			if(N2>0) {
			resultado = N1 / N2;
			}else {
				System.out.println("El divisor debe ser mayor que 0");
				continue;
			}
			break;
		case 5: 
			resultado = Math.pow(N1, N2);
			break;
		case 6: 
			resultado = N1 % N2;
			break;
		}
			System.out.println("El resultado es: " + resultado);
		}else if(opcion !=7) {
			System.out.println("Opcion no valida"); 
		}
		}while(opcion!=7);
		System.out.println("Saliendo de la calculadora...");
	
	}
}
