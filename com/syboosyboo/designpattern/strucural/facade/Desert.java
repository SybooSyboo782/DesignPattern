package com.syboosyboo.designpattern.strucural.facade;

/**
 * <pre>
 * Class : Desert
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
public class Desert {

    private String name ="";

    public Desert(String name) {
        this.name = name;
    }

    public void PickOrder() {
        System.out.println(name + " 디저트 주문하기");
    }

    public void EatDesert() {
        System.out.println(name + " 디저트 먹기");
    }
}
