package hh.palvohj.bookstore.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.palvohj.bookstore.domain.Book;

@Controller
public class BookController {

@RequestMapping(value="/index", method=RequestMethod.GET)
	
	public String uusiAuto(Model model) {
		Book book1 = new Book(); //luodaan uusi tyhjä kirjaolio
		model.addAttribute("book", book1);
		return "index"; //index.html.html (Thymeleaf template)
	}
	
}
