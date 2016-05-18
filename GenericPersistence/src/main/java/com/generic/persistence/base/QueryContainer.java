package com.generic.persistence.base;

import java.util.Properties;

public class QueryContainer {
	
	public static final String SHEMA = "GENERIC";
	Properties queries;

	public Properties getQueries() {
		return queries;
	}

	public void setQueries(Properties queries) {
		this.queries = queries;
	}
	
	public String get(String key){
		return (this.queries.getProperty(key).replace("[SCHEMA]", QueryContainer.SHEMA));
	}
}
