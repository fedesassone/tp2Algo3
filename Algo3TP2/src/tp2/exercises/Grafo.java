package tp2.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.runner.manipulation.Sortable;


public class Grafo {
	private ArrayList<Vertice> vertices;
	private int peso;
	private int idVertices;
	public Grafo() {
		vertices = new ArrayList<Vertice>();
		idVertices = 0;
	}
	
	public void addVertice(int nodo1, int nodo2, int peso ) {
		Vertice vertice = new Vertice(nodo1, nodo2, -peso);
		vertice.setId(idVertices);
		idVertices++;
		vertices.add(vertice);
		this.peso += peso;
	}
	
	public ArrayList<Vertice> getVertices() {
		return vertices;
	}
	public ArrayList<Vertice> getSortedVertices(){
		Collections.sort(vertices, new Comparator<Vertice>() {
	        @Override
	        public int compare(Vertice  v1, Vertice  v2){
	        	return  v1.compareTo(v2);
	        }
	    });
		return vertices;
	}
	public int getPeso() {
		return peso;
	}
}
