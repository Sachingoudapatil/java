package com.xworkz.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class EmailDTO {

	private String from;
	private String to;
	private String subject;
	private String message;

}
