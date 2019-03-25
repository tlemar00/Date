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

	/*
	** Devuelve el nombre de la estacion
	*/
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

	/*
	** Devuelve los meses que faltan para acabar el año
	*/
	public int getMonthsLeft(){

		int mesesRestantes = 0;

		for(int i = this.month; i <= 12; i++){
			mesesRestantes = 12 - this.month;
		}

		return mesesRestantes;
	}
	
	/*
	** Metodo toString
	*/
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	/*
	** Imprime todas las fechas hasta final de mes
	*/
	public int daysEnd(){

		int num = 0;

		/*
		** Para meses de 31 dias
		*/
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			for(int i = this.day+1; i <= 31; i++){
				num = num +1;
			}
		}
		/*
		** Para meses de 30 dias
		*/
		if(month == 4 || month == 6 || month == 9 || month == 11 ){
			for(int i = this.day+1; i <= 30; i++){
				num = num +1;
			}		
		} 
		/*
		** Para mes de 28 dias
		*/
		if(month == 2 ){
			for(int i = this.day+1; i <= 29; i++){
				num = num +1;
			}
		}
		return num;
	}

	/* 
	** Imprime los meses con el mismo numero de dias que el mes de la fecha
	*/		
	public String monthsSameDays(){

		String meses = " ";

		if(this.month == 1){
			meses = "Marzo, Mayo, Julio, Agosto, Octubre, Diciembre";
		}
		if(this.month == 2){
			meses = "Febrero";
		}
		if(this.month == 3){
			meses = "Enero, Mayo, Julio, Agosto, Octubre, Diciembre";
		}
		if(this.month == 4){
			meses = "Junio, Septiembre, Noviembre";
		}
		if(this.month == 5){
			meses = "Marzo, Enero, Julio, Agosto, Octubre, Diciembre";
		}
		if(this.month == 6){
			meses = "Abril, Septiembre, Noviembre";
		}
		if(this.month == 7){
			meses = "Marzo, Mayo, Enero, Agosto, Octubre, Diciembre";
		}
		if(this.month == 8){
			meses = "Marzo, Mayo, Julio, Enero, Octubre, Diciembre";
		}
		if(this.month == 9){
			meses = "Junio, Abril, Noviembre";
		}
		if(this.month == 10){
			meses = "Marzo, Mayo, Julio, Agosto, Enero, Diciembre";
		}
		if(this.month == 11){
			meses = "Junio, Septiembre, Abril";
		}
		if(this.month == 12){
			meses = "Marzo, Mayo, Julio, Agosto, Octubre, Enero";
		}

		return meses;
	}

	/*
	** Dias desde principio de anio hasta la fecha
	*/
	public int daysSinceFirst(){

		int nums = 0;
		
		switch(month){
			case 1: 
				nums = day;
				break;
			case 2: 
				nums = day + 31;
				break;
			case 3: 
				nums = day + 31 + 28;
				break;
			case 4: 
				nums = day + 31 + 28 + 31;
				break;
			case 5: 
				nums = day + 31 + 28 + 31 + 30;
				break;
			case 6: 
				nums = day + 31 + 28 + 31 + 30 + 31;
				break;
			case 7: 
				nums = day + 31 + 28 + 31 + 30 + 31 + 30;
				break;
			case 8: 
				nums = day + 31 + 28 + 31 + 30 + 31 + 30 + 31;
				break;
			case 9: 
				nums = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 10: 
				nums = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 11: 
				nums = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			default:
				nums = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
		}

		return nums;
	}

	/*
	** Numero de intentos hasta general una fecha aleatoria igual que la fecha introducida (bucle do-while)
	*/
	public int numberAttempsDoWhile(){

		int day_ = 0;
		int month_ = 0;
		int attemps = 0;
		
		do{
			day_ = (int)((Math.random()*31)+1);
			month_ = (int)((Math.random()*12)+1);
			attemps = attemps +1;
		}while((day_ != this.day) && (month_ != this.month));
		
		return attemps;
	}
	/*
	** Numero de intentos hasta general una fecha aleatoria igual que la fecha introducida (bucle while)
	*/
	public int numberAttempsWhile(){

		int day2_ = 0;
		int month2_ = 0;
		int attemps2 = 0;

		while((day2_ != this.day) && (month2_ != this.month)){
			day2_ = (int)((Math.random()*31)+1);
			month2_ = (int)((Math.random()*12)+1);
			attemps2 = attemps2 + 1;
		}

		return attemps2;
	}

}