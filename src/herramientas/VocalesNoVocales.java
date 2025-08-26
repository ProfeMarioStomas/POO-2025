package herramientas;

public class VocalesNoVocales {
    private Integer ContadorVocales;
    private Integer ContadorNoVocales;

    public VocalesNoVocales() {
        this.ContadorVocales = 0;
        this.ContadorNoVocales = 0;
    }

    public void agregarCaracter(String caracter) {
        /* No podemos comparar "objetos" con variables. En el caso de los String, tenemos que comparar con
         *  String.equals(valor).
         * La operación "O" (Ejemplo: A o E) se escribe con 2 símbolos 'pipe' ||
         * La operación "Y" (Ejemplo: A y E) se escribe con 2 símbolos 'ampersand' && */
        if (caracter.equals("a")
            || caracter.equals("e")
            || caracter.equals("i")
            || caracter.equals("o")
            || caracter.equals("u")
        ){
            this.ContadorVocales++;
        } else {
            this.ContadorNoVocales++;
        }
    }

    public Integer obtenerContadorVocales() {
        return this.ContadorVocales;
    }

    public Integer obtenerContadorNoVocales() {
        return this.ContadorNoVocales;
    }
}
