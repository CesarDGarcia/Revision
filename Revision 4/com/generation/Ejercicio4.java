/*Agregamos una carpeta llamada com > generation > Creamos el archivo Ejercicio4.class y metimos el archivo Ejercicio4.java */
package com.generation;

import java.util.Scanner; // importamos el Scanner ya que se usa pero no se utiliza

public class Ejercicio4{ //Cambiamos el nombre de Codigo4 a Ejercicio4 ya que se tiene que llamar igual que la clase 
      public static void main(String[] args) { // Agregamos el public static void main(String[] args)
        
      
        Scanner s = new Scanner(System.in);
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();
        
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine();
        // quitamos una linea de scanner para el jugador 2 ya que no era necesaria
        if (j1.equals(j2)) {
          System.out.println("Empate");
        } else {
          int g = 2;
          switch(j1) {
            case "piedra":
              if (j2.equals("tijeras")) {
                g = 1;
              }
            break;
            case "papel":
              if (j2.equals("piedra")) {
                g = 1;
              }
            break;
            case "tijera":
              if (j2.equals("papel")) {
                g = 1;
              }
              break;
            default:
          }
          System.out.println("Gana el jugador " + g);
        }
        s.close(); // Cerramos el scanner
      }
    } // Faltaba cerrar el corchete