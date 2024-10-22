package com.directi.training.dip.exercise;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

public class MyDatabase implements DataWriter {
	private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;

    @Override
    public void write(String encodedString) {
        _data.put(++_count, encodedString);
    }
}
