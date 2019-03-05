package mx.sindelantal.utils;

/**
 * @author Eduardo Cruz Zamorano
 *
 */
public enum SongTypeEnum {

	TYPE_PARTY("1LwBQqaMFewXbY7uSgKESN"),
	TYPE_POP("6R4skbYOSaqJ6Qpm5zYWuW"),
	TYPE_ROCK("3S0sKv0JifwzAF2mH2WFSE"),
	TYPE_CLASSICAL("1ti3RTaWsi3wDB9sPVaoRE");
	
	private String key;

	
	private SongTypeEnum(String key){
		this.key = key;
	}
	public String getString() {
		return key;
	}
	
}
