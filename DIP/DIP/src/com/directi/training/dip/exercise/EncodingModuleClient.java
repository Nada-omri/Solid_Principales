package com.directi.training.dip.exercise;

import java.io.IOException;
import java.net.URL;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        // Utilisation avec des fichiers
        DataReader fileReader = new FileDataReader("beforeEncryption.txt");
        DataWriter fileWriter = new FileDataWriter("afterEncryption.txt");
        EncodingModule fileEncodingModule = new EncodingModule(fileReader, fileWriter);
        fileEncodingModule.encode();

        // Utilisation avec réseau et base de données
        URL url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
        DataReader networkReader = new NetworkDataReader(url);
        DataWriter databaseWriter = new DatabaseDataWriter();
        EncodingModule networkEncodingModule = new EncodingModule(networkReader, databaseWriter);
        networkEncodingModule.encode();
    }
}
