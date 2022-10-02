package com.skilldistillery.filmquery.app;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Actor;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {

	DatabaseAccessor db = new DatabaseAccessorObject();

	public static void main(String[] args) throws SQLException {
		FilmQueryApp app = new FilmQueryApp();
		app.test();
		app.launch();
	}

	private void test() throws SQLException {
//    Film film = db.findFilmById(1);
//    Actor film2 = db.findActorById(1);
//    List<Actor> actors = db.findActorsByFilmId(474);
//		for (Actor actor : actors) {
//			System.out.println(actor);
//		}
	}

	private void launch() throws SQLException {
		Scanner input = new Scanner(System.in);
		startUserInterface(input);
		input.close();
	}

	private void startUserInterface(Scanner input) throws SQLException {
		boolean loopMenu = true;
		int input1;
		while (loopMenu) {
			menu();
			try {
				input1 = input.nextInt();
				switch (input1) {
				case 1:
					filmById(input);
					System.out.println();
					continue;
				case 2:
					filmByKeyword(input);
					System.out.println();
					continue;
				case 3:
					System.out.println("All out of popcorn?");
					loopMenu = false;
					break;
				default:
					System.out.println("invalid entry");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Enter a valid number.\n");
				input = new Scanner(System.in);
				continue;
			}
		}
	}

	private void filmById(Scanner input) throws SQLException {
		System.out.println("Enter a film id");
		int filmId = input.nextInt();
		Film result = db.findFilmById(filmId);
		if (result != null) {
			System.out.println(result);
			subMenu(result);
		} else {
			System.out.println("No match found.");
		}
	}

	public void filmByKeyword(Scanner input) {
		System.out.println("Type in a keyword to search films:");
		String filmKey = input.next();
		List<Film> result = db.findFilmByKey(filmKey);

		if (result.size() == 0) {
			System.out.println("No films match the keywords.");
		} else {
			for (Film film : result) {
				System.out.println(film);
				System.out.println();
			}
			System.out.println("Here are " + result.size() + " films related to the keywords.");
		}
	}

	private void menu() {
		System.out.println("Select an option:");
		System.out.println("1 - Look up a film by its id");
		System.out.println("2 - Look up a film by a search keyword");
		System.out.println("3 - Exit the application");
	}

	private void subMenu(Film film) {
		System.out.println("\nSelect an option:");
		System.out.println("1 - View all film details");
		System.out.println("2 - Return to the main menu");
		Scanner kb = new Scanner(System.in);
		int userInput = kb.nextInt();
		switch (userInput) {
		case 1:
			System.out.println(film.printDetailsString());
			break;
		case 2:
			System.out.println("Returning to main menu...");
			break;
		}
	}
}
