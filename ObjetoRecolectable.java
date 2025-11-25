public class ObjetoRecolectable {

    // Atributos privados (Encapsulamiento)
    private String nombre;
    private double peso;
    private RarezaObjeto rareza;

    // Constructor
    public ObjetoRecolectable(String nombre, double peso, RarezaObjeto rareza) {
        this.nombre = nombre;
        this.peso = peso;
        this.rareza = rareza;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public RarezaObjeto getRareza() {
        return rareza;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Comportamiento de la clase
    public void usarObjeto() {
        System.out.println("-> El objeto " + nombre + " ha sido utilizado. ¡Efecto aplicado!");
    }

    @Override
    public String toString() {
        return "\n--- OBJETO RECOLECTABLE ---" +
                "\nNombre: " + nombre +
                "\nPeso: " + peso + " kg" +
                "\n--- Rareza ---" +
                "\nTipo de Rareza: " + rareza.getNombre() +
                "\nValor en el Juego: " + rareza.getDescripcionValor();
    }
}