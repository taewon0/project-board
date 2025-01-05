package com.tw.projectboard.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class PaginationService {

    private static final int BAR_LENGTH = 5;

    public List<Integer> getPaginationBarNumbers(int currentPageNumber, int totalPages){
        if (currentPageNumber <= BAR_LENGTH / 2){
            return IntStream.range(0,BAR_LENGTH).boxed().toList();
        } else if (totalPages - 1 - currentPageNumber <= BAR_LENGTH / 2){
            return IntStream.range(totalPages - BAR_LENGTH, totalPages).boxed().toList();
        } else {
            return IntStream.range(currentPageNumber - BAR_LENGTH/2, currentPageNumber + BAR_LENGTH/2 + 1).boxed().toList();
        }
    }

    public int currentBarLength(){
        return BAR_LENGTH;
    }
}
