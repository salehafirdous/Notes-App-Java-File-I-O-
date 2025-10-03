# Task 4: Notes App (File I/O)

This project is part of my **Elevate Labs Java Developer Internship**.  
The objective is to build a **Notes App** using **Java File I/O** for persistent data storage.

## What I Did
In this task, I:
- Implemented a **menu-driven console application** in Java.  
- Used **FileWriter & BufferedWriter** to write notes into a file (`notes.txt`).  
- Used **FileReader & BufferedReader** to read and display saved notes.  
- Handled **checked exceptions** like `IOException` using `try-with-resources`.  
- Ensured data persistence by storing notes permanently in a text file.  

## Features
- Add a new note (appends to file)  
- View all saved notes  
- Exit program safely  
- Data persists even after program exit  


## Project Structure
```
com.elevatelabs.tasks.task4
NotesApp.java  # Contains all logic for adding, viewing notes, and menu
```

## Sample Output
```
Notes App 
1. Add Note
2. View Notes
3. Exit
Enter your choice: 1
Enter your note: Complete Java File I/O Task
Note added successfully!

Notes App
1. Add Note
2. View Notes
3. Exit
Enter your choice: 1
Enter your note: Revise Java File I/O concepts (FileWriter, BufferedReader)
Note added successfully

Notes App
1. Add Note
2. View Notes
3. Exit
Enter your choice: 1
Enter your note: Submit internship task report on GitHub with README.md.
Note added successfully

Notes App
1. Add Note
2. View Notes
3. Exit
Enter your choice: 2

Your Notes
- Complete File I/O task
- Revise Java File I/O concepts (FileWriter, BufferedReader)
- Submit internship task report on GitHub with README.md.
```

- Name: Saleha Firdous Syed Qamar
- Domain: Java Developer Intern
- Date: 26-09-2025
