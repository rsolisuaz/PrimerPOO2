import java.io.*;

public class PrimerTarea {
	public static void main(String args[])  throws IOException {
		Operaciones<Double> ops = new Operaciones<>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea = in.readLine();
		while (linea != null) {
			String elems[]= linea.split(" ");
			Double num1 = Double.parseDouble(elems[0]);
			char operador = elems[1].charAt(0);
			Double num2 = Double.parseDouble(elems[2]);
			Double result=null;
			try {
				switch (operador) {
					case '+' : 
						result=ops.suma(num2,num2);
						break;
					case '-' : 
						result=ops.resta(num2,num2);
						break;
					case '*' : 
						result=ops.multiplica(num2,num2);
						break;
					case '/' : 
						result=ops.divide(num2,num2);
						break;
				}
			}
			catch (ArithmeticException ex) {
				System.out.println(ex.getMessage());
			}
			linea=in.readLine();
		}
	}
}