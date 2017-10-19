
package proyecto_java_iv;


public class Proyecto_java_IV {

   
    public static void main(String[] args) {
        persona p = new persona("Reywis","Hola Mundo");
        persona p1 = new persona("Ingrid","hola Mundo 2");
        persona p2 = new persona("carlos","hola Mundo 11");
        persona p3 = new persona("anyelo","hola Mundo 3");
        persona p4 = new persona("jose","hola Mundo 4");
        persona p5 = new persona("reina","hola Mundo 5");
        persona p6 = new persona("edicson","hola Mundo 6");
        persona p7 = new persona("nahum","hola Mundo 7");
        persona p8 = new persona("frank","hola Mundo 8");
        persona p9 = new persona("carolay","hola Mundo 9");
        persona p10 = new persona("santiago","hola Mundo 10");
        

        Thread hilo = new Thread(p);
        Thread hilo1 = new Thread(p1);
        Thread hilo2 = new Thread(p2);
        Thread hilo3 = new Thread(p3);
        Thread hilo4 = new Thread(p4);
        Thread hilo5 = new Thread(p5);
        Thread hilo6 = new Thread(p6);
        Thread hilo7 = new Thread(p7);
        Thread hilo8 = new Thread(p8);
        Thread hilo9 = new Thread(p9);
        Thread hilo10 = new Thread(p10);
        hilo.start();
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
        hilo8.start();
        hilo9.start();
        hilo10.start();
        
        
        
    }
    
}
