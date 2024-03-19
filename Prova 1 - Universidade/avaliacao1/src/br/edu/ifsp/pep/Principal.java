package br.edu.ifsp.pep;

import br.edu.ifsp.pep.dao.AlunoDAO;
import br.edu.ifsp.pep.dao.MonitorDAO;
import br.edu.ifsp.pep.dao.PessoaDAO;
import br.edu.ifsp.pep.dao.ProfessorDAO;
import br.edu.ifsp.pep.modelo.Aluno;
import br.edu.ifsp.pep.modelo.Monitor;
import br.edu.ifsp.pep.modelo.Pessoa;
import br.edu.ifsp.pep.modelo.Professor;
import java.math.BigDecimal;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Professor professor = new Professor("cesar", "123", "César Alberto", new BigDecimal(10000));
        ProfessorDAO professorDAO = new ProfessorDAO();
        try {
            professorDAO.inserir(professor);
        } catch (Exception ex) {
            System.out.println("Login já existe: " + professor.getLogin());
            ex.printStackTrace();
        }

        Aluno aluno = new Aluno("ana", "123", "Ana Carolina", "Matemática", new BigDecimal(8.5));
        AlunoDAO alunoDAO = new AlunoDAO();
        try {
            alunoDAO.inserir(aluno);
        } catch (Exception ex) {
            System.out.println("Login já existe: " + aluno.getLogin());
            ex.printStackTrace();
        }

        Monitor monitor = new Monitor("joao", "123", "João Carlos", new BigDecimal(700), "Lógica de Programação", new BigDecimal(10));
        MonitorDAO monitorDAO = new MonitorDAO();
        try {
            monitorDAO.inserir(monitor);
        } catch (Exception ex) {
            System.out.println("Login já existe: " + monitor.getLogin());
            ex.printStackTrace();
        }

        System.out.println("\nReajustar o salários dos professores");
        professorDAO.reajustarSalario(0.10);

        System.out.println("\nListar alunos com média maior do que seis");
        List<Aluno> alunos = alunoDAO.buscarMediaMaiorQueSeis();
        for (Aluno a : alunos) {
            System.out.println(a);
        }
        
        System.out.println("\nTodas as informações de todas instâncias armazenadas no banco de dados");
        List<Pessoa> pessoas = new PessoaDAO<>().buscarTodas();
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

    }

}
