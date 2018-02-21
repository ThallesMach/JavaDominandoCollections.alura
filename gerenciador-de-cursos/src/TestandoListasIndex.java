

///
	///testt
import java.util.ArrayList;
import java.util.Collections;

class TestandoListasIndex {

    public static void main(String[] args) {

        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";
        
        
        System.out.println("------------");
//        aulas.remove(0);
//        System.out.println(aulas);

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);        

        System.out.println(aulas);

        System.out.println("------------");
        
        Collections.sort(aulas);
        System.out.println("Depois de ordenado:");
        System.out.println(aulas); 
        
        
        
//        Percorrendo uma lista
//        Bem, talvez não seja a melhor das ideias fazer um System.out.println na nossa lista, pois talvez queiramos mostrar esses itens de alguma outra forma, como por exemplo um por linha. Como fazer isso? Utilizando o for de uma maneira especial, chamada de enhanced for, ou popularmente foreach. Lembrando que foreach não existe no Java como comando, e sim como um caso especial do for mesmo. Olhe o código:
//        
        
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }
        
        System.out.println("------------");
        
        /*
         * Acessando elementos
E se eu quisesse saber apenas a primeira aula? O método aqui é o get. Ele retorna o primeiro elemento se passarmos o 0 como argumento:
         */
        
        
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);
        
        System.out.println("------------");
//        Você pode usar esse mesmo método para percorrer a lista toda, em vez do tal do enhanced for. Para isso, precisamos saber quantos elementos temos nessa lista. Nesse caso, utilizamos o método size para limitar o nosso for:
        
         
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula : " + aulas.get(i));
        }
        
        System.out.println("------------");
        
        /*
         * Mais uma forma de percorrer elementos, agora com Java 8
Percorrer com o enhanced for é uma forma bastante indicada. Já o for que fizemos utilizando o get possui alguns problemas que veremos em uma próxima aula e vai ficar bastante claro.

Uma outra forma de percorrer nossa lista é utilizando as sintaxes e métodos novos incluídos no Java 8. Temos um método (não um comando!) agora que se chama forEach. Ele recebe um objeto do tipo Consumer, mas o interessante é que você não precisa criá-lo, você pode utilizar uma sintaxe bem mais enxuta, mas talvez assustadora a primeira vista, chamada lambda. Repare:
         */
         
        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Aula " + aula);
        });
        
        System.out.println("------------");
        
        
        
        
        
    }
}