package com.codetest.animalfarm.model;
/**
 * DTO for Animal statistics
 * @author Prabhakar M
 *
 */
public class AnimalStatsDTO {
	private long swimmableCount;
	private long singableCount;
	private long walkableCount;
	private long flyableCount;
	public long getSwimmableCount() {
		return swimmableCount;
	}
	public void setSwimmableCount(long swimmableCount) {
		this.swimmableCount = swimmableCount;
	}
	public long getSingableCount() {
		return singableCount;
	}
	public void setSingableCount(long singableCount) {
		this.singableCount = singableCount;
	}
	public long getWalkableCount() {
		return walkableCount;
	}
	public void setWalkableCount(long walkableCount) {
		this.walkableCount = walkableCount;
	}
	public long getFlyableCount() {
		return flyableCount;
	}
	public void setFlyableCount(long flyableCount) {
		this.flyableCount = flyableCount;
	}
	
}
