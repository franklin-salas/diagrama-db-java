/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadb.uml;

import diagramadb.uml.elemento.LienzoInterfaz;
import diagramadb.uml.elemento.TComponente;
import java.awt.Color;
import org.jgraph.JGraph;
import org.jgraph.graph.CellView;
import org.jgraph.graph.DefaultGraphModel;


/**
 *
 * @author FRANKLIN SALAS
 */
public class DiagramaLienzo implements LienzoInterfaz,TComponente{
   private DefaultGraphModel model;
    private JGraph graph;
    private static DiagramaLienzo diagrama = new DiagramaLienzo();

    private DiagramaLienzo() {
        model = new DefaultGraphModel();
        graph = new JGraph(model);
        initGraph();
    }    

    public static DiagramaLienzo getInstancia() {
        return diagrama;
    }

    private void initGraph() {
        graph.setGridColor(Color.BLUE);
        graph.setGridSize(20);
        graph.setGridEnabled(true);
        graph.setGridVisible(true);
        graph.setHandleColor(Color.BLUE);
        graph.setSelectionEnabled(true);
    }

    public JGraph getGraph() {
        return graph;
    }

    public void setGraph(JGraph graph) {
        this.graph = graph;
        initGraph();
    }
@Override
    public void actualizarPintado() {
        CellView cells[] = graph.getGraphLayoutCache().getAllViews();
        for (int i = 0; i < cells.length; i++) {
            CellView cellView = cells[i];
            Object o = cellView.getCell();
            if (o != null && o instanceof TComponente) {
             ((TComponente) o).actualizarPintado();
            }
        }
    }

    @Override
    public void repintar(Object obj) {
     this.getGraph().getGraphLayoutCache().setVisible(obj, false);
     this.getGraph().getGraphLayoutCache().setVisible(obj, true);
    }

     
}
