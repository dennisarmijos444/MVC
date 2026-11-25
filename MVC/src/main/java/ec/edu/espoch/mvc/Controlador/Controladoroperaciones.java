package ec.edu.espoch.mvc.Controlador;

import ec.edu.espoch.mvc.Modelo.InterfaceOperaciones;
import ec.edu.espoch.mvc.Modelo.Operacion;
import ec.edu.espoch.mvc.Modelo.Operaciones;
import ec.edu.espoch.mvc.Vista.Vista;

public class Controladoroperaciones {
    
   public void controlaroperaciones (){
        Vista vista = new Vista();
       try {
           
           
           float numOne = Float.parseFloat(vista.getnumOne());
           float numTwo = Float.parseFloat(vista.getnumOne());
           Operacion operacion = new Operacion(5, 6);
           InterfaceOperaciones InterfaceOperacion = new Operaciones();
           float respuesta= InterfaceOperacion.sumar (operacion);
           
           vista.mostrar(respuesta);
           
       } catch (Exception e) {
           vista.mostrarError();
   }
   } 
}
