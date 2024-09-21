package com.eventostec.api.domain.event;

import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;
import java.util.UUID;

public record EventResponseDTO(UUID id, String title, String description, Date date, String city, String state, boolean remote, String eventUrl, String imageUrl) {
}
