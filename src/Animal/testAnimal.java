package Animal;

public class testAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creamos un animal, en este momento usamos el metodo que imprime hacer sonido y cuando definimos  que este animal es un gato, se sobreescribe el metodo a mia miau
		
		Animal Garfield = new Gato();
		Garfield.hacerSonido();
		
		Animal Godzilla =new Animal();
		Godzilla.hacerSonido();

	}// cierre main

}// cierre clase
