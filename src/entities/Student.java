package entities;

import exceptions.UserNotFoundException;
import exceptions.ValidationException;

import java.util.Random;

public class Student {
	private int id;
	private String name;
	private String surname;

	public Student(String name, String surname) {
		this.setName(name);
		this.surname = surname;
		Random random = new Random();
		this.id = random.nextInt(1, 10000);
	}

	public static Student findById(int userId) throws UserNotFoundException {
		// cerca nel db lo studente...
		Student studente = new Student("Ajeje", "Brazorf");
		if (studente != null) return studente;
		else throw new UserNotFoundException(userId);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 2) throw new ValidationException("Il nome è troppo corto!");
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				'}';
	}
}
