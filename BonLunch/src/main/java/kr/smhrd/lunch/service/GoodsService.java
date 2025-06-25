package kr.smhrd.lunch.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.smhrd.lunch.dto.GoodsDTO;
import kr.smhrd.lunch.entity.Goods;
import kr.smhrd.lunch.repository.GoodsRepository;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class GoodsService {
	
	
	private final GoodsRepository repository;

	public List<GoodsDTO> getGoods() {

		return repository.findAll().stream().map(GoodsDTO::fromEntity).toList();
		
		
	}

	public GoodsDTO getGoodsDetail(int id) {
		
		Goods goods = repository.findById(id).orElse(null);
		
		return GoodsDTO.fromEntity(goods);
	}
	
	
}
