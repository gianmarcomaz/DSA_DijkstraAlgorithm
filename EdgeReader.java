package dijkstraalgorithm;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class EdgeReader {

    private String file_path;

    public EdgeReader(String file_path) {
        this.file_path = file_path;
    }

    public ArrayList<String[]> read() throws FileNotFoundException {
        ArrayList<String[]> data = new ArrayList<>();
        File f = new File(this.file_path);
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            String line = s.nextLine();
            if (line.startsWith("#")) {
                continue;
            }
            String fields[] = line.split(",");
            data.add(fields);
        }
        s.close();
        return data;
    }
}
