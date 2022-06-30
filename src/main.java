import java.util.Scanner;

public class main {

    static SQLConnector sqlc = new SQLConnector();
    searchDB sdb = new searchDB();

    public static void main(String[] args) {
        sqlc.connectToSQL();
        main m = new main();
        m.run();
        sqlc.SQLDisconnector();
    }

    public void run() {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the keyword you would like to search using: ");
            String keywordSearch = scan.next();
            sdb.searchInChessList(keywordSearch);

        }
    }
}
