/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Mar 29, 2022
**/
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author jake
 *
 */
@Entity
public class beverage {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String flavor;

	public beverage() {
		super();
	}

	public beverage(String name) {
		setName(name);
	}

	public beverage(String name, String flavor) {
		setName(name);
		setFlavor(flavor);
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public String toString() {
		return "beverage [id=" + id + ", " + (name != null ? "name=" + name + ", " : "")
				+ (flavor != null ? "flavor=" + flavor : "") + "]";
	}
}
