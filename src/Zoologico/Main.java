
package Zoologico;


public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Zologico Departamental Main");
        Animal misAnimales[] = new Animal[4];
        
        
        misAnimales[0] = new Jirafa(101, "jirafona", 200, 3.5f, "amarillo");
        misAnimales[1] = new Jirafa(102, "jirafita", 100, 1.5f, "cafe");
        misAnimales[2] = new Elefante(201, "dumbo", 800, 2.5f, 10000f);
        misAnimales[3] = new Puma(301, "puma", 100, 8, 120f);
        misAnimales[3] = new Leon(100f, 401, "leoncito", 140, 20);
        
        for(Animal i: misAnimales){
            System.out.println(i.mostrarDatos());
            System.out.println("");
        }
    }
    
}
