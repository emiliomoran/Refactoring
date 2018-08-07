/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comments.bad;

/**
 *
 * @author CltControl
 */
public class Directory {

    public String SplitDirectoryFile(String path) {
        String directory = "";
        String file = "";

        // assumes a validated full path
        if (path != null) {
            int length = path.length();
            int rootLength = GetRootLength(path);

            // ignore a trailing slash
            if (length > rootLength && EndsInDirectorySeparator(path)) {
                length--;
            }

            // find the pivot index between end of string and root
            for (int pivot = length - 1; pivot >= rootLength; pivot--) {
                if (IsDirectorySeparator(path.charAt(pivot))) {
                    directory = path.substring(0, pivot);
                    file = path.substring(pivot + 1, length - pivot - 1);
                    return directory;
                }
            }

            // no pivot, return just the trimmed directory
            directory = path.substring(0, length);
        }
        return directory;
    }

    private int GetRootLength(String path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean EndsInDirectorySeparator(String path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean IsDirectorySeparator(char charAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
