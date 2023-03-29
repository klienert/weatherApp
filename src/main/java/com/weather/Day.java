package com.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Day{

	@JsonProperty("avgvis_km")
	private Object avgvisKm;

	@JsonProperty("uv")
	private Object uv;

	@JsonProperty("avgtemp_f")
	private Object avgtempF;

	@JsonProperty("avgtemp_c")
	private Object avgtempC;

	@JsonProperty("daily_chance_of_snow")
	private int dailyChanceOfSnow;

	@JsonProperty("maxtemp_c")
	private Object maxtempC;

	@JsonProperty("maxtemp_f")
	private Object maxtempF;

	@JsonProperty("mintemp_c")
	private Object mintempC;

	@JsonProperty("avgvis_miles")
	private Object avgvisMiles;

	@JsonProperty("daily_will_it_rain")
	private int dailyWillItRain;

	@JsonProperty("mintemp_f")
	private Object mintempF;

	@JsonProperty("totalprecip_in")
	private Object totalprecipIn;

	@JsonProperty("totalsnow_cm")
	private Object totalsnowCm;

	@JsonProperty("avghumidity")
	private Object avghumidity;

	@JsonProperty("condition")
	private Condition condition;

	@JsonProperty("maxwind_kph")
	private Object maxwindKph;

	@JsonProperty("maxwind_mph")
	private Object maxwindMph;

	@JsonProperty("daily_chance_of_rain")
	private int dailyChanceOfRain;

	@JsonProperty("totalprecip_mm")
	private Object totalprecipMm;

	@JsonProperty("daily_will_it_snow")
	private int dailyWillItSnow;

	public void setAvgvisKm(Object avgvisKm){
		this.avgvisKm = avgvisKm;
	}

	public Object getAvgvisKm(){
		return avgvisKm;
	}

	public void setUv(Object uv){
		this.uv = uv;
	}

	public Object getUv(){
		return uv;
	}

	public void setAvgtempF(Object avgtempF){
		this.avgtempF = avgtempF;
	}

	public Object getAvgtempF(){
		return avgtempF;
	}

	public void setAvgtempC(Object avgtempC){
		this.avgtempC = avgtempC;
	}

	public Object getAvgtempC(){
		return avgtempC;
	}

	public void setDailyChanceOfSnow(int dailyChanceOfSnow){
		this.dailyChanceOfSnow = dailyChanceOfSnow;
	}

	public int getDailyChanceOfSnow(){
		return dailyChanceOfSnow;
	}

	public void setMaxtempC(Object maxtempC){
		this.maxtempC = maxtempC;
	}

	public Object getMaxtempC(){
		return maxtempC;
	}

	public void setMaxtempF(Object maxtempF){
		this.maxtempF = maxtempF;
	}

	public Object getMaxtempF(){
		return maxtempF;
	}

	public void setMintempC(Object mintempC){
		this.mintempC = mintempC;
	}

	public Object getMintempC(){
		return mintempC;
	}

	public void setAvgvisMiles(Object avgvisMiles){
		this.avgvisMiles = avgvisMiles;
	}

	public Object getAvgvisMiles(){
		return avgvisMiles;
	}

	public void setDailyWillItRain(int dailyWillItRain){
		this.dailyWillItRain = dailyWillItRain;
	}

	public int getDailyWillItRain(){
		return dailyWillItRain;
	}

	public void setMintempF(Object mintempF){
		this.mintempF = mintempF;
	}

	public Object getMintempF(){
		return mintempF;
	}

	public void setTotalprecipIn(Object totalprecipIn){
		this.totalprecipIn = totalprecipIn;
	}

	public Object getTotalprecipIn(){
		return totalprecipIn;
	}

	public void setTotalsnowCm(Object totalsnowCm){
		this.totalsnowCm = totalsnowCm;
	}

	public Object getTotalsnowCm(){
		return totalsnowCm;
	}

	public void setAvghumidity(Object avghumidity){
		this.avghumidity = avghumidity;
	}

	public Object getAvghumidity(){
		return avghumidity;
	}

	public void setCondition(Condition condition){
		this.condition = condition;
	}

	public Condition getCondition(){
		return condition;
	}

	public void setMaxwindKph(Object maxwindKph){
		this.maxwindKph = maxwindKph;
	}

	public Object getMaxwindKph(){
		return maxwindKph;
	}

	public void setMaxwindMph(Object maxwindMph){
		this.maxwindMph = maxwindMph;
	}

	public Object getMaxwindMph(){
		return maxwindMph;
	}

	public void setDailyChanceOfRain(int dailyChanceOfRain){
		this.dailyChanceOfRain = dailyChanceOfRain;
	}

	public int getDailyChanceOfRain(){
		return dailyChanceOfRain;
	}

	public void setTotalprecipMm(Object totalprecipMm){
		this.totalprecipMm = totalprecipMm;
	}

	public Object getTotalprecipMm(){
		return totalprecipMm;
	}

	public void setDailyWillItSnow(int dailyWillItSnow){
		this.dailyWillItSnow = dailyWillItSnow;
	}

	public int getDailyWillItSnow(){
		return dailyWillItSnow;
	}
}