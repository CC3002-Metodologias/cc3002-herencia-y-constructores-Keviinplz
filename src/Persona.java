public class Persona {
    protected String nombre;
    protected String ocupacion;
    protected int edad;

    public Persona(String nombre, int edad, String ocupacion){
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.edad = edad;

    }

    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {
        System.out.println("ZzzZzZzZ");
    }

    public String hacerLoSuyo() {
        return "Aquí en cuarentena de pana banana";
    }
}
