//package jpabook.jpashop.domain;
//
//import jpabook.memberteam.domain.Member;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
///**
// * Created by pasudo123 on 2019-09-01
// * Blog: https://pasudo123.tistory.com/
// * Email: oraedoa@gmail.com
// **/
//@Entity
//@Table(name = "orders")
//@NoArgsConstructor
//@Getter
//@Setter
//public class Order {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ORDER_ID")
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "member_id")
//    private Member member;
//
//    private LocalDateTime orderDate;
//
//    @Enumerated(EnumType.STRING)
//    private OrderStatus status;
//
//}
