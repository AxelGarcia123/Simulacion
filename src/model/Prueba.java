package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Prueba {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Add the main seed: ");
		String consoleInput = input.next();
		long mainSeed = Long.valueOf(consoleInput);

		boolean cycle = false;
		List<Double> results = new ArrayList<Double>();
		List<Long> entireResults = new ArrayList<Long>();
		int n = 0;

		System.out.println("n          Semilla 1          Semilla 2          Resultado          Dato tomado          Num. Aleatorio");
		if(consoleInput.length() == 4) {
			while(n < 100 && cycle != true) {
				if(String.valueOf(mainSeed).length() == 2)
					mainSeed *= 1000;
				
				long nextNumber = mainSeed;
				while(!nextPrimeNumber(nextNumber)) {
					nextNumber++;
				}
				
				long result = mainSeed * nextNumber;
				long aux = Long.valueOf(getCenterNumber(String.valueOf(result)));
				double random = Double.parseDouble(String.valueOf(aux)) / 10000;
				
				if(repeatedNumber(results, random)) {
					mainSeed = entireResults.get(n - 1);
					while(!nextPrimeNumber(mainSeed)) {
						mainSeed++;
					}
					
					nextNumber = mainSeed;
					while(!nextPrimeNumber(nextNumber)) {
						nextNumber++;
					}
					
					result = mainSeed * nextNumber;
					aux = Long.valueOf(getCenterNumber(String.valueOf(result)));
					random = Double.parseDouble(String.valueOf(aux)) / 10000;
				}
				
				results.add(random);
				entireResults.add(aux);
				
				System.out.println(n + "\t\t"+ mainSeed + "\t\t"+ nextNumber + "\t\t"+ result + "     \t\t"+ aux + "\t\t"+ random);
				mainSeed = aux;
				n++;
			}
		}
	}
	
	public void generador(long mainSeed, String consoleInput) {
		boolean cycle = false;
		List<Double> results = new ArrayList<Double>();
		List<Long> entireResults = new ArrayList<Long>();
		int n = 0;

		System.out.println("n          Semilla 1          Semilla 2          Resultado          Dato tomado          Num. Aleatorio");
		if(consoleInput.length() == 4) {
			while(n < 100 && cycle != true) {
				if(String.valueOf(mainSeed).length() == 2)
					mainSeed *= 1000;
				
				long nextNumber = mainSeed;
				while(!nextPrimeNumber(nextNumber)) {
					nextNumber++;
				}
				
				long result = mainSeed * nextNumber;
				long aux = Long.valueOf(getCenterNumber(String.valueOf(result)));
				double random = Double.parseDouble(String.valueOf(aux)) / 10000;
				
				if(repeatedNumber(results, random)) {
					mainSeed = entireResults.get(n - 1);
					while(!nextPrimeNumber(mainSeed)) {
						mainSeed++;
					}
					
					nextNumber = mainSeed;
					while(!nextPrimeNumber(nextNumber)) {
						nextNumber++;
					}
					
					result = mainSeed * nextNumber;
					aux = Long.valueOf(getCenterNumber(String.valueOf(result)));
					random = Double.parseDouble(String.valueOf(aux)) / 10000;
				}
				
				results.add(random);
				entireResults.add(aux);
				
				System.out.println(n + "\t\t"+ mainSeed + "\t\t"+ nextNumber + "\t\t"+ result + "     \t\t"+ aux + "\t\t"+ random);
				mainSeed = aux;
				n++;
			}
		}
	}
	
	public static boolean repeatedNumber(List<Double> results, double random) {
		boolean flag = false;
		if(results.isEmpty())
			results.add(random);
		else {
			for (Double double1 : results) {
				if(double1 == random) {
					flag = true;
					break;
				}
				else {
					
				}
			}
		}
		if(flag) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean nextPrimeNumber(long n) {
		int counter = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0)
				counter++;
		}
		if(counter == 2)
			return true;
		else
			return false;
	}

	public static String getCenterNumber(String result) {
		String mainSeed = "";
		if(result.length() == 10) {
			mainSeed = result.substring(3, result.length() - 3);
		}

		else if(result.length() == 8)
			mainSeed = result.substring(2, result.length() - 2);

		else if(result.length() == 6) 
			mainSeed = result.substring(1, result.length() - 1);

		else if(result.length() == 4)
			mainSeed = result;

		else if(result.length() == 9){
			String auxZero = "0";
			auxZero += result;
			mainSeed = auxZero.substring(3, auxZero.length() - 3);
		}

		else if(result.length() == 7) {
			String auxZero = "0";
			auxZero += result;
			mainSeed = auxZero.substring(2, auxZero.length() - 2);
		}

		else if(result.length() == 5) {
			String auxZero = "0";
			auxZero += result;
			mainSeed = auxZero.substring(1, auxZero.length() - 1);
		}
		
		return mainSeed;
	}
}
