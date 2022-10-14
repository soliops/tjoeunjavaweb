package com.opete95.item.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemDTO {
	private int itemid;
	private String itemname;
	private int price;
	private String description;
	private String imgurl;
}
