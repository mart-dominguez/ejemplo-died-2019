package isi.died.catalogo.estructuras;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import isi.died.catalogo.estructuras.Grafo;

public class GrafoTest {

	Grafo<String> g1;
	
	@Before
	public void armarGrafo() {
		g1 = new Grafo<String>();
		g1.addNodo("A");
		g1.addNodo("B");
		g1.addNodo("C");
		g1.addNodo("D");
		g1.addNodo("E");
		g1.conectar("A", "B");
		g1.conectar("A", "C");
		g1.conectar("B", "D");
		g1.conectar("D", "C");
		g1.conectar("C", "E");
	}
	
	@Ignore
	public void testRecorridoAnchura() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testRecorridoProfundidad() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testRecorridoTopologico() {
		fail("Not yet implemented");
	}

	@Test
	public void testCaminos() {
		g1.caminos("A", "E");
	}

}
