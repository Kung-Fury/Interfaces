package clasesCifoCom;

public class Empleados implements Saludos {
	private String nombre;
	private String dni;
	private double sueldo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public double setSueldoNeto() {
		double neto;
		neto = sueldo * getIrpf();
		return neto;	
	}
	
	private double getIrpf() {
		if (sueldo < 3000) 
			return 0.85;
		else
			return 0.75;	
	}
	
	public Empleados(String nombre, String dni, double sueldo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
	}
	@Override
	public String saludos() {
		String saludo = "Saludo de Empleados.";
		return saludo;
	}
}