public class Test0{
public static void main(Strings[] args){

try{
Class.forName("com.mysql.cj.jdbc.Driver);
String connectionURL ="jdbc: mysql://localhost/booksdb";
Connection conn = DriveManager.Connection(connectionURL,"root","<passwordhere>");
int bid=102;
String bookTitle ="sql essentials";
String author ="jerry";
int price =295;

String insertQuery =String.format(delete fromm books where id =%d",101);
Statement start =conn.createStatement();
String selectQuery = "seelct from books";
ResultSet result = start.executeQuery(selectQuery);
while(result.next()){
System.out.println(result.getString(1)+ " " +result.getString(2));
start.execute(insertQuery);
start.close();
conn.close();
System.out.println("connected to server successfully");
conn.close();}
catch(Exception e){
e.printStackTrace();
}}}
