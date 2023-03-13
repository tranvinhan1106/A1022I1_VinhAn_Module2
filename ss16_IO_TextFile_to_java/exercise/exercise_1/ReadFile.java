package ss16_IO_TextFile_to_java.exercise.exercise_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String FILE_PATH = "D:\\V.An\\moudule2\\A1022I1_VinhAn_Module2\\src\\ss16_IO_TextFile_to_java\\exercise\\ListCountry.csv";

    public static List<Country> ReaderFileCSV() {
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader br = new BufferedReader(fileReader);
            List<Country> countryList = new ArrayList<>();
            String line;
            String[] temp;
            while ((line = br.readLine()) != null) {
                temp = line.split(",");
                String id = temp[0];
                String name = temp[1];
                String abbreviations = temp[2];
                Country country = new Country(id, abbreviations, name);
                countryList.add(country);
            }
            br.close();
            return countryList;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void main(String[] args) {
        List<Country> countryList = ReaderFileCSV();
        for (Country country : countryList) {
            System.out.println(country);
        }
    }
}

