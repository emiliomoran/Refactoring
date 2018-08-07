/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longMethod.bad;

/**
 *
 * @author EmilioMoran
 */
public class Board {
    public void UniversalBoardCoordinate(String locationPhrase){
        String noParens = locationPhrase.replace('(', ' ').replace(')', ' ');
        String[] coordinates = noParens.split(",");

        if (coordinates.length != 2) {
            System.out.println("That's not a valid board location.");
        }

        int row = Integer.parseInt(coordinates[0].trim());
        int column = Integer.parseInt(coordinates[1].trim());
    }
}
