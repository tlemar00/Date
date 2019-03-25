package es.unileon.prg.practicaDate;

public class MainDate {

	public static void main(String[] args) {

		Date today;
		Date tomorrow;

		try{
			today = new Date(18, 03, 2019);
			System.out.println("Primera fecha: " + today.toString());
			tomorrow = new Date(11, 10, 2019);
			System.out.println("Segunda fecha: " + tomorrow.toString());
			System.out.println(today.isSameYear(tomorrow));
			System.out.println(today.isSameMonth(tomorrow));
			System.out.println(today.isSameDay(tomorrow));
			System.out.println(today.isSame(tomorrow));
			System.out.println("El nombre del mes de " + today + " es: " + today.getMonthName());
			System.out.println("El nombre del mes de " + tomorrow + " es: " + tomorrow.getMonthName());
			System.out.println("El mes de " + today.getMonthName() + " tiene " + today.getDayOfMonth() + " días.");
			System.out.println("El mes de " + tomorrow.getMonthName() + " tiene " + tomorrow.getDayOfMonth() + " días.");
			System.out.println("La estación de la primera fecha es: " + today.seasonName());
			System.out.println("La estación de la segunda fecha es: " + tomorrow.seasonName());
			System.out.println("Desde la primera fecha faltan " + today.getMonthsLeft() + " meses para acabar el año.");
			System.out.println("Desde la segunda fecha faltan " + tomorrow.getMonthsLeft() + " meses para acabar el año.");
			System.out.println("Desde la primera fecha faltan " + today.daysEnd() + " días para acabar el mes.");
			System.out.println("Desde la segunda fecha faltan " + tomorrow.daysEnd() + " días para acabar el mes.");
			System.out.println("Los meses con los mismos días que la primera fecha son: " + today.monthsSameDays());
			System.out.println("Los meses con los mismos días que la segunda fecha son: " + tomorrow.monthsSameDays());
			System.out.println("Días desde principio de año hasta " + today + ": " + today.daysSinceFirst());
			System.out.println("Días desde principio de año hasta " + tomorrow + ": " + tomorrow.daysSinceFirst());
			System.out.println("Intentos de generar la misma fecha 1 con bucle do-while: " + today.numberAttempsDoWhile());
			System.out.println("Intentos de generar la misma fecha 2 con bucle do-while: " + tomorrow.numberAttempsDoWhile());
			System.out.println("Intentos de generar la misma fecha 1 con bucle while: " + today.numberAttempsWhile());
			System.out.println("Intentos de generar la misma fecha 2 con bucle while: " + tomorrow.numberAttempsWhile());
		}catch(DateException e){
			System.out.println(e.getMessage());
		}
		
	}
}