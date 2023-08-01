package org.zerock.guestbook.service;

import org.zerock.guestbook.dto.GuestDto;
import org.zerock.guestbook.entity.Guestbook;

public interface GuestbookService {
    Long register(GuestDto dto);

    default Guestbook dtoToEntity(GuestDto guestDto){
        Guestbook entity = Guestbook.builder()
                .gno(guestDto.getGno())
                .title(guestDto.getTitle())
                .content(guestDto.getContent())
                .writer(guestDto.getWriter())
                .build();
        return entity;
    }
}
