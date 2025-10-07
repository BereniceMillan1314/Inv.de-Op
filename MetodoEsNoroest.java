/**
 Método de Transporte (Esquina Noroeste)


Las filas (horizontales) serán la demanda, mientras que la oferta serán las columnas (verticales). Estas se representan fuera de la matriz, y este es el único que se puede modificar. Al igual que se pueden agregar columnas y filas a como se desee siempre con una oferta o una demanda (nunca puede salir nada negativo). Al terminar el ejercicio no puede quedar ningún valor sin asignar.


Paso 1
En la celda superior izquierda se debe asignar la máxima cantidad de unidades posibles, cantidad que se ve restringida ya sea por las restricciones de oferta o de demanda. En este mismo paso se procede a ajustar la oferta y demanda de la fila y columna afectada, restándole la cantidad asignada a la celda.
Paso 2
En este paso se procede a eliminar la fila o destino cuya oferta o demanda sea 0 después del «Paso 1», si dado el caso ambas son cero arbitrariamente se elige cual eliminar y la restante se deja con demanda u oferta cero (0) según sea el caso.
Paso 3
Una vez en este paso existen dos posibilidades, la primera que quede un solo renglón o columna, si este es el caso se ha llegado al final el método, «detenerse».

 */

public class MetodoEsNoroest {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int [][] matriz = new int[10][10];
        int i=0;
        int j=0;
        int m=0;
        int n=0;
        int x=0;
        int y=0;
        do {
            System.out.println("1. Insertar fila");
            System.out.println("2. Insertar columna");
            System.out.println("3. Eliminar fila");
            System.out.println("4. Eliminar columna");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = Leer.nextInt();
            switch(opcion) {
            case 1:
                System.out.print("Ingrese la fila: ");
                i = Leer.nextInt();
                System.out.print("Ingrese la columna: ");
                j = Leer.nextInt();
                System.out.print("Ingrese la cantidad: ");
                x = Leer.nextInt();
                matriz[i][j]=x;
                break;
            case 2:
                System.out.print("Ingrese la columna: ");
                j = Leer.nextInt();
                System.out.print("Ingrese la cantidad: ");
                x = Leer.nextInt();
                matriz[i][j]=x;
                break;
            case 3:
                System.out.print("Ingrese la fila: ");
                i = Leer.nextInt();
                matriz[i][j]=0;
                break;
            case 4:
                System.out.print("Ingrese la columna: ");
                j = Leer.nextInt();
                matriz[i][j]=0;
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion invalida");
            }
        } while(opcion != 5);
        for(i=0;i<matriz.length;i++) {
            for(j=0;j<matriz[i].length;j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        Leer.close();
    }
    System.out.println("\n<table border='1'>");
for(i = 0; i < matriz.length; i++) {
    System.out.print("<tr>");
    for(j = 0; j < matriz[i].length; j++) {
        System.out.print("<td>" + matriz[i][j] + "</td>");
    }
    System.out.println("</tr>");
}
System.out.println("</table>");
}