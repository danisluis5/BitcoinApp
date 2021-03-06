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
public class CaptchaComboboxModel implements ComboBoxModel{

    private ArrayList<String> alItems = new ArrayList<>();
    private Object object = new Object();
            
    public CaptchaComboboxModel(){
        alItems.add("SM");
        alItems.add("RC");
        object = alItems.get(0);
    }
    public CaptchaComboboxModel(String temp){
        alItems.add("SM");
        alItems.add("RC");
        switch(temp){
            case "SM":
                object = alItems.get(0);
                break;
            case "RC":
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
