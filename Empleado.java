package Taller1;

public class Empleado {
	public static void main(String[] args) {
		int horas=48;
		double pagoHora=5000.0;
		double retencionP=12.5;
		double bruto;
		double neto;
		double retencion;
		
		bruto=horas*pagoHora;
		retencion=bruto*(retencionP/100);
		neto=bruto-retencion;
		
		System.out.println("Salario bruto: " + bruto);
		System.out.println("retencion de fuente: " + retencion);
		System.out.println("Salario neto: " + neto);
	}
}
