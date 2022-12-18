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
public class Enlace extends EnlaceBase implements TComponente{
    
          public static enum EnlaceEnum {

        ASOCIACION {
                    @Override
                    public String toString() {
                        return "Asociacion";
                    }
                },
        COMPOSICION{
                    @Override
                    public String toString() {
                        return "Composicion";
                    }
                }
    };
        
        private CardinalidadEnum cardinalidadO;
        private CardinalidadEnum cardinalidadD;
        private  EnlaceEnum tipo;
        private  LienzoInterfaz diag;

    

    public CardinalidadEnum getCardinalidadO() {
        return cardinalidadO;
    }

    public void setCardinalidadO(CardinalidadEnum cardinalidadO) {
        this.cardinalidadO = cardinalidadO;
    }

    public CardinalidadEnum getCardinalidadD() {
        return cardinalidadD;
    }

    public void setCardinalidadD(CardinalidadEnum cardinalidadD) {
        this.cardinalidadD = cardinalidadD;
    }

     public void setLienzo(LienzoInterfaz l ){
     this.diag= l;
     }
     @Override
    public void actualizarPintado() {
     diag.repintar(this);
    }

    @Override
    public String toString() {
        if (cardinalidadD == null) {
            return "";
        }
        
        return    cardinalidadO + "       " + cardinalidadD ;
    }
    
}
