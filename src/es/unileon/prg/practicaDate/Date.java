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
	
	//
	public boolean isSameYear(int year){
	
		return (this.year == year);
	}
	
	public boolean isSameMonth(int month){
	
		return (this.month == month);
	}
	
	public boolean isSameDay(int day){

		return (this.day == day);
	}

	public boolean isSame(){

		return true;
	}

	public int getDayOfMonth(int day, int month){

		int v_dias_del_mes = 0;

		switch(month){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				v_dias_del_mes = 31;
				break;
			case 2:
				v_dias_del_mes = 28;
				break;
			case 4:
			case 6:
			case 9:
				v_dias_del_mes = 30;
				break;
			default: 
				break;
		}
		return v_dias_del_mes;
	}

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


}

