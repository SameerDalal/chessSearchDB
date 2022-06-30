import java.sql.SQLException;

public class addToDataBase extends SQLConnector {

    public String addDatabaseSQLString(String name, String uscfId, String membershipExpirationDate, String state, String rating, String table1) {
        return "INSERT INTO " + table1 + " " + "VALUES (" + name + "," + "'" + uscfId + "','" + membershipExpirationDate + "'," + state  + "," + "'" + rating + ")";
    }


    public void addToDatabase(String name, String uscfId, String membershipExpirationDate, String state, String rating, String table) {
        int counter = 0;
        try {
            statement.executeUpdate(addDatabaseSQLString(name,uscfId,membershipExpirationDate,state,rating,table));
        } catch (SQLException se) {
            System.out.println(se + "\n");
            counter++;
            System.out.println("Error Code 3");
        } finally {
            if (counter == 0) {
                System.out.println("Added " + name + " " + uscfId + " " + membershipExpirationDate + " " + state + " " + rating + "to the Database!\n");
            } else {
                System.out.println("Data: " + name + " " + uscfId + " " + membershipExpirationDate + " " + state + " " + rating + " has NOT been successfully added!\n");
            }
        }
    }
}


