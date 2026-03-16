package exceptions;

public class ValidationException extends RuntimeException {
	// Se estendo RUNTIMEEXCEPTION questa sarà UNCHEKED!
	public ValidationException() {
		super("Errore di validazione");
	}

	public ValidationException(String msg) {
		super(msg);
	}
}
