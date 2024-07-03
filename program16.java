import java.util.*;
public class invalidexception extends Exception{
   public invalidexception(String message) {
super(message);
}


}
public class Main{
 public static void main(String args[]){
Scanner sc=new Scanner(System.in);
try{
    System.out.print("Enter Employee Id : ");
    int id=sc.nextInt();
    if(id<2001||id>5001){
        throw new invalidexception("The ID is invalid");
    }

System.out.print("Enter Employee Name: "); 
String employeeName = scanner.nextLine();
if (Character.isLowerCase(employeeName.charAt(0))) {
throw new invalidexception("First letter of Employee Name must be a capital letter.");
 }
 System.out.print("Enter Department ID: ");
  int deptId = scanner.nextInt();
if (deptId < 1 || deptId > 5) {
throw new invalidexception("Department ID must be between 1 and 5");

}
 catch (invalidexception e) {
System.out.println("Error: " + e.getMessage());
} 

}