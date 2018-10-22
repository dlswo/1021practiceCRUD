package org.aram.controller;

import org.aram.domain.Board;
import org.aram.domain.Param;
import org.aram.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {
	
	private BoardService service;
	
	@GetMapping("/list")
	public void listGET(Model model, @ModelAttribute("pageObj") Param param) {
		param.setTotal(service.count());
		model.addAttribute("list", service.getList(param));
	}
	
	@GetMapping("/register")
	public void registerGET() {
		
	}
	
	@PostMapping("/register")
	public String registerPOST(Board board, RedirectAttributes rttr) {
		
		rttr.addFlashAttribute("result", service.register(board)==1?"SUCCESS":"FAIL");
		
		return "redirect:/board/list";
	}
	
	@GetMapping({"/read","/modify"})
	public void readGET(@ModelAttribute("pageObj") Param param, Model model) {
		model.addAttribute("board", service.read(param));
	}
	
	@PostMapping("/remove")
	public String removePOST(@ModelAttribute("pageObj") Param param, RedirectAttributes rttr) {
		
		rttr.addFlashAttribute("result", service.remove(param)==1?"SUCCESS":"FAIL");

		return "redirect:/board/list";
	}
	
	@PostMapping("/modify")
	public String modifyPOST(Board board, RedirectAttributes rttr, Param param) {
		
		rttr.addFlashAttribute("result", service.update(board)==1?"SUCCESS":"FAIL");
		
		return "redirect:/board/list?page=" + param.getPage();
	}
}
