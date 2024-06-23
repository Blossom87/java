package fr.afpa.employees;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Classe principale du projet, contient la fonction "main"
 */
class EmployeeMain {
	public static void main(String[] args) {
		System.out.println("\n----- Exercice de programmation objet - classe \"Employee\" -----");

		// TODO instanciez 4 objets de la classe "Employee" (une fois celle-ci
		// implémentée)
		Employee employee1 = new Employee("111aaa12", "Shazam", "Samantha", 1800.0, "1994-12-12");

		// Appelle de methode a partir de l'objet employee1 de la classe Employee (le
		// "." demande accès à une donnée spécifique ici registrationNumber)
		System.out.println(employee1.getRegistrationNumber());

		// Modification de la variable registrationNumber graçe au Setter de la classe
		// Employee, nouvelle donnée attribuer a registrationNumber
		employee1.setRegistrationNumber("22ZZZ33");
		System.out.println(employee1.getRegistrationNumber());

		System.out.println(employee1.toString());

		// TODO afficher les informations des employés avec System.out.println
	}
}
