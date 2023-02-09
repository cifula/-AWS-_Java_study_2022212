package usermanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
public class RequestDto<T> {
	private String resourse;
	private T body;

}
