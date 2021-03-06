/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package render;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author vuongluis
 */
public class BankComboboxModel implements ComboBoxModel{

    private ArrayList<String> alItems = new ArrayList<>();
    private Object object = new Object();
    
    public BankComboboxModel(){
        alItems.add("FaucetBOX");
        alItems.add("ePay");
        object = alItems.get(0);
    }
    public BankComboboxModel(String temp){
        alItems.add("FaucetBOX");
        alItems.add("ePay");
        switch(temp){
            case "FaucetBOX":
                object = alItems.get(0);
                break;
            case "ePay":
                object = alItems.get(1);
                break;
            default:
               object = alItems.get(0);
        }
    }
    @Override
    public void setSelectedItem(Object anItem) {
        object = anItem;
    }

    @Override
    public Object getSelectedItem() {
        return object;
    }

    @Override
    public int getSize() {
        return alItems.size();
    }

    @Override
    public Object getElementAt(int index) {
        return alItems.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        //
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        //
    }
    
}
