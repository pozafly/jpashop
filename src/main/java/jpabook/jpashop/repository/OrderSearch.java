package jpabook.jpashop.repository;

import jpabook.jpashop.domin.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderSearch {

    private Long memberName;  // 회원 이름
    private OrderStatus orderStatus;  // 주문 상태[ORDER, CANCEL]
}
