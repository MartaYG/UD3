/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3n;

/**
 *
 * @author marta
 */
public class UD3N {

    /**
     * @param numerador entero
     * @param denominador entero
     * @return
     */
    
    public static int division (int numerador, int denominador){
        int resultado=0;
        try{
        resultado=(numerador/denominador);
        
        }catch (Exception e){
            System.out.println("se ha producido un error: "+e.getMessage());
                    
        }
        return resultado;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("resultado de la operación: "+division(6,0));
                
    }
}
