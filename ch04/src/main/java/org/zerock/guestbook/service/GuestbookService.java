package org.zerock.guestbook.service;

import org.zerock.guestbook.dto.GuestDto;

public interface GuestbookService {
    Long register(GuestDto dto);
}
