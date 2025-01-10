package com.tw.projectboard.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class PaginationService {

    private static final int BAR_LENGTH = 5;

    public List<Integer> getPaginationBarNumbers(int currentPageNumber, int totalPages){
        int startNum = Math.max(0, currentPageNumber - BAR_LENGTH / 2);
        int endNum = Math.min(totalPages, startNum + BAR_LENGTH);
        return IntStream.range(startNum, endNum).boxed().toList();
    }

    public int currentBarLength(){
        return BAR_LENGTH;
    }
}
