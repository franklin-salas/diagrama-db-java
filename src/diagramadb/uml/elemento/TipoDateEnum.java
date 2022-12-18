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
public enum TipoDateEnum {

    INTENGER {
                @Override
                public String toString() {
                    return "Integer";
                }
            },

    FLOAT {
                @Override
                public String toString() {
                    return "Float";
                }
            },
  
    VARCHAR {
                @Override
                public String toString() {
                    return "Varchar";
                }
            },
  
    DATE {
                @Override
                public String toString() {
                    return "Date";
                }
            };
    
  
    public static TipoDateEnum parseString(String Enum) {
        if (Enum.equalsIgnoreCase(VARCHAR.toString())) {
            return TipoDateEnum.VARCHAR;
        }
        if (Enum.equalsIgnoreCase(INTENGER.toString())) {
            return TipoDateEnum.INTENGER;
        }
        if (Enum.equalsIgnoreCase(FLOAT.toString())) {
            return TipoDateEnum.FLOAT;
        }
        if (Enum.equalsIgnoreCase(DATE.toString())) {
            return TipoDateEnum.DATE;
        }
        return TipoDateEnum.VARCHAR;
    }
  
}
