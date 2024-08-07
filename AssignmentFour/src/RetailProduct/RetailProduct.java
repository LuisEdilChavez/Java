/*
 *  Luis Chavez CIS 166  3/2/24
 *  Description: This program contains fields for product name, price and quantity.
 *  It contains constructors that initializes all fields.
 *  This is to be accessed by the testRetailProduct.java file that is submitted along this one.
 *  
 * 	 
 *      			UML          	
 *      		RetailProduct          
*
*  - name: String                    
*  - price: double                   
*  - quantity: int                   
* 
*  + RetailProduct()                 
* + setPrice(double price): void    
*  + setQuantity(int quantity): void 
*  + getPrice(): double              
*  + getQuantity(): int              
*/

package RetailProduct;

public class RetailProduct {

	 String name;
	  double price;
	  int quantity;

	  // Constructor
	  RetailProduct() { }

	  // setters
	  public void setPrice(double price) {
	    this.price = price;
	  }

	  public void setQuantity(int quantity) {
	    this.quantity = quantity;
	  }

	  // getters
	  public double getPrice(double price) {
	    return price;
	  }

	  public int getQuantity(int quantity) {
	    return quantity;
	  }

	}
