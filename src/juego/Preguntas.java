/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

/**
 *
 * @author Andres Felipe Martinez Henao - 2260121-2724
 */
public class Preguntas {
    private String pregunta; // Esta variable almacena el enunciado de la pregunta.
    private String[] opciones; // Este arreglo almacena las opciones de respuesta.
    private int respuesta; // Este entero almacena el índice de la respuesta correcta.

//Constructor de la clase Preguntas que recibe una pregunta, un arreglo de opciones y la respuesta correcta.
    public Preguntas(String pregunta, String[] opciones, int respuesta) { 
        this.pregunta = pregunta; //pregunta El enunciado de la pregunta.
        this.opciones = opciones; //opciones Un arreglo de Strings que contiene las opciones de respuesta.
        this.respuesta = respuesta; //Un entero que representa el índice de la respuesta correcta en el arreglo de opciones.
    }

    //Constructor vacío de la clase Preguntas.
    public Preguntas() {
        
    }
    
    //Método para obtener la pregunta.
    public String getPregunta() {
        return pregunta;
    }

    //Método para obtener las opciones de respuesta.
    public String[] getOpciones() {
        return opciones;
    }

    //Método para obtener la respuesta correcta.
    public int getRespuesta() {
        return respuesta;
    }
    
    

}
  
