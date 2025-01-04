package com.tw.projectboard.service;

import com.tw.projectboard.domain.Article;
import com.tw.projectboard.domain.type.SearchType;
import com.tw.projectboard.dto.ArticleDto;
import com.tw.projectboard.dto.ArticleUpdateDto;
import com.tw.projectboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@DisplayName("비즈니스 로직 - 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    //InjectMocks로 Mock 객체들을 의존성 주입을 해준다.
    @InjectMocks private ArticleService sut; //system under test: test 중인 대상에게 주로 하는 네이밍

    @Mock private ArticleRepository articleRepository;

    @DisplayName("게시글을 검색하면, 게시글 리스트를 반환한다.")
    @Test
    void givenSearchingParameter_whenSearchingArticles_thenReturnArticlesList(){

        //given

        //when
        Page<ArticleDto> articles = sut.searchArticle(SearchType.TITLE, "search keyword");

        //then
        assertThat(articles).isNotNull();

    }

    @DisplayName("게시글을 조회하면, 게시글을 반환한다.")
    @Test
    void givenArticleId_whenSearchingArticles_thenReturnArticle(){

        //given

        //when
        ArticleDto article = sut.searchArticle(1L);

        //then
        assertThat(article).isNotNull();

    }

    @DisplayName("게시글 정보를 입력하면, 게시글을 생성한다.")
    @Test
    void givenArticleInfo_whenSavingArticle_thenSavesArticle(){

        //given
        given(articleRepository.save(any(Article.class))).willReturn(null);

        //when
        sut.saveArticle(ArticleDto.of("title", "content", "#java", LocalDateTime.now(), "t1"));

        //then
        then(articleRepository).should().save(any(Article.class));

    }

    @DisplayName("게시글 Id와 수정 정보를 입력하면, 게시글을 수정한다.")
    @Test
    void givenArticleIdAndModifiedInfo_whenUpdatingArticle_thenUpdatesArticle(){

        //given
        given(articleRepository.save(any(Article.class))).willReturn(null);

        //when
        sut.updateArticle(1L, ArticleUpdateDto.of("title", "content", "#java"));

        //then
        then(articleRepository).should().save(any(Article.class));

    }

    @DisplayName("게시글 Id를 입력하면, 게시글을 삭제한다.")
    @Test
    void givenArticleId_whenDeletingArticle_thenDeletesArticle(){

        //given
        willDoNothing().given(articleRepository).delete(any(Article.class));

        //when
        sut.deleteArticle(1L);

        //then
        then(articleRepository).should().delete(any(Article.class));

    }

}
