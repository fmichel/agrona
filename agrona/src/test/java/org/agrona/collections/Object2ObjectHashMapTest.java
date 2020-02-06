/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agrona.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author OmniBene, s.r.o.
 */
public class Object2ObjectHashMapTest {

    @Test
    public void testToArray()
    {
        final Object2ObjectHashMap<String, String> cut = new Object2ObjectHashMap<>();
        cut.put("a", "valA");
        cut.put("b", "valA");
        cut.put("c", "valA");

        Map.Entry<String, String>[] array = cut.entrySet().toArray();
        for (Map.Entry<String, String> entry : array)
        {
            cut.remove(entry.getKey());
        }
        assertTrue(cut.isEmpty());
    }

    @Test
    public void testToArrayWithArrayListConstructor()
    {
        final Object2ObjectHashMap<String, String> cut = new Object2ObjectHashMap<>();
        cut.put("a", "valA");
        cut.put("b", "valA");
        cut.put("c", "valA");

        List<Entry<String, String>> list = new ArrayList<>(cut.entrySet());
        for (Map.Entry<String, String> entry : list)
        {
            cut.remove(entry.getKey());
        }
        assertTrue(cut.isEmpty());
    }

}
