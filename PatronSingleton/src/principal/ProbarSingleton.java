/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import ico.fes.is.patterns.BaseDeDatosSingleton;

/**
 *
 * @author plats
 */
public class ProbarSingleton {
    public static void main(String[] args) {
        BaseDeDatosSingleton.getInstance().consultarClientes();
        BaseDeDatosSingleton.getInstance().consultarClientes();
        BaseDeDatosSingleton.getInstance().consultarClientes();
}
