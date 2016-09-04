package nyc.c4q.Yojana;

public class Main {

    public static void main(String[] args) {
        Student yojana = new Student("Yojana", "Sh", 3331, "hummus");
        String fn = yojana.getFirstname();
        System.out.println(fn);
    }
}
