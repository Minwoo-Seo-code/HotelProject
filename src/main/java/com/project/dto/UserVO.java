package com.project.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserVO {
	private String userId;
	private String userName;
	private String userPwd;
	private String userEmail;
	private String userPhone;
	private int userGrade;
}
