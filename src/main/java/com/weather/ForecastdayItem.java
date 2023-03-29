package com.weather;

import java.util.HashMap;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ForecastdayItem{

	@JsonProperty("date")
	private String date;

	@JsonProperty("astro")
	private Astro astro;

	@JsonProperty("date_epoch")
	private int dateEpoch;

	@JsonProperty("hour")
	private List<HourItem> hour;

	@JsonProperty("day")
	private Day day;

	public ForecastdayItem() { 	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setAstro(Astro astro){
		this.astro = astro;
	}

	public Astro getAstro(){
		return astro;
	}

	public void setDateEpoch(int dateEpoch){
		this.dateEpoch = dateEpoch;
	}

	public int getDateEpoch(){
		return dateEpoch;
	}

	public void setHour(List<HourItem> hour){
		this.hour = hour;
	}

	public List<HourItem> getHour(){
		return hour;
	}

	public void setDay(Day day){
		this.day = day;
	}

	public Day getDay(){
		return day;
	}

	@Override
	public String toString() {
		return "ForecastdayItem{" +
				"date='" + date + '\'' +
				", astro=" + astro +
				", dateEpoch=" + dateEpoch +
				", hour=" + hour +
				", day=" + day +
				'}';
	}

	public HashMap<String, Object> getForecastAll() {
		HashMap<String, Object> newMap = new HashMap<>();
		newMap.put("date", date);
		newMap.put("asto", astro);
		newMap.put("dateEpoch", dateEpoch);
		newMap.put("hour", hour);
		newMap.put("day", day);
		return newMap;
	}
}