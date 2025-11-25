public enum RarezaObjeto {

    COMUN("Común", 0.70, "Objetos que se encuentran con frecuencia. Su valor es bajo, pero útil para crafteo básico."),
    RARO("Raro", 0.20, "Objetos valiosos con propiedades únicas. Su obtención es poco común, pero son clave para el progreso."),
    EPICO("Épico", 0.08, "Artefactos muy codiciados y poderosos. Solo se encuentran en zonas de alto riesgo o misiones especiales."),
    LEGENDARIO("Legendario", 0.02, "Los objetos más escasos y poderosos del juego. Cambian drásticamente el estilo de juego de quien los posee.");

    private final String nombre;
    private final double probabilidadObtencion;
    private final String descripcionValor;

    RarezaObjeto(String nombre, double probabilidadObtencion, String descripcionValor) {
        this.nombre = nombre;
        this.probabilidadObtencion = probabilidadObtencion;
        this.descripcionValor = descripcionValor;
    }

    // Métodos públicos para consultar la información
    public String getNombre() {
        return nombre;
    }

    public double getProbabilidadObtencion() {
        return probabilidadObtencion;
    }

    public String getDescripcionValor() {
        return descripcionValor;
    }
}