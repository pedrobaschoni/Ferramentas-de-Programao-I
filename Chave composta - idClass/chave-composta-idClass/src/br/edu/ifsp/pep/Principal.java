package br.edu.ifsp.pep;

import br.edu.ifsp.pep.dao.EmpresaDAO;
import br.edu.ifsp.pep.dao.FuncionarioDAO;
import br.edu.ifsp.pep.modelo.Empresa;
import br.edu.ifsp.pep.modelo.Funcionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String[] args) {
        EmpresaDAO empresaDAO = new EmpresaDAO();
        Empresa empresa = new Empresa("Empresa 1");
        empresaDAO.inserir(empresa);

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = new Funcionario("123", "Maria", empresa);
        funcionarioDAO.inserir(funcionario);
        
    }

}
