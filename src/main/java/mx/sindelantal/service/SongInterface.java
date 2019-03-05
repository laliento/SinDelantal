package mx.sindelantal.service;

/**
 * @author Eduardo Cruz Zamorano
 *
 */
public interface SongInterface {

	/**
	 * @param temperature
	 * @return String Key
	 */
	public String findByTemperature(Double temperature);
}
