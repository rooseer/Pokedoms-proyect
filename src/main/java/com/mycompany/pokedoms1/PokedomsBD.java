/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pokedoms1;

/**
 *
 * @author usuari
 */
public class PokedomsBD {
          Pokedom pokedoms[];

    public PokedomsBD(Pokedom[] listaPokedoms) {
        pokedoms=listaPokedoms;
    }

    Pokedom describe(String nombrePokedom) {
        Pokedom elPokedom=null;

        for(Pokedom p: pokedoms) {
            if (p.getNombre().equalsIgnoreCase(nombrePokedom))
                elPokedom=p;
        }

        return elPokedom;
    }  
}
