/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateCode.bad;

/**
 *
 * @author CltControl
 */
public interface FileType {

    public enum Image implements FileType {
        JPG;
        public String toString() {  //duplicated code
            return "." + super.toString().toLowerCase();
        };
    }

    public enum Office implements FileType {
        DOC;
        public String toString() {
            return "." + super.toString().toLowerCase();
        };
    }

    public enum PlainText implements FileType {
        TXT;
        public String toString() {  //duplicated code
            return "." + super.toString().toLowerCase();
        };
    }
}
