package DAO;

import MODEL.Pessoa;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DAOPessoa {
    
    private final Connection conexao;
    private final Statement stm;
    private String sql;
    
    public DAOPessoa() throws Exception{
        this.conexao = DAO.getConexao();
        this.stm = conexao.createStatement();
    }
    public void cadastrarPessoa(Pessoa p) throws Exception{
        sql="INSERT INTO PESSOA(ID, NOME, EMAIL)"+
                "VALUES('"+p.getId()+"',"+p.getNome()+","+p.getEmail()+")";
        
        stm.executeUpdate(sql);
       
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        
        stm.close();
    }
}