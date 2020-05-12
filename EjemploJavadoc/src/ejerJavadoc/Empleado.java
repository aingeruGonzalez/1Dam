package ejerJavadoc;
/**
 * @version 
 * @author estibaliz
 *
 */
public class Empleado {
	private String nombre;
	private String apellido;
	private double salario; 
//Holaa
/**
 * 
 * @param nombre
 * @param apellido
 * @param salario
 */
public Empleado(String nombre, String apellido, double salario) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.salario = salario;
}
/**
 * @see Empleado
 * @param subida
 */
public void subirsalario (double subida) {
	salario=salario+subida;
}
/**
 * 
 * @return
 */
private boolean comprobar() {
	if (nombre.equals("")) {
		return false;
	}
	return true;
}
}