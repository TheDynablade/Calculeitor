
public class Opera {
	public static double multiply (double Factor1, double Factor2){
		double resultado = 0;
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