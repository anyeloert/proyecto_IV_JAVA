package proyecto_java_iv;


public class persona implements Runnable {
    private String nombre;
    private String mensaje;

    public persona(String nombre, String mensaje) {
        this.nombre = nombre;
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public void run() {
            System.out.println(getMensaje());
            System.out.println("Finalizo el hilo");
    }
    

    
   
    
}
    
    

