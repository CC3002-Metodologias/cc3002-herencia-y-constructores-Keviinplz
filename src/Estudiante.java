public class Estudiante extends Persona{
    public Estudiante(String nombre, int edad, String ocupacion){
        super(nombre, edad, ocupacion);
    }

    public void comer(){
        System.out.println("Comiendo completito de gorbea...");
    }

    public void dormir(){
        System.out.println("ZzzZzz");
    }

    public String hacerLoSuyo(){
        String estudianteHacer = "Aquí viendo anime y series de Netflix de pana banana";
        String impresionTotal = super.hacerLoSuyo() + "\n" + "También hago \n" + estudianteHacer;
        return impresionTotal;
    }
}
