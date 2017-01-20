package ejemploarrays;

import javax.swing.JOptionPane;

public class Lista {

    //int[] dorsales = new int[5];
    String[] nombres = new String[11];
    //creando lista

    public int[] cargarArray(int[] dorsales) {
        for (int i = 0; i < dorsales.length; i++) {
            ///longitud variable del array por si hay que cambiarlo
            dorsales[i] = i + 3;
        }
        return dorsales;
    }

    //tambien con for each
       /* for (int numero : dorsales) {
     System.out.println(numero);
     }
     */
    public void visualizar(int[] dorsales) {
        /*System.out.println("DORSALES NOMBRES/n");
         for (int i = 0; i < dorsales.length; i++) 
         System.out.println(dorsales[i] + "---------> " + nombres[i]);
         */
        for (int numero : dorsales) {
            System.out.println(numero);
        }
        //ordenacion de los arrays mediante metodo directo
    }

    public int[] ordenar(int[] dorsales) {
        int aux;
        for (int i = 0; i < dorsales.length - 1; i++) {
            for (int j = i + 1; j < dorsales.length; j++) {
                if (dorsales[i] < dorsales[j]) {//ordena de mayor a menor
                    aux = dorsales[i];
                    dorsales[i] = dorsales[j];
                    dorsales[j] = aux;
                }
            }
        }
        return dorsales;
    }
}


/*public String pedirNombres() {
 String auxNombres;
 auxNombres = JOptionPane.showInputDialog("nombres :");
 return auxNombres;
 }
 */
