package main;

import java.util.Scanner;

public class sistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();

       
        empresa.adicionarFuncionario(new funcionario("Ana", 28, "123.456.789-00"));
        empresa.adicionarFuncionario(new funcionario("Carlos", 35, "987.654.321-11"));
        empresa.adicionarFuncionario(new funcionario("Bruno", 22, "456.789.123-22"));

       
        empresa.ordenarFuncionariosPorNome();

        System.out.println("Funcionários ordenados por nome:");
        empresa.exibirFuncionarios();

       
        System.out.print("\nDigite o nome do funcionário para buscar: ");
        String nomeBusca = scanner.nextLine();

        funcionario encontrado = empresa.buscarFuncionarioPorNome(nomeBusca);
        if (encontrado != null) {
            System.out.println("\nFuncionário encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("\nFuncionário não encontrado!");
        }

        scanner.close();
    }
}


