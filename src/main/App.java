package main;

import java.util.*;
import utils.StudentValidator;
import main.LogicaClasificacion;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        LogicaClasificacion ejercicio = new LogicaClasificacion();
        Queue<String> colaNombre = new LinkedList<>();
        String[] nombres = {"Ana,Luis,Pedro"};
        for(String nombre : nombres) {
            colaNombre.add(nombre);
        }
        System.out.println("Cola original: "+colaNombre);
        colaNombre = ejercicio.invertirColaNombres(colaNombre);
        System.out.println("Cola Invertida: "+colaNombre);
        

        Queue<Character> colaPalabra = new LinkedList<>();
        String palabra = "radar";
        for(Character letra: palabra.toCharArray()){
            colaPalabra.add(letra);
        }
        ejercicio.verificarPalindromoCola(colaPalabra);
    }
}
