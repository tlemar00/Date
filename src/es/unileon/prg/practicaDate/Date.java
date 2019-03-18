package es.unileon.prg.practicaDate;

public class Date {

	//Declaracion de variables
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
	this.year = year;
	if (month < 1 || month > 12) {
		throw new DateException("Mes " + month + " no valido" +
				" Valores posibles entre 1 y 12.");
	} else {
		this.month = month;
	}
	this.day = day;
	}

	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

}

