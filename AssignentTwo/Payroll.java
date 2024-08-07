/* This payroll class represents an employees payroll info including hourly wage and number of hours worked */
// LUIS CHAVEZ  SP24 DUE 2/11.
          // UML CHART
/* ---------------------------------
|           Payroll             |
---------------------------------
| - name: String                |
| - idNumber: String            |
| - hourlyPayRate: double       |
| - hoursWorked: double         |
---------------------------------
| + Payroll(name: String,      |
|           idNumber: String,   |
|           hourlyPayRate: double, |
|           hoursWorked: double) |
| + getName(): String           |
| + setName(name: String): void |
| + getIdNumber(): String       |
| + setIdNumber(idNumber: String): void |
| + getHourlyPayRate(): double |
| + setHourlyPayRate(hourlyPayRate: double): void |
| + getHoursWorked(): double   |
| + setHoursWorked(hoursWorked: double): void |
| + calculateGrossPay(): double|
---------------------------------
*/

public class Payroll {
  private String name;
  private String idNumber;
  private double hourlyPayRate;
  private double hoursWorked;

  // Constructor
  public Payroll(String name, String idNumber, double hourlyPayRate, double hoursWorked) {
      this.name = name;
      this.idNumber = idNumber;
      this.hourlyPayRate = hourlyPayRate;
      this.hoursWorked = hoursWorked;
  }

  // Accessor methods
  public String getName() {
      return name;
  }

  public String getIdNumber() {
      return idNumber;
  }

  public double getHourlyPayRate() {
      return hourlyPayRate;
  }

  public double getHoursWorked() {
      return hoursWorked;
  }

  // Mutator methods
  public void setName(String name) {
      this.name = name;
  }

  public void setIdNumber(String idNumber) {
      this.idNumber = idNumber;
  }

  public void setHourlyPayRate(double hourlyPayRate) {
      this.hourlyPayRate = hourlyPayRate;
  }

  public void setHoursWorked(double hoursWorked) {
      this.hoursWorked = hoursWorked;
  }

  // Method to calculate gross pay
  public double calculateGrossPay() {
      return hoursWorked * hourlyPayRate;
  }
}
