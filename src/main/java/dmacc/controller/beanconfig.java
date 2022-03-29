/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Mar 29, 2022
**/
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.beverage;

/**
 * @author jake
 *
 */
@Configuration
public class beanconfig {

	@Bean
	public beverage bev() {
		beverage bean = new beverage("La Croix");
		return bean;
	}
}
