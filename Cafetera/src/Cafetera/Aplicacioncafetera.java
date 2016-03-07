package Cafetera;

import java.util.Scanner;

public class Aplicacioncafetera {
    public static void main (String [] args){
    	//Creo las variables necesarias para el ejercicio
    	int cantidadcafe=0;
    	int cantidadagua=0;
    	String titular="";
    	String modelo="";
    	int opcion = 0;
    	//Creo una variable boolean para controlar el bucle que posteriormente veremos
    	boolean salir = false;
    	Scanner leer = new Scanner(System.in);
    	//Aqu� el usuario introduce los datos pedidos por el ejercicio para iniciar
        System.out.println("�Que modelo de cafetera va a utilizar?: ");
        modelo = leer.next();
        System.out.println("Introduzca el nombre del titular: ");
        titular = leer.next();
        System.out.println("Inserte la cantidad inicial de agua (Capacidad de la cafetera es de 500 unidades de caf�): ");
        cantidadagua = leer.nextInt();
        //Establezco el l�mite de la cafetera en 500 unidades tanto para el agua como para el caf�
        //Mediante dos if controlo que las cantidades introducidas por el usuario para iniciar no superen esos l�mites
        if (cantidadagua>500){
        	System.out.print("Error");
        	return;
        }
        System.out.println("Inserte la cantidad inicial de caf�  (Capacidad de la cafetera es de 500 unidades de agua): ");
        cantidadcafe = leer.nextInt();
        if (cantidadcafe>500){
        	System.out.print("Error");
        	return;
        }
        //Creo un objeto con esos datos que se pasar� al metodo constructor de la otra clase
        Cafetera ejemplo = new Cafetera(titular,modelo,cantidadagua,cantidadcafe);
    //Mediante un while permito al usuario realizar todas las acciones que el quiere hasta que el mismo indique que quiere salir
    while (salir == false) {
    //Hago el men�
    System.out.println("�Que acci�n desea realizar?: ");
    System.out.println("1. Ver modelo de cafetera");
    System.out.println("2. Ver el titular de la cafetera");
    System.out.println("3. Consultar dep�sito de caf�");
    System.out.println("4. Consultar dep�sito de Agua");
    System.out.println("5. Servir un caf�(Coste de 20 unidades de agua y 50 de caf�)");
    System.out.println("6. A�adir caf� al dep�sito");
    System.out.println("7. A�adir agua al dep�sito");
    System.out.println("8. Consulta de caf�s totales servidos");
    System.out.println("9. Salir de la aplicaci�n.");
    opcion = leer.nextInt();
    //Mediante un switch controlo la opcion elegida por el usuario
    switch(opcion){
    	case 1:
    	//En el primer caso se trata de devolver el modelo
    	System.out.println("El modelo de la cafetera es: " + modelo);
    	break;
    	
    	case 2:
    	//En el segundo caso se trata de devolver el titular
    	System.out.println("El titular de la cafetera es: " + titular);
    	break;
    	
    	case 3:
    	// Aqu� llamo al m�todo consultar_caf�
    	int cantidadcafeactual=0;
    	cantidadcafeactual=ejemplo.consultar_caferestante();
    	System.out.println( "Cantidad actual de cafe es de: " + cantidadcafeactual + " unidades");
    	break;
    	
    	case 4:
    	//Aqu� llamo al m�todo consultar_agua
    	int cantidadaguaactual=0;
    	cantidadaguaactual=ejemplo.consultar_aguarestante();
        System.out.println( "Cantidad actual de agua es de: " + cantidadaguaactual + " unidades");
        break;
    	
    	case 5:
    	//Aqu� llamo al m�todo servir_caf�
    	//Pero antes compruebo que exista la cantidad necesaria en los dep�sitos para crear un caf�, si no es as� saldr� del programa
    	int cantidadcafeservidos = 0;
    	cantidadagua = ejemplo.consultar_aguarestante();
    	if (cantidadagua < 20){
    		System.out.print("Cantidad insuficiente de agua");
    		return;
    	}
    	cantidadcafe = ejemplo.consultar_caferestante();
    	if (cantidadcafe < 50){
    		System.out.print("Cantidad insuficiente de cafe");
    		return;
    	}
    	
    	String mensaje2 = ejemplo.servir_cafe(cantidadagua, cantidadcafe);
    	System.out.println(mensaje2);
    	break;
    	
    	case 6:
    	//Aqu� llamo al m�todo a�adir_cafe
    	//Pero controlo que la cantidad a�adida mas la que hab�a antes no supere los limites
    	int cantidadac2cafe =0;
    	int cantidadnuevacafe = 0;
    	System.out.println("Introduzca la cantidad a introducir");
    	cantidadnuevacafe = leer.nextInt();
    	cantidadac2cafe= ejemplo.consultar_caferestante();
    	if ((cantidadac2cafe+cantidadnuevacafe >500)){
    		System.out.print("L�mites de cafe superados");
    		return;
    	}
    	cantidadcafe = ejemplo.a�adir_cafe(cantidadnuevacafe);
    	
    	break;
    	
    	case 7:
    	//Aqu� llamo al m�todo a�adir_agua
        //Pero controlo que la cantidad a�adida mas la que hab�a antes no supere los limites
    	int cantidadac2agua  = 0;
    	int cantidadnuevaagua = 0;
        System.out.println("Introduzca la cantidad a introducir");
        cantidadnuevaagua = leer.nextInt();
        cantidadac2agua= ejemplo.consultar_aguarestante();
    	if ((cantidadac2agua+cantidadnuevaagua >500)){
    		System.out.print("L�mites de agua superados");
    		return;
    	}
        cantidadagua = ejemplo.a�adir_agua(cantidadnuevaagua);
        break;
        
    	case 8:
    	//Aqu� llamo al m�todo para ver la totalidad de caf�s servidos
    	int cantidad=0;
    	cantidadcafeservidos= ejemplo.totalcafes();
    	System.out.println("La cantidad de caf�s servidos es de: " + cantidadcafeservidos);
    	
    	break;
    	
    	case 9:
    	//En este caso cambio el valor de la variable booleana para salir del bucle
        salir = true;
    }		
    }
    
    }
}
