/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pokedoms1;
import java.io.IOException;

/**
 *
 * @author roser roman
 */
public class Pokedoms1 {
    public static void main(String[] args) throws IOException {
        PokedomsBD pokedom = new PokedomsBD();
        pokedom.leerArchivo(args[0]);
        switch(args[1].toLowerCase()){
            case "add":
                if(args.length ==6){
                    pokedom.anadirPokedomNuevo(args[0], args[2], args[3], Float.parseFloat(args[4]), Float.parseFloat(args[5]));
                }                    
                break;
            case "describe":
                if(args.length ==3){
                    pokedom.describePokedom(args[2]);
                    }
                break;
            }
}
    }
    

