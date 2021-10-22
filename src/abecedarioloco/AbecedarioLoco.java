/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abecedarioloco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AbecedarioLoco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
          
          String letra = sc.nextLine();
          int numero = sc.nextInt();
          
          ArrayList<String> abecedario = new ArrayList<String>();
          abecedario.add("A");
          abecedario.add("B");
          abecedario.add("C");
          abecedario.add("D");
          abecedario.add("E");
          abecedario.add("F");
          abecedario.add("G");
          abecedario.add("H");
          abecedario.add("I");
          abecedario.add("J");
          abecedario.add("K");
          abecedario.add("L");
          abecedario.add("M");
          abecedario.add("N");
          abecedario.add("O");
          abecedario.add("P");
          abecedario.add("Q");
          abecedario.add("R");
          abecedario.add("S");
          abecedario.add("T");
          abecedario.add("U");
          abecedario.add("V");
          abecedario.add("W");
          abecedario.add("X");
          abecedario.add("Y");
          abecedario.add("Z");
          
          //Buscamos la letra ingresada.
          int posicion = 0;
          for (int i = 0; i < abecedario.size(); i++) {
            
              if(letra.equals(abecedario.get(i))){
                  posicion = i;
              }
          }
         
          
          
        metodoRecursivo(numero, posicion,abecedario,1,0);
        //---  
        int posInicial = 2;
        int posFinal = (numero + numero) - 2;
        metodoRecursivoResta(numero, posicion,abecedario, posInicial, posFinal,0);
       
          
        
    }
    
    public static void metodoRecursivo(int numero, int posicion, ArrayList<String> abecedario, int ciclo, int pos){
        
        if(ciclo <= (numero)){
            for (int i = 1; i < numero + numero; i++) {
              
                 if(ciclo > 1){
                    
                     if(pos - (ciclo - 1) == i){
                         System.out.print(abecedario.get(posicion));
                     }
                     else if(pos + (ciclo - 1) == i){
                         System.out.print(abecedario.get(posicion));
                     }
                     else{
                         System.out.print(".");
                     }
                      
                 }
                 else{
                     if(i == (numero+numero)/2){
                        System.out.print(abecedario.get(posicion));
                        pos = i;
                    }
                    else{
                    System.out.print(".");
                    }
                 }
                    
          }
              System.out.println("");
        
        posicion++;
        ciclo++;
        metodoRecursivo(numero, posicion, abecedario, ciclo, pos);
    }
  
  } 
    
  public static void metodoRecursivoResta(int numero, int posicion, ArrayList<String> abecedario,int posInicial,int posFinal, int ciclo){
        
         if(ciclo <= (numero -2)){
             for (int i = 1; i < numero + numero; i++) {
             
             if(posInicial == i){
                System.out.print(abecedario.get(posicion + numero - 2 )); 
             }
             else if(posFinal == i){
                 System.out.print(abecedario.get(posicion + numero - 2 )); 
             }
             else{
                 System.out.print("."); 
             }
         }
            System.out.println("");
        
            ciclo++;
        
            posInicial++;
            posFinal--;
        
            posicion--;
       
            metodoRecursivoResta(numero, posicion, abecedario, posInicial, posFinal, ciclo);
         }
         
    }
  
}  
