package com.cromxt.common.crombucket.dtos.mediaserver.requests;


public record UpdateMediaRequestDTO(
       String fileId,
       Long fileSize,
       String extension,
       String accessUrl
) {
}
