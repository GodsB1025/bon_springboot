package kr.smhrd.lunch.dto;

import kr.smhrd.lunch.entity.Goods;
import kr.smhrd.lunch.entity.GoodsDetail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsDTO {

	private Integer id;
	private String name;
	private String price;
	private Boolean isNew;
	private Boolean isBest;
	private String main_thumb;
	
	// GoodsDetail 물품의 상세 정보 객체
	private String summary;
	private String txt;
	private String sub_thumb;
	
	
	public static GoodsDTO fromEntity(Goods goods) {
		GoodsDetail detail = goods.getGoodsDetail();
		return GoodsDTO.builder()
				.id(goods.getId())
				.isBest(goods.getIsBest())
				.isNew(goods.getIsNew())
				.main_thumb(goods.getMain_thumb())
				.name(goods.getName())
				.price(goods.getPrice())
				.summary(detail != null ? detail.getSummary() : null) 
				.txt(detail != null ? detail.getTxt() : null)         
				.sub_thumb(detail != null ? detail.getSub_thumb() : null)
				.build();
		
	}
	
}
