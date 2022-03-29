/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Mar 29, 2022
**/
package dmacc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.beverage;


/**
 * @author jake
 *
 */
public interface bevrepo extends JpaRepository<beverage, Long> {

}
