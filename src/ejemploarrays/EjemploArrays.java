
package ejemploarrays;


public class EjemploArrays {

   
    public static void main(String[] args) {
        //voy a crear una array de lista de numeros enteros
        int[]numeros = new int[5];
        //int[]numeros={1,2,3,4,5};
        Lista obxLista = new Lista();
        numeros = obxLista.cargarArray(numeros);
        obxLista.visualizar(numeros);
        //obxLista.cargarArray();
        //obxLista.visualizar(); 
        
        
        
    }
    
}
