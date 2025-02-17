package com.tw.projectboard.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

@DisplayName("비즈니스 로직 - 페이지네이션")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = PaginationService.class)
class PaginationServiceTest {

    private final PaginationService sut;

    public PaginationServiceTest(@Autowired PaginationService paginationService){
        this.sut = paginationService;
    }

    @DisplayName("현재 페이지 번호와 총 페이지 수를 주면, 페이징 바 리스트를 만들어준다.")
    @MethodSource
    @ParameterizedTest(name = "[{index}] {0} {1} => {2}")
    void givenCurrentPageNumberAndTotalPages_whenCalculating_thenReturnsPaginationBarNumbers(int currentPage, int totalPages, List<Integer> expected) {
        //given

        //when
        List<Integer> actual = sut.getPaginationBarNumbers(currentPage, totalPages);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> givenCurrentPageNumberAndTotalPages_whenCalculating_thenReturnsPaginationBarNumbers(){
        return Stream.of(
                arguments(0, 10, List.of(0,1,2,3,4)),
                arguments(1, 10, List.of(0,1,2,3,4)),
                arguments(2, 10, List.of(0,1,2,3,4)),
                arguments(3, 10, List.of(1,2,3,4,5)),
                arguments(4, 10, List.of(2,3,4,5,6)),
                arguments(5, 10, List.of(3,4,5,6,7)),
                arguments(6, 10, List.of(4,5,6,7,8)),
                arguments(7, 10, List.of(5,6,7,8,9)),
                arguments(8, 10, List.of(6,7,8,9)),
                arguments(9, 10, List.of(7,8,9))
        );
    }

    @DisplayName("현재 설정되어 있는 페이지네이션 바의 길이를 알려준다.")
    @Test
    void givenNothing_whenCalling_thenReturnsCurrentBarLength() {

        //given

        //when
        int barLength = sut.currentBarLength();

        //then
        assertThat(barLength).isEqualTo(5);

    }
}