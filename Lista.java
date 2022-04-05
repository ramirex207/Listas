package Listas;

public class Lista {
	Nodo primero;
	public Lista() {
		primero=null;
	}
	public void inicializar() {
		primero = null;
	}
	public boolean lista_Vacia() {
		return primero==null;
	}
	public void insertar(int d) {
		Nodo nuevo= new Nodo(d);
		nuevo.sig=primero;
		primero=nuevo;
	}
	public void eliminar(){
		if(!lista_Vacia())
		{
			primero= primero.sig;
		}
	}
	public void insertarp(Nodo pos, int x) {
		Nodo nuevo= new Nodo(x);
		//conectar el nuevo nodo a la lista
		nuevo.sig=pos.sig;
		pos.sig=nuevo;
		
	}
}
