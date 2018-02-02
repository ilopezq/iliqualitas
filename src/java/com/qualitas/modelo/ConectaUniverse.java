package com.qualitas.modelo;

import asjava.uniobjects.UniCommand;
import asjava.uniobjects.UniCommandException;
import asjava.uniobjects.UniSession;
import asjava.uniobjects.UniSessionException;
import com.qualitas.modelo.entities.TipoEndoso;
import java.util.ArrayList;
import java.util.List;


public class ConectaUniverse {
    private String server = "110.10.0.176"; // ip server
    private String userName = "ilopez"; // usuario
    private String password = "secreto1"; // contraseña
    private String accountPath = "/sise"; //cuenta
    public String DBtype= "UNIVERSE"; // tipo de cuenta
    public UniSession session;       // UniVerse session
    
    public ConectaUniverse() {
	session = new UniSession();   //Crera la instancia de conexion
	procesar();
    }
    
    //public static void main(String args[] ){
    //	new ConectaUniverse();
    // }

    public void procesar(){		
	//System.out.println("Entro a procesar");			
	try {			
	    session.setHostName(server);
	    session.setUserName(userName);
	    session.setPassword(password);
	    session.setAccountPath(accountPath);
	    session.setDataSourceType(DBtype);			
	   // System.out.println("Termino asignar valores");
			
	    session.connect();
	    //System.out.println("Conexion establecida");	
						
	    leer();
						
	} catch (UniSessionException e) {
	    System.out.println("Error en la conexion ");
	    System.out.println(e.getMessage());
            
        } catch (Exception e){
	    System.out.println("Se encontro el error  "+e.getMessage());
	}
    }
	
    public List<TipoEndoso> leer(){
	String cmdString;
	UniCommand command = null;
	System.out.println("\nEjecuta Comando inicio >>>\n");
        
        List<TipoEndoso> lista = new ArrayList<>();
	try {
   	    /*cmdString = "LIST.ITEM PV 044129576200000000";
	    command = session.command();
	    command.setCommand(cmdString);
	    command.exec();*/
            
            cmdString = "SELECT TENDOSO";
	    command = session.command();
	    command.setCommand(cmdString);
	    command.exec();
            System.out.println(command.response());
            command.getBlockSize();
            command.exec();
            
            
            String arreglo;             //Carga del arreglo
            
            /*for (int i=0;i<arreglo.length;i++){
                //crerar un objeto tipo endoso
            lista.add(TipoEndoso); //se agrega a la lista
            }*/
                                    
	    System.out.println(command.response());
	} catch (UniSessionException e) {
	    //System.out.println("   ERROR:UniSessonException:" + e.getMessage() + "\n");
	} catch (UniCommandException e) {
	    //System.out.println("   ERROR:UniCommandException:" + e.getMessage() + "\n");
	}
	    //System.out.println("Ejecuta Comando fin <<<\n");	
        return lista;
    }
    
}