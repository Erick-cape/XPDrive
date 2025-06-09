package org.xpdrive.dao;
import org.xpdrive.conexão.Conexao;
import org.xpdrive.model.Produto;
import java.sql.*;
import java.util.ArrayList;

public class ProdutoDAO {


    public void inserir (Produto p) {
        String sql = "INSERT INTO produto (nome, tipo, valor, quantidade) VALUES (?, ?, ?, ?)";

        try (
                //.
                Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement (sql)) {
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getTipo());
            stmt.setDouble(3, p.getValor());
            stmt.setInt(4, p.getQuantidade()); //.
            stmt.executeUpdate();
            System.out.println("Registro incluido com sucesso!!!");
        } catch (SQLException exception) {
            System.out.println("Erro ao inserir veiculo: " + exception.getMessage());
        }
    }
    public void listar() {
        ArrayList<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produtos";
        try {
            //.
            Connection conn = Conexao.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Produto p = new Produto(
                        rs.getString("nome"),
                        rs.getString("tipo"),
                        rs.getDouble("valor"),
                        rs.getInt("quantidade"));
                lista.add(p);
            }
        } catch (SQLException exception){
            System.out.println("ERRO: Não foi possível incluir o registro!!!");
        }
        System.out.println("NOME-TIPO-VALOR-QUANTIDADE");
        for (Produto p : lista) {
            System.out.println(p.getNome()+"    "+p.getTipo()+"    "+p.getValor()+"    "+p.getQuantidade());
        }
    }
    public void excluir(int id) {
        String sql = "DELETE FROM produtos WHERE id=?";
        try (

                Connection conn = Conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1,id);
            stmt.executeUpdate();

        } catch (SQLException exception) {
            System.out.println("Erro ao excluir o produto: " + exception.getMessage());
        }
        System.out.println("Registro exluído com sucesso!!!");
    }
    public void alterar(int id, Produto p) {
        String sql = "UPDATE produtos SET nome=?, tipo=?, valor=?, quantidade=? " +
                "WHERE id=?";

        try (
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, p.getNome());
                stmt.setString(2, p.getTipo());
                stmt.setDouble(3, p.getValor());
                stmt.setInt(4, p.getQuantidade());
                stmt.setInt(5, id);
                stmt.executeUpdate();
                System.out.println("Registro alterado com sucesso!!!");
        } catch (SQLException exception) {
            System.out.println("Erro ao atualizar o Produto: " + exception.getMessage());
        }
    }
}
