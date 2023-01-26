import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {

    public FileHandler() {

    }
    
    public File createFile(String pathName) {
        return new File(pathName);
    }

    public String[] readDataFromFile(File file) {
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(file));
            String st;
            ArrayList<String> strArray = new ArrayList<String>();
            while ((st = buffReader.readLine()) != null) {
                strArray.add(st);
            }
            buffReader.close();
            return strArray.toArray(new String[strArray.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean writeDataToFile(File file, String data) {
        try {
            FileWriter fWriter = new FileWriter(file);
            fWriter.write(data);
            fWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean appendDataToFile(File file, String data) {
        try {
            FileWriter fWriter = new FileWriter(file, true);
            fWriter.write(data + "\n");
            fWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    
}