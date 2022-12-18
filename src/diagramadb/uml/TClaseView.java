package diagramadb.uml;

import diagramadb.uml.elemento.Clase;
import diagramadb.uml.elemento.JClase;
import java.awt.Component;

import org.jgraph.JGraph;
import org.jgraph.graph.CellView;
import org.jgraph.graph.CellViewRenderer;
import org.jgraph.graph.VertexRenderer;
import org.jgraph.graph.VertexView;


/**
 *
 * @author Administrador
 */
public class TClaseView extends VertexView {

    private static CompViewRenderer _renderer = new CompViewRenderer();

    private static class CompViewRenderer extends VertexRenderer {

        public CompViewRenderer() {
            super();
        }

        @Override
        public Component getRendererComponent(JGraph jGraph, CellView cellView, boolean selected, boolean focused, boolean preview) {
            JClase comp = new JClase();
            Clase cell = (Clase) cellView.getCell();
           comp.setCell(cell);
            return comp;
        }
    }

    public TClaseView(Object cell) {
        super(cell);
    }

    @Override
    public CellViewRenderer getRenderer() {
        return _renderer;
    }
   

    
}
