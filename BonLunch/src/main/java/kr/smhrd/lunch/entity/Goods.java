package kr.smhrd.lunch.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="goods")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
	
	@Id
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String price;
	
	@Column(name = "is_new", nullable= false)
	private Boolean isNew;
	
	@Column(name = "is_best", nullable= false)
	private Boolean isBest;
	
	@Column(nullable=false)
	private String main_thumb;
	
	@OneToOne(mappedBy = "goods",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private GoodsDetail goodsDetail;
	
}
