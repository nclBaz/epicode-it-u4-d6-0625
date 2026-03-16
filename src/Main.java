import entities.Student;
import exceptions.ValidationException;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ************************************ ERRORS **************************************
		/*
		Gli ERRORS sono problematiche che non possiamo gestire nè tramite try-catch o controlli vari
		Qua è necessario modificare il codice incriminato, addirittura in casi gravi potrebbe essere
		necessario dover mettere mano sull'hardware del computer
		* */

//		print("CIAO");


		// *********************************** UNCHECKED EXCEPTIONS ***************************
		// Sono le eccezioni che NON ABBIAMO OBBLIGO DI GESTIRE. Non abbiamo obbligo di usare try-catch per far partire l'applicazione
		// Solitamente sono problematiche che possiamo prevenire senza appesantire il codice con i try-catch

		Scanner scanner = new Scanner(System.in);
//		int input = Integer.parseInt(scanner.nextLine());

//		int[] numbers = {1, 2, 3};
//		if (input < 0 || input > 2) System.out.println("Hai inserito un numero fuori dal range");
//		else System.out.println(numbers[input]); // ArrayIndexOutOfBoundsException
//
//		System.out.println("Dammi un numero");
//		int n1 = Integer.parseInt(scanner.nextLine());
//
//		System.out.println("Dammi un secondo numero diverso da zero");
//		int n2 = Integer.parseInt(scanner.nextLine());
//
//		if (n2 != 0)
//			System.out.println(n1 / n2); // ArithmeticException
//

//		Object qualsiasi = new Object();
//
//		qualsiasi = null;
//
//		if (qualsiasi != null)
//			System.out.println(qualsiasi.getClass()); // NullPointerException


		// ********************************************* CHECKED EXCEPTIONS ******************************
		// Con queste eccezioni ho l'OBBLIGO DI GESTIONE. Ciò significa che devo scrivere del codice per la loro gestione solo per
		// poter eseguire il codice. L'applicazione non potrà essere eseguita fino a che non gestisco il codice

//		try {
//		Thread.sleep(10000); // Attesa di 10 secondi
//		} catch (InterruptedException e) {
//			throw new RuntimeException(e);
//		}

//		try {
//			Student student = new Student("A", "Baglio");
//		} catch (ValidationException ex) {
//			System.out.println(ex.getMessage());
//		}


//		try {
//			Student.findById(10);
//		} catch (UserNotFoundException e) {
//			System.out.println(e.getMessage());
//		}

		System.out.println("CIAO");

		try {
			Student student = new Student("Aldo", "Baglio");
			System.out.println("Dammi il nuovo nome per Aldo");
			String newName = scanner.nextLine();

			student.setName(newName);

		} catch (ValidationException ex) {

			System.out.println("Errore di validazione dei dati");
			System.out.println(ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.println("Ho salvato il log di errore nel DB");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("Ho inviato un'email con l'errore al presidente Mattarella");
		} catch (Exception ex) {
			System.out.println("Nessuna delle precedenti");
			ex.printStackTrace();
		} finally {
			System.out.println("FINALLY");
			// Il finally viene eseguito SEMPRE. Non importa se sono finito nel catch oppure no, ciò che inseriamo nel finally viene eseguito a prescindere
			scanner.close();
		}
	}

//	public static void print(String str) {
//		print(str);
//	}
}
