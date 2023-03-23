/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pokedoms1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author usuari
 */
public class PokedomsBD {
    ArrayList<Pokedom> listaPokedoms = new ArrayList<Pokedom>();
   
    public  Pokedom buscarPokedom(String nombre) {
        for (int i = 0; i < listaPokedoms.size(); i++) {
            if (listaPokedoms.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return listaPokedoms.get(i);
            }
        }
        return null;
    }  
    public String leerArchivo(String nombreFichero) throws FileNotFoundException, IOException{
        File file = new File(nombreFichero);
            if (file.exists()){
             FileReader reader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(reader);
             String line;
                while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" ");
                Pokedom newPokedom = new Pokedom(parts[0], parts[1], Float.parseFloat(parts[2]), Float.parseFloat(parts[3]));
                listaPokedoms.add(newPokedom);
            }
            }
            }       
}
