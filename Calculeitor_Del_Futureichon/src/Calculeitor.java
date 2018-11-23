import java.util.*;
public class Calculeitor {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String option = new String();
		boolean Aux = true;
		System.out.print("Bienvenido a la Calculeitor del futureichon!"+"\n"+
		"Ingrese la función que desea."+"\n"+"	1) Operaciones aritméticas"+"\n"+
		"	2) Operaciones binarias."+"\n"+"	3) Promedios."+"\n"+
		"	4) Ordenamiento de datos."+"\n"+"No ingrese nada y pulse [ENTER] para"
		+ " salir del programa."+"\n");
		while(Aux == true){
			option = sc.nextLine();
			switch(option){
			case "1": System.out.println("");break;
			case "2": System.out.println("");break;
			case "3": System.out.println("");break;
			case "4": System.out.println("");break;
			case "": System.out.println(". . . CERRANDO . . ."); System.exit(0);break;
			default: System.out.println("Dato inválido, inténtelo otra vez.");break;
			}
		}
	}
}