import java.sql.SQLException;

public class searchDB extends SQLConnector{


    public void searchInChessList(String valueToSearch){
        int rowCounter2 = 1;
        boolean valueObtained = false;
        try{
            setResultSet("*", "rating_database");
            while(rs.next()){
                rs.absolute(rowCounter2);
                if (((rs.getString(1)).equals(valueToSearch)) || ((String.valueOf(rs.getInt(2))).equals(valueToSearch)) || (rs.getString(3).equals(valueToSearch)) || (rs.getString(4).equals(valueToSearch)) || (rs.getString(5).equals(valueToSearch))){
                    System.out.println("\nName-----------USCF ID-----------Membership Expiration Date-----------State-----------Rating");
                    System.out.println(rs.getString(1) + "           " + rs.getInt(2) + "                 " + rs.getString(3) + "                           " + rs.getString(4) + "           " + rs.getString(5) + "\n");
                    System.out.println("----------------------------------------------------------------------------------------------");
                    valueObtained = true;
                }
                rowCounter2++;
            }
            if(!(valueObtained)){
                System.out.println("No values found!!");
            }
        } catch (SQLException se){
            System.out.println(se);
            System.out.println("Error Code 11");
        }
    }





}
