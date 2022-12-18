/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadb.uml.elemento;

/**
 *
 * @author FRANKLIN SALAS
 */
public enum VisibilidadEnum {
    
    PRIVATE {
                @Override
                public String toString() {
                    return "private";
                }

            },
    PROTECTED {
                @Override
                public String toString() {
                    return "protected";
                }

            },
    PUBLIC {
                @Override
                public String toString() {
                    return "public";
                }

            };

    /**
     * Converts a String object into the corresponding Visibility element 
     * (element with the same name). Case insensitive. Used here, as Enum.valueOf(String string)
     * is case sensitive, so this provides more flexibility and cleaner code.
     * 
     * @param value - string representation of a modifier e.g. "public"
     * @return Visibility enumeration component. Returns PACKAGE as default value.
     */
    public static VisibilidadEnum stringToVisibility(String value) {
        if(value.equalsIgnoreCase(PUBLIC.toString())) return PUBLIC;
        else if(value.equalsIgnoreCase(PRIVATE.toString())) return PRIVATE;
        else if(value.equalsIgnoreCase(PROTECTED.toString())) return PROTECTED;
        else return PUBLIC;
    }
}
