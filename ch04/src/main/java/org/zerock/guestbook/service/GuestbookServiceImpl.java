package org.zerock.guestbook.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.guestbook.dto.GuestDto;

@Log4j2
@Service
public class GuestbookServiceImpl implements GuestbookService{

    @Override
    public Long register(GuestDto dto) {
        return null;
    }
}
