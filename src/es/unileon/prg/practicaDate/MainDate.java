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
		}catch(DateException e){
			System.out.println(e.getMessage());
		}
		
	}
}