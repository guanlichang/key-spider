package org.yi.spider.model;

import org.yi.spider.entity.ChapterEntity;

public class PreNextChapter {
	
	private Integer pre;
	
	private Integer next;
	
	private Integer current;
	
	private ChapterEntity preChapter;
	
	private ChapterEntity nextChapter;
	
	private ChapterEntity currentChapter;
	
	private String preURL;
	
	private String nextURL;
	
	private String currentURL;
	
	private String chapterListURL;

	public Integer getPre() {
		return pre;
	}

	public void setPre(Integer pre) {
		this.pre = pre;
	}

	public Integer getNext() {
		return next;
	}

	public void setNext(Integer next) {
		this.next = next;
	}

	public ChapterEntity getPreChapter() {
		return preChapter;
	}

	public void setPreChapter(ChapterEntity preChapter) {
		this.preChapter = preChapter;
	}

	public ChapterEntity getNextChapter() {
		return nextChapter;
	}

	public void setNextChapter(ChapterEntity nextChapter) {
		this.nextChapter = nextChapter;
	}

	public String getPreURL() {
		return preURL;
	}

	public void setPreURL(String preURL) {
		this.preURL = preURL;
	}

	public String getNextURL() {
		return nextURL;
	}

	public void setNextURL(String nextURL) {
		this.nextURL = nextURL;
	}

	public Integer getCurrent() {
		return current;
	}

	public void setCurrent(Integer current) {
		this.current = current;
	}

	public ChapterEntity getCurrentChapter() {
		return currentChapter;
	}

	public void setCurrentChapter(ChapterEntity currentChapter) {
		this.currentChapter = currentChapter;
	}

	public String getCurrentURL() {
		return currentURL;
	}

	public void setCurrentURL(String currentURL) {
		this.currentURL = currentURL;
	}

	public String getChapterListURL() {
		return chapterListURL;
	}

	public void setChapterListURL(String chapterListURL) {
		this.chapterListURL = chapterListURL;
	}
	
}
