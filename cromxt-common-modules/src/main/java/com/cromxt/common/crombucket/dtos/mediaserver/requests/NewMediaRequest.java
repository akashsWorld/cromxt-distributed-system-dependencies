package com.cromxt.common.crombucket.dtos.mediaserver.requests;




public record NewMediaRequest(
        String userId,
        String bucketId,
        String fileExtension,
        String mediaId,
        MediaStatus mediaStatus
) {
}
