/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comments.good;

/**
 *
 * @author CltControl
 */
public class Directory {

    private String validatedFullPath ;
    private int length;
    private int rootLength;
    private boolean pivotFound;
    public String Directory;
    public String File;

    public void DirectoryFileSplitter(String validatedFullPath) {
        this.validatedFullPath = validatedFullPath;
        length = validatedFullPath.length();
        rootLength = GetRootLength(validatedFullPath);
    }

    public void Split() {
        if (validatedFullPath != null) {
            IgnoreTrailingSlash();
            FindPivotIndexBetweenEndOfStringAndRoot();
            if (!pivotFound) {
                TrimDirectory();
            }
        }
    }

    private void TrimDirectory() {
        Directory = validatedFullPath.substring(0, length);
    }

    private void FindPivotIndexBetweenEndOfStringAndRoot() {
        for (int pivot = length - 1; pivot >= rootLength; pivot--) {
            if (IsDirectorySeparator(validatedFullPath.charAt(pivot))) {
                Directory = validatedFullPath.substring(0, pivot);
                File = validatedFullPath.substring(pivot + 1, length - pivot - 1);
                pivotFound = true;
            }
        }
    }

    private void IgnoreTrailingSlash() {
        if (length > rootLength && EndsInDirectorySeparator(validatedFullPath)) {
            length--;
        }
    }

    private int GetRootLength(String validatedFullPath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean IsDirectorySeparator(char charAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean EndsInDirectorySeparator(String validatedFullPath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
