package com.eduardo.auth.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserVO implements Serializable{
	private static final long serialVersionUID = 8399348356048894167L;
	
	private String userName;
	private String password;

}
