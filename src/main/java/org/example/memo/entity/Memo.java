package org.example.memo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.memo.dto.MemoRequestDto;


@Getter
@AllArgsConstructor
public class Memo {

    private Long id;
    private String title;
    private String contents;

    public void update(MemoRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
    }
}
