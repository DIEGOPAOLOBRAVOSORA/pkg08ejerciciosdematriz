/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08ejerciciosdematriz;

/**
 *
 * @author DieGo1
 */
public class problema1 {
 //EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO SUME LA DIAGONAL PRIMARIA Y SECUNDARIA   
//Alumno DIEGO BRAVO SORA PAOLO
public static void main(String[] args) {
 int matriz[][]=new int [10][10];
 int dato=1;
 for(int i=0; i<matriz. length; i++){
 for(int j=0; j<matriz[i]. length; j++){
 matriz[i][j]=dato;
 dato++;
 } 
 }
for(int i=0; i<matriz. length; i++){
 for(int j=0; j<matriz[i]. length; j++){
 System.out.print("\t"+matriz[i][j]);
 }
 System.out.println("");
}
int diagonalPrincipal[]=new int[matriz. length];
 int diagonalSecundaria[]=new int[matriz. length];
 for(int i=0; i<matriz. length; i++){
 for(int j=0; j<matriz[i]. length; j++){
 if(i==j){
 diagonalPrincipal[i]=matriz[i][j];
 }
 if( (i+j) == matriz. length-1){
 diagonalSecundaria[i]=matriz[i][j];
 }
 }
 }
int suma=0;
 System.out.println("\nEste es tu diagonal principal");
 for(int elemento:diagonalPrincipal){
 System.out. print("\t"+elemento);
 suma=suma+elemento;
 }
 System.out. print(" = "+suma);
 System.out. println("");
 suma=0;
 System.out. println("\nEste es tu diagonal secundaria");
 for(int elemento:diagonalSecundaria){
 System. out. print("\t"+elemento);
 suma=suma+elemento;
 }
 System.out. print(" = "+suma);
 System.out. println("");
 
}
}
