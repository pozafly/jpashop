package jpabook.jpashop;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class MemberRepositoryTest {

    // @Autowired
    // MemberRepository memberRepository;
    //
    // @Test
    // @Transactional
    // @DisplayName("testMember")
    // @Rollback(false)
    // void testMember() {
    //     // given
    //     Member member = new Member();
    //     member.setUsername("memberA");
    //
    //     // when
    //     Long savedId = memberRepository.save(member);
    //     Member findMember = memberRepository.find(savedId);
    //
    //     // then
    //     assertThat(findMember.getId()).isEqualTo(member.getId());
    //     assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
    //
    //     /**
    //      * hashCode, toString을 정의하지 않았으므로 == 비교임.
    //      * 하지만, findMember, member는 주소 값이 다를텐데?
    //      * 하지만, 같은 영속성 context 안에서는 이게 같음.
    //      * 쿼리
    //      */
    //     assertThat(findMember).isEqualTo(member);
    // }

}