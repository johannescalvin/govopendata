package govopendata.utils;

import java.util.List;

public class PageBar<T>{
	private List<T> resultList;

	public List<T> getResultList() {
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}
	
}
