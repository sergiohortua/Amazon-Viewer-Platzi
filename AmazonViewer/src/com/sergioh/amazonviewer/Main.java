package com.sergioh.amazonviewer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Bienvenidos a AMAZON VIEWER");
		
		Scanner tc=new Scanner(System.in);
		int num;
		
		do {
			
			System.out.println();
			System.out.println("Selecciona la opcion deseada:");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("0. Exit");
			
			num=tc.nextInt();
			switch (num) {
			case 0:
				System.out.println("Saliste del Menu");
				break;
			case 1:
				System.out.println("Veras una Pelicula");
				break;
			case 2:
				System.out.println("Veras una Serie");
				break;
			case 3:
				System.out.println("Leeras un Libro");
				break;
			case 4:
				System.out.println("Leeras una Revista");
				break;
			

			default:System.out.println("No es una opcion valida");
				break;
			}			
			
			
		}while(num!=0);

}

}
