/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08ejerciciosdematriz;

/**
 *
 * @author DieGo1
 */
public class Main {
 public static void main(String[] args) {
 int matriz[][]=new int [10][10];
 int dato=1;
     for (int[] matriz1 : matriz) {
         for (int j = 0; j < matriz1.length; j++) {
             matriz1[j] = dato;
             dato++;
         }
     }
 
 
     for (int[] matriz1 : matriz) {
         for (int j = 0; j < matriz1.length; j++) {
             System.out.print("\t" + matriz1[j]);
         }
         System.out.println("");
     }
//suma de filas 

 //Ahora procedemos a sumar las filas 
       for(int i=0;i<10;i++){
     int sumaFilas = 0;
            for(int j=0;j<10;j++){
                sumaFilas += matriz[i][j];
            }
            System.out.print("\nLa suma de la fila["+i+"] es: "+sumaFilas);
        }
        System.out.println("");
         //por ultimo sumamos las columnas
        for(int j=0;j<10;j++){
     int sumaCol = 0;
            for(int i=0;i<10;i++){
                sumaCol += matriz[i][j];
                
            }
            System.out.print("\nLa suma de la columna["+j+"] es: "+ sumaCol);
        }
        System.out.println("");
}
 }

