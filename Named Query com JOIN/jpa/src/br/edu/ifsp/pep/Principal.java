package br.edu.ifsp.pep;

import br.edu.ifsp.pep.dao.CategoriaDAO;
import br.edu.ifsp.pep.dao.PessoaDAO;
import br.edu.ifsp.pep.dao.ProdutoDAO;
import br.edu.ifsp.pep.dto.ProdutoDTO;
import br.edu.ifsp.pep.entity.Categoria;
import br.edu.ifsp.pep.entity.Pessoa;
import br.edu.ifsp.pep.entity.Produto;
import java.math.BigDecimal;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        PessoaDAO pessoaDAO = new PessoaDAO();
        
        Pessoa pessoa = new Pessoa("Manoel", "manoel", "Silva");
        System.out.println(":::::" + pessoa);
        pessoaDAO.inserir(pessoa);
        
        System.out.println(":::::" + pessoa);
        pessoa.setNome("Joaquim");
        System.out.println(":::::" + pessoa);
        pessoaDAO.alterar(pessoa);
        
        //Remover
        pessoaDAO.excluir(pessoa);
        
        //Buscar pessoa pelo ID
        Pessoa pessoaRetornada = pessoaDAO.buscarPeloId(1);
        System.out.println("::::" + pessoaRetornada);
        
        
        System.out.println("--------LISTA DE PESSOAS----------");
//        List pessoas = pessoaDAO.buscarTodas();
//        for (int i = 0; i < pessoas.size(); i++) {
//            Pessoa p = (Pessoa) pessoas.get(i);
//            System.out.println(p);
//        }

        //Lista tipada
        List<Pessoa> pessoas = pessoaDAO.buscarTodas();
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
        
        
        ProdutoDAO produtoDAO = new ProdutoDAO();
        List<Produto> produtos = produtoDAO
                .buscarPeloPreco(new BigDecimal(350));
        
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        
        System.out.println("Maior Preço: " + produtoDAO
                .buscarMaiorPreco());
        
        
        System.out.println("DESCRIÇÃO DOS PRODUTOS");
        List<String> produtosDescricao = produtoDAO
                .buscarDescricao();
        for (String descricao : produtosDescricao) {
            System.out.println(descricao);
        }
        
        System.out.println("DESCRIÇÃO, PREÇO E QUANTIDADE DOS PRODUTOS");
        List<Object[]> arrayProdutos = produtoDAO
                .buscarDescricaoPrecoQuantidade();
        for (Object[] arrayProduto : arrayProdutos) {
            System.out.print(arrayProduto[0] + " | ");
            System.out.print(arrayProduto[1] + " | ");
            System.out.println(arrayProduto[2]);
            
        }
        
        System.out.println("---------- DTO ----------");
        List<ProdutoDTO> produtosDTO = produtoDAO.buscarDTO();
        for (ProdutoDTO produtoDTO : produtosDTO) {
            System.out.print(produtoDTO.getDescricao() + " | ");
            System.out.print(produtoDTO.getPreco() + " | ");
            System.out.println(produtoDTO.getQuantidade());
        }
        
        
        System.out.println("---Produtos pela Categoria----");
        produtos = produtoDAO.buscarPeloIdCategoria(2);
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        
        System.out.println("----- Categoria -----");
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        List<Categoria> categorias = categoriaDAO
                .buscarPelaQuantidadeProduto(110);
        for (Categoria categoria : categorias) {
            System.out.println(categoria);
        }
        
        
        
    }

}
