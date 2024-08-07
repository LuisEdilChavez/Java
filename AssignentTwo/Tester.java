/**
 * LUIS CHAVEZ SP24 DUE 2/11
 * The Tester class is used to test the functionality of the Payroll class.
 */

 public class Tester {
  public static void main(String[] args) {
      // Creating a Payroll object
      Payroll employee1 = new Payroll("John Doe", "123456", 15.0, 40);

      // Testing accessor methods
      System.out.println("Name: " + employee1.getName());
      System.out.println("ID Number: " + employee1.getIdNumber());
      System.out.println("Hourly Pay Rate: " + employee1.getHourlyPayRate());
      System.out.println("Hours Worked: " + employee1.getHoursWorked());

      // Testing mutator methods
      employee1.setName("Jane Smith");
      employee1.setIdNumber("654321");
      employee1.setHourlyPayRate(20.0);
      employee1.setHoursWorked(45);

      System.out.println("\nUpdated Information:");
      System.out.println("Name: " + employee1.getName());
      System.out.println("ID Number: " + employee1.getIdNumber());
      System.out.println("Hourly Pay Rate: " + employee1.getHourlyPayRate());
      System.out.println("Hours Worked: " + employee1.getHoursWorked());

      // Testing calculateGrossPay method
      System.out.println("\nGross Pay: $" + employee1.calculateGrossPay());
  }
}
