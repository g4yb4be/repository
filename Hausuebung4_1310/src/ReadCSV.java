import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReadCSV {

    public List<String[]> readCSV(File file) throws IOException {
        List<String[]> list;
        list = Files.readAllLines(file.toPath()).stream().map(string -> string.split(":")).collect(Collectors.toList());
        for()
        return list;
    }
}
