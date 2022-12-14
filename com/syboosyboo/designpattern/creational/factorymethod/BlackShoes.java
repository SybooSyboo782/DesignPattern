package com.syboosyboo.designpattern.creational.factorymethod;

/**
 * <pre>
 * Class : BlackShoes
 * Comment: 구두 인터페이스를 구현한 까만 구두 클래스
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2022-12-14       부시연           최초 생성
 * </pre>
 *
 * @author 부시연(최초 작성자)
 * @version 1(클래스 버전)
 * @see (참고할 class 또는 외부 url)
 */
public class BlackShoes implements Shoes{
    @Override
    public void color() {
        System.out.println("BlackShoes");
    }
}
