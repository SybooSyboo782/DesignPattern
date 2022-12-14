package com.syboosyboo.designpattern.creational.factorymethod;

/**
 * <pre>
 * Class : Application
 * Comment: Factory method 메인
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
public class Application {

    public static void main(String[] args) {

        ShoeFactory shoeFactory = new ShoeFactory();

        Shoes shoes1 = shoeFactory.makingShoes("blue");

        shoes1.color();

        Shoes shoes2 = shoeFactory.makingShoes("red");

        shoes2.color();

        Shoes shoes3 = shoeFactory.makingShoes("black");

        shoes3.color();

    }
}
