package es.unileon.prg.practicaDate;

public class MainDate {

	public static void main(String[] args) {

		Date today;
		Date tomorrow;

		try{
			today = new Date(18, 03, 2019);
			System.out.println(today.toString());
			tomorrow = new Date(19, 03, 2019);
			System.out.println(tomorrow.toString());
		}catch(DateException e){
			System.out.println(e.getMessage());
		}
		
	}
}