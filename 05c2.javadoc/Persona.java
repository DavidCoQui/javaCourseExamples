/*
 Esta clase define el comportamiento de objetos Persona
*/

public class Persona
{
	final static int EDAD_MIN = 0;
	final static int EDAD_MAX = 130;
	final static int MAYORIA_DE_EDAD = 18;

	//Atributos de Clase
	static String CIUDAD;

	//atributos
	/** Nombre de la persona */
	String nombre;
	/** Edad de la persona en el momento de la creaci�n */
	int edad;

	//Constructores

	/*Persona()
	{

	}*/


	Persona(String nombre)
	{
		this.setNombre(nombre);
	}

	Persona(int edad, String nombre)
	{
		this(nombre, edad);
	}

	Persona(String nombre, int edad)
	{
		//this.nombre = nombre;
		//this.edad = edad;
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	//M�todos de clase

	static String getCIUDAD()
	{
		return CIUDAD;
	}


	static void setCIUDAD(String _CIUDAD)
	{
		CIUDAD = _CIUDAD;
	}


	//m�todos
	String getNombre()
	{
		return nombre;
	}

	int getEdad()
	{
		return edad;
	}

	void setNombre(String nombre)
	{
		this.nombre = nombre.toUpperCase();
	}

	void setEdad(int edad) //en un futuro este m�todo deber� lanzar un error en la validaci�n
	{
		if(edad >=EDAD_MIN && edad < EDAD_MAX)
			this.edad = edad;
	}

	boolean isMayorEdad()
	{
		return (edad >= MAYORIA_DE_EDAD);
	}

	//Este m�todo no forma parte del interfaz. Se invoca de una forma interna.
	String formatHTML(float f)
	{
		return this.formatHTML(""+f);
		//En un futuro: return this.formatHTML(String.valueOf(f));
	}

	//Este m�todo no forma parte del interfaz. Se invoca de una forma interna.
	String formatHTML(int i)
	{
		return this.formatHTML(""+i);
		//En un futuro: return this.formatHTML(String.valueOf(i));
	}

	//Este m�todo no forma parte del interfaz. Se invoca de una forma interna.
	String formatHTML(String s)
	{
		return "<b><u>" + s + "</u></b>";
	}

	String getInfoHTML()
	{
		return "<br/>===========" +
			   "<br/>Nombre: " + this.formatHTML(nombre) + 
			   "<br/>Edad: " + this.formatHTML(edad);
	}

	/** M�todo equiivalente a toString() */
	String getInfo()
	{
		return "\n===========" + 
		"\nNombre: " + nombre +
		"\nEdad: " + edad + 
		"\nCIUDAD: " + CIUDAD;
	}
}