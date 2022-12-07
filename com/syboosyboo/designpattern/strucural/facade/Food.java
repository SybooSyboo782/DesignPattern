package com.syboosyboo.designpattern.strucural.facade;

/**
 * <pre>
 * Class : Food
 * Comment: 클래스에 대한 간단 설명
 * History
 * ================================================================
 * DATE             AUTHOR           NOTE
 * ----------------------------------------------------------------
 * 2022-12-07       부시연           최초 생성
 * </pre>
 *
 * @author 부시연(최초 작성자)
 * @version 1(클래스 버전)
 * @see (참고할 class 또는 외부 url)
 */
public class Food {

    private String name ="";

    public Food(String name) {
        this.name = name;
    }

    public void PickOrder() {
        System.out.println(name + " 음식 주문하기");
    }

    public void EatFood() {
        System.out.println(name + " 음식 먹기");
    }

}
