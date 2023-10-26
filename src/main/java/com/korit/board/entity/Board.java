package com.korit.board.entity;

import com.korit.board.dto.BoardListRespDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Board {
    private int boardId;
    private String boardTitle;
    private int boardCategoryId;
    private String boardContent;
    private String email;

    private String nickname;

    private LocalDateTime createDate;

    private int boardHitsCount;
    private int boardLikeCount;

    public BoardListRespDto toBoardListDto() {
        return BoardListRespDto.builder()
                .boardId(boardId)
                .title(boardTitle)
                .nickname(nickname)
                // DateTimeFormatter.ISO_DATE (년,월,일)
                .createDate(createDate.format(DateTimeFormatter.ISO_DATE))
                .hitsCount(boardHitsCount)
                .likeCount(boardLikeCount)
                .build();
    }
}