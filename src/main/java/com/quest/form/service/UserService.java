package com.quest.form.service;

import java.util.List;

import com.quest.form.model.User;

public interface UserService {

	User findById(Integer id);
	
	List<User> findAll();

	void saveOrUpdate(User user);

	
}