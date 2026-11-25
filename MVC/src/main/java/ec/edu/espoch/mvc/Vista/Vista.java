package ec.edu.espoch.mvc.Vista;

import ec.edu.espoch.mvc.Controlador.Controladoroperaciones;

public class Vista {
    
    Controladoroperaciones controlador = new Controladoroperaciones();
    
    public String getnumOne (){
     return "a";    
    }
     public String getnumTwo ( ){
     return "h";    
    }
    
    public void mostrar (float respuesta){
        
        System.out.println("La respuesta es: "+respuesta);
    }
        
    public void mostrarError (){
        System.out.println("Error..." );    
        
    }   
    public void enviar (){
         controlador.controlaroperaciones();
    }
        
    }

