package kr.smhrd.lunch.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.smhrd.lunch.dto.GoodsDTO;
import kr.smhrd.lunch.service.GoodsService;
import lombok.RequiredArgsConstructor;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GoodsController {
	
	
	private final GoodsService service;

	@GetMapping("/goods_list")
	public List<GoodsDTO> getGoodsList() {
		System.out.println("요청확인이요");
		
		return service.getGoods();
	}
	
	@GetMapping("/goods_list/{id}")
	public GoodsDTO getDetail(@PathVariable("id") int id) {
		
		return service.getGoodsDetail(id);
	}
	
}
