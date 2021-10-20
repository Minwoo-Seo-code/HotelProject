package com.project.dto;

import java.sql.Timestamp;
	import lombok.Data;
	import lombok.Getter;
	import lombok.Setter;

@Getter
@Setter
@Data
	
public class CartVO {

		private int cartSeq;
		private String userId; 
		private int hotelSeq;
		private String hotelName;
		private String checkInDate;
		private String checkOutDate;
		private int lengthOfStay;
		private int hotelPrice;
		private Timestamp indate;
		private String hotelImage;
	}

