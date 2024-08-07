/*
 * Luis Chavez CIS 166
 * Description: This program  defines a class representing a die, 
 * with attributes for the number of sides and the current value. 
 * It includes methods to roll the die and retrieve its sides and value.
 * 
 *              UML:Die                  
    - sides: int                         
    - value: int                         
    - random: Random                     
    + Die()                              
    + Die(sides: int)                    
    + getSides(): int                    
    + getValue(): int                    
    + roll(): void            
*/

package src;
import java.util.Random;

public class Die {
  // priv vars for number of sides/ value
  private int sides;
  private int value;

  // random datatype for var named random
  private Random random;

  // No arg constructor..
  public Die() {
    this.sides  = 0;
  }

  // Constructor 
  public Die(int sides){
    this.sides = sides;
        random = new Random();
        roll();
  }
  // Roll method
  public void roll() {
    value = random.nextInt(sides) + 1; 
    // Generates a random number between 1 and the number user entered of sides
  }

  // Accessors for sides and value.
  public int getSides() {
    return sides;
  }
  public int getValue() {
    return value;
  }
}