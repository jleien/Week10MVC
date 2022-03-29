/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Mar 29, 2022
**/
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.beverage;
import dmacc.repo.bevrepo;

/**
 * @author jake
 *
 */
@Controller
public class webcontroller {
	@Autowired
	bevrepo repo;
	
	@GetMapping({ "/", "viewAll" })
	public String viewAllBevs(Model model) {
		if (repo.findAll().isEmpty()) {
			return addNewBev(model);
		}
		model.addAttribute("beverages", repo.findAll());
		return "results";
	}

	@GetMapping("/inputBev")
	public String addNewBev(Model model) {
		beverage b = new beverage();
		model.addAttribute("newBev", b);
		return "input";
	}

	@GetMapping("/edit/{id}")
	public String showUpdateBev(@PathVariable("id") long id, Model model) {
		beverage b = repo.findById(id).orElse(null);
		model.addAttribute("newBev", b);
		return "input";
	}

	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		beverage b = repo.findById(id).orElse(null);
		repo.delete(b);
		return viewAllBevs(model);
	}

	@PostMapping("/inputBev")
	public String addNewBev(@ModelAttribute beverage b, Model model) {
		repo.save(b);
		return viewAllBevs(model);
	}

	@PostMapping("/update/{id}")
	public String reviseBev(beverage b, Model model) {
		repo.save(b);
		return viewAllBevs(model);
	}
}
