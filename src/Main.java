public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Jorge Alis", 53, "Comediante");
        Estudiante kevin = new Estudiante("Kevin Pinochet", 21, "Estudiante de DCC");
        Academico jorge = new Academico("Jorge Perez", 35, "Profesor de DCC", "New Arch of Neural Network that find Coronavirus vacunne");

        System.out.println("¿Qué comen ustedes?");
        persona.comer();
        kevin.comer();
        jorge.comer();
        System.out.println("");
        System.out.println("¿Cuanto duermen ustedes?");
        persona.dormir();
        kevin.dormir();
        jorge.dormir();
        System.out.println("");
        System.out.println("¿Que están haciendo ustedes?");
        String personaHace = persona.hacerLoSuyo();
        String kevinHace = kevin.hacerLoSuyo();
        String jorgeHace = jorge.hacerLoSuyo();
        System.out.println("Persona responde: \n" + personaHace + "\n");
        System.out.println("Kevin responde: \n" + kevinHace + "\n");
        System.out.println("Jorge responde: \n" + jorgeHace + "\n");
        System.out.println("");
        System.out.println("Académico, publique su paper por favor");
        jorge.publicarPaper();
    }
}
