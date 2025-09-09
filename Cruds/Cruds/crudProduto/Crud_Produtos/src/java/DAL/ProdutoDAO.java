
package DAL;

import modelo.Produto;
import org.hibernate.Session;


/**
   CREATE TABLE `crud_prod`.`produto` (
  `idProduto` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NULL,
  `fabricante` VARCHAR(45) NULL,
  `peso` VARCHAR(45) NULL,
  `valor` VARCHAR(45) NULL,
  PRIMARY KEY (`idProduto`));

 */
public class ProdutoDAO 
{
    public String mensagem;
    Session session = Conexao.getSessionFactory().openSession();
    
    public void cadastrarProduto(Produto produto)
    {
        this.mensagem = "";
        try 
        {
            session.beginTransaction();
            session.save(produto);
            session.getTransaction().commit();
            session.close();
            this.mensagem = "Produto Cadastrado com Sucesso!";
        } 
        catch (Exception e) 
        {
            this.mensagem = "Erro BD 01";
        }
    }
}