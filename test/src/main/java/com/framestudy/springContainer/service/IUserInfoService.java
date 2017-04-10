package com.framestudy.springContainer.service;

import com.framestudy.springContainer.beans.UserInfo;

public interface IUserInfoService {

	public void saveUserInfo(UserInfo user) throws Exception;
	
	public void updateUserInfo(UserInfo user) throws Exception;
	
}
