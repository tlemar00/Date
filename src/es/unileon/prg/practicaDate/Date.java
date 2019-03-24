package es.unileon.prg.practicaDate;

public class Date {

	/*
	** Declaracion de variables
	*/
	private int day;
	private int month;
	private int year;

	/*
	** Constructor
	*/
	public Date(int day, int month, int year) throws DateException{
		
		/*
		** Comprobamos que el año sea correcto
		*/
		if(year < 1){
			throw new DateException("Año " + month + " no valido. El año no puede ser negativo.");
		}else{
			this.year = year;
		}
		/*
		** Comprobamos que el mes sea correcto
		*/
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido. Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		/*
		** Comprobamos que el dia sea correcto
		*/
		if (day < 1 || day > 31){
			throw new DateException("Día " + day + " no válido. Valores posibles entre 1 y 31.");
		}else{
			this.day = day;
		}
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}

	/*
	** Comprobamos si es el mismo anio
	*/
	public boolean isSameYear(Date another){

		boolean mismoAnio = false;

		if(this.year == another.getYear()){
			mismoAnio = true;
			System.out.println("¿Tienen el mismo año?");
		}else{
			mismoAnio = false;
			System.out.println("¿Tienen el mismo año?");
		}

		return mismoAnio;
	}

	public void setMonth(int month){
		this.month = month;
	}

	public int getMonth(){
		return month;
	}

	//Comprobamos si es el mismo mes
	public boolean isSameMonth(Date another){

		boolean mismoMes = false;

		if(this.month == another.getMonth()){
			mismoMes = true;
			System.out.println("¿Tienen el mismo mes?");
		}else{
			mismoMes = false;
			System.out.println("¿Tienen el mismo mes?");
		}

		return mismoMes;
	}

	public void setDay(int day){
		this.day = day;
	}

	public int getDay(){
		return day;
	}

	//Comprobamos si es el mismo dia
	public boolean isSameDay(Date another){

		boolean mismoDia = false;

		if(this.day == another.getDay()){
			mismoDia = true;
			System.out.println("¿Tienen el mismo día?");
		}else{
			mismoDia = false;
			System.out.println("¿Tienen el mismo día?");
		}

		return mismoDia;
	}

	/*
	** Comprobamos si es la misma fecha
	*/
	public boolean isSame(Date another){

		boolean igual = false;

		if((this.day == another.getDay()) && (this.month == another.getMonth()) && (this.year == another.getYear())){
			igual = true;
			System.out.println("¿Es la misma fecha?");
		}else{
			igual = false;
			System.out.println("¿Es la misma fecha?");
		}

		return igual;
	}

	/*
	** Devuelve el nombre del mes
	*/
	public String getMonthName(){

		String nombreMes = "ERROR";

		switch(month){
			case 1:
				nombreMes = "Enero";
				break;
			case 2:
				nombreMes = "Febrero";
				break;
			case 3: 
				nombreMes = "Marzo";
				break;
			case 4:
				nombreMes = "Abril";
				break;
			case 5:
				nombreMes = "Mayo";
				break;
			case 6:
				nombreMes = "Junio";
				break;
			case 7:
				nombreMes = "Julio";
				break;
			case 8:
				nombreMes = "Agosto";
				break;
			case 9:
				nombreMes = "Septiembre";
				break;
			case 10:
				nombreMes = "Octubre";
				break;
			case 11:
				nombreMes = "Noviembre";
				break;
			default:
				nombreMes = "Diciembre";
		}

		return nombreMes;
	}

	/*
	** Devuelve el numero de dias del mes
	*/
	public int getDayOfMonth(){

		int dias_del_mes = 0;

		switch(month){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				dias_del_mes = 31;
				break;
			case 4:
			case 6:
			case 9:
				dias_del_mes = 30;
				break;
			default: 
				dias_del_mes = 28;
		}

		return dias_del_mes;
	}

	public String seasonName(){

		String season = "Verano";

		if(((day >= 21) && (month >= 3)) || (( day < 21 ) && (month <= 6))){
			season = "Primavera";
		}

		if(((day >= 21) && (month >= 6)) || ((day < 23) && (month <= 9))){
			season = "Verano";
		}

		if(((day >= 23) && (month >= 9)) || ((day < 21) && (month <= 12))){
			season = "Otoño";
		}
		
		if(((day >= 21) && (month >= 12)) || ((day < 21) && (month <= 3))){
			season = "Invierno";
		}

		return season;
	}
	
	//Metodo toString
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}


}