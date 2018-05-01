import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class cuarto {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();
		String[] numbers = line.split(","); //guarda en un arreglo los numero ingrsador por comas
		int[] array = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++)
			array[i] = Integer.parseInt(numbers[i]);
		
		cuarto.printArray(array);
		cuarto.proceso(array);
	}
	public static void printArray(int[] array) throws IOException// funcion que imprime el arreglo
	{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < array.length; i++)
			bw.write(array[i] + " "); 
		
		bw.write(" ");
		bw.flush();
	}
	public static void proceso(int[]array)
	{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int menor = Integer.MAX_VALUE;
		int mayor = Integer.MIN_VALUE;
		
		for(int i =0; i< array.length; i++)
		{
			for(int j = i; j < array.length; j++ )
			{
				if(array[i]<menor)
				{
					menor = array[i];
					
					
				}
				
				if(array[i]> mayor)
				{
					mayor = array[i];
					
				}
					
			}
		}
		int ganancia = 0;
		ganancia = mayor - menor;
		System.out.println("\n"+"la mayor ganancia es de: "+ganancia);
	}
}
