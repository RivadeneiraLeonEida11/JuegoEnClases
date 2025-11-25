public enum TipoPersonaje {

    CABALLERO("Caballero", "Defensa", "Un guerrero robusto con gran armadura, especializado en la defensa y el combate cuerpo a cuerpo."),
    MAGO("Mago", "Daño a Distancia", "Un hechicero que manipula las artes arcanas para lanzar poderosos hechizos desde lejos."),
    EXPLORADOR("Explorador", "Agilidad", "Rápido y sigiloso. Utiliza arcos y trampas, ideal para reconocimiento y daño rápido."),
    BERSERKER("Berserker", "Daño Cuerpo a Cuerpo", "Un luchador que entra en un frenesí de batalla, sacrificando defensa por una inmensa fuerza ofensiva.");

    private final String nombre;
    private final String rolCombate;
    private final String descripcionNarrativa;

    // Constructor privado para inicializar los campos
    TipoPersonaje(String nombre, String rolCombate, String descripcionNarrativa) {
        this.nombre = nombre;
        this.rolCombate = rolCombate;
        this.descripcionNarrativa = descripcionNarrativa;
    }

    // Métodos públicos para consultar la información
    public String getNombre() {
        return nombre;
    }

    public String getRolCombate() {
        return rolCombate;
    }

    public String getDescripcionNarrativa() {
        return descripcionNarrativa;
    }
}