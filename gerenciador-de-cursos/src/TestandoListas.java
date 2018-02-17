
//	Curso Java: Dominando as Collections
	//  01 Trabalhando com ArrayList
		// site: docs.oracle.com/javase/8/docs/api/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);
		System.out.println("-----------------------");

		aulas.remove(0);
		System.out.println(aulas);
		System.out.println("------------------------");

		for (String aula : aulas) {
			System.out.println("Aulas: " + aulas);
		}
		System.out.println("------------------------");

		String primeiraAula = aulas.get(0);
		System.out.println("_A primeira aula é: " + primeiraAula);
		System.out.println("------------------------");

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula : " + aulas.get(i));
		}
		;
		System.out.println("_Quantidade de elemento tem no for: " + aulas.size());
		System.out.println("------------------------");

		aulas.forEach(aula -> {
			System.out.println("_perdorrendo:");
			System.out.println("_Aula " + aula);
		});
		System.out.println("------------------------");

		
		
		Collections.sort(aulas);
		System.out.println("Depois de ordenado:");
		System.out.println(aulas);
		System.out.println("------------------------");

	}
}