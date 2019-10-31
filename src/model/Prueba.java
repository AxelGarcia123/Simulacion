package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Prueba {

	public /*List<Long>*/ Long generador(String consoleInput) {
		boolean cycle = false;
		List<Double> results = new ArrayList<Double>();
		List<Long> entireResults = new ArrayList<Long>();
		long lastResult = 0;
		int n = 0;
		Random aleatorio = new Random();
		long mainSeed = aleatorio.nextInt(1000);
		if(consoleInput.equals("Entre 1000 y 10000")) {
			while(n < 1 && cycle != true) {
				long nextNumber = mainSeed;
				while(!nextPrimeNumber(nextNumber)) {
					nextNumber++;
				}

				long result = mainSeed * nextNumber;
				long aux = Long.valueOf(getCenterNumber4(String.valueOf(result)));
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
					aux = Long.valueOf(getCenterNumber4(String.valueOf(result)));
					random = Double.parseDouble(String.valueOf(aux)) / 10000;
				}

				results.add(random);
				entireResults.add(aux);
				lastResult = Long.parseLong(String.valueOf(aux));
				mainSeed = aux;
				n++;
			}
		}

		else if(consoleInput.equals("Entre 100 y 1000")) {
			while(n < 1 && cycle != true) {

				long nextNumber = mainSeed;
				while(!nextPrimeNumber(nextNumber)) {
					nextNumber++;
				}

				long result = mainSeed * nextNumber;
				long aux = Long.valueOf(getCenterNumber3(String.valueOf(result)));
				double random = Double.parseDouble(String.valueOf(aux)) / 1000;

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
					aux = Long.valueOf(getCenterNumber3(String.valueOf(result)));
					random = Double.parseDouble(String.valueOf(aux)) / 1000;
				}

				results.add(random);
				entireResults.add(aux);
				lastResult = Long.parseLong(String.valueOf(aux));
				mainSeed = aux;
				n++;
			}
		}

		else if(consoleInput.equals("Entre 10000 y 100000")) {
			while(n < 1 && cycle != true) {

				long nextNumber = mainSeed;
				while(!nextPrimeNumber(nextNumber)) {
					nextNumber++;
				}

				long result = mainSeed * nextNumber;
				long aux = Long.valueOf(getCenterNumber5(String.valueOf(result)));
				double random = Double.parseDouble(String.valueOf(aux)) / 100000;

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
					aux = Long.valueOf(getCenterNumber5(String.valueOf(result)));
					random = Double.parseDouble(String.valueOf(aux)) / 100000;
				}

				results.add(random);
				entireResults.add(aux);
				lastResult = Long.parseLong(String.valueOf(aux));
				mainSeed = aux;
				n++;
			}
		}
		else {
			
		}
		return lastResult;
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

	public static String getCenterNumber4(String result) {
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

		else if(result.length() == 2)
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
		
		else if(result.length() == 4)
			mainSeed = result;

		else if(result.length() == 3) {
			mainSeed = result;
		}
		
		else if(result.length() == 2)
			mainSeed = result;

		return mainSeed;
	}

	public static String getCenterNumber3(String result) {
		String mainSeed = "";
		if(result.length() == 6) {
			String auxZero = "0";
			auxZero += result;
			mainSeed = auxZero.substring(2, auxZero.length() - 2);
		}

		else if(result.length() == 5) {
			mainSeed = result.substring(1, result.length() - 1);
		}

		else if(result.length() == 4) {
			String auxZero = "0";
			auxZero += result;
			mainSeed = auxZero.substring(1, auxZero.length() - 1);
		}

		else if(result.length() == 3) {
			mainSeed = result;
		}

		else if(result.length() == 2)
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
	
	public static String getCenterNumber5(String result) {
		String mainSeed = "";
		if(result.length() == 11) {
			mainSeed = result.substring(3, result.length() - 3);
		}

		else if(result.length() == 10) {
			String auxZero = "0";
			auxZero += result;
			mainSeed = auxZero.substring(3, auxZero.length() - 3);
		}

		else if(result.length() == 9) {
			mainSeed = result.substring(2, result.length() - 2);
		}

		else if(result.length() == 8) {
			String auxZero = "0";
			auxZero += result;
			mainSeed = auxZero.substring(2, auxZero.length() - 2);
		}

		else if(result.length() == 7) {
			mainSeed = result.substring(1, result.length() - 1);
		}

		else if(result.length() == 6){
			String auxZero = "0";
			auxZero += result;
			mainSeed = auxZero.substring(1, auxZero.length() - 1);
		}

		else if(result.length() == 5) {
			String auxZero = "0";
			auxZero += result;
			mainSeed = auxZero.substring(2, auxZero.length() - 2);
		}

		else if(result.length() == 4) {
			String auxZero = "0";
			auxZero += result;
			mainSeed = auxZero.substring(1, auxZero.length() - 1);
		}

		else if(result.length() == 3) {
			/*String auxZero = "00";
			auxZero += result;
			mainSeed = auxZero;*/
			mainSeed = result;
		}

		else {
			/*String auxZero = "000";
			auxZero += result;
			mainSeed = auxZero;*/
			mainSeed = result;
		}

		return mainSeed;
	}
}
