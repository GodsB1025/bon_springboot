package kr.smhrd.lunch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="goods_detail")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsDetail {

	@Id
	private Integer goods_id;
	
	@Column(name="summary")
	private String summary;
	
	@Column(name="txt")
	private String txt;
	
	@Column(nullable = false)
	private String sub_thumb;
	
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name="goods_id")
	private Goods goods;
}
