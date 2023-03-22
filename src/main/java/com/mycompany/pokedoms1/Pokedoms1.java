/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pokedoms1;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Pokedoms1 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> pokedoms = new ArrayList<String>();
        
        
        switch(args[1].toLowerCase()){
            case "add":
                if(args.length ==6){
                    Pokedom miPokedom = new Pokedom (args[2], args[3],Float.parseFloat(args[4]), Float.parseFloat(args[5]));
                    FileWriter archivo = new FileWriter(args[0]);
                    archivo.write("\n" + args[2] + " " + args[3] + " " + args[4] + " " + args[5]);
                    archivo.close();
                    

    
                }
                break;
            case "describe":
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

