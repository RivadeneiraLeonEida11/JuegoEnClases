import java.util.ArrayList;
import java.util.List;

public class Nivel {

    // Atributos privados (Encapsulamiento)
    private String nombreZona;
    private int dificultad;
    private List<CriaturaEnemiga> enemigosZona; // Relación de integración: Nivel contiene Criaturas
    private List<ObjetoRecolectable> objetosZona; // Relación de integración: Nivel contiene Objetos

    // Constructor
    public Nivel(String nombreZona, int dificultad) {
        this.nombreZona = nombreZona;
        this.dificultad = dificultad;
        this.enemigosZona = new ArrayList<>();
        this.objetosZona = new ArrayList<>();
    }

    // Getters
    public String getNombreZona() { return nombreZona; }
    public int getDificultad() { return dificultad; }
    public List<CriaturaEnemiga> getEnemigosZona() { return enemigosZona; }
    public List<ObjetoRecolectable> getObjetosZona() { return objetosZona; }

    // Comportamientos de la clase
    public void agregarEnemigo(CriaturaEnemiga enemigo) {
        enemigosZona.add(enemigo);
    }

    public void agregarObjeto(ObjetoRecolectable objeto) {
        objetosZona.add(objeto);
    }

    public void describirZona() {
        System.out.println("\n🌍 Explorando el Nivel: **" + nombreZona + "**");
        System.out.println("Dificultad de la zona: " + dificultad);
        System.out.println("Enemigos presentes: " + enemigosZona.size());
        System.out.println("Objetos recolectables: " + objetosZona.size());
    }

    @Override
    public String toString() {
        return "\n--- DETALLE DEL NIVEL ---" +
                "\nZona: " + nombreZona +
                "\nDificultad: " + dificultad +
                "\nEnemigos: " + enemigosZona.size() +
                "\nObjetos: " + objetosZona.size();
    }
}