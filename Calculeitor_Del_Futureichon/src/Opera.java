public class Opera {
	public static double multiply (double Factor1, double Factor2){
		/*Función para discriminar los factores de una multiplicación y para invocar la multiplicación
		que se deba desarrollar.*/
		//Factor1 y Factor2 son los factores de la multiplicación.
		double resultado = 0;
		String Factor2S = new String ("" + Factor2);
		while((Factor2 - (int)Factor2) != (0)) {
			Factor2S = String.format("%.7g%n", multiply(Factor2, 10));
			Factor1 = division(Factor1,10);
			Factor2 = Double.valueOf(Factor2S.replace(",", "."));
		}
		if (Factor2 >= 0){
			resultado = multiply_complement (Factor1, Factor2);
			return resultado;
		}
		else{
			Factor2 = -Factor2;
			if(Factor1 >= 0){
				resultado = multiply_complement (Factor1, Factor2);
				return -resultado;
			}
			else{
				Factor1 = -Factor1;
				resultado = multiply_complement (Factor1, Factor2);
				return resultado;
			}
		}
	}
	private static double multiply_complement (double Factor1, double Factor2){
		double total = 0;
		for(int i = 0; i < Factor2; i++){
			total += Factor1;
		}
		return total;
	}
	public static double division (double div1, double div2){
		double resultado = 0;
		if (div2 >= 0){
			resultado = division_complement (div1, div2);
			return resultado;
		}
		else{
			div2 = -div2;
			if(div1 >= 0){
				resultado = division_complement (div1, div2);
				return -resultado;
			}
			else{
				div1 = -div1;
				resultado = division_complement (div1, div2);
				return resultado;
			}
		}
	}
	private static double division_complement (double div1, double div2){
		double total = 0;
		int aux = 0;
		String totalS = new String ("");
		// while(div1 > div2){
		// >= eso corrijo el error.
		if(div2 == 0){
			return -1;
		}
		else{
			while(div1 >= div2){
				div1 -= div2;
				aux++;
			}
			if(div1 == 0){
				return aux;
			}
			else{
				totalS += aux + ".";
				while (div1 != 0){
					div1 = multiply(div1, 10);
					aux = 0;
					while(div1 >= div2){
						div1 -= div2;
						aux++;
					}
					totalS += aux;
					if ((totalS.length()) == 15){
						break;
					}
				}
				total = Double.valueOf(totalS);
				return total;
			}
		}
	}
	public static double power (double base, double exponente){
		double respuesta = 0;
		double aux = base;
		for(int i = 0; i < exponente; i++){
			respuesta = multiply(base, aux);
		}
		return respuesta;
	}
	public static double divMod (double div1, double div2){
		double resultado = divMod_complement(div1, div2);
		return resultado;
	}
	private static double divMod_complement (double div1, double div2){
		if(div2 == 0){
			return 0;
		}
		else{
			while(div1 >= div2){
				div1 -= div2;
			}
			return div1;
		}
	}
	public static double round (double valor){
		if (multiply((valor)-((int)valor),10) >= 5){
			valor = (int)valor + 1;
		}
		else{
			valor = (int)valor;
		}
		return valor;
	}
}