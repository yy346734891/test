package com.framestudy.springContainer.dao;

import com.framestudy.springContainer.beans.UserInfo;

public interface IUserInfoDao {
	
	public void saveUserInfo(UserInfo user) throws Exception;
	
	public void updateUserInfo(UserInfo user) throws Exception;
}
