package br.edu.ifsp.pep;

import br.edu.ifsp.pep.dao.AcessorioDAO;
import br.edu.ifsp.pep.dao.VeiculoDAO;
import br.edu.ifsp.pep.modelo.Acessorio;
import br.edu.ifsp.pep.modelo.TipoCombustivel;
import br.edu.ifsp.pep.modelo.Veiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String[] args) {

        VeiculoDAO veiculoDAO = new VeiculoDAO();
        AcessorioDAO acessorioDAO = new AcessorioDAO();

        Acessorio acessorio = new Acessorio();
        acessorio.setDescricao("Rodas de liga leve");
        acessorioDAO.inserir(acessorio);

        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca("ABC-0000");
        veiculo.setMarca("Fiat");
        veiculo.setModelo("UNO");
        veiculo.setTipoCombustivel(TipoCombustivel.GASOLINA);

        List<Acessorio> acessorios = new ArrayList<>();
        acessorios.add(acessorio);
        veiculo.setAcessorios(acessorios);

        veiculoDAO.inserir(veiculo);

        Acessorio acessorioRetorno = acessorioDAO.buscarPeloCodigo(1L);
        if (acessorioRetorno != null) {
            System.out.println(acessorioRetorno.getDescricao());

            System.out.println("Veículos a partir do Acessório.");
            for (Veiculo v : acessorioRetorno.getVeiculos()) {
                System.out.println(v.getPlaca());
            }
        }

    }
}
