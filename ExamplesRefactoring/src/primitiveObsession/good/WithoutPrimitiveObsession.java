/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveObsession.good;

/**
 *
 * @author Moises
 */
public class WithoutPrimitiveObsession {
    public static void main(String args[]) {
        for (City city : City.ALL_CITIES) {
            System.out.println(city.toString());
        }
    }
}
