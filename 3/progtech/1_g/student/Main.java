package student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    private static Student readStudent(Scanner scanner) {
        String name;
        String nationality;
        double average;

        System.out.print("Név: ");
        name = scanner.next();

        System.out.print("Nemzetiség: ");
        nationality = scanner.next();

        System.out.print("Tanulmányi átlag: ");
        average = scanner.nextDouble();
        scanner.nextLine();
        return new Student(name,nationality,average);
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hallgatók száma: ");
        int studentCount = scanner.nextInt();

        for (int i = 0; i < studentCount; i++) {
            students.add(readStudent(scanner));
        }

        int worst = 0;
        int best = 0;


        for (int i=0; i < students.size(); ++i) {
            Student student = students.get(i);
            if (student.getAverage() < students.get(worst).getAverage()) {
                worst = i;
            }
            if (student.getAverage() > students.get(best).getAverage()) {
                best = i;
            }
        }

        System.out.println("Legjobb tanuló: " + students.get(best));
        System.out.println("Legrosszabb tanuló: " + students.get(worst));
        System.out.println();
        System.out.println("Ösztöndíjat kapnak: ");

        for (Student student : students) {
            if (student.getAverage() >= 4.0) {
                System.out.println(student);
            }
        }

        // Funkcionális megoldások
        System.out.println();
        System.out.println("Legjobb tanuló: " + students.stream().toList().stream().max(Comparator.comparingDouble(Student::getAverage)).orElse(null));
        System.out.println("Legrosszabb tanuló: " + students.stream().toList().stream().min(Comparator.comparingDouble(Student::getAverage)).orElse(null));

        System.out.println();
        System.out.println("Ösztöndíjat kapnak: ");
        Stream<Student> scholarship = students.stream().toList().stream().filter(student -> student.getAverage() > 4.0);
        scholarship.forEach(System.out::println);
    }
}
