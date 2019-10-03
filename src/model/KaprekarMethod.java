package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class KaprekarMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Add the main seed: ");
		String mainSeed = input.next();
		System.out.println("n\tSemilla1\tSemilla2\tResultado\tDato tomado\tN\u00famero aleatorio\n");
		
		double datoRepetido = 0;
		int position = 0;
		
		if(mainSeed.length() == 4) {
			boolean cycle = false;
			List<Double> results = new ArrayList<Double>();
			int n = 0;
			while(n < 10000 && cycle == false) {
				char tidySeed[] = new char[4];
				for(int i = 0; i < mainSeed.length(); i++) 
					tidySeed[i] = mainSeed.charAt(i);
				
				int highestLowest = orderFromHighestToLowest(tidySeed);
				Arrays.sort(tidySeed);
				String aux = "";
				
				for(int i = 0; i < tidySeed.length; i++) 
					aux += String.valueOf(tidySeed[i]);
				
				int lowestHighest = Integer.parseInt(aux);
				String result = String.valueOf(highestLowest * lowestHighest);
				mainSeed = getCenterNumbers(result);
				double random = Double.parseDouble(mainSeed) / 10000;
				
				if(n != 0) {
					for (Double db : results) {
						if(db == random) {
							cycle = true;
							datoRepetido = db;
							position = n;
							break;
						}
					}
					results.add(random);
				}
				
				if(cycle) {
					System.out.println("Cambiando dato repetido");
					double dato = results.get(n - 2);
					int datoEntero = (int) (dato * 10000);
					for(int i = 0; i < mainSeed.length(); i++) {
						tidySeed[i] = String.valueOf(datoEntero).charAt(i);
					}
					String menor = "";
					Arrays.sort(tidySeed);
					for(int i = 0; i < tidySeed.length; i++) {
						menor += String.valueOf(tidySeed[i]);
					}
					int newData = orderFromHighestToLowest(tidySeed) - Integer.parseInt(menor);
					mainSeed = String.valueOf(newData);
					cycle = false;
				}
				else
					System.out.println(n + "\t" + highestLowest +"\t\t"+ lowestHighest + "\t\t" + result + "\t\t" + mainSeed + "\t\t" +random);
				n++;
			}
		}
		System.out.println("Dato repetido " + datoRepetido + "\nPosition "+ position);
	}
	
	public static int orderFromHighestToLowest(char[] seed) {
		for(int i = 0; i < seed.length; i++) {
			for(int j = 0; j < seed.length; j++) {
				if(seed[j] < seed[i]) {
					char aux = seed[i];
					seed[i] = seed[j];
					seed[j] = aux;
				}
			}
		}
		String aux = "";
		for(int i = 0; i < seed.length; i++)
			aux += Integer.parseInt(String.valueOf(seed[i]));
		
		return Integer.parseInt(aux);
	}
	
	public static String getCenterNumbers(String result) {
		String mainSeed = "";
		if(result.length() % 2 == 0 && result.length() == 8) {
			mainSeed = result.substring(2, result.length() - 2);
		}
		
		else if(result.length() % 2 == 0 && result.length() == 6) {
			mainSeed = result.substring(1, result.length() - 1);
		}
		
		else if(result.length() % 2 == 0 && result.length() == 6) {
			String auxZero = "0";
			auxZero += result;
			mainSeed = auxZero.substring(1, auxZero.length() - 1);
		}
		
		else if(result.length() == 5) {
			String auxZero = "0";
			auxZero += result;
			mainSeed = auxZero.substring(1, auxZero.length() - 1);
		}
		
		else if(result.length() == 4)
			mainSeed = result;
		
		else {
			String auxZero = "0";
			auxZero += result;
			mainSeed = auxZero.substring(2, auxZero.length() - 2);
		}
		return mainSeed;
	}
}