package database;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Connection.conn();
        System.out.println("Welcome to database client!" +
                "Let me introduce features you can do here." +
                "You may only navigate via number keys." +
                "1. Insert data to database." +
                "2. Display data from database." +
                "3. Delete data from database." +
                "4. Exit");
        int a = scan.nextInt();
        switch (a) {
            case 1:
                Insert.insertTable();
                break;
            case 2:

                break;
            case 3:
                Delete.deleteData();
                break;
            case 4:
                System.exit(0);
        }
    }
}
