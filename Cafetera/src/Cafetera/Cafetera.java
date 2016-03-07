package Cafetera;

public class Cafetera {
	//Creo los atributos necesarios para desarrollar el ejercicio
	String titular="";
	String modelo="";
	int cantidada = 0;
	int cantidadc = 0;
	int cantidadtotal = 0;
	//Creo el método constructor
	public Cafetera(String titular,String modelo, int cantidada, int cantidadc){
		this.titular = titular;
		this.modelo = modelo;
		this.cantidada = cantidada;
		this.cantidadc = cantidadc;
	}
	//Este metodo nos dirá la cantidad de cafe que actualmente haya en la cafetera
	 public int consultar_cafe(){
		return cantidadc;
	 }
	 //Este metodo nos dirá la cantidad de agua que actualmente haya en la cafetera
	 public int consultar_agua(){
		return cantidada;
	 }
	 //Este metodo servirá el cafe descontándole a las cantidades actuales de cafe y agua las unidades necesarias para crear dicho café
	 //Además esté metodo va incrementando una variable cada vez que se ejecute, esa variable nos dirá la totalidad de cafés servidos
	 public String servir_cafe(int cantidadagua, int cantidadcafe){
         String mensaje = "Café servido";
         cantidadagua = 20;
         cantidadcafe = 50;
         cantidadc -= cantidadcafe;
         cantidada -= cantidadagua;
         cantidadtotal++;
         return mensaje;
	 }
	 //Este metodo añadirá agua a la cafetera
	 public int añadir_agua(int cantidadagua){
		 cantidada += cantidadagua;
		 return cantidada;
	 }
	 //Este metodo añadirá café a la cafetera
	 public int añadir_cafe(int cantidadcafe){
		 cantidadc += cantidadcafe;
		 return cantidadc;
	 }
	 //Este método nos devolverá la totalidad de cafés servidos
	 public int totalcafes(){
         return cantidadtotal;
	 }
	 
	 

}
