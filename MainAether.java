public class MainAether {
    public static void main(String[] args) {

        System.out.println("***** INICIANDO LEGENDS OF AETHER *****");

        // 1. Creación de Objetos Recolectables
        ObjetoRecolectable pocion = new ObjetoRecolectable("Poción de Salud", 0.5, RarezaObjeto.COMUN);
        ObjetoRecolectable espada = new ObjetoRecolectable("Espada de Fuego", 10.2, RarezaObjeto.EPICO);

        System.out.println(pocion);
        System.out.println(espada);

        // 2. Creación de Criaturas Enemigas
        CriaturaEnemiga goblin = new CriaturaEnemiga("Goblin Malvado", 30, 5, TipoCriatura.GOBLIN);
        CriaturaEnemiga dragon = new CriaturaEnemiga("Ignis, el Dragón", 250, 45, TipoCriatura.DRAGON_JOVEN);

        System.out.println(goblin);

        // 3. Creación del Personaje Jugador
        PersonajeJugador heroe = new PersonajeJugador("Aetherian", TipoPersonaje.CABALLERO);

        System.out.println(heroe);

        // 4. Creación e Integración con Nivel
        Nivel bosque = new Nivel("Bosque Prohibido", 3);
        bosque.agregarEnemigo(goblin);
        bosque.agregarObjeto(pocion);
        bosque.agregarObjeto(espada);

        bosque.describirZona();

        // 5. Demostración de Integración de Clases
        System.out.println("\n--- DEMOSTRACIÓN DE INTEGRACIÓN ---");

        // El Personaje se mueve
        heroe.mover("Norte");

        // El Personaje recolecta Objetos del Nivel
        heroe.recolectar(pocion);
        heroe.recolectar(espada);

        // El Personaje combate una Criatura
        heroe.combatir(goblin);

        System.out.println("\nInventario final de " + heroe.getNombre() + ": " + heroe.getInventario().size() + " objetos.");
    }
}