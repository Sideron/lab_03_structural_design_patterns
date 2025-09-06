package ejercicio_02_solucion;

public abstract class Character {
    protected String name;
    protected String platform;
    public void attack(){
        System.out.println(name+" ataca desde "+platform);
    }
}
