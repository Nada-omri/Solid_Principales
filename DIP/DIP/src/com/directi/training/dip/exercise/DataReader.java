package com.directi.training.dip.exercise;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface DataReader {
    String read() throws FileNotFoundException, IOException;
}
