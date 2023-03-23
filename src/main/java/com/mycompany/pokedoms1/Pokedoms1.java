/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pokedoms1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Pokedoms1 {
    private static ArrayList<Pokedom> listaPokedoms = new ArrayList<Pokedom>();
    
    public static void main(String[] args) throws IOException 
        PokedomsBD db = new PokedomsBD(lista);
        listaPokedoms = new ArrayList<Pokedom>();
        switch(args[1].toLowerCase()){
            case "add":
                if(args.length ==6){
                    File file = new File(args[0]);
                    if (file.exists()){
                        if(db.buscarPokedom(args[2]) == null){
                            FileWriter archivo = new FileWriter(args[0], true);
                            archivo.write("\n" + args[2] + " " + args[3] + " " + args[4] + " " + args[5]);
                            archivo.close();
                            String line = null;
                            String[] parts = line.split(" ");
                            Pokedom miPokedom = new Pokedom(parts[0], parts[1], Float.parseFloat(parts[2]), Float.parseFloat(parts[3]));
                            listaPokedoms.add(miPokedom);
                        }else{
                            System.out.println("Este pokedom ya existe");
                        }
                    }
                }
                break;
            case "describe":
                if(args.length ==3){
                    if(db.buscarPokedom(args[2]) != null){
                            System.out.println("Nom: "+ db.buscarPokedom(args[2]).getNombre());
                            System.out.println("Familía: "+ db.buscarPokedom(args[2]).getFamilia());
                            System.out.println("Atac: "+db.buscarPokedom(args[2]).getAtaque());
                            System.out.println("Defensa: "+db.buscarPokedom(args[2]).getDefensa());
                       
                        
                    }else{
                        System.out.println("No existe ningun pokedom con ese nombre");
                    }
                }
             
                break;
            }
        /*String noms[] = new String[] {
                "Kandentium",
                "Demantima",
                "Eufrotructon",
                "Jokisuba"
        };

        String families[] = new String[] {
                "fuego",
                "tierra",
                "aire",
                "agua"
        };

        float atacs[] = new float[] { 7.4f, 7.5f, 0.6f, 7 };

        float defenses[] = new float[] { 2.6f, 2.5f, 9.4f, 3 };

        Pokedom lista[] = new Pokedom[noms.length];
        for (int i = 0; i < noms.length; i++) {
            lista[i] = new Pokedom(noms[i], families[i], atacs[i], defenses[i]);
        }
        
        PokedomsBD db = new PokedomsBD(lista);
        Pokedom pokedomDemanat=db.describe(args[0]);
        if (pokedomDemanat!=null) {
            System.out.println("Nom: "+pokedomDemanat.getNombre());
            System.out.println("Familía: "+pokedomDemanat.getFamilia());
            System.out.println("Atac: "+pokedomDemanat.getAtaque());
            System.out.println("Defensa: "+pokedomDemanat.getDefensa());
        } else {
            System.out.println("No conec aquest Pokedom.");
        }*/
    }
    }

