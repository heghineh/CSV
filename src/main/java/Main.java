import com.github.javafaker.Faker;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        File file = new File("peopleData.csv");

        try (
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(String.valueOf(file)));

                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                        .withHeader("Name", "Last Name", "Date", "Race", "Phone Number", "Email"));
        ) {
            myRandomRaceGenerator myRandomRaceGenerator = new myRandomRaceGenerator();
            myRandomEmailGenerator myRandomEmailGenerator = new myRandomEmailGenerator();

            for (int i = 0; i < 100; i++) {
                Person person = new Person(faker.name().firstName(), faker.name().lastName(), faker.date(), myRandomRaceGenerator.generateRace(), faker.phoneNumber(), myRandomEmailGenerator.generateEmail());
                csvPrinter.printRecord(person.getName(), person.getSurname(), person.getDate().birthday(), person.getRace(), person.getPhoneNumber().phoneNumber(), person.getEmail());
            }

            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}