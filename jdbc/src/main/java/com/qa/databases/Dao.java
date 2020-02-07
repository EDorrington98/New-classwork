package com.qa.databases;

import java.util.ArrayList;
import java.util.List;

public interface Dao <T> {
	public void create(T t);
	public ArrayList <T> readAll();
	public void update(T t);
	public void delete(int id);
	}


