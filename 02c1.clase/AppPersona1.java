public class AppPersona1
{
	public static void main(String args[])
	{
		int numeros[]=new int[10];
		numeros[0]=5;
		numeros[1]=8;
        numeros[2]=42;
        for(int i=0;i<10;i++)
        	System.out.println(numeros[i]);


		System.out.println(Persona.EDAD_MIN);
		//Persona.EDAD_MIN = -55;
		//persona1.edad = -44;

		Persona.setCIUDAD("Madrid");
		Alumno alumno1=new Alumno();
		alumno1.setNombre("Juan");
		alumno1.setEdad(33);
		alumno1.setTitulo("GITT");
		alumno1.setCurso("2ºA");


		Persona persona1 = new Persona("Luis", 22);
		Persona persona2 = new Persona("Manuel", 23);
		System.out.println(persona1.getInfo());
		System.out.println(persona2.getInfo());
		System.out.println(alumno1.getInfo());

	}
}