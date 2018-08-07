/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longMethod.good;

/**
 *
 * @author EmilioMoran
 */
public class Board {
    public void UniversalBoardCoordinate(String locationPhrase){
        Integer[] orderedPair = parseString(locationPhrase);

        int row = orderedPair[0];
        int column = orderedPair[1];
    }    
    
    private Integer[] parseString(String locationPhrase){
        String noParens = locationPhrase.replace('(', ' ').replace(')', ' ');
        String[] coordinates = noParens.split(",");
        checkValidity(coordinates);
        return parseCoordinates(coordinates);
    }
    
    private void checkValidity(String[] coordinates){
        if (coordinates.length != 2) {
            System.out.println("That's not a valid board location.");
        }
    }
    
    private Integer[] parseCoordinates(String[] coordinates) {
        return new Integer[] { Integer.parseInt(coordinates[0].trim()),
                               Integer.parseInt(coordinates[1].trim()) };
    }
}
