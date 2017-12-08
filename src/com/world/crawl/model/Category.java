package com.world.crawl.model;

public class Category {
	
	private int id;
	private String name;
	private int order;
	private String description;
	private int parentId;
	private int level;
	private String url;
	private int countLink;
	private int countryId;
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
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getCountLink() {
		return countLink;
	}
	public void setCountLink(int countLink) {
		this.countLink = countLink;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public int getCrawlStatus() {
		return crawlStatus;
	}
	public void setCrawlStatus(int crawlStatus) {
		this.crawlStatus = crawlStatus;
	}
	

}
