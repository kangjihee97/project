package kr.co.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.service.BoardService;
import kr.co.vo.BoardVo;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	BoardService service;
	
	// 게시판 글 작성 화면
	@RequestMapping(value = "/board/writeView", method = RequestMethod.GET)
	public void writeView() throws Exception{
		System.out.println("writeView");
		
	}
	
	// 게시판 글 작성
	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public String write(BoardVo boardVo) throws Exception{
		System.out.println("write");
		
		service.write(boardVo);
		
		return "redirect:/";
	}
	
	// 게시판 목록 조회
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		model.addAttribute("list", service.list());
		return "board/list";

	}
	
	// 게시판 조회
	@RequestMapping(value = "/readView", method = RequestMethod.GET)
	public String read(BoardVo boardVo, Model model) throws Exception {
		model.addAttribute("read", service.read(boardVo.getBoardNum()));
		return "board/readView";
	}
	
	// 게시판 수정뷰
	@RequestMapping(value = "/updateView", method = RequestMethod.GET)
	public String updateView(BoardVo boardVo, Model model) throws Exception {
		model.addAttribute("update", service.read(boardVo.getBoardNum()));
		return "board/updateView";
	}

	// 게시판 수정
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(BoardVo boardVo) throws Exception {
		service.update(boardVo);
		return "redirect:/board/list";
	}

	// 게시판 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(BoardVo boardVo) throws Exception {
		service.delete(boardVo.getBoardNum());
		return "redirect:/board/list";
	}
}
