/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStoreAndLoadTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Class.DataStoreAndLoad;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author doffl
 */
public class DataStoreAndLoadTest {
    
    public DataStoreAndLoadTest() {
    }
    
    DataStoreAndLoad dsl = new DataStoreAndLoad();

    @Test
    public void testStore() {
        dsl.store("key1=value1;key2=value2\nkeyA=valueA\nkeyB=valueB");
    }
    
    @Test
    public void testLoad() {
        Map<String, String> map1 = new HashMap<String, String>() {{
            put("key1", "value1");
            put("key2", "value2");
         }};

        Map<String, String> map2 = new HashMap<String, String>() {{
            put("keyA", "valueA");
            put("keyB", "valueB");
        }};
        
        List<Map<String, String>> a = Arrays.asList(map1, map2);
        dsl.load(a);
    }
}
