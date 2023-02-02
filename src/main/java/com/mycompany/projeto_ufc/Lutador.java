package com.mycompany.projeto_ufc;
public class Lutador {
    //ATRIBUTOS
    
    private String nome;
    private String nacionalidade; 
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
//METODOS PUBLICOS

    public void apresentar(){
       System.out.println("----------------APRESENTAÇÃO-------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("ORIGEM: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " Anos");
        System.out.println(this.getAltura() + " Altura");
        System.out.println("Peso: " + this.getPeso());
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getEmpates() + " Empates");
        System.out.println(this.getDerrotas() + " Derrotas");
    
    }
    public void status(){
        
        System.out.println("---------------STATUS---------------");
        System.out.println(this.getNome() + " é um peso: " + this.getCategoria());
        System.out.println("Lutas Ganhas: " + this.getVitorias());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Derrotas: " + this.getDerrotas());
        
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    
    }
    
    //METODOS ESPECIAIS 

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;           ///METODO CONSTRUTOR
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
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
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Invalido";
        } else if (this.peso <= 71){
            this.categoria = "Pena";
        } else if (this.peso <= 84 ){
            this.categoria = "Mediano";
        } else if (this.peso <= 130){
            this.categoria = "Pessadissimo";
        } else {
            this. categoria = "Invalido";
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
    
    
    
    
}
