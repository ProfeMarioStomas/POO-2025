package calculos;

import java.util.ArrayList;

public class ParesImpares {
    private Integer pares;
    private Integer impares;

    public ParesImpares() {
        this.pares = 0;
        this.impares = 0;
    }

    public void agregarNumero(int numero) {
        if (numero % 2 == 0) {
            this.pares++;
        } else {
            this.impares++;
        }
    }

    public Integer cantidadPares() {
        return this.pares;
    }

    public Integer cantidadImPares() {
        return this.impares;
    }
}
