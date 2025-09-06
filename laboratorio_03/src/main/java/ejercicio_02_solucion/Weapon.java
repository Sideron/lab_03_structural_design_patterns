package ejercicio_02_solucion;

public abstract class Weapon {
    protected String name;
    protected String platform;
    public void use(){
        System.out.println(name+" se usa desde "+platform);
    }
}
