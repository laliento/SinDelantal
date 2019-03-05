package mx.sindelantal.model;

/**
 * @author Eduardo Cruz Zamorano
 *
 */
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.ToString
public class ClientInformation {

	private String cityName;
	private Integer latitude;
	private Integer longitud;
	private Double temperature;
}
