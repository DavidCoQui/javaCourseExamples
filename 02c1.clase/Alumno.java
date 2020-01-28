public class Alumno extends Persona
{
 String titulo;
 String curso;
 void setTitulo(String titulo)
 {
   this.titulo=titulo;

 }
 void setCurso(String curso)
 {
   this.curso=curso;
 	
 }
 String getInfo()
 {
        return super.getInfo()+
		"\nCURSO : " + curso + 
		"\nTITULO: " + titulo;

 }
}