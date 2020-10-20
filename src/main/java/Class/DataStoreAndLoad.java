/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Dylan Hartojo
 */
public class DataStoreAndLoad {
    
    List<Map<String, String>> mapList = new ArrayList<>(0);
    
    
    public void store(String text) {
 
        String arr[];
        List<Map<String, String>> a = new ArrayList<>(0);
 
        //first seperate by new line (index)
        arr = text.split("\n");
 
        //then seperate by colon
        for(int i=0; i<arr.length; i++) {
            Map<String, String> map = new HashMap<>();
            String[] arr2;
            arr2 = arr[i].split(";");
            
        //then seperate by equals
            for(int j=0; j<arr2.length; j++) {
                String[] arr3;
                arr3 = arr2[j].split("=");
                map.put(arr3[0], arr3[1]);
            }
        a.add(map);
    }
 
    System.out.println(a);
  }
 
  public void load(List<Map<String, String>> a) {
 
    String text = "";
    int counter = 1;
    for(Map<String, String> map : a) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            text = text.concat(entry.getKey() + "=" + entry.getValue() + ";");
        }
        
        if(counter != a.size()) {
          text = text.concat("\\n");
        }
        
        counter++;
    }
 
    System.out.println(text);
  }
       
    public static void main(String[] args) {
        
    }
}
