package com.qualitas;

import com.qualitas.modelo.ConectaUniverse;
import com.qualitas.modelo.entities.TipoEndoso;
import java.util.List;


public class Lanzador {
    public static void main(String args[] ){
    	ConectaUniverse conectaUniverse  = new ConectaUniverse();
        List<TipoEndoso> lista = conectaUniverse.leer();
        System.out.println("Encontre :"+lista.size()+" registros");
     }

    
}
