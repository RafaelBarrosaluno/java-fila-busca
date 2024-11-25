package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class funcionario {
	    private String nome;
	    private int idade;
	    private String cpf;

	    public funcionario(String nome, int idade, String cpf) {
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
	    private List<funcionario> funcionarios = new ArrayList<>();

	   
	    public void adicionarFuncionario(funcionario funcionario) {
	        funcionarios.add(funcionario);
	    }

	    
	    public void ordenarFuncionariosPorNome() {
	        Collections.sort(funcionarios, Comparator.comparing(funcionario::getNome));
	    }

	    
	    public funcionario buscarFuncionarioPorNome(String nome) {
	        for (funcionario f : funcionarios) {
	            if (f.getNome().equalsIgnoreCase(nome)) {
	                return f;
	            }
	        }
	        return null; 
	    }

	    
	    public void exibirFuncionarios() {
	        for (funcionario f : funcionarios) {
	            System.out.println(f);
	        }
	    }
	}

	
	
