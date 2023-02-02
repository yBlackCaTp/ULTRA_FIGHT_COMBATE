package com.mycompany.projeto_ufc;
public class Projeto_UFC {
    public static void main(String[] args) {
        
        Lutador l[] =  new Lutador[6];
                
        l[0] = new Lutador("Paulo", "BR", 23, 1.75f, 75f, 16, 1, 2 );
        l[1] = new Lutador("DeadCode", "CN", 26, 1.72f, 78f, 5, 8, 5 );
        l[2] = new Lutador("Lorem", "EUA", 28, 1.77f, 79f, 4, 7, 3 );


       
       
        l[0].apresentar();
        l[0].status();
        
        l[1].apresentar();
        l[1].status();
        
        l[2].apresentar();
        l[2].status();
    }
}
