import db.database;
import example.Human;

public class Main {
    public static void main(String[] args) {
        Human ali = new Human("Ali");
        database.add(ali);

        ali.name = "Ali Hosseini";

        Human aliFromTheDatabase = (Human) database.get(ali.id);

        System.out.println("ali's name in the database: " + aliFromTheDatabase.name);
    }
}