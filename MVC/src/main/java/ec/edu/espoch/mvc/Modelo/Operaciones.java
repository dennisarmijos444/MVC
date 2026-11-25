package ec.edu.espoch.mvc.Modelo;

public class Operaciones implements InterfaceOperaciones {

    @Override
    public float sumar(Operacion operacion) {

        return operacion.getNumOne() + operacion.getNumTwo();
    }
}