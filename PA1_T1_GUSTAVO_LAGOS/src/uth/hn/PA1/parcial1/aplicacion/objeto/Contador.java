/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.PA1.parcial1.aplicacion.objeto;

/**
 *
 * @author Gustavo
 */
public class Contador {

    public Contador() {
    }

    private int votoD = 0;    
    private int votoA = 0;
    private int votoa = 0;

 


    public int getVotoD() {
        return votoD;
    }

    public void setVotoD(int votoD) {
        this.votoD = votoD;
    }

    public int getVotoA() {
        return votoA;
    }

    public void setVotoA(int votoA) {
        this.votoA = votoA;
    }

    public int getVotoa() {
        return votoa;
    }

    public void setVotoa(int votoa) {
        this.votoa = votoa;
    }

    @Override
    public String toString() {
        return "Contador{" + "votoD=" + votoD + ", votoA=" + votoA + ", votoa=" + votoa + '}';
    }

     
    
    public int contadorD (){
     votoD++;
    return votoD;
             
 }
     public int contadorAL (){
     votoA++;
    return votoA;
    }
     public int contadorAS (){
     votoa++;
    return votoa;
    }
}

 
    
    
  