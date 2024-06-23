package fr.afpa.employees;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
Objectif :
L’objectif de ce TP est de concevoir un programme en console basé sur une approche objet et
permettant de gérer (vraiment très basiquement) des salariés d’une entreprise.

Vous allez écrire une classe représentant les salariés d'une entreprise.
Vous pourrez vous aider du PDF disponible sur pour obtenir des informations sur la façon de faire.
*/

class Employee {
	/**
	 * Matricule de l'employé
	 * Permet de stock les informations a rentré
	 */
	private String registrationNumber;
	private String lastName;
	private String firstName;
	private double salary;
	private LocalDate birthDate;
	private final int socialRate = 30;

	// Permet d'attribué les données de la fonction aux variables dessous (les
	// variables sont instancies afin d'être initialiser dans un autre code)

	public Employee(String registrationNumber, String lastName, String firstName, double salary, String birthDate) {
		this.registrationNumber = registrationNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
		this.birthDate = LocalDate.parse(birthDate);
	}

	// GETTERS : Permet de récupéréss les données d'un objet.

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getBirthdatDate() {
		return birthDate;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setLocalDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override

	public String toString() {

		return "Employee {"
				+ " \nMatricule " + getRegistrationNumber()
				+ " \nNom " + getLastName()
				+ " \nPrénom " + getFirstName()
				+ " \nSalaire " + getSalary()
				+ " \nBirthday " + getBirthdatDate()
				+ " \nDays before Birthday " + daysBeforeBirthdate()
				+ " \nSalary " + netSalary()
				+ '}';
	}

	public double netSalary() {

		return this.salary - this.salary * (this.socialRate / 100.0);
	}

	public long daysBeforeBirthdate() {
		LocalDate currentDate = LocalDate.now();
		LocalDate nextBirthDate = this.birthDate.withYear(currentDate.getYear());//.withYear permet de set l'année de birthyear sur l'année actuelle > Prochain Anniversaire

		// Si l'anniversaire de cette année est déjà passé, on prend l'année prochaine
		if (nextBirthDate.isBefore(currentDate) || nextBirthDate.isEqual(currentDate)){
			nextBirthDate = nextBirthDate.plusYears(1); // .plusYear rajoute une valeur à l'année, pareil avec .plusMonths / .plusDays
		}

		return ChronoUnit.DAYS.between(currentDate, nextBirthDate);
	}



	// TODO implémenter la méthode "toString()" qui renvoie une chaîne de caractère
	// qui représente un objet de la classe employé
	// plus d'information sur la méthode "toString()" ->
	// https://codegym.cc/fr/groups/posts/fr.986.mthode-java-tostring
}
