package net.sotanobinario.boot.controllers;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.sotanobinario.boot.database.test.SimpleEO;

@Controller
public class HomeControler {
	
	@Autowired
	private SqlSession sqlSession;
	
	@GetMapping("/home")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
		List<SimpleEO> listado;
		
		listado = sqlSession.selectList("inicio.listado");
		
		model.addAttribute("name", name);
		model.addAttribute("listado", listado);
		
		return "home";
	}
}
