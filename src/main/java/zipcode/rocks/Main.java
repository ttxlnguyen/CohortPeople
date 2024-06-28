package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "TenFiveZero.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

        List listOfStudents = programObject.loadCSVFile(student_source);

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }
    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;

    }

    private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.
        String[] values = line.split(COMMA_DELIMITER);
        Person newPerson = new Person(values[0], values[1],values[2],values[3],values[4],values[5]);
        return newPerson;
//        return null;
    }
//    private List handWrittenLoadOfData() {
//        ArrayList<Person> students = new ArrayList<>();
//
//        Person newPerson1 = new Person("Teddy", "Archibald", "half & half", "red", "March", false);
//        newPerson1.setBeverage("half & half");
//        newPerson1.setFavColor("red");
//        newPerson1.setBirthMonth("March");
//        newPerson1.setPets(false);
//        students.add(newPerson1);
//
//        Person newPerson2 = new Person("Peter", "Beever", "coffee", "gray", "August", true);
//        newPerson2.setBeverage("coffee");
//        newPerson2.setFavColor("gray");
//        newPerson2.setBirthMonth("August");
//        newPerson2.setPets(true);
//        students.add(newPerson2);
//
//        Person newPerson3 = new Person("Tim", "Linkous", "water", "green", "September", false);
//        newPerson3.setBeverage("water");
//        newPerson3.setFavColor("green");
//        newPerson3.setBirthMonth("September");
//        newPerson3.setPets(false);
//        students.add(newPerson3);
//
//        Person newPerson4 = new Person("Qian", "Wang", "water", "blue", "October", false);
//        newPerson4.setBeverage("water");
//        newPerson4.setFavColor("blue");
//        newPerson4.setBirthMonth("October");
//        newPerson4.setPets(false);
//        students.add(newPerson4);
//
//        Person newPerson5 = new Person("Diptika", "Devi", "tea", "orange", "June", false);
//        newPerson5.setBeverage("tea");
//        newPerson5.setFavColor("orange");
//        newPerson5.setBirthMonth("June");
//        newPerson5.setPets(false);
//        students.add(newPerson5);
//
//        Person newPerson6 = new Person("Ian", "Gordon", "water", "green", "April", true);
//        newPerson6.setBeverage("water");
//        newPerson6.setFavColor("green");
//        newPerson6.setBirthMonth("April");
//        newPerson6.setPets(true);
//        students.add(newPerson6);
//
//        Person newPerson7 = new Person("Tim", "Nguyen", "bubble tea", "white", "November", true);
//        newPerson7.setBeverage("bubble tea");
//        newPerson7.setFavColor("white");
//        newPerson7.setBirthMonth("November");
//        newPerson7.setPets(true);
//        students.add(newPerson7);
//
//        Person newPerson8 = new Person("Bryan", "Smith", "water", "brown", "May", false);
//        newPerson8.setBeverage("water");
//        newPerson8.setFavColor("brown");
//        newPerson8.setBirthMonth("May");
//        newPerson8.setPets(false);
//        students.add(newPerson8);
//
//        Person newPerson9 = new Person("Johnathan", "Diehl", "coffee", "green", "February", true);
//        newPerson9.setBeverage("coffee");
//        newPerson9.setFavColor("green");
//        newPerson9.setBirthMonth("February");
//        newPerson9.setPets(true);
//        students.add(newPerson9);
//
//        Person newPerson10 = new Person("Jared", "Thacker", "water", "green", "December", true);
//        newPerson10.setBeverage("water");
//        newPerson10.setFavColor("green");
//        newPerson10.setBirthMonth("December");
//        newPerson10.setPets(true);
//        students.add(newPerson10);
//
//        Person newPerson11 = new Person("Robbie", "Niemeyer", "water", "blue", "January", false);
//        newPerson11.setBeverage("water");
//        newPerson11.setFavColor("blue");
//        newPerson11.setBirthMonth("January");
//        newPerson11.setPets(false);
//        students.add(newPerson11);
//
//        Person newPerson12 = new Person("Mohammed", "N.", "snapple", "green", "August", false);
//        newPerson12.setBeverage("snapple");
//        newPerson12.setFavColor("green");
//        newPerson12.setBirthMonth("August");
//        newPerson12.setPets(false);
//        students.add(newPerson12);
//
//        Person newPerson13 = new Person("Josue", "Castro", "coffee", "blue", "June", true);
//        newPerson13.setBeverage("coffee");
//        newPerson13.setFavColor("blue");
//        newPerson13.setBirthMonth("June");
//        newPerson13.setPets(true);
//        students.add(newPerson13);
//
//        Person newPerson14 = new Person("Corey", "Ross", "water", "black", "October", false);
//        newPerson14.setBeverage("water");
//        newPerson14.setFavColor("black");
//        newPerson14.setBirthMonth("October");
//        newPerson14.setPets(false);
//        students.add(newPerson14);
//
//        Person newPerson15 = new Person("Will", "Chapman", "water", "purple", "December", false);
//        newPerson15.setBeverage("water");
//        newPerson15.setFavColor("purple");
//        newPerson15.setBirthMonth("December");
//        newPerson15.setPets(false);
//        students.add(newPerson15);
//
//        return students;
//    }
}
