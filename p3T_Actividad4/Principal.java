package p3T_Actividad4;

import java.util.Stack;

public class Principal {
	public static void main(String[] args) {
		Stack<String> animalesAlimentados=new Stack(); //PILA que almacena los animales que han comido
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
		miVaca.hacerRuido(); //modificado de Animal con @Override.
		System.out.println();
		System.out.println("MÉTODOS HEREDADOS DE HERVIBORO:");
		miVaca.buscarHierba();
		miVaca.comer();
		System.out.println();
		System.out.println("MÉTODOS HEREDADOS DE ANIMAL:"); //los otros métodos que estaban en Animal han sido heredados de herviboro
		miVaca.dormir();
		
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
		miHerviboro.comer(); //modificado de Animal con @Override.
		System.out.println();
		System.out.println("MÉTODOS QUE HEREDA DE ANIMAL:");
		miHerviboro.dormir();
		miHerviboro.hacerRuido();
		
		System.out.println("------------------------SUBCLASES HIJAS DE CARNIVORO----------------------------");
		Leon miLeon=new Leon("Radahn",11,"Leon","Llanura","Cebra",90); //creo un nuevo objeto de la clase Leon
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
		miVaca.comer();
		System.out.println();
		/*System.out.println("MÉTODOS HEREDADOS DE ANIMAL:"); //los otros métodos que estaban en Animal han sido heredados de carnivoro
		miVaca.dormir();
		System.out.println();
		Aguila miAguila=new Aguila("Longus",17,"Jirafa","Bosque","Hojas de acacia",2.1); //creo un nuevo objeto de la clase Aguila
		System.out.println("- Nombre: "+miAguila.getNombre());
		System.out.println("- Edad: "+miAguila.getEdad()+" años");
		System.out.println("- Especie: "+miAguila.getEspecie());
		System.out.println("- Hábitat: "+miAguila.getHabitat());
		System.out.println("- Hierba Favorita: "+miAguila.getHierbafavorita());
		System.out.println("- Longitud del cuello: "+miAguila.getLongitudcuello()+" metros");
		System.out.println();
		System.out.println("MÉTODOS DE JIRAFA:");
		miJirafa.estirarCuello();
		miVaca.hacerRuido(); //modificado de Animal con @Override.
		System.out.println();
		System.out.println("MÉTODOS HEREDADOS DE HERVIBORO:");
		miVaca.buscarHierba();
		miVaca.comer();
		System.out.println();
		System.out.println("MÉTODOS HEREDADOS DE ANIMAL:"); //los otros métodos que estaban en Animal han sido heredados de herviboro
		miVaca.dormir();*/
	}
}
