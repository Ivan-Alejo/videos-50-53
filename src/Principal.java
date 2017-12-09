public class Principal {
    public static void main(String[] args) {
        OrdenamientoBurbuja ordenar = new OrdenamientoBurbuja();
        int vector1[] = {5, 6, 3, 44, 22, 1};
        int vector2[] = {55, 4, 43, 44, 2, 10,-9};

        /*System.out.println("Arreglo original");
        ordenar.mostrarArreglo(vector1);
        System.out.println("Arreglo ordenado con burbuja 1");
        ordenar.burbuja1(vector1);
        ordenar.mostrarArreglo(vector1);

        System.out.println();

        System.out.println("Arreglo original");
        ordenar.mostrarArreglo(vector2);
        System.out.println("Arreglo ordenado con burbuja 2");
        ordenar.burbuja1(vector2);
        ordenar.mostrarArreglo(vector2);*/

      /*  System.out.println("Arreglo orginal");
        ordenar.mostrarArreglos(vector2);
        ordenar.radix(vector2);*/

     /* ordenar.mostrarArreglos(vector2);
      int inice=ordenar.busquedaSecuencial(vector2,-9);
      if (inice!=-1){
          System.out.println("elemento encontrado -9 en el indice "+inice);

      }
      else {System.out.println("elemento no encontrado");}
*/

     ordenar.mostrarArreglos(vector2);
     ordenar.mezclanatural(vector2);
     ordenar.mostrarArreglos(vector2);
        int inice=ordenar.busquedaBinaria(vector2,5);
        if (inice!=-1){
            System.out.println("elemento encontrado -9 en el indice "+inice);

        }
        else {System.out.println("elemento no encontrado");}
    }
}
