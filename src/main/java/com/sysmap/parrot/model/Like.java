package com.sysmap.parrot.model;

import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("like")
public class Like {
	private UUID userId;
	private String name;

	public Like(User user) {
		this.userId = user.getId();
		this.name = user.getName();
	}
}
