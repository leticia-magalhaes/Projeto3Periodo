/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoFonte;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Letícia Magalhães
 */
    public class ModeloTabela extends AbstractTableModel{
        
    private ArrayList linhas = null;
    private String[] colunas = null;
   
    public ModeloTabela(ArrayList linha, String[] coluna){
   
   
    setLinhas(linhas);
    setColunas(colunas);
   
}

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    @Override
    public int getRowCount(){
        return linhas.size();
    }
    @Override
    public String   getColumnName(int numColunas){
        return colunas[numColunas];
    }
    @Override
    public Object getValueAt(int numLinha, int numColuna) {
        Object [] linha = (Object[])getLinhas().get(numLinha);
        return linha[numColuna];
    }

    
    
    
}
