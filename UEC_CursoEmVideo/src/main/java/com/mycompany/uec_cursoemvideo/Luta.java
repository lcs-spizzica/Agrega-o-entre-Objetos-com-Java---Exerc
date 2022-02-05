/*
                 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uec_cursoemvideo;

import java.util.Random;

/**
 *
 * @author lucas
 */
public class Luta extends Lutador{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCate().equals(l2.getCate()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
        this.aprovada = false;
        this.desafiado = null;
        this.desafiante = null;
        }
    }
    
    public void lutar(){
        if (this.isAprovada() == true) {
            System.out.println("\n---Desafiado---");
            desafiado.apresentar();
            System.out.println("\n---Desafiante---");
            desafiante.apresentar();
            
            Random aleatorio = new Random();
            
            int vencedor = aleatorio.nextInt(3);
            
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!!");
                    this.desafiado.empatar();
                    this.desafiante.empatar();
                    break;
                case 1:
                    System.out.println("Vitória do " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2 :
                    System.out.println("Vitória do " + desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                default:
                    throw new AssertionError();
            }
            
        }else{
            System.out.println("Luta nao pode acontecer");
        }
    }
}
