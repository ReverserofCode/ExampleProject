package org.zerock.guestbook.service;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.guestbook.dto.GuestDto;
import org.zerock.guestbook.entity.Guestbook;

@SpringBootTest
public class GuestbookServiceTests {

    @Autowired
    private GuestbookService service;

    @Test
    public void testRegister() {
        GuestDto guestDto = GuestDto.builder()
                .title("Sample Title.....")
                .content("Sample Content....")
                .writer("user0")
                .build();
        System.out.println(service.register(guestDto));
    }
}
