package jpabook.jpashop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpashopApplicationTests {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void contextLoads() {
    }

}
