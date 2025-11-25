public class CriaturaEnemiga {

    // Atributos privados (Encapsulamiento)
    private String nombre;
    private int salud;
    private int ataqueBase;
    private TipoCriatura tipo;

    // Constructor
    public CriaturaEnemiga(String nombre, int salud, int ataqueBase, TipoCriatura tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataqueBase = ataqueBase;
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public int getSalud() { return salud; }
    public int getAtaqueBase() { return ataqueBase; }
    public TipoCriatura getTipo() { return tipo; }

    public void setSalud(int salud) { this.salud = salud; }

    // Comportamiento de la clase
    public int atacar() {
        System.out.println(">> " + nombre + " realiza un ataque con fuerza de " + ataqueBase);
        return ataqueBase;
    }

    @Override
    public String toString() {
        return "\n--- CRIATURA ENEMIGA ---" +
                "\nNombre: " + nombre +
                "\nSalud: " + salud +
                "\nAtaque Base: " + ataqueBase +
                "\n--- Tipo de Criatura ---" +
                "\nCategoría: " + tipo.getNombre() +
                "\nNivel de Amenaza: " + tipo.getNivelAmenaza() +
                "\nComportamiento: " + tipo.getDescripcionComportamiento();
    }
}