package calculadorajava;

public class calculadorajava {
	
		public static void main(String[] args) {
		
			double unNumero = 70;
			double otroNumero = 40;
			double resultado = sumar(unNumero, otroNumero);
			resultado = resultado * 25;
			System.out.println("El resultado de la suma es: "+resultado);

			double unNumeroR = 90;
			double otroNumeroR = 50;
			double resultadoR = restar(unNumeroR, otroNumeroR);
			resultadoR = resultadoR * 15;
			System.out.println("El resultado de la resta es: "+resultadoR);

			double unNumeroM = 80;
			double otroNumeroM = 3;
			double resultadoM = multiplicar(unNumeroM, otroNumeroM);
			System.out.println("El resultado de la multiplicacion es: "+resultadoM);

			double unNumeroD = 150;
			double otroNumeroD = 180;
			double resultadoD = sumar(unNumeroD, otroNumeroD);
			resultadoD = resultadoD / 3;
			System.out.println("El resultado de la division es: "+resultadoD);
			}
		
		public static double sumar(double unNumero, double otroNumero) {
			double suma;
			suma = unNumero + otroNumero;
			return suma;
			
		}
		
		public static double restar(double unNumeroR, double otroNumeroR) {
			double resta;
			resta = unNumeroR - otroNumeroR;
			return resta;
			
		}
		
		public static double multiplicar(double unNumeroM, double otroNumeroM) {
			double multiplicar;
			multiplicar = unNumeroM * otroNumeroM;
			return multiplicar;
			
		}
		
		public static double dividir(double unNumeroD, double otroNumeroD) {
			double dividir;
			dividir = unNumeroD + otroNumeroD;
			return dividir;
			
		}}
		
