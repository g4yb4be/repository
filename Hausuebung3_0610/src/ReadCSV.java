import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSV {

    private File csvFile = new File("weapons.csv");


    public List<Weapon> readCSV() throws FileNotFoundException {
        Scanner scanner = new Scanner(csvFile);
        String delimiter = ";";
        String line;
        List<Weapon> lines = new ArrayList();
        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] arr = line.split(delimiter);
            Weapon w = new Weapon(arr[0], CombatType.valueOf(arr[1]), DamageType.valueOf(arr[2]), Integer.valueOf(arr[3]), Integer.valueOf(arr[4]),Integer.valueOf(arr[5]),Integer.valueOf(arr[6]));
            lines.add(w);
        }
        lines.forEach(x -> System.out.println(x));
        return lines;
    }
}
