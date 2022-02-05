/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uec_cursoemvideo;

/**
 *
 * @author lucas
 */
public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String cate;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float pe, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(pe);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public Lutador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCate();
    }

    public String getCate() {
        return cate;
    }

    private void setCate() {
        if (this.getPeso() < 52.2) {
            this.cate = "Inválido";
        } else if(this.getPeso() < 70.3) {
            this.cate = "Leve";
        }else if(this.getPeso()<= 83.9){
            this.cate = "Médio";
        }else if (this.getPeso()<=120){
            this.cate = ("Pesado");
        }else{
            this.cate="Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //Métodos
    
    public void apresentar(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.println("Pesando: " + getPeso());
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }
    
    public void status(){
        System.out.println("Lutador: " + getNome());
        System.out.println("é um peso " + getCate());
        System.out.println(getVitorias()+" vitórias");
        System.out.println(getDerrotas()+ " derrotas");
        System.out.println(getEmpates() + " empates");
    }
    
    public void ganharLuta(){
        setVitorias(vitorias++);
    }
    
    public void perderLuta(){
        setDerrotas(derrotas++);
    }
    
    public void empatar(){ 
        setDerrotas(empates++);

}
}
