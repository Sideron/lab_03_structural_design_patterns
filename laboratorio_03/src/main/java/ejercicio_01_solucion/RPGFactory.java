/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01_solucion;

/**
 *
 * @author o12307
 */
public class RPGFactory extends GameFactory {
    public RPGGame createGame(){
        return new RPGGame();
    }
}
