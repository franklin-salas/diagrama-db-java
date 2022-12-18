/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadb.uml.elemento;



/**
 * Defines all four combinations of cardinalities.
 *
 * @author zoran
 * @see RelationComponent
 * @see IsRelationComponent
 * @see HasRelationComponent
 * @see UseRelationComponent
 * @see ImplementsRelationComponent
 */
public enum CardinalidadEnum {

    /**
     * "1..1" relation
     */
    One2One {
                @Override
                public String toString() {
                    return "1..1";
                }
            },
    /**
     * "0..1" relation
     */
    Zero2One {
                @Override
                public String toString() {
                    return "0..1";
                }
            },
    /**
     * "1..*" relation
     */
    One2Many {
                @Override
                public String toString() {
                    return "1..*";
                }
            },
    /**
     * "0..*" relation
     */
    Zero2Many {
                @Override
                public String toString() {
                    return "0..*";
                }
            };
    
    /**
     * Converts a String object into adjacent CardinalityEnum element (element
     * with the same meaning). Case insensitive.
     *
     * @param cardinalityEnum
     * @return
     */
    public static CardinalidadEnum parseString(String cardinalityEnum) {
        if (cardinalityEnum.equalsIgnoreCase("1..1")) {
            return CardinalidadEnum.One2One;
        }
        if (cardinalityEnum.equalsIgnoreCase("0..1")) {
            return CardinalidadEnum.Zero2One;
        }
        if (cardinalityEnum.equalsIgnoreCase("1..*")) {
            return CardinalidadEnum.One2Many;
        }
        if (cardinalityEnum.equalsIgnoreCase("0..*")) {
            return CardinalidadEnum.Zero2Many;
        }
        return CardinalidadEnum.Zero2One;
    }

}
