/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego;

import java.util.Random; // Importa la clase Random para generar números aleatorios.
import java.util.HashSet; // Importa HashSet para almacenar preguntas seleccionadas de manera única.
import java.util.Set; // Importa Set para trabajar con conjuntos.
import javax.swing.JOptionPane; // Importa la clase JOptionPane para mostrar ventanas de diálogo.


/**
 *
 * @author Andres Felipe Martinez Henao - 2260121-2724
 */
public class Juego {

    public static void main(String[] args) {
        //Logica usuario ingrese nombre para avanzar
        String nombre = null; // Variable para almacenar el nombre del jugador.
        boolean nombreIngresado = false; // Para verificar si se ha ingresado un nombre.
        while (!nombreIngresado){
            nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre"); // Solicita al jugador que ingrese su nombre.
            
            if (nombre != null && !nombre.isEmpty()){
                nombreIngresado = true; // Si se proporciona un nombre válido, se establece la verificacion en verdadero.
            }else if (nombre == null){
                // Si el jugador cancela, se muestra un mensaje de agradecimiento y se sale del juego.
                JOptionPane.showMessageDialog(null, "        Gracias por jugar");
                System.exit(0); // Termina la ejecución del programa.
                
            }
            else{
                // Si no se ingresa un nombre, se muestra un mensaje de error.
                JOptionPane.showMessageDialog(null, "Debes ingresar un nombre para avanzar");
            }
        }
       
        //Preguntas con sus opciones y respuesta
        Preguntas  pregunta[] = new Preguntas[30]; // Arreglo de preguntas.
        // Se crean instancias de Preguntas y se llenan con preguntas, opciones y respuestas.
        pregunta[0] = new Preguntas("¿Cuál es la capital de Francia?", 
                new String[]{"Roma", "Madrid", "París", "Londres"}, 2);
        pregunta[1] = new Preguntas("¿En que año se fundo Google?", 
                new String[]{"1998", "2000", "1997", "2002"}, 0);
        pregunta[2] = new Preguntas("¿Que equipo es considerado el REY DE EUROPA?", 
                new String[]{"Fc Barcelona", "Milan", "Real Madrid", "Bayern Múnich"}, 2);
        pregunta[3] = new Preguntas("¿Cuál es la capital de Colombia?", 
                new String[]{"Cali", "Medellin", "Bogota", "Barranquilla"}, 2);
        pregunta[4] = new Preguntas("¿Cual es el rio mas largo del mundo?", 
                new String[]{"Nilo", "Amazonas", "Tajo", "Misisipi"}, 0);
        pregunta[5] = new Preguntas("¿En que liga juega el Manchester City?", 
                new String[]{"La Liga", "Premier League", "Liga Betplay", "Ligue 1"}, 1);
        pregunta[6] = new Preguntas("¿En que año se estreno GTA San Andreas?", 
                new String[]{"2004", "2000", "2005", "2003"}, 0);
        pregunta[7] = new Preguntas("¿En que año murio el DJ Avicii?", 
                new String[]{"2019", "2016", "2020", "2018"}, 3);
        pregunta[8] = new Preguntas("¿Quien pinto la Mona Lisa?", 
                new String[]{"Leonardo Dicaprio", "Leonardo Favio", "Leonardo da Vinci", "Vincent van Gogh"}, 2);
        pregunta[9] = new Preguntas("¿En que año llego el hombre a la luna?", 
                new String[]{"1945", "1969", "1968", "1970"}, 1);
        pregunta[10] = new Preguntas("¿Quien pinto la GUERNICA?", 
                new String[]{"Platon", "Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso"}, 3);
        pregunta[11] = new Preguntas("¿Quien gano el mundial 2022?", 
                new String[]{"Argentina", "Francia", "Portugal", "Brasil"}, 0);
        pregunta[12] = new Preguntas("¿Cuantos balones de oro tiene Messi?", 
                new String[]{"5", "3", "7", "8"}, 2);
        pregunta[13] = new Preguntas("¿Quien escribio el libro NADA?", 
                new String[]{"Jane Teller", "Gabriel Garcia Marquez", "Edgar Allan Poe", "Jane Austen"}, 0);
        pregunta[14] = new Preguntas("¿Que gas de la atmosfera nos protege de la radiacion ultravioleta?", 
                new String[]{"Atmosfera", "Ozono", "Oxigeno", "Nitrogeno"}, 1);
        pregunta[15] = new Preguntas("¿Qué famoso científico formuló la teoría de la relatividad?", 
                new String[]{"Isaac Newton", "Robert Oppenheimer", "Albert Einstein", "Marie Curie"}, 2);
        pregunta[16] = new Preguntas("¿Cuál es el planeta más cercano al Sol?", 
                new String[]{"Marte", "Venus", "Tierra", "Mercurio"}, 3);
        pregunta[17] = new Preguntas("¿En que año inicio y finalizo la Segunda Guerra Mundial?", 
                new String[]{"1935-1945", "1940-1945", "1939-1945", "1942-1945"}, 2);
        pregunta[18] = new Preguntas("¿Cuantos lados tiene un heptadecagono?", 
                new String[]{"12", "18", "15", "17"}, 3);
        pregunta[19] = new Preguntas("¿Cual es el pais mas grande?", 
                new String[]{"China", "Indonesia", "Australia", "Rusia"}, 3);
        pregunta[20] = new Preguntas("¿Quien era el vocalista de QUEEN?", 
                new String[]{"Brian May", "Freddie Mercury", "John Lennon", "Federico Mercurio"}, 1);
        pregunta[21] = new Preguntas("¿A que grupo de animales pertenecen las ranas?", 
                new String[]{"Anfibios", "Reptiles", "Aves", "Mamiferos"}, 0);
        pregunta[22] = new Preguntas("¿Cuantos dientes tiene un humano adulto?", 
                new String[]{"33", "34", "30", "32"}, 3);
        pregunta[23] = new Preguntas("¿Cuantos elementos forman la tabla periodica?", 
                new String[]{"120", "118", "110", "119"}, 1);
        pregunta[24] = new Preguntas("¿Como se llamaba el vocalista de Nirvana?", 
                new String[]{"Kurt Cobain", "Brian Johnson", "Axl Rose", "John Lennon"}, 0);
        pregunta[25] = new Preguntas("¿Cual de estos dioses no tiene un planeta a su nombre en el sistema solar?", 
                new String[]{"Apolo", "Cronos", "Afrodita", "Ares"}, 0);
        pregunta[26] = new Preguntas("¿A que saga pertenece el personaje Katniss Everdeen?", 
                new String[]{"Harry Potter", "Los juegos del hambre", "Star Wars", "Crepusculo"}, 1);
        pregunta[27] = new Preguntas("¿Como se llama el lobo de Jon Snow?", 
                new String[]{"Rey de la noche", "Lannister", "Fantasma", "Drogon"}, 2);
        pregunta[28] = new Preguntas("¿En que equipo juega actualmente Leo Messi?", 
                new String[]{"Fc Barcelona", "Inter de Milan", "Inter de Miami", "Retirado"}, 2);
        pregunta[29] = new Preguntas("¿En que año se produjo la caida del muro de berlin?", 
                new String[]{"1945", "1990", "1889", "1989"}, 3);
        
        //Logica para obtener preguntas aleatorias
        Set<Preguntas> preguntaSelecc = selecPreguntaAleatoria (pregunta, 15);  // Selecciona 15 preguntas aleatorias.
        Preguntas[] preguntaAleatoria = preguntaSelecc.toArray(new Preguntas[0]); // Convierte el conjunto en un arreglo.
        shuffleArray(preguntaAleatoria); // Mezcla las preguntas aleatorias.
        
        int puntaje = 0; // Inicializa el puntaje del jugador
        boolean juegoFin = false; //Para indicar si el juego ha terminado.
        
        for (int i = 0; i < preguntaAleatoria.length && !juegoFin; i++){
            Preguntas preguntaActual = preguntaAleatoria[i]; // Obtiene la pregunta actual desde el arreglo de preguntas aleatorias.
            String[] opciones = preguntaActual.getOpciones(); //Obtiene las opciones de respuesta de la pregunta actual
            int respuesta = preguntaActual.getRespuesta(); //Obtiene las respuestas correcats de las pregunta
            boolean respuestaValida = false; //Para verificar que la respuesta es correcta
            
            // Este bucle se ejecuta hasta que la respuesta del usuario sea válida.
            while(!respuestaValida){
                
                String respuestaUsuario = JOptionPane.showInputDialog("Pregunta " + (i + 1) + ":\n\n"+
                        preguntaActual.getPregunta() + "\n" + // Mostrar las opciones de respuesta al usuario (A, B, C, D).
                        "A. " + opciones[0] + "\n" +
                        "B. " + opciones[1] + "\n" +
                        "C. " + opciones[2] + "\n" +
                        "D. " + opciones[3] + "\n\n");

                if (respuestaUsuario == null){
                    // Si el jugador cancela, se muestra un mensaje de agradecimiento y se sale del juego.
                    JOptionPane.showMessageDialog(null, "    Gracias por jugar " + nombre);
                    System.exit(0); // Termina la ejecución del programa.
                }
                //Verifica que la respuesta sea correcta para mostrar los mensajes ya sea de correcto o incorrecto
                if (respuestaUsuario.length() == 1){
                    respuestaUsuario = respuestaUsuario.toUpperCase(); // Convierte la respuesta del usuario a mayúsculas.
                    int respuestaUsuarioIndex = respuestaUsuario.charAt(0) - 'A'; // Calcula el índice de la respuesta ingresada por el usuario.
                    // Comprueba si el índice de la respuesta ingresada por el usuario coincide con la respuesta correcta.
                    if (respuestaUsuarioIndex == respuesta){
                        JOptionPane.showMessageDialog(null,"Respuesta correcta, sumas 100!"); // Mensaje de respuesta correcta.
                        puntaje += 100; // Aumenta el puntaje del jugador.
                        //Muestra puntaje actual
                        JOptionPane.showMessageDialog(null, "       Puntaje actual: " + puntaje);
                    }
                    
                    else{
                        // Mensaje de respuesta incorrecta.
                        JOptionPane.showMessageDialog(null,"Respuesta incorrecta, la correcta era: " + opciones[respuesta]);
                        juegoFin = true; // El juego termina si la respuesta es incorrecta.

                    }
                    respuestaValida = true; //Sale del bucle cuando es verdadera
                } else{
                    // Mensaje de error si la entrada no es válida.
                    JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
                }
                
            }

        }
        if (juegoFin){
                // Mensaje de despedida si el juego termina al fallar una respuesta.
                JOptionPane.showMessageDialog(null,"Gracias por participar " +nombre+ " tu puntaje fue " +puntaje);
        }
        else{
                // Mensaje de felicitación si el jugador responde correctamente todas las preguntas.
                JOptionPane.showMessageDialog(null, "Felicidades " + nombre + "! " + "Acertaste todo, tu puntaje fue: " + puntaje);
        }
    
    }
    /**
    * Logica preguntas aleatorias
    * Método que selecciona un conjunto de preguntas aleatorias de un arreglo de preguntas.
    * pregunta Arreglo de preguntas del que se seleccionarán preguntas aleatorias.
    * cantidad La cantidad de preguntas aleatorias que se desea seleccionar.
    * Un conjunto de preguntas seleccionadas de manera única.
    */
    private static Set<Preguntas> selecPreguntaAleatoria(Preguntas[] pregunta, int cantidad){
        Random random = new Random(); // Crea una instancia de la clase Random para generar números aleatorios.
        Set<Preguntas> preguntaSelecc = new HashSet<>(); // Crea un conjunto para almacenar preguntas seleccionadas de manera única.
        // Este bucle se ejecuta mientras el conjunto de preguntas seleccionadas sea menor que la cantidad deseada.
        while (preguntaSelecc.size() < cantidad){
            int aleatorio = random.nextInt(pregunta.length); // Genera un número aleatorio entre 0 y la longitud del arreglo de preguntas.
            preguntaSelecc.add(pregunta[aleatorio]); // Agrega preguntas aleatorias al conjunto.
            
        }
        return preguntaSelecc; // Devuelve el conjunto de preguntas seleccionadas de manera única.
    }
    
    /**
    * Método que mezcla aleatoriamente un arreglo de preguntas.
    * El arreglo de preguntas que se desea mezclar.
    */
    private static void shuffleArray(Preguntas[] array){
        Random random = new Random(); // Crea una instancia de la clase Random para generar números aleatorios.
        // Este ciclo se ejecuta en reversa desde el último elemento del arreglo hasta el segundo.
        for (int i = array.length - 1; i > 0; i--){
            int indice = random.nextInt(i + 1); // Genera un índice aleatorio dentro del rango de índices del arreglo.
            Preguntas temp = array[indice]; // Guarda temporalmente la pregunta en la posición aleatoria.
            array[indice] = array[i]; // Reemplaza la pregunta en la posición aleatoria con la pregunta en la posición actual.
            array[i] = temp; // Mezcla el arreglo de preguntas aleatoriamente.
        }
    }
}
