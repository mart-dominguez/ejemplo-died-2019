package isi.died.catalogo.app;

import isi.died.estructuras.grafos.Grafo;
import isi.died.estructuras.grafos.Vertice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Grafo<String> g1;

		g1 = new Grafo<String>();
		g1.addNodo("A");
		g1.addNodo("C");
		g1.addNodo("B");
		g1.addNodo("D");
		g1.addNodo("E");
		g1.conectar("B", "D");
		g1.conectar("A", "C");
		g1.conectar("A", "B");
		g1.conectar("D", "C");
		g1.conectar("C", "E");
		
		// System.out.println(g1.recorridoAnchura(new Vertice<String>("A")));
		// System.out.println(g1.recorridoProfundidad(new Vertice<String>("A")));
		g1.caminos("A", "E");

    }
}
