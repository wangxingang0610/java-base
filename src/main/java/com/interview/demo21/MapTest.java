package com.interview.demo21;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;

public class MapTest {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();

        HashMap<String,String> hashMap = new HashMap<>();

        Collections.synchronizedMap(hashMap);

    }
}
