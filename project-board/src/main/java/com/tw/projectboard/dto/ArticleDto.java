package com.tw.projectboard.dto;

import java.time.LocalDateTime;

/**
 * DTO for {@link com.tw.projectboard.domain.Article}
 */
public record ArticleDto(
        String title,
        String content,
        String hashtag,
        LocalDateTime createdAt,
        String createdBy
) {
    public static ArticleDto of(String title, String content, String hashtag, LocalDateTime createdAt, String createdBy) {
        return new ArticleDto(title, content, hashtag, createdAt, createdBy);
    }
}
