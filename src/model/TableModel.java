package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModel<T> extends AbstractTableModel {

    private ArrayList<T> data;
    private String[] tenCot;

    public TableModel(ArrayList<T> data, String[] tenCot) {
        this.data = data;
        this.tenCot = tenCot;
    }

    @Override
    public int getRowCount() {
        return data.size(); 
    }

    @Override
    public int getColumnCount() {
        return tenCot.length; 
    }

    @Override
    public String getColumnName(int column) {
        return tenCot[column]; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
