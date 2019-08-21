package com.example.demo;

public class FeignClientFallback implements UserFiegnClient {

	@Override
	public Users findById(Long id) {
		// TODO Auto-generated method stub
		Users users=new Users();
		users.setName("出现错误的用户");
		return users;
	}

}
