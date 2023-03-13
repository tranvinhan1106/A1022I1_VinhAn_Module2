package ss16_IO_TextFile_to_java.exercise.exercise_2;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter source file:");
            File sourceFile = new File(scanner.nextLine());
            System.out.print("Enter dest file:");
            File destFile = new File(scanner.nextLine());
            if (!sourceFile.exists()&&!destFile.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();
            System.out.println("the file has been copied successfully !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

