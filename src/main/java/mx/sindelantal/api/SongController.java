package mx.sindelantal.api;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.sindelantal.model.ClientInformation;
import mx.sindelantal.service.SongService;

/**
 * @author Eduardo Cruz Zamorano
 *
 */
@Controller
public class SongController {

	protected static final Logger LOG = LogManager.getLogger();
	@Autowired
	private SongService songService;

	@RequestMapping(value = "/temperature", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<String> listAllUsers(@RequestBody ClientInformation clientInfo) {
		String playlistsKey = songService.findByTemperature(clientInfo.getTemperature());
		return new ResponseEntity<String>(playlistsKey, HttpStatus.OK);
	}

	@ExceptionHandler
	void handleIllegalArgumentException(IllegalArgumentException e, HttpServletResponse response) throws IOException {
		LOG.error("ERROR {}",e.getMessage());
		response.sendError(HttpStatus.BAD_REQUEST.value());
	}
}
