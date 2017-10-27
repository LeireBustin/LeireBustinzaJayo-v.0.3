package pojo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import interfaz.WeatherAble;

public class Tiempo implements WeatherAble {
	
	static final int CELSIUS = 1;
	static final int FARENHEIT = 2;
	static final int KELVIN = 3;
	
	private String localizacion;
	private int temperatura;
	private String descripcion;
	private char letraIcono;
	private String fecha;
	
	public Tiempo(String localizacion) {
		super();
		this.localizacion = localizacion;
		this.temperatura = 0;
		this.descripcion = "";
		this.letraIcono = this.getLetraIcono();
		this.fecha = this.getFecha();
	}
	
	
	public Tiempo(String localizacion, String descripcion) {
		super();
		this.localizacion = "";
		this.temperatura = 0;
		this.descripcion = "";
		this.letraIcono = this.getLetraIcono();
		this.fecha = this.getFecha();
	}
	
	
	
	public Tiempo(String localizacion, int temperatura, String descripcion) {
		super();
		this.localizacion = localizacion;
		this.temperatura = temperatura;
		this.descripcion = descripcion;
		this.letraIcono = this.getLetraIcono();
		this.fecha = this.getFecha();
	}


	public Tiempo(String localizacion, int temperatura, String descripcion, char letraIcono) {
		super();
		this.localizacion = localizacion;
		this.temperatura = temperatura;
		this.descripcion = descripcion;
		this.letraIcono = letraIcono;
		this.fecha = this.getFecha();
	}
	
	


	public int getTemperatura() {
		return temperatura;
	}



	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	@Override
	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	
	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public char getLetraIcono() {
		char letraIcono = 'F'; //claves
		if ("soleado".equalsIgnoreCase(this.descripcion)) {
			this.letraIcono = 'B';
		}else if ("lluvia".equalsIgnoreCase(this.descripcion)) {
			this.letraIcono = 'R';
		}else {
			this.letraIcono = 'M'; //rayas en otro caso
		}
		letraIcono = this.letraIcono;
		return letraIcono;
	}


	public void setLetraIcono(char letraIcono) {
		this.letraIcono = letraIcono;
	}

	
	public String getFecha() {
		final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		final String DIASSEMANA[] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
		String fechaTexto = fecha;		
		Date date = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		
		int anyo = gc.get(Calendar.YEAR);
		int mes = gc.get(Calendar.MONTH);
		int dia = gc.get(Calendar.DAY_OF_MONTH);
		int diassemana = (gc.get(Calendar.DAY_OF_WEEK)-1);
		
		fechaTexto = DIASSEMANA[diassemana] + " " + dia + " de " + MESES[mes] + " de " + anyo;
		//System.out.println("año/mes/dia: " + anyo + " / " + MESES[mes] + " / " + DIASSEMANA[diassemana]);
		fecha = fechaTexto;
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "Tiempo [localizacion=" + localizacion + ", fecha=" + fecha + ", temperatura=" + temperatura
				+ ", descripcion=" + descripcion + ", letraIcono=" + letraIcono + "]";
	}



	
	@Override
	public int getTemperatura(int unidad) {
		int u = unidad;
		int temp = this.temperatura;
		switch(u) {
		case CELSIUS:
			this.temperatura = temp;
			break;
		case FARENHEIT:
			/*
			this.temperatura = (int) (temp *1.8f);
			this.temperatura = this.temperatura + 32 ;
			*/
			this.temperatura = (int) ( temp *1.8f + 32 );
			break;
		case KELVIN:
			this.temperatura = temp + 273;
			break;
		default:
			//invalid temperature option, temp. given in celsius by default
			this.temperatura = temp;
			
		}
		return temperatura;
	}
	@Override
	public String getMes() {
		final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		String mes = "";
		Date date = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		int mesNum = gc.get(Calendar.MONTH);
		mes = MESES[mesNum];
		return mes;
	}
	@Override
	public int getDia() {
		int dia = 0;
		Date date = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		dia = gc.get(Calendar.DAY_OF_MONTH);
		return dia;
	}
	
	
	@Override
	public char getIconoTiempo() {
		char letraIcono = 'F'; //claves
		if ("soleado".equalsIgnoreCase(this.descripcion)) {
			this.letraIcono = 'B';
		}else if ("lluvia".equalsIgnoreCase(this.descripcion)) {
			this.letraIcono = 'R';
		}else if("nublado".equalsIgnoreCase(this.descripcion)){ 
			this.letraIcono = 'N';
		}else if("rayos".equalsIgnoreCase(this.descripcion)){ 
			this.letraIcono = '0';
		}else {
			this.letraIcono = 'M'; //rayas en otro caso
		}
		letraIcono = this.letraIcono;
		return letraIcono;
	}
	
	
	
	
	

	
}
