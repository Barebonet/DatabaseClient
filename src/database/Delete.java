package database;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
    public static void deleteData () {
        try {
            Scanner scan = new Scanner(System.in);
            Statement myStmt = conn.createStatement();
            System.out.println("Write the table you want to delete data from:");
            String table = scan.nextLine();
            System.out.println("By what column you want to delete row?");
            String col = scan.nextLine();
            System.out.println("Type in what you want to delete:");
            String name = scan.nextLine();
            String query = "DELETE FROM " + table +" WHERE " + col + " = " + name;
            myStmt.executeQuery(query);
        }catch (SQLException e){
            System.err.println("Error occured while deleting data!");
            e.printStackTrace();
        }

    }
}
