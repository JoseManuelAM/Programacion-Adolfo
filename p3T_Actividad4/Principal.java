package p3T_Actividad4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Principal {
	public static void main(String[] args) {
		System.out.println("------------------------SUPERCLASE ANIMAL----------------------------");
		Animal miAnimal=new Animal("Jake",3,"Perro","Doméstico"); //creo un nuevo objeto de la clase Animal
		System.out.println("- Nombre: "+miAnimal.getNombre());
		System.out.println("- Edad: "+miAnimal.getEdad()+" años");
		System.out.println("- Especie: "+miAnimal.getEspecie());
		System.out.println("- Hábitat: "+miAnimal.getHabitat());
		System.out.println();
		System.out.println("MÉTODOS DE ANIMAL:");
		miAnimal.comer();
		miAnimal.dormir();
		miAnimal.hacerRuido();
		
		System.out.println("------------------------SUBCLASE HERVIBORO HIJA DE ANIMAL----------------------------");
		Herviboro miHerviboro=new Herviboro("Caith",60,"Elefante","Sabana","Hojas"); //creo un nuevo objeto de la clase Herviboro
		System.out.println("- Nombre: "+miHerviboro.getNombre());
		System.out.println("- Edad: "+miHerviboro.getEdad()+" años");
		System.out.println("- Especie: "+miHerviboro.getEspecie());
		System.out.println("- Hábitat: "+miHerviboro.getHabitat());
		System.out.println("- Hierba Favorita: "+miHerviboro.getHierbafavorita());
		System.out.println();
		System.out.println("MÉTODOS DE HERVIBORO:");
		miHerviboro.buscarHierba();
		miHerviboro.comer(); //modificado de Animal con @Override.
		System.out.println();
		System.out.println("MÉTODOS QUE HEREDA DE ANIMAL:");
		miHerviboro.dormir();
		miHerviboro.hacerRuido();
		
		System.out.println("------------------------SUBCLASES HIJAS DE HERVIBORO----------------------------");
		Vaca miVaca=new Vaca("Vanilla",11,"Vaca","Campo","Cereales",50); //creo un nuevo objeto de la clase Vaca
		System.out.println("- Nombre: "+miVaca.getNombre());
		System.out.println("- Edad: "+miVaca.getEdad()+" años");
		System.out.println("- Especie: "+miVaca.getEspecie());
		System.out.println("- Hábitat: "+miVaca.getHabitat());
		System.out.println("- Hierba Favorita: "+miVaca.getHierbafavorita());
		System.out.println("- Cantidad de leche: "+miVaca.getCantidadleche()+" litros");
		System.out.println();
		System.out.println("MÉTODOS DE VACA:");
		miVaca.sacarLeche(5);
		miVaca.hacerRuido(); //modificado de Animal con @Override.
		System.out.println();
		System.out.println("MÉTODOS HEREDADOS DE HERVIBORO:");
		miVaca.buscarHierba();
		miVaca.comer();
		System.out.println();
		System.out.println("MÉTODOS HEREDADOS DE ANIMAL:"); //los otros métodos que estaban en Animal han sido heredados de herviboro
		miVaca.dormir();
		System.out.println();
		Jirafa miJirafa=new Jirafa("Longus",17,"Jirafa","Bosque","Hojas de acacia",2.1); //creo un nuevo objeto de la clase Jirafa
		System.out.println("- Nombre: "+miJirafa.getNombre());
		System.out.println("- Edad: "+miJirafa.getEdad()+" años");
		System.out.println("- Especie: "+miJirafa.getEspecie());
		System.out.println("- Hábitat: "+miJirafa.getHabitat());
		System.out.println("- Hierba Favorita: "+miJirafa.getHierbafavorita());
		System.out.println("- Longitud del cuello: "+miJirafa.getLongitudcuello()+" metros");
		System.out.println();
		System.out.println("MÉTODOS DE JIRAFA:");
		miJirafa.estirarCuello();
		miJirafa.hacerRuido(); //modificado de Animal con @Override.
		System.out.println();
		System.out.println("MÉTODOS HEREDADOS DE HERVIBORO:");
		miJirafa.buscarHierba();
		miJirafa.comer();
		System.out.println();
		System.out.println("MÉTODOS HEREDADOS DE ANIMAL:"); //los otros métodos que estaban en Animal han sido heredados de herviboro
		miJirafa.dormir();
		
		System.out.println("------------------------SUBCLASE CARNIVORO HIJA DE ANIMAL----------------------------");
		Carnivoro miCarnivoro=new Carnivoro("Sharp",9,"Tigre","Selva","Búfalo"); //creo un nuevo objeto de la clase Carnivoro
		System.out.println("- Nombre: "+miCarnivoro.getNombre());
		System.out.println("- Edad: "+miCarnivoro.getEdad()+" años");
		System.out.println("- Especie: "+miCarnivoro.getEspecie());
		System.out.println("- Hábitat: "+miCarnivoro.getHabitat());
		System.out.println("- Presa favorita: "+miCarnivoro.getPresafavorita());
		System.out.println();
		System.out.println("MÉTODOS DE CARNIVORO:");
		miCarnivoro.cazarAnimal();
		miCarnivoro.comer(); //modificado de Animal con @Override.
		System.out.println();
		System.out.println("MÉTODOS QUE HEREDA DE ANIMAL:");
		miCarnivoro.dormir();
		miCarnivoro.hacerRuido();
		
		System.out.println("------------------------SUBCLASES HIJAS DE CARNIVORO----------------------------");
		Leon miLeon=new Leon("Radahn",11,"León","Llanura","Cebra",90); //creo un nuevo objeto de la clase Leon
		System.out.println("- Nombre: "+miLeon.getNombre());
		System.out.println("- Edad: "+miLeon.getEdad()+" años");
		System.out.println("- Especie: "+miLeon.getEspecie());
		System.out.println("- Hábitat: "+miLeon.getHabitat());
		System.out.println("- Presa Favorita: "+miLeon.getPresafavorita());
		System.out.println("- Velocidad: "+miLeon.getVelocidad()+" km/h");
		System.out.println();
		System.out.println("MÉTODOS DE LEON:");
		miLeon.zarpazo();
		miLeon.hacerRuido(); //modificado de Animal con @Override.
		System.out.println();
		System.out.println("MÉTODOS HEREDADOS DE CARNIVORO:");
		miLeon.cazarAnimal();
		miLeon.comer();
		System.out.println();
		System.out.println("MÉTODOS HEREDADOS DE ANIMAL:"); //los otros métodos que estaban en Animal han sido heredados de carnivoro
		miVaca.dormir();
		System.out.println();
		Aguila miAguila=new Aguila("Tornado",17,"Aguila","Montaña","Conejo",2.1); //creo un nuevo objeto de la clase Aguila
		System.out.println("- Nombre: "+miAguila.getNombre());
		System.out.println("- Edad: "+miAguila.getEdad()+" años");
		System.out.println("- Especie: "+miAguila.getEspecie());
		System.out.println("- Hábitat: "+miAguila.getHabitat());
		System.out.println("- Hierba Favorita: "+miAguila.getPresafavorita());
		System.out.println("- Longitud de las alas: "+miAguila.getLongitudalas()+" metros");
		System.out.println();
		System.out.println("MÉTODOS DE AGUILA:");
		miAguila.aleteo();
		miAguila.hacerRuido(); //modificado de Animal con @Override.
		System.out.println();
		System.out.println("MÉTODOS HEREDADOS DE HERVIBORO:");
		miAguila.cazarAnimal();
		miVaca.comer();
		System.out.println();
		System.out.println("MÉTODOS HEREDADOS DE ANIMAL:"); //los otros métodos que estaban en Animal han sido heredados de herviboro
		miVaca.dormir();
		System.out.println();
		System.out.println("FIN DEL PROGRAMA.");
		System.out.println("Animales creados: "+miAnimal.getAnimales()); //Imprimo los animales totales creados, que los he almacenado en una VARIABLE GLOBAL.
		System.out.println();
		System.out.println();
		
		//Implementación de COLA y PILA
		System.out.println("-- EXTRA: Ejemplos de cola y pila");
		Queue<String> inofensivos=new LinkedList<>(); //COLA que almacena los animales que son inofensivos
		
		//Añadimos animales a la cola
		inofensivos.add(miLeon.getEspecie());
		inofensivos.add(miAnimal.getEspecie());
		inofensivos.add(miVaca.getEspecie());
		inofensivos.add(miJirafa.getEspecie());

		System.out.println();
		System.out.println("Cola de animales inofensivos: "+inofensivos);
		String primero=inofensivos.peek();
		System.out.println("El elemento superior es: "+primero); //Output: León	
		System.out.println("El león no es inofensivo, vamos a eliminarlo y colocarlo en la pila de peligrosos.");
		String leonEsPeligroso=inofensivos.remove();
		System.out.println("Se ha eliminado: "+leonEsPeligroso); //elimina león porque ha sido el primer introducido y la cola es FIFO (first in first out)
		System.out.println("Cola de animales inofensivos actualizada: "+inofensivos);
		System.out.println();
		
		Stack<String> peligrosos=new Stack(); //PILA que almacena los animales que son peligrosos
		peligrosos.push(miHerviboro.getEspecie());
		peligrosos.push(miCarnivoro.getEspecie());
		peligrosos.push(miAguila.getEspecie());
		peligrosos.push(leonEsPeligroso); //Devuelvo el león a la pila de animales peligrosos
		System.out.println("Pila de animales peligrosos: "+peligrosos);
		String first=peligrosos.peek();
		System.out.println("El animal superior es: "+first); //Output: León
		String eliminado=peligrosos.pop();
		System.out.println("Se ha eliminado: "+eliminado); //elimina león porque ha sido el último introducido y la pila es LIFO (last in first out)
		System.out.println("Cola de animales peligrosos actualizada: "+peligrosos);
	}
}
