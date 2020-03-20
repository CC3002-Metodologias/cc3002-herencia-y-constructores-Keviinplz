public class Academico extends Persona {
    protected String paper;
    public Academico(String nombre, int edad, String ocupacion, String paper){
        super(nombre, edad, ocupacion);
        this.paper = paper;
    }

    public void comer(){
        System.out.println("Ñom Ñom Comida de la Casa");
    }

    public void dormir(){
        System.out.println("ZzzZzzZ");
    }

    public String hacerLoSuyo(){
        String academicoHacer = "Aquí aprendiendo a usar Zoom de pana banana";
        String impresionTotal = super.hacerLoSuyo() + "\n" + "También hago \n" + academicoHacer;
        return impresionTotal;
    }

    public String getPaper(){
        return this.paper;
    }

    public void publicarPaper(){
        System.out.println("Publicando paper...");
        System.out.println("Paper: " + "'" + this.getPaper() + "'" + " publicado con éxito");
    }
}
