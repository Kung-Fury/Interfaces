package clasesCifoCom;

public class Program {
	public static void main(String args[]) {
		Empleados empleado;
		empleado = new Empleados("Alex","DNI12345 ", 3000);
		System.out.println("CLASE EMPLEADO:");
		System.out.println("Nombre: " + empleado.getNombre());
		System.out.println("DNI: " + empleado.getDni());
		System.out.println("Sueldo: " + empleado.getSueldo());
		System.out.println("---------------------------------------");
		
		Administracion admin;
		admin = new Administracion("Maros","DNI12345 ", 4000);
		admin.setSeccion("TIC");
		System.out.println("CLASE ADMINISTRACION:");
		System.out.println("Nombre: " + admin.getNombre());
		System.out.println("DNI: " + admin.getDni());
		System.out.println("Sección: " + admin.getSeccion());
		System.out.println("Sueldo: " + admin.getSueldo());
		System.out.println("---------------------------------------");
		
		Gerente gerente;
		gerente = new Gerente("Alberto","DNI12345 ", 5000, "Desarrollo tecnología virtual", 300);
		System.out.println("CLASE GERENTE:");
		System.out.println("Nombre: " + gerente.getNombre());
		System.out.println("DNI: " + gerente.getDni());
		System.out.println("Departamento: " + gerente.getDepartamento());
		System.out.println("Sueldo neto con dietas: " + gerente.setSueldoNetoDietas());
		System.out.println("---------------------------------------");
		
		Direccion direccion;
		direccion = new Direccion("Jordi","DNI12345 ", 7000, 1000);
		System.out.println("CLASE DIRECCIÓN:");
		System.out.println("Nombre: " + direccion.getNombre());
		System.out.println("DNI: " + direccion.getDni());
		System.out.println("Sueldo neto con Stock Options: " + direccion.setSueldoNetoStocks());
		System.out.println("---------------------------------------");
		
		// Se muestran los saludos de los métodos previamente declarados en la interfaz.
		System.out.println(empleado.saludos());
		System.out.println(admin.saludos());
		System.out.println(gerente.saludos());
		System.out.println(direccion.saludos());
	}
}	