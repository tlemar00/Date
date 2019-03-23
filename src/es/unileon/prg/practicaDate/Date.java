package es.unileon.prg.practicaDate;

public class Date {

	//Declaracion de variables
	private int day;
	private int month;
	private int year;

	//Constructor
	public Date(int day, int month, int year) throws DateException{
	
		this.year = year;
		
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido. Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}

		if (day < 1 || day > 31){
			throw new DateException("Día " + day + " no válido. Valores posibles entre 1 y 31.");
		}else{
			this.day = day;
		}
	}

	public int getYear(int year){
		return this.year;
	}

	//Comprobamos si es el mismo anio
	public boolean isSameYear(Date tomorrow){

		boolean mismoAnio;

		if(this.year == tomorrow.getYear()){
			mismoAnio = true;
			System.out.println("Tienen el mismo año.");
		}else{
			mismoAnio = false;
			System.out.println("NO tienen el mismo año.");
		}

		return mismoAnio;
	}

	public int getMonth(int month){
		return this.month;	
	}

	//Comprobamos si es el mismo mes
	public boolean isSameMonth(Date tomorrow){

		boolean mismoMes;

		if(this.month == tomorrow.getMonth()){
			mismoMes = true;
			System.out.println("Tienen el mismo mes.");
		}else{
			mismoMes = false;
			System.out.println("NO tienen el mismo mes.");
		}

		return mismoMes;
	}

	public int getDay(int day){
		return this.day;	
	}

	//Comprobamos si es el mismo dia
	public boolean isSameDay(Date tomorrow){

		boolean mismoDia;

		if(this.day == tomorrow.getDay()){
			mismoDia = true;
			System.out.println("Tienen el mismo día.");
		}else{
			mismoDia = false;
			System.out.println("NO tienen el mismo día.");
		}

		return mismoDia;
	}

	//Comprobamos si es la misma fecha
	public boolean isSame(Date tomorrow){

		boolean igual;

		if((isSameDay() == true) && (isSameMonth() == true) && (isSameYear() == true)){
			igual = true;
			System.out.println("Es la misma fecha.");
		}else{
			igual = false;
			System.out.println("No es la misma fecha.");
		}

		return igual;
	}

	/*
	//Metodo toString
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	//Comprobamos si es el mismo mes
	public boolean isSameMonth(int month){
	
		return (this.month == month);
	}
	
	//Comprobamos si el mismo dia
	public boolean isSameDay(int day){

		return (this.day == day);
	}

	//Comprobamos si es la misma fecha
	public boolean isSame(){

		return true;
	}
	*/

	//Devuelve el dia del mes
	public int getDayOfMonth(int day, int month){

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
			case 2:
				dias_del_mes = 28;
				break;
			case 4:
			case 6:
			case 9:
				dias_del_mes = 30;
				break;
			default: 
				break;
		}
		return dias_del_mes;
	}

	//Devuelve el nombre del mes
	public String getMonthName(int month){

		String v_s_retorno = "ERROR";

		switch(month){
			case 1:
				v_s_retorno = "Enero";
				break;
			case 2:
				v_s_retorno = "Febrero";
				break;
			case 3: 
				v_s_retorno = "Marzo";
				break;
			case 4:
				v_s_retorno = "Abril";
				break;
			case 5:
				v_s_retorno = "Mayo";
				break;
			case 6:
				v_s_retorno = "Junio";
				break;
			case 7:
				v_s_retorno = "Julio";
				break;
			case 8:
				v_s_retorno = "Agosto";
				break;
			case 9:
				v_s_retorno = "Septiembre";
				break;
			case 10:
				v_s_retorno = "Octubre";
				break;
			case 11:
				v_s_retorno = "Noviembre";
				break;
			case 12:
				v_s_retorno = "Diciembre";
				break;
			default:
			break;

		}
		return v_s_retorno;
	}

	public String SeasonName(int day, month){

		String season;

		if(((day >= 21) && (month >= 3)) && (( day < 21 ) && (month <= 6))){
			season = "Spring";
		}

		if(((day >= 21) && (month >= 6)) && ((day < 23) && (month <= 9))){
			season = "Summer";
		}

		if(((day >= 23) && (month >= 9)) && ((day < 21) && (month <= 12))){
			season = "Autumn";
		}
		
		if(((day >= 21) && (month >= 12)) && ((day < 21) && (month <= 3))){
			season = "Winter";
		}
		return season;
	}

}