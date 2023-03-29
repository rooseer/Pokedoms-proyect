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
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author roser roman
 */
public class PokedomsBD {
    public ArrayList<Pokedom> listaPokedoms = new ArrayList<Pokedom>();
   
    public  Pokedom buscarPokedom(String nombre) {
        for (int i = 0; i < listaPokedoms.size(); i++) {
            if (listaPokedoms.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return listaPokedoms.get(i);
            }
        }
        return null;
    }
    public void describePokedom(String nombre){
        if(buscarPokedom(nombre) != null){
            System.out.println("Nom: "+ buscarPokedom(nombre).getNombre());
            System.out.println("Familía: "+ buscarPokedom(nombre).getFamilia());
            System.out.println("Atac: "+buscarPokedom(nombre).getAtaque());
            System.out.println("Defensa: "+buscarPokedom(nombre).getDefensa());
            }else{
                System.out.println("No existe ningun pokedom con ese nombre");
                }

    }
  
    public void leerArchivo(String nombreFichero) throws FileNotFoundException, IOException{
        File file = new File(nombreFichero);
            if (file.exists()){
             FileReader reader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(reader);
             String line;
                while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" ");
                if(parts.length == 4){
                    Pokedom newPokedom = new Pokedom(parts[0], parts[1], Float.parseFloat(parts[2]), Float.parseFloat(parts[3]));
                    listaPokedoms.add(newPokedom);
                }
                }
            }else{
                System.out.println("El fichero indicado no existe");
            }
            }    
    public void anadirPokedomNuevo(String nombreFichero, String nombrePokedom, String familia , float ataque , float defensa) throws IOException{
        if (buscarPokedom(nombrePokedom) == null){
            FileWriter archivo = new FileWriter(nombreFichero, true);
            archivo.write( nombrePokedom + " " + familia + " " + ataque + " " + defensa + "\n" );
            archivo.close();
            Pokedom miPokedom = new Pokedom(nombrePokedom, familia, ataque, defensa);
            listaPokedoms.add(miPokedom);
            System.out.println("Pokedom añadido");
        }else{
            System.out.println("Ya existe un pokedom con ese nombre");
        }
    }
    
}
