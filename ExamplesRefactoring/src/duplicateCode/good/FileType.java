/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateCode.good;

/**
 *
 * @author CltControl
 */
public enum FileType {
    DOC(Type.Document), JPG(Type.Image), GIF(Type.Image), TXT(Type.Text);
    private Type type;

    private FileType(Type t) {
        this.type = t;
    }

    public Type getType() {
        return type;
    }

    public String toString() {
        return "." + super.toString().toLowerCase();
    }
}
