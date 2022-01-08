package database;

import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
    public static void insertTable() {
        try{
            Scanner scan = new Scanner(System.in);
            Statement stmt = conn.createStatement();
            System.out.println("Type in name of the table you want to insert data into: ");
            String tabela = scan.nextLine();
            String id = scan.nextLine();
            String wejscie1 = scan.nextLine();
            String wejscie2 = scan.nextLine();
            String wejscie3 = scan.nextLine();
            String query = "INSERT INTO " + tabela + " VALUES (" + id + ", " + wejscie1 + ", " + wejscie2 + ", " + wejscie3 + ")";
            stmt.executeQuery(query);
        } catch (SQLException ex) {
            System.err.println("Error occured while addind data!");
            ex.printStackTrace();
        }
    }
}
