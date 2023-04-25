package p3T_Actividad4;

import java.util.Stack;

import ejemploHerencia.Acuatico;
import ejemploHerencia.Aereo;
import ejemploHerencia.Avion;
import ejemploHerencia.Barco;
import ejemploHerencia.Helicoptero;
import ejemploHerencia.Vehiculo;
import ejemploHerencia.Velero;

public class Principal {
	public static void main(String[] args) {
		Stack<String> animalesAlimentados=new Stack(); //Pila que almacena los animales que han comido
		System.out.println("------------------------SUPERCLASE ANIMAL----------------------------");
		Animal miAnimal=new Animal("Jake",3,"Perro","Doméstico"); //creo un nuevo objeto de la clase Animal
		System.out.println("El animal se llama "+miAnimal.getNombre());
	}
}
