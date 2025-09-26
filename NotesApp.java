package com.elevatelabs.tasks.task4;

import java.io.*;
import java.util.Scanner;

public class NotesApp {
	private static final String FILE_NAME = "notes.txt"; // file to store notes
	private Scanner sc = new Scanner(System.in);

	// Add a new note
	public void addNote() {
		System.out.print("Enter your note: ");
		sc.nextLine();
		String note = sc.nextLine();

		try (FileWriter fw = new FileWriter(FILE_NAME, true); // true = append mode means(our old notes won’t get
																// deleted).
				BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write(note);
			bw.newLine();
			System.out.println("Note added successfully");
		} catch (IOException e) {
			System.out.println("Error writing to file: " + e.getMessage());
		}
	}

	// View all notes
	public void viewNotes() {
		File file = new File(FILE_NAME);
		if (!file.exists()) {
			System.out.println("No notes found.");
			return;
		}

		System.out.println("\nYour Notes");
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println("- " + line);
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}

	// Menu
	public void menu() {
		while (true) {
			System.out.println("\nNotes App");
			System.out.println("1. Add Note");
			System.out.println("2. View Notes");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addNote();
				break;
			case 2:
				viewNotes();
				break;
			case 3:
				System.out.println("Exiting from the Notes App");
				return;
			default:
				System.out.println("Invalid choice");
			}
		}
	}

	public static void main(String[] args) {
		new NotesApp().menu();
	}
}
