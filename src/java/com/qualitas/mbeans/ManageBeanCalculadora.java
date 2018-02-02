package com.qualitas.mbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ManageBeanCalculadora {
    
    private int dato1;
    private int dato2;
    private int resultado;
    private int resultado1;
    
    public void sumar(){
        resultado = dato1 + dato2 ;
    }

   public void restar(){
        setResultado1(dato1 - dato2) ;
    }
    public int getDato1() {
        return dato1;
    }

    
    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }

    
    public int getDato2() {
        return dato2;
    }

    
    public void setDato2(int dato2) {
        this.dato2 = dato2;
    }

    
    public int getResultado() {
        return resultado;
    }

    
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the resultado1
     */
    public int getResultado1() {
        return resultado1;
    }

    /**
     * @param resultado1 the resultado1 to set
     */
    public void setResultado1(int resultado1) {
        this.resultado1 = resultado1;
    }
    
    
    
}
