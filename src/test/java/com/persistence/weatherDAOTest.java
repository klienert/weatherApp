package com.persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class weatherDAOTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    weatherDAO dao;

    @Test
    public void getCurrentWeatherTestSuccess() {
        dao = new weatherDAO();
        assertEquals("USA", dao.getCurrentWeather(77340).getLocation().getCountry());
    }

    @Test
    public void getCurrentNameTestSuccess() { // getName() ==> city
        dao = new weatherDAO();
        assertEquals("Huntsville", dao.getCurrentWeather(77340).getLocation().getName());
        assertEquals("Madison", dao.getCurrentWeather(53717).getLocation().getName());

    }

    @Test
    public void getCurrentStateTestSuccess() { // getRegion() ==> state
        dao = new weatherDAO();
        assertEquals("Wisconsin", dao.getCurrentWeather(53818).getLocation().getRegion());
        assertEquals("Texas", dao.getCurrentWeather(77340).getLocation().getRegion());
    }

    @Test
    public void getWeatherFeelsLikeTestSuccess() {
        dao = new weatherDAO();
        // Check logs, this is constantly changing so there is no 'real' test here...
        logger.info("Feels like " + dao.getCurrentWeather(77340).getCurrent().getFeelslikeF() + " in Huntsville, TX");
        logger.info("Local Time in Madison, WI is: " + dao.getCurrentWeather(53717).getLocation().getLocaltime());
        logger.info("It is " + dao.getCurrentWeather(53818).getCurrent().getTempF() + " degrees in Platteville, WI");
    }
}