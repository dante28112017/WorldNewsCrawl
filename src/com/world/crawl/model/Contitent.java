package com.world.crawl.model;

public class Contitent {
	private int id;
	private String name;
	private String url;
	private int crawlStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getCrawlStatus() {
		return crawlStatus;
	}
	public void setCrawlStatus(int crawlStatus) {
		this.crawlStatus = crawlStatus;
	}
	
}
