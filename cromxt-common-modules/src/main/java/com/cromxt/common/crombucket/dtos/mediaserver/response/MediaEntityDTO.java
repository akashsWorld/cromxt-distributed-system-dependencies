package com.cromxt.common.crombucket.dtos.mediaserver.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MediaEntityDTO {
    private String fileId;
    private String mediaId;
    private Long fileSize;
    private String extension;
    private String accessUrl;
    private String absolutePath;
}
