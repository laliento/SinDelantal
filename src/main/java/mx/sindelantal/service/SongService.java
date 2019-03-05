package mx.sindelantal.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import mx.sindelantal.utils.SongTypeEnum;

/**
 * @author Eduardo Cruz Zamorano
 *
 */
@Service
public class SongService implements SongInterface{
	
	protected static final Logger LOG = LogManager.getLogger();
	@Override
	public String findByTemperature(Double double1) {
		LOG.info("FIND BY {}",double1);
		CheckTemperature ckTemp = (n)-> 
		n<10?SongTypeEnum.TYPE_CLASSICAL: 
			n>=10 && n<=14?SongTypeEnum.TYPE_ROCK: 
				n>=15 &&n<=30?SongTypeEnum.TYPE_POP:
					SongTypeEnum.TYPE_PARTY;
		return ckTemp.checTemperature(double1).getString();
	}
	
	interface CheckTemperature{
		SongTypeEnum checTemperature(Double temperature);
	}
	
}
