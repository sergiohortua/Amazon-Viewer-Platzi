package com.sergioh.amazonviewer;

import java.util.Scanner;

import com.sergioh.amazonviewer.model.Movie;

public class Main {

	public static void main(String[] args) {

		showMenu();

	}

	public static void showMenu() {
		System.out.println("Bienvenidos a AMAZON VIEWER");

		Scanner tc = new Scanner(System.in);
		int exit=0, num;

		do {

			System.out.println();
			System.out.println("Selecciona la opcion deseada:");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Chapters");
			System.out.println("0. Exit");

			num = tc.nextInt();
			switch (num) {
			case 0:
				System.out.println("Saliste del Menu");
				break;
			case 1:
				showMovie();

				break;
			case 2:
				showSeries();

				break;
			case 3:

				showBook();
				break;
			case 4:
				showMagazine();

				break;
			case 5:
				showChapter();
				
				break;

			default:
				System.out.println("No es una opcion valida");
				break;
			}

		} while (exit != 0);
	}

	public static void showMovie() {

		int exit=0;

		do {

			System.out.println();
			System.out.println("::Movie::");
		} while (exit != 0);

	}

	public static void showSeries() {

		int exit = 0;

		do {

			System.out.println();
			System.out.println("::Series::");
		} while (exit != 0);

	}

	public static void showChapter() {

		int exit = 0;

		do {

			System.out.println();
			System.out.println("::Chapters::");
		} while (exit != 0);

	}

	public static void showBook() {

		int exit = 0;

		do {

			System.out.println();
			System.out.println("::Books::");
		} while (exit != 0);

	}

	public static void showMagazine() {

		int exit = 0;

		do {

			System.out.println();
			System.out.println("::Magazine::");
		} while (exit != 0);

	}
}
