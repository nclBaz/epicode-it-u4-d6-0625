package exceptions;

public class UserNotFoundException extends Exception {
	// Se estendo EXCEPTION questa sarà CHECKED!

	public UserNotFoundException() {
		super("Utente non trovato!");
	}

	public UserNotFoundException(int id) {
		super("L'utente con id " + id + " non è stato trovato!");
	}

}
