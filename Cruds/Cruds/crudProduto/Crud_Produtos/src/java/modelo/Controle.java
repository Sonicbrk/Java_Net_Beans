package modelo;

import DAL.ProdutoDAO;
import java.util.List;

public class Controle 
{
    public String mensagem ="";
    public void cadastrarProduto(List<String> listaDadosProdutos)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarProduto(listaDadosProdutos);
        if(validacao.mensagem.equals(""))
        {
            Produto produto = new Produto();
            produto.setTitulo(listaDadosProdutos.get(0));
            produto.setFabricante(listaDadosProdutos.get(1));
            produto.setPeso(listaDadosProdutos.get(2));
            produto.setValor(listaDadosProdutos.get(3));
            ProdutoDAO produtoDAO = new ProdutoDAO();
            produtoDAO.cadastrarProduto(produto);
            this.mensagem = produtoDAO.mensagem;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
}
