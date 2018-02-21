
//



public class TestaCursoComAluno {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("Douglas Quintanilha", 11824763);
		Aluno alunoQueVeioDoFormulario = new Aluno("Douglas Quintanilha", 11824763);

		System.out.println("O aluno e igual ao aluno que veio do formulario?");
		System.out.println(aluno == alunoQueVeioDoFormulario);
	}
}
