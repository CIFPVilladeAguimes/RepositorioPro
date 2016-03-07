package Cafetera;

public class Cafetera {
	//Creo los atributos necesarios para desarrollar el ejercicio
	String titular="";
	String modelo="";
	int cantidada = 0;
	int cantidadc = 0;
	int cantidadtotal = 0;
	//Creo el m�todo constructor
	public Cafetera(String titular,String modelo, int cantidada, int cantidadc){
		this.titular = titular;
		this.modelo = modelo;
		this.cantidada = cantidada;
		this.cantidadc = cantidadc;
	}
	//Este metodo nos dir� la cantidad de cafe que actualmente haya en la cafetera
	 public int consultar_cafe(){
		return cantidadc;
	 }
	 //Este metodo nos dir� la cantidad de agua que actualmente haya en la cafetera
	 public int consultar_agua(){
		return cantidada;
	 }
	 //Este metodo servir� el cafe descont�ndole a las cantidades actuales de cafe y agua las unidades necesarias para crear dicho caf�
	 //Adem�s est� metodo va incrementando una variable cada vez que se ejecute, esa variable nos dir� la totalidad de caf�s servidos
	 public String servir_cafe(int cantidadagua, int cantidadcafe){
         String mensaje = "Caf� servido";
         cantidadagua = 20;
         cantidadcafe = 50;
         cantidadc -= cantidadcafe;
         cantidada -= cantidadagua;
         cantidadtotal++;
         return mensaje;
	 }
	 //Este metodo a�adir� agua a la cafetera
	 public int a�adir_agua(int cantidadagua){
		 cantidada += cantidadagua;
		 return cantidada;
	 }
	 //Este metodo a�adir� caf� a la cafetera
	 public int a�adir_cafe(int cantidadcafe){
		 cantidadc += cantidadcafe;
		 return cantidadc;
	 }
	 //Este m�todo nos devolver� la totalidad de caf�s servidos
	 public int totalcafes(){
         return cantidadtotal;
	 }
	 
	 

}
