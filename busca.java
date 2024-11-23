import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Funcionario {
    private String nome;
    private int idade;
    private String cpf;

    public Funcionario(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf;
    }
}

class Empresa {
    private List<Funcionario> funcionarios = new ArrayList<>();

    // Método para adicionar um funcionário à lista
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    // Método para ordenar os funcionários por nome
    public void ordenarFuncionariosPorNome() {
        Collections.sort(funcionarios, Comparator.comparing(Funcionario::getNome));
    }

    // Método de busca por nome
    public Funcionario buscarFuncionarioPorNome(String nome) {
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Método para exibir todos os funcionários
    public void exibirFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}

public class SistemaEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();

        // Adicionando funcionários
        empresa.adicionarFuncionario(new Funcionario("Ana", 28, "123.456.789-00"));
        empresa.adicionarFuncionario(new Funcionario("Carlos", 35, "987.654.321-11"));
        empresa.adicionarFuncionario(new Funcionario("Bruno", 22, "456.789.123-22"));

        // Ordenar por nome
        empresa.ordenarFuncionariosPorNome();

        System.out.println("Funcionários ordenados por nome:");
        empresa.exibirFuncionarios();

        // Buscar funcionário pelo nome
        System.out.print("\nDigite o nome do funcionário para buscar: ");
        String nomeBusca = scanner.nextLine();

        Funcionario encontrado = empresa.buscarFuncionarioPorNome(nomeBusca);
        if (encontrado != null) {
            System.out.println("\nFuncionário encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("\nFuncionário não encontrado!");
        }

        scanner.close();
    }
}
