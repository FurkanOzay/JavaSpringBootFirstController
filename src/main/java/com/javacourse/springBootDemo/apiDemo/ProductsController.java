package com.javacourse.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductsController {
	
	@GetMapping("/")
	public String get() {
		return "Laptop";
	}
	
	@GetMapping("/products")
	public String get2() {
		return "Laptop2";
	}
	
	@GetMapping("/furkan")
	public String get3() {
		return "Merhabalar burası yeni bir controller ile yapılan yeni bir sayfa. Bu sayfanın reload olması için extra birşeye gerek yok";
	}
}

