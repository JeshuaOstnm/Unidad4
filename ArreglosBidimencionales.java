/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos.bidimencionales;

/**
 *
 * @author hola
 */
public class ArreglosBidimencionales {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    char[][] letras = new char [3][5];
       
        char letra = 'a';
        
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){  
                letras[3][5] = letra;
                letra++;
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){  
                System.out.println(letras[i][j] + " ");
            }
            System.out.println();
        }
        
        }
    }
