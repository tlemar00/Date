package es.unileon.prg.practicaDate;

public class MainDate {

	public static void main(String[] args) {

		Date today, tomorrow;

		try{
			today = new Date(18, 03, 2019);
			System.out.println(today.toString());
		}catch(DateException e){
			System.out.println(e.getMessage());
		}
	}
}