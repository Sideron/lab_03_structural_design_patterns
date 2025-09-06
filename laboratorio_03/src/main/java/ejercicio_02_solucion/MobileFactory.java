package ejercicio_02_solucion;

public class MobileFactory extends GameElementFactory{
    @Override
    public Character createCharacter() {
        return new MobileWarrior();
    }

    @Override
    public Weapon createWeapon() {
        return new MobileSword();
    }
}
