public enum TipoCriatura {

    GOBLIN("Goblin", "Baja", "Criaturas pequeñas y numerosas. Atacan en grupos y son fáciles de derrotar individualmente."),
    TROLL("Troll", "Media", "Grandes y lentos, pero extremadamente resistentes. Requieren un enfoque estratégico para ser derribados."),
    DRAGON_JOVEN("Dragón Joven", "Alta", "Una bestia voladora capaz de arrojar fuego. Un desafío serio que requiere gran preparación."),
    ESPECTRO("Espectro", "Media", "Un ser incorpóreo que ataca desde las sombras. Resistente al daño físico.");

    private final String nombre;
    private final String nivelAmenaza;
    private final String descripcionComportamiento;

    TipoCriatura(String nombre, String nivelAmenaza, String descripcionComportamiento) {
        this.nombre = nombre;
        this.nivelAmenaza = nivelAmenaza;
        this.descripcionComportamiento = descripcionComportamiento;
    }

    // Métodos públicos para consultar la información
    public String getNombre() {
        return nombre;
    }

    public String getNivelAmenaza() {
        return nivelAmenaza;
    }

    public String getDescripcionComportamiento() {
        return descripcionComportamiento;
    }
}