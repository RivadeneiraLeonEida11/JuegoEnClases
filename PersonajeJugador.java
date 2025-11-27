import java.util.ArrayList;
import java.util.List;

public class PersonajeJugador {

    // Atributos privados (Encapsulamiento)
    private String nombre;
    private int nivel;
    private int salud;
    private TipoPersonaje tipo;
    private List<ObjetoRecolectable> inventario; // Relación de integración: Personaje tiene Objetos

    // Constructor
    public PersonajeJugador(String nombre, TipoPersonaje tipo) {
        this.nombre = nombre;
        this.nivel = 1; // Inicia en nivel 1
        this.salud = 100; // Inicia con 100 de salud
        this.tipo = tipo;
        this.inventario = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public int getSalud() { return salud; }
    public TipoPersonaje getTipo() { return tipo; }
    public List<ObjetoRecolectable> getInventario() { return inventario; }

    public void setSalud(int salud) { this.salud = salud; }

    // Comportamientos de la clase
    public void mover(String direccion) {
        System.out.println("\n" + nombre + " (" + tipo.getNombre() + ") se está moviendo hacia la dirección: " + direccion);
    }

    public void recolectar(ObjetoRecolectable objeto) {
        inventario.add(objeto);
        System.out.println(+ nombre + " ha recolectado: " + objeto.getNombre() + "!");
    }

    public void combatir(CriaturaEnemiga enemigo) {
        System.out.println("\n" + nombre + " se enfrenta a " + enemigo.getNombre() + "!");
        int danioRecibido = enemigo.atacar();
        this.salud -= danioRecibido;
        System.out.println("Salud actual de " + nombre + ": " + this.salud);
    }

    @Override
    public String toString() {
        return "\n*** PERSONAJE JUGADOR ***" +
                "\nNombre: " + nombre +
                "\nNivel: " + nivel +
                "\nSalud: " + salud +
                "\n--- Tipo de Personaje ---" +
                "\nClase: " + tipo.getNombre() +
                "\nRol de Combate: " + tipo.getRolCombate() +
                "\nDescripción: " + tipo.getDescripcionNarrativa() +
                "\nObjetos en Inventario: " + inventario.size();
    }

}
