package ec.edu.espoch.mvc.Modelo;

public class Operacion {
    private float numOne; 
    private float numTwo;

    public Operacion(float numOne, float numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
    }
        

    public float getNumOne() {
        return numOne;
    }

    public void setNumOne(float numOne) {
        this.numOne = numOne;
    }

    public float getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(float numTwo) {
        this.numTwo = numTwo;
    }
    
    
}
