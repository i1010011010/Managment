package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtils
    {
    public static void createNewFile(String filename) throws IOException
        {
        File file = new File(filename);
        file.createNewFile();
        }
    public static void clearFile(String filename) throws FileNotFoundException
        {
        PrintWriter printWriter = new PrintWriter(filename);
        printWriter.close();
        }

    }
